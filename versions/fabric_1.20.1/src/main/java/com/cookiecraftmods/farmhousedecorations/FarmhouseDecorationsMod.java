package com.cookiecraftmods.farmhousedecorations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModItems;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModTabs;

public class FarmhouseDecorationsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("farmhouse_decorations");
	public static final String MODID = "farmhouse_decorations";

	@Override
	public void onInitialize() {
		FarmhouseDecorationsModSounds.init();
		FarmhouseDecorationsModBlocks.init();
		FarmhouseDecorationsModItems.init();
		FarmhouseDecorationsModTabs.init();
	}
}
