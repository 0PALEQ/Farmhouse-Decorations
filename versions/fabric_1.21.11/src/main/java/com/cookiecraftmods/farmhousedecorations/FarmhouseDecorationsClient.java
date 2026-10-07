package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.registries.BuiltInRegistries;

public final class FarmhouseDecorationsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BuiltInRegistries.BLOCK.stream()
				.filter(block -> FarmhouseDecorationsMod.MODID.equals(BuiltInRegistries.BLOCK.getKey(block).getNamespace()))
				.forEach(block -> BlockRenderLayerMap.putBlock(block, ChunkSectionLayer.CUTOUT));

		BlockRenderLayerMap.putBlocks(
				ChunkSectionLayer.TRANSLUCENT,
				FarmhouseDecorationsModBlocks.WINE_GLASS,
				FarmhouseDecorationsModBlocks.TOILET
		);
	}
}
