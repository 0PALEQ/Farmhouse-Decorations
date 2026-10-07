package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class PianoRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomSound = 0;
		double pianoRandomChord = 0;
		pianoRandomChord = Mth.nextInt(RandomSource.create(), 1, 7);
		if (pianoRandomChord == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:piano_place")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:piano_place")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
		} else if (pianoRandomChord == 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc1")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc1")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
		} else if (pianoRandomChord == 3) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc2")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc2")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
		} else if (pianoRandomChord == 4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc3")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc3")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc4")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("farmhouse_decorations:pc4")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
		}
	}
}