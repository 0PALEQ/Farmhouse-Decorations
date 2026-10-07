package com.cookiecraftmods.farmhousedecorations;

import net.fabricmc.api.ClientModInitializer;

public final class FarmhouseDecorationsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Minecraft 26.1 selects solid, cutout, or translucent terrain layers
		// automatically from each model sprite's alpha values.
	}
}
