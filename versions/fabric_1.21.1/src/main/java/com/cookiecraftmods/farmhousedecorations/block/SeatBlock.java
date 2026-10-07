package com.cookiecraftmods.farmhousedecorations.block;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;

public abstract class SeatBlock extends Block {
	private static final String SEAT_TAG = "farmhouse_decorations:seat";
	private static final double CHAIR_SEAT_HEIGHT = 7.0D / 16.0D;
	private static final double RIDER_HEIGHT_CORRECTION = 3.0D / 16.0D;
	private final double seatHeight;

	protected SeatBlock(BlockBehaviour.Properties properties) {
		this(properties, CHAIR_SEAT_HEIGHT);
	}

	protected SeatBlock(BlockBehaviour.Properties properties, double seatHeight) {
		super(properties);
		this.seatHeight = seatHeight;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
		if (player.isShiftKeyDown() || player.isPassenger()) {
			return InteractionResult.PASS;
		}
		if (!world.isClientSide) {
			removeLegacySeats(world, pos);
			List<ArmorStand> seats = findSeats(world, pos);
			ArmorStand seat = seats.stream().filter(entity -> entity.getPassengers().isEmpty()).findFirst().orElse(null);
			if (seat == null && seats.isEmpty()) {
				seat = new SeatArmorStand(world, pos.getX() + 0.5D, pos.getY() + seatHeight + RIDER_HEIGHT_CORRECTION, pos.getZ() + 0.5D);
				seat.setNoGravity(true);
				seat.setInvulnerable(true);
				seat.setInvisible(true);
				seat.addTag(SEAT_TAG);
				world.addFreshEntity(seat);
			}
			if (seat != null) {
				seat.setPos(pos.getX() + 0.5D, pos.getY() + seatHeight + RIDER_HEIGHT_CORRECTION, pos.getZ() + 0.5D);
				seat.setYRot(state.getValue(HorizontalDirectionalBlock.FACING).toYRot());
				player.startRiding(seat);
				world.scheduleTick(pos, this, 20);
			}
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
		boolean occupied = false;
		for (ArmorStand seat : findSeats(world, pos)) {
			if (seat.getPassengers().isEmpty()) {
				seat.discard();
			} else {
				occupied = true;
			}
		}
		if (occupied) {
			world.scheduleTick(pos, this, 20);
		}
	}

	@Override
	public BlockState playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
		removeSeats(world, pos);
		return super.playerWillDestroy(world, pos, state, player);
	}

	private static List<ArmorStand> findSeats(Level world, BlockPos pos) {
		return world.getEntitiesOfClass(ArmorStand.class, new AABB(pos), SeatBlock::isSeat);
	}

	private static boolean isSeat(ArmorStand entity) {
		return entity.getTags().contains(SEAT_TAG);
	}

	private static void removeLegacySeats(Level world, BlockPos pos) {
		for (Entity entity : world.getEntitiesOfClass(Entity.class, new AABB(pos),
				candidate -> candidate.getTags().contains(SEAT_TAG) && !(candidate instanceof ArmorStand))) {
			entity.ejectPassengers();
			entity.discard();
		}
	}

	private static void removeSeats(Level world, BlockPos pos) {
		for (Entity entity : world.getEntitiesOfClass(Entity.class, new AABB(pos),
				candidate -> candidate.getTags().contains(SEAT_TAG))) {
			entity.ejectPassengers();
			entity.discard();
		}
	}

	private static final class SeatArmorStand extends ArmorStand {
		private SeatArmorStand(Level world, double x, double y, double z) {
			super(world, x, y, z);
			CompoundTag settings = new CompoundTag();
			settings.putBoolean("Marker", true);
			readAdditionalSaveData(settings);
		}
	}
}
