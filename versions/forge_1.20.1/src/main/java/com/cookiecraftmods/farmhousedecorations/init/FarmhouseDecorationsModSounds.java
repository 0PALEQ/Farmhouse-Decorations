
package com.cookiecraftmods.farmhousedecorations.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FarmhouseDecorationsMod.MODID);
	public static final RegistryObject<SoundEvent> GUITAR_BREAK = REGISTRY.register("guitar_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "guitar_break")));
	public static final RegistryObject<SoundEvent> GUITAR_PLACE = REGISTRY.register("guitar_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "guitar_place")));
	public static final RegistryObject<SoundEvent> CUCKOO_CLOCK = REGISTRY.register("cuckoo-clock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "cuckoo-clock")));
	public static final RegistryObject<SoundEvent> PIANO_BREAK = REGISTRY.register("piano_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "piano_break")));
	public static final RegistryObject<SoundEvent> PIANO_PLACE = REGISTRY.register("piano_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "piano_place")));
	public static final RegistryObject<SoundEvent> GUITAR_CHORD_1 = REGISTRY.register("guitar-chord-1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "guitar-chord-1")));
	public static final RegistryObject<SoundEvent> GC2 = REGISTRY.register("gc2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc2")));
	public static final RegistryObject<SoundEvent> GC3 = REGISTRY.register("gc3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc3")));
	public static final RegistryObject<SoundEvent> PC1 = REGISTRY.register("pc1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "pc1")));
	public static final RegistryObject<SoundEvent> PC2 = REGISTRY.register("pc2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "pc2")));
	public static final RegistryObject<SoundEvent> PC3 = REGISTRY.register("pc3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "pc3")));
	public static final RegistryObject<SoundEvent> PC4 = REGISTRY.register("pc4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "pc4")));
	public static final RegistryObject<SoundEvent> GC4 = REGISTRY.register("gc4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc4")));
	public static final RegistryObject<SoundEvent> GC5 = REGISTRY.register("gc5", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc5")));
	public static final RegistryObject<SoundEvent> GC6 = REGISTRY.register("gc6", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc6")));
	public static final RegistryObject<SoundEvent> GC7 = REGISTRY.register("gc7", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "gc7")));
	public static final RegistryObject<SoundEvent> PHONE_PLACE_BREAK = REGISTRY.register("phone_place_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farmhouse_decorations", "phone_place_break")));
}
