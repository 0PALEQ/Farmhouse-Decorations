package com.cookiecraftmods.farmhousedecorations.block.entity;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public final class DecorationPlacementBlockEntity extends BlockEntity {
    public DecorationPlacementBlockEntity(BlockPos pos, BlockState state) {
        super(FarmhouseDecorationsModBlockEntities.DECORATION_PLACEMENT.get(), pos, state);
    }
}
