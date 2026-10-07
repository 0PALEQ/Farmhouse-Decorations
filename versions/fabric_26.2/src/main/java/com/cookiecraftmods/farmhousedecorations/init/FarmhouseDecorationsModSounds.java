package com.cookiecraftmods.farmhousedecorations.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModSounds {
	public static final SoundEvent GUITAR_BREAK = register("guitar_break");
	public static final SoundEvent GUITAR_PLACE = register("guitar_place");
	public static final SoundEvent CUCKOO_CLOCK = register("cuckoo-clock");
	public static final SoundEvent PIANO_BREAK = register("piano_break");
	public static final SoundEvent PIANO_PLACE = register("piano_place");
	public static final SoundEvent GUITAR_CHORD_1 = register("guitar-chord-1");
	public static final SoundEvent GC2 = register("gc2");
	public static final SoundEvent GC3 = register("gc3");
	public static final SoundEvent PC1 = register("pc1");
	public static final SoundEvent PC2 = register("pc2");
	public static final SoundEvent PC3 = register("pc3");
	public static final SoundEvent PC4 = register("pc4");
	public static final SoundEvent GC4 = register("gc4");
	public static final SoundEvent GC5 = register("gc5");
	public static final SoundEvent GC6 = register("gc6");
	public static final SoundEvent GC7 = register("gc7");
	public static final SoundEvent PHONE_PLACE_BREAK = register("phone_place_break");

	public static void init() {
	}

	private static SoundEvent register(String path) {
		Identifier id = Identifier.fromNamespaceAndPath(FarmhouseDecorationsMod.MODID, path);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}
}
