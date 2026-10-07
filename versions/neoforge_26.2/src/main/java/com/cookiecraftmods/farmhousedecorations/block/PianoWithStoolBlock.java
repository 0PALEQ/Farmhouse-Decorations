package com.cookiecraftmods.farmhousedecorations.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.neoforged.neoforge.common.util.DeferredSoundType;

import java.util.function.Function;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import com.cookiecraftmods.farmhousedecorations.SoundInteractions;

public class PianoWithStoolBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public PianoWithStoolBlock(BlockBehaviour.Properties properties) {
	super(properties
				.sound(new DeferredSoundType(1.0f, 1.0f, FarmhouseDecorationsModSounds.PIANO_BREAK, FarmhouseDecorationsModSounds.PIANO_BREAK, FarmhouseDecorationsModSounds.PIANO_PLACE,
						FarmhouseDecorationsModSounds.PIANO_PLACE, FarmhouseDecorationsModSounds.PIANO_BREAK))
				.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 32, 10, 12), box(0, 0, 0, 32, 20, 6), box(10, 0, 13, 22, 8, 21));
				case NORTH -> Shapes.or(box(-16, 0, 4, 16, 10, 16), box(-16, 0, 10, 16, 20, 16), box(-6, 0, -5, 6, 8, 3));
				case EAST -> Shapes.or(box(0, 0, -16, 12, 10, 16), box(0, 0, -16, 6, 20, 16), box(13, 0, -6, 21, 8, 6));
				case WEST -> Shapes.or(box(4, 0, 0, 16, 10, 32), box(10, 0, 0, 16, 20, 32), box(-5, 0, 10, 3, 8, 22));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return rotate(state, mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		SoundInteractions.playRandomPianoChord(world, pos);
		return InteractionResult.SUCCESS;
	}
}
