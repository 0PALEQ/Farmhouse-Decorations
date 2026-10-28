package com.cookiecraftmods.farmhousedecorations;

import net.fabricmc.api.ClientModInitializer;

public final class FarmhouseDecorationsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        net.minecraft.client.renderer.blockentity.BlockEntityRenderers.register(com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlockEntities.CUCKOO_CLOCK, com.cookiecraftmods.farmhousedecorations.client.clock.CuckooClockRenderer::new);
		// Minecraft 26.1 selects solid, cutout, or translucent terrain layers
		// automatically from each model sprite's alpha values.
	}
}
