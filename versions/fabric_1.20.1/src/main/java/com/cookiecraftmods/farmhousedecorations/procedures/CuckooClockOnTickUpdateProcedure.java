package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;

public class CuckooClockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		long timeOfDay = world.dayTime() % 24000L;
		if (timeOfDay == 6000L || timeOfDay == 18000L) {
			if (world instanceof Level level) {
				play(level, BlockPos.containing(x, y, z), FarmhouseDecorationsModSounds.CUCKOO_CLOCK);
			}
		}
	}

	private static void play(Level level, BlockPos pos, SoundEvent sound) {
		if (!level.isClientSide()) {
			level.playSound(null, pos, sound, SoundSource.NEUTRAL, 1, 1);
		} else {
			level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.NEUTRAL, 1, 1, false);
		}
	}
}
