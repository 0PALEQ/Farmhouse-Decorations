package com.cookiecraftmods.farmhousedecorations.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModTabs {
	public static final CreativeModeTab FARMHOUSE_DECORATIONS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(FarmhouseDecorationsMod.MODID, "farmhouse_decorations"),
			FabricCreativeModeTab.builder()
					.title(Component.translatable("item_group.farmhouse_decorations.farmhouse_decorations"))
					.icon(() -> new ItemStack(FarmhouseDecorationsModBlocks.LIQUOR_CABINET))
					.displayItems((context, entries) -> {
						entries.accept(FarmhouseDecorationsModBlocks.LIQUOR_CABINET);
						entries.accept(FarmhouseDecorationsModBlocks.KEROSENE_LANTERN);
						entries.accept(FarmhouseDecorationsModBlocks.ACOUSTIC_GUITAR);
						entries.accept(FarmhouseDecorationsModBlocks.DOUBLE_BED);
						entries.accept(FarmhouseDecorationsModBlocks.ANTIQUE_OVEN);
						entries.accept(FarmhouseDecorationsModBlocks.SINGLE_BED);
						entries.accept(FarmhouseDecorationsModBlocks.TALL_BOOKSHELF);
						entries.accept(FarmhouseDecorationsModBlocks.WINE_BOTTLE);
						entries.accept(FarmhouseDecorationsModBlocks.RED_WINE_BOTTLE);
						entries.accept(FarmhouseDecorationsModBlocks.CUCKOO_CLOCK);
						entries.accept(FarmhouseDecorationsModBlocks.DINING_CHAIR);
						entries.accept(FarmhouseDecorationsModBlocks.DINING_TABLE_SIDE);
						entries.accept(FarmhouseDecorationsModBlocks.DINING_TABLE_MIDDLE);
						entries.accept(FarmhouseDecorationsModBlocks.DRESSER);
						entries.accept(FarmhouseDecorationsModBlocks.NIGHT_STAND);
						entries.accept(FarmhouseDecorationsModBlocks.PIANO);
						entries.accept(FarmhouseDecorationsModBlocks.PIANO_WITH_STOOL);
						entries.accept(FarmhouseDecorationsModBlocks.ROCKING_CHAIR);
						entries.accept(FarmhouseDecorationsModBlocks.ROUND_TABLE);
						entries.accept(FarmhouseDecorationsModBlocks.STANDING_LAMP);
						entries.accept(FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN);
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_LEFT);
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_RIGHT);
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_MIDDLE);
						entries.accept(FarmhouseDecorationsModBlocks.TOOL_BOARD);
						entries.accept(FarmhouseDecorationsModBlocks.WARDROBE);
						entries.accept(FarmhouseDecorationsModBlocks.COAT_HANGER);
						entries.accept(FarmhouseDecorationsModBlocks.WINE_GLASS);
						entries.accept(FarmhouseDecorationsModBlocks.WORKBENCH);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN_DECORATED);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_COUNTER);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_CABINET);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_DRAWERS);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_HALFWALL_SHELF);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_SINK);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_WALL_CABINET);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_WALL_CABINET);
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_WALL_SHELF);
						entries.accept(FarmhouseDecorationsModBlocks.BATHTUB);
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_CABINET);
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_COUNTER);
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_SINK);
						entries.accept(FarmhouseDecorationsModBlocks.BIG_BATHROOM_MIRROR);
						entries.accept(FarmhouseDecorationsModBlocks.SMALL_BATHROOM_MIRROR);
						entries.accept(FarmhouseDecorationsModBlocks.TOWEL_HANGER);
						entries.accept(FarmhouseDecorationsModBlocks.FRIDGE);
						entries.accept(FarmhouseDecorationsModBlocks.LAMP);
						entries.accept(FarmhouseDecorationsModBlocks.CIGAR_BOX);
						entries.accept(FarmhouseDecorationsModBlocks.GRAMOPHONE);
						entries.accept(FarmhouseDecorationsModBlocks.RADIATOR);
						entries.accept(FarmhouseDecorationsModBlocks.PHONE);
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV_WITH_LEGS);
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV);
						entries.accept(FarmhouseDecorationsModBlocks.COFFEE_TABLE);
						entries.accept(FarmhouseDecorationsModBlocks.PILE_OF_BOOKS);
						entries.accept(FarmhouseDecorationsModBlocks.DESK);
						entries.accept(FarmhouseDecorationsModBlocks.DOOR_MAT);
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_1);
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_2);
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_WOOD_1);
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_WOOD_2);
						entries.accept(FarmhouseDecorationsModBlocks.RADIO);
						entries.accept(FarmhouseDecorationsModBlocks.RUG_1X_3);
						entries.accept(FarmhouseDecorationsModBlocks.RUG_3X_3);
						entries.accept(FarmhouseDecorationsModBlocks.SEASONING_RACK);
						entries.accept(FarmhouseDecorationsModBlocks.TYPEWRITER);
						entries.accept(FarmhouseDecorationsModBlocks.WALL_SHELF);
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV_STAND);
						entries.accept(FarmhouseDecorationsModBlocks.CEILING_LAMP);
						entries.accept(FarmhouseDecorationsModBlocks.CHANDELIER);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAIN_ROD);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_1W);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_1W_LONG);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_LEFT);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_LEFT_LONG);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT);
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT_LONG);
						entries.accept(FarmhouseDecorationsModBlocks.HANGING_SHELF);
						entries.accept(FarmhouseDecorationsModBlocks.OLD_BATHROOM_RADIATOR);
						entries.accept(FarmhouseDecorationsModBlocks.WALL_TELEPHONE);
						entries.accept(FarmhouseDecorationsModBlocks.TOILET);
						entries.accept(FarmhouseDecorationsModBlocks.WALL_LAMP_CANDLE);
						entries.accept(FarmhouseDecorationsModBlocks.WALL_SHADE);
						entries.accept(FarmhouseDecorationsModBlocks.WINDOW_BLINDS);
						entries.accept(FarmhouseDecorationsModBlocks.WINDOW_BLINDS_LONG);
					})
					.build());

	public static void init() {
	}
}
