package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;

public final class SoundInteractions {
	private static final SoundEvent[] GUITAR_CHORDS = {
			FarmhouseDecorationsModSounds.GUITAR_CHORD_1.get(),
			FarmhouseDecorationsModSounds.GC2.get(),
			FarmhouseDecorationsModSounds.GC3.get(),
			FarmhouseDecorationsModSounds.GC4.get(),
			FarmhouseDecorationsModSounds.GC5.get(),
			FarmhouseDecorationsModSounds.GC6.get(),
			FarmhouseDecorationsModSounds.GC7.get()
	};
	private static final SoundEvent[] PIANO_CHORDS = {
			FarmhouseDecorationsModSounds.PIANO_PLACE.get(),
			FarmhouseDecorationsModSounds.PC1.get(),
			FarmhouseDecorationsModSounds.PC2.get(),
			FarmhouseDecorationsModSounds.PC3.get(),
			FarmhouseDecorationsModSounds.PC4.get(),
			FarmhouseDecorationsModSounds.PC4.get(),
			FarmhouseDecorationsModSounds.PC4.get()
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
		long timeOfDay = level.getDayTime() % 24000L;
		if (timeOfDay == 6000L || timeOfDay == 18000L) {
			level.playSound(null, pos, FarmhouseDecorationsModSounds.CUCKOO_CLOCK.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
		}
	}

	private static void playRandom(Level level, BlockPos pos, SoundEvent[] sounds) {
		if (!level.isClientSide()) {
			SoundEvent sound = sounds[level.getRandom().nextInt(sounds.length)];
			level.playSound(null, pos, sound, SoundSource.BLOCKS, 2.0F, 1.0F);
		}
	}
}
