package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class CuckooClockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		long time = world.dayTime() % 24000L;
		if (time == 6000L || time == 18000L) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
