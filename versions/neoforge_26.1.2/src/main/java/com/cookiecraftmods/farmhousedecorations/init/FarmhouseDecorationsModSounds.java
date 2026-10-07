package com.cookiecraftmods.farmhousedecorations.init;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class FarmhouseDecorationsModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FarmhouseDecorationsMod.MODID);
    public static final DeferredHolder<SoundEvent, SoundEvent> GUITAR_BREAK = register("guitar_break");
    public static final DeferredHolder<SoundEvent, SoundEvent> GUITAR_PLACE = register("guitar_place");
    public static final DeferredHolder<SoundEvent, SoundEvent> CUCKOO_CLOCK = register("cuckoo-clock");
    public static final DeferredHolder<SoundEvent, SoundEvent> PIANO_BREAK = register("piano_break");
    public static final DeferredHolder<SoundEvent, SoundEvent> PIANO_PLACE = register("piano_place");
    public static final DeferredHolder<SoundEvent, SoundEvent> GUITAR_CHORD_1 = register("guitar-chord-1");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC2 = register("gc2");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC3 = register("gc3");
    public static final DeferredHolder<SoundEvent, SoundEvent> PC1 = register("pc1");
    public static final DeferredHolder<SoundEvent, SoundEvent> PC2 = register("pc2");
    public static final DeferredHolder<SoundEvent, SoundEvent> PC3 = register("pc3");
    public static final DeferredHolder<SoundEvent, SoundEvent> PC4 = register("pc4");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC4 = register("gc4");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC5 = register("gc5");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC6 = register("gc6");
    public static final DeferredHolder<SoundEvent, SoundEvent> GC7 = register("gc7");
    public static final DeferredHolder<SoundEvent, SoundEvent> PHONE_PLACE_BREAK = register("phone_place_break");

    private static DeferredHolder<SoundEvent, SoundEvent> register(String path) {
        Identifier id = Identifier.fromNamespaceAndPath(FarmhouseDecorationsMod.MODID, path);
        return REGISTRY.register(path, () -> SoundEvent.createVariableRangeEvent(id));
    }

    private FarmhouseDecorationsModSounds() {
    }
}
