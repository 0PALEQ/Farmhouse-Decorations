package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;

public class PianoRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int pianoRandomChord = Mth.nextInt(RandomSource.create(), 1, 7);
		if (world instanceof Level level) {
			SoundEvent sound = switch (pianoRandomChord) {
				case 1 -> FarmhouseDecorationsModSounds.PIANO_PLACE;
				case 2 -> FarmhouseDecorationsModSounds.PC1;
				case 3 -> FarmhouseDecorationsModSounds.PC2;
				case 4 -> FarmhouseDecorationsModSounds.PC3;
				default -> FarmhouseDecorationsModSounds.PC4;
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
