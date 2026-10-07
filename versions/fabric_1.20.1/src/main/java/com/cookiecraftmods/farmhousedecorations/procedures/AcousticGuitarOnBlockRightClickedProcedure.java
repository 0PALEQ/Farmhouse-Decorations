package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;

public class AcousticGuitarOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int randomSound = Mth.nextInt(RandomSource.create(), 1, 7);
		if (world instanceof Level level) {
			SoundEvent sound = switch (randomSound) {
				case 1 -> FarmhouseDecorationsModSounds.GUITAR_CHORD_1;
				case 2 -> FarmhouseDecorationsModSounds.GC2;
				case 3 -> FarmhouseDecorationsModSounds.GC3;
				case 4 -> FarmhouseDecorationsModSounds.GC4;
				case 5 -> FarmhouseDecorationsModSounds.GC5;
				case 6 -> FarmhouseDecorationsModSounds.GC6;
				default -> FarmhouseDecorationsModSounds.GC7;
			};
			play(level, BlockPos.containing(x, y, z), sound);
		}
	}

	private static void play(Level level, BlockPos pos, SoundEvent sound) {
		if (!level.isClientSide()) {
			level.playSound(null, pos, sound, SoundSource.NEUTRAL, 2, 1);
		} else {
			level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), sound, SoundSource.NEUTRAL, 2, 1, false);
		}
	}
}
