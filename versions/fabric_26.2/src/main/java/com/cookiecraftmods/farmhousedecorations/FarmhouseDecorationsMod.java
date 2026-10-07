package com.cookiecraftmods.farmhousedecorations;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModTabs;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModItems;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;
import net.fabricmc.fabric.api.recipe.v1.sync.RecipeSynchronization;
import net.minecraft.world.item.crafting.StonecutterRecipe;

public final class FarmhouseDecorationsMod implements net.fabricmc.api.ModInitializer {
	public static final String MODID = "farmhouse_decorations";

	@Override
	public void onInitialize() {
		FarmhouseDecorationsModSounds.init();
		FarmhouseDecorationsModBlocks.init();
		FarmhouseDecorationsModItems.init();
		FarmhouseDecorationsModTabs.init();
		RecipeSynchronization.synchronizeRecipeSerializer(StonecutterRecipe.SERIALIZER);
	}
}
