package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CuckooClockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		while (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			if (world.dayTime() == 6000) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (world.dayTime() == 18000) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farmhouse_decorations:cuckoo-clock")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
