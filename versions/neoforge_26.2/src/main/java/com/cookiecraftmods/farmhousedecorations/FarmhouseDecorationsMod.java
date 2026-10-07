package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModItems;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(FarmhouseDecorationsMod.MODID)
public final class FarmhouseDecorationsMod {
    public static final String MODID = "farmhouse_decorations";

    public FarmhouseDecorationsMod(IEventBus modBus) {
        FarmhouseDecorationsModSounds.REGISTRY.register(modBus);
        FarmhouseDecorationsModBlocks.REGISTRY.register(modBus);
        FarmhouseDecorationsModItems.REGISTRY.register(modBus);
        FarmhouseDecorationsModTabs.REGISTRY.register(modBus);
    }
}
