package com.cookiecraftmods.farmhousedecorations.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModTabs {
	public static final CreativeModeTab FARMHOUSE_DECORATIONS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
			new ResourceLocation(FarmhouseDecorationsMod.MODID, "farmhouse_decorations"),
			FabricItemGroup.builder().title(Component.translatable("item_group.farmhouse_decorations.farmhouse_decorations"))
					.icon(() -> new ItemStack(FarmhouseDecorationsModBlocks.LIQUOR_CABINET.asItem())).displayItems((parameters, entries) -> {
						entries.accept(FarmhouseDecorationsModBlocks.LIQUOR_CABINET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KEROSENE_LANTERN.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ACOUSTIC_GUITAR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DOUBLE_BED.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ANTIQUE_OVEN.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SINGLE_BED.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.TALL_BOOKSHELF.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WINE_BOTTLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.RED_WINE_BOTTLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CUCKOO_CLOCK.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DINING_CHAIR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DINING_TABLE_SIDE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DINING_TABLE_MIDDLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DRESSER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.NIGHT_STAND.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.PIANO.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.PIANO_WITH_STOOL.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ROCKING_CHAIR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ROUND_TABLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.STANDING_LAMP.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_LEFT.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_RIGHT.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SOFA_MIDDLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.TOOL_BOARD.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WARDROBE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.COAT_HANGER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WINE_GLASS.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WORKBENCH.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN_DECORATED.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_COUNTER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_CABINET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_DRAWERS.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_HALFWALL_SHELF.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_SINK.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_WALL_CABINET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_WALL_CABINET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.KITCHEN_WALL_SHELF.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.BATHTUB.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_CABINET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_COUNTER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.BATHROOM_SINK.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.BIG_BATHROOM_MIRROR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SMALL_BATHROOM_MIRROR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.TOWEL_HANGER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.FRIDGE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.LAMP.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CIGAR_BOX.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.GRAMOPHONE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.RADIATOR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.PHONE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV_WITH_LEGS.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.COFFEE_TABLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.PILE_OF_BOOKS.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DESK.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.DOOR_MAT.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_1.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_2.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_WOOD_1.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SCREEN_WOOD_2.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.RADIO.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.RUG_1X_3.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.RUG_3X_3.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.SEASONING_RACK.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.TYPEWRITER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WALL_SHELF.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.ANCIENT_TV_STAND.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CEILING_LAMP.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CHANDELIER.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAIN_ROD.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_1W.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_1W_LONG.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_LEFT.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_LEFT_LONG.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT_LONG.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.HANGING_SHELF.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.OLD_BATHROOM_RADIATOR.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WALL_TELEPHONE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.TOILET.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WALL_LAMP_CANDLE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WALL_SHADE.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WINDOW_BLINDS.asItem());
						entries.accept(FarmhouseDecorationsModBlocks.WINDOW_BLINDS_LONG.asItem());
					}).build());

	private FarmhouseDecorationsModTabs() {
	}

	public static void init() {
	}
}
