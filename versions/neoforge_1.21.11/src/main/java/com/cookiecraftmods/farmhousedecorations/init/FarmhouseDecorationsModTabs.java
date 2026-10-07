package com.cookiecraftmods.farmhousedecorations.init;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class FarmhouseDecorationsModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FarmhouseDecorationsMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FARMHOUSE_DECORATIONS =
            REGISTRY.register("farmhouse_decorations", () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.farmhouse_decorations.farmhouse_decorations"))
                    .icon(() -> new ItemStack(FarmhouseDecorationsModItems.LIQUOR_CABINET.get()))
                    .displayItems((parameters, output) ->
                            FarmhouseDecorationsModItems.ALL_ITEMS.forEach(item -> output.accept(item.get())))
                    .build());

    private FarmhouseDecorationsModTabs() {
    }
}
