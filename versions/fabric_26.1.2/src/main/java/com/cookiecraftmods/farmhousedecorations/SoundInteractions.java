package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;

public final class SoundInteractions {
	private static final SoundEvent[] GUITAR_CHORDS = {
			FarmhouseDecorationsModSounds.GUITAR_CHORD_1,
			FarmhouseDecorationsModSounds.GC2,
			FarmhouseDecorationsModSounds.GC3,
			FarmhouseDecorationsModSounds.GC4,
			FarmhouseDecorationsModSounds.GC5,
			FarmhouseDecorationsModSounds.GC6,
			FarmhouseDecorationsModSounds.GC7
	};
	private static final SoundEvent[] PIANO_CHORDS = {
			FarmhouseDecorationsModSounds.PIANO_PLACE,
			FarmhouseDecorationsModSounds.PC1,
			FarmhouseDecorationsModSounds.PC2,
			FarmhouseDecorationsModSounds.PC3,
			FarmhouseDecorationsModSounds.PC4,
			FarmhouseDecorationsModSounds.PC4,
			FarmhouseDecorationsModSounds.PC4
	};

	private SoundInteractions() {
	}

	public static void playRandomGuitarChord(Level level, BlockPos pos) {
		playRandom(level, pos, GUITAR_CHORDS);
	}

	public static void playRandomPianoChord(Level level, BlockPos pos) {
		playRandom(level, pos, PIANO_CHORDS);
	}

	public static void tickCuckooClock(ServerLevel level, BlockPos pos) {
		long timeOfDay = level.getOverworldClockTime() % 24000L;
		if (timeOfDay == 6000L || timeOfDay == 18000L) {
			level.playSound(null, pos, FarmhouseDecorationsModSounds.CUCKOO_CLOCK, SoundSource.BLOCKS, 1.0F, 1.0F);
		}
	}

	private static void playRandom(Level level, BlockPos pos, SoundEvent[] sounds) {
		if (!level.isClientSide()) {
			SoundEvent sound = sounds[level.getRandom().nextInt(sounds.length)];
			level.playSound(null, pos, sound, SoundSource.BLOCKS, 2.0F, 1.0F);
		}
	}
}
