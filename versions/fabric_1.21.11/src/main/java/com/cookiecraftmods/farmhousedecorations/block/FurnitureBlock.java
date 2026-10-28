package com.cookiecraftmods.farmhousedecorations.block;
import com.cookiecraftmods.eqlib.block.SeatBlock;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.AABB;
import com.cookiecraftmods.eqlib.block.FurnitureFootprint;
import com.cookiecraftmods.eqlib.block.MulticellFurniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FurnitureBlock extends Block implements net.minecraft.world.level.block.EntityBlock {
    protected FurnitureBlock(BlockBehaviour.Properties properties) { super(properties.dynamicShape().pushReaction(FurnitureFootprint.IMMOVABLE)); }

    @Override
    public net.minecraft.world.level.block.entity.BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new com.cookiecraftmods.farmhousedecorations.block.entity.DecorationPlacementBlockEntity(pos, state);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
    @Override
    public void setPlacedBy(net.minecraft.world.level.Level level, BlockPos pos, BlockState state,
            net.minecraft.world.entity.LivingEntity placer, net.minecraft.world.item.ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        FurnitureFootprint.placeParts(level, pos, state);
    }

    @Override
    public void tick(BlockState state, net.minecraft.server.level.ServerLevel level, BlockPos pos,
            net.minecraft.util.RandomSource random) {
        if (this instanceof MulticellFurniture) FurnitureFootprint.placeParts(level, pos, state);
        else super.tick(state, level, pos, random);
    }


    @Override
    protected void affectNeighborsAfterRemoval(BlockState state, net.minecraft.server.level.ServerLevel level,
            BlockPos pos, boolean moving) {
        SeatBlock.removeSeats(level, pos);
        removeLegacySeats(level, pos, true);
        FurnitureFootprint.removeParts(level, pos, state);
        super.affectNeighborsAfterRemoval(state, level, pos, moving);
    }


    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (com.cookiecraftmods.eqlib.api.FurnitureApi.sittable(state)
                && !player.isShiftKeyDown() && !player.isPassenger()
                && removeLegacySeats(world, pos, false)) return InteractionResult.SUCCESS;
        InteractionResult result = SeatBlock.use(state, world, pos, player);
        return result.consumesAction() ? result : super.useWithoutItem(state, world, pos, player, hit);
    }

    // Old FDM mounts used a different tag and are not owned by eqLib.
    // Preserve occupied mounts until dismount; clear abandoned mounts before reuse.
    private static boolean removeLegacySeats(Level level, BlockPos pos, boolean removing) {
        if (level.isClientSide()) return false;
        var offset = com.cookiecraftmods.eqlib.placement.PrecisePlacement.offset(level, pos);
        boolean occupied = false;
        for (var seat : level.getEntitiesOfClass(net.minecraft.world.entity.Entity.class,
                new AABB(pos).move(offset), entity -> entity.getTags().contains("farmhouse_decorations:seat")
                        && Math.abs(entity.getX() - (pos.getX() + 0.5 + offset.x)) < 0.01
                        && Math.abs(entity.getZ() - (pos.getZ() + 0.5 + offset.z)) < 0.01)) {
            if (!removing && !seat.getPassengers().isEmpty()) occupied = true;
            else {
                seat.ejectPassengers();
                seat.discard();
            }
        }
        return occupied;
    }
}
