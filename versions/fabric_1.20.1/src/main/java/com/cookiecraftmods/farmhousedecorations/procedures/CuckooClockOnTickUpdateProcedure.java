package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;

public class CuckooClockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel level) {
			level.playSound(null, BlockPos.containing(x, y, z), FarmhouseDecorationsModSounds.CUCKOO_CLOCK, SoundSource.BLOCKS, 0.5F, 1.0F);
		}
	}
}
