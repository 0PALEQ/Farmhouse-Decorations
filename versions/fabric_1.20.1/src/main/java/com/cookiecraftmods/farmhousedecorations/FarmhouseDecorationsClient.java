package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;

public final class FarmhouseDecorationsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BuiltInRegistries.BLOCK.stream()
				.filter(block -> FarmhouseDecorationsMod.MODID.equals(BuiltInRegistries.BLOCK.getKey(block).getNamespace()))
				.forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout()));

		BlockRenderLayerMap.INSTANCE.putBlocks(
				RenderType.translucent(),
				FarmhouseDecorationsModBlocks.TOILET,
				FarmhouseDecorationsModBlocks.WINE_GLASS
		);
	}
}
