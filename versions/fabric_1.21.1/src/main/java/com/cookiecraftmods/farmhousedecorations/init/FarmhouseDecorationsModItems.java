package com.cookiecraftmods.farmhousedecorations.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModItems {
	public static final Item LIQUOR_CABINET = block(FarmhouseDecorationsModBlocks.LIQUOR_CABINET);
	public static final Item KEROSENE_LANTERN = block(FarmhouseDecorationsModBlocks.KEROSENE_LANTERN);
	public static final Item ACOUSTIC_GUITAR = block(FarmhouseDecorationsModBlocks.ACOUSTIC_GUITAR);
	public static final Item DOUBLE_BED = block(FarmhouseDecorationsModBlocks.DOUBLE_BED);
	public static final Item ANTIQUE_OVEN = block(FarmhouseDecorationsModBlocks.ANTIQUE_OVEN);
	public static final Item SINGLE_BED = block(FarmhouseDecorationsModBlocks.SINGLE_BED);
	public static final Item TALL_BOOKSHELF = block(FarmhouseDecorationsModBlocks.TALL_BOOKSHELF);
	public static final Item WINE_BOTTLE = block(FarmhouseDecorationsModBlocks.WINE_BOTTLE);
	public static final Item RED_WINE_BOTTLE = block(FarmhouseDecorationsModBlocks.RED_WINE_BOTTLE);
	public static final Item CUCKOO_CLOCK = block(FarmhouseDecorationsModBlocks.CUCKOO_CLOCK);
	public static final Item DINING_CHAIR = block(FarmhouseDecorationsModBlocks.DINING_CHAIR);
	public static final Item DINING_TABLE_SIDE = block(FarmhouseDecorationsModBlocks.DINING_TABLE_SIDE);
	public static final Item DINING_TABLE_MIDDLE = block(FarmhouseDecorationsModBlocks.DINING_TABLE_MIDDLE);
	public static final Item DRESSER = block(FarmhouseDecorationsModBlocks.DRESSER);
	public static final Item NIGHT_STAND = block(FarmhouseDecorationsModBlocks.NIGHT_STAND);
	public static final Item PIANO = block(FarmhouseDecorationsModBlocks.PIANO);
	public static final Item PIANO_WITH_STOOL = block(FarmhouseDecorationsModBlocks.PIANO_WITH_STOOL);
	public static final Item ROCKING_CHAIR = block(FarmhouseDecorationsModBlocks.ROCKING_CHAIR);
	public static final Item ROUND_TABLE = block(FarmhouseDecorationsModBlocks.ROUND_TABLE);
	public static final Item STANDING_LAMP = block(FarmhouseDecorationsModBlocks.STANDING_LAMP);
	public static final Item CHAINED_KEROSENE_LANTERN = block(FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN);
	public static final Item SOFA_LEFT = block(FarmhouseDecorationsModBlocks.SOFA_LEFT);
	public static final Item SOFA_RIGHT = block(FarmhouseDecorationsModBlocks.SOFA_RIGHT);
	public static final Item SOFA_MIDDLE = block(FarmhouseDecorationsModBlocks.SOFA_MIDDLE);
	public static final Item TOOL_BOARD = block(FarmhouseDecorationsModBlocks.TOOL_BOARD);
	public static final Item WARDROBE = block(FarmhouseDecorationsModBlocks.WARDROBE);
	public static final Item COAT_HANGER = block(FarmhouseDecorationsModBlocks.COAT_HANGER);
	public static final Item WINE_GLASS = block(FarmhouseDecorationsModBlocks.WINE_GLASS);
	public static final Item WORKBENCH = block(FarmhouseDecorationsModBlocks.WORKBENCH);
	public static final Item KITCHEN_ANTIQUE_OVEN = block(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN);
	public static final Item KITCHEN_ANTIQUE_OVEN_DECORATED = block(FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN_DECORATED);
	public static final Item KITCHEN_COUNTER = block(FarmhouseDecorationsModBlocks.KITCHEN_COUNTER);
	public static final Item KITCHEN_CORNER_CABINET = block(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_CABINET);
	public static final Item KITCHEN_DRAWERS = block(FarmhouseDecorationsModBlocks.KITCHEN_DRAWERS);
	public static final Item KITCHEN_HALFWALL_SHELF = block(FarmhouseDecorationsModBlocks.KITCHEN_HALFWALL_SHELF);
	public static final Item KITCHEN_SINK = block(FarmhouseDecorationsModBlocks.KITCHEN_SINK);
	public static final Item KITCHEN_WALL_CABINET = block(FarmhouseDecorationsModBlocks.KITCHEN_WALL_CABINET);
	public static final Item KITCHEN_CORNER_WALL_CABINET = block(FarmhouseDecorationsModBlocks.KITCHEN_CORNER_WALL_CABINET);
	public static final Item KITCHEN_WALL_SHELF = block(FarmhouseDecorationsModBlocks.KITCHEN_WALL_SHELF);
	public static final Item BATHTUB = block(FarmhouseDecorationsModBlocks.BATHTUB);
	public static final Item BATHROOM_CABINET = block(FarmhouseDecorationsModBlocks.BATHROOM_CABINET);
	public static final Item BATHROOM_COUNTER = block(FarmhouseDecorationsModBlocks.BATHROOM_COUNTER);
	public static final Item BATHROOM_SINK = block(FarmhouseDecorationsModBlocks.BATHROOM_SINK);
	public static final Item BIG_BATHROOM_MIRROR = block(FarmhouseDecorationsModBlocks.BIG_BATHROOM_MIRROR);
	public static final Item SMALL_BATHROOM_MIRROR = block(FarmhouseDecorationsModBlocks.SMALL_BATHROOM_MIRROR);
	public static final Item TOWEL_HANGER = block(FarmhouseDecorationsModBlocks.TOWEL_HANGER);
	public static final Item FRIDGE = block(FarmhouseDecorationsModBlocks.FRIDGE);
	public static final Item LAMP = block(FarmhouseDecorationsModBlocks.LAMP);
	public static final Item CIGAR_BOX = block(FarmhouseDecorationsModBlocks.CIGAR_BOX);
	public static final Item GRAMOPHONE = block(FarmhouseDecorationsModBlocks.GRAMOPHONE);
	public static final Item RADIATOR = block(FarmhouseDecorationsModBlocks.RADIATOR);
	public static final Item PHONE = block(FarmhouseDecorationsModBlocks.PHONE);
	public static final Item ANCIENT_TV_WITH_LEGS = block(FarmhouseDecorationsModBlocks.ANCIENT_TV_WITH_LEGS);
	public static final Item ANCIENT_TV = block(FarmhouseDecorationsModBlocks.ANCIENT_TV);
	public static final Item COFFEE_TABLE = block(FarmhouseDecorationsModBlocks.COFFEE_TABLE);
	public static final Item PILE_OF_BOOKS = block(FarmhouseDecorationsModBlocks.PILE_OF_BOOKS);
	public static final Item DESK = block(FarmhouseDecorationsModBlocks.DESK);
	public static final Item DOOR_MAT = block(FarmhouseDecorationsModBlocks.DOOR_MAT);
	public static final Item SCREEN_CLOTH_1 = block(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_1);
	public static final Item SCREEN_CLOTH_2 = block(FarmhouseDecorationsModBlocks.SCREEN_CLOTH_2);
	public static final Item SCREEN_WOOD_1 = block(FarmhouseDecorationsModBlocks.SCREEN_WOOD_1);
	public static final Item SCREEN_WOOD_2 = block(FarmhouseDecorationsModBlocks.SCREEN_WOOD_2);
	public static final Item RADIO = block(FarmhouseDecorationsModBlocks.RADIO);
	public static final Item RUG_1X_3 = block(FarmhouseDecorationsModBlocks.RUG_1X_3);
	public static final Item RUG_3X_3 = block(FarmhouseDecorationsModBlocks.RUG_3X_3);
	public static final Item SEASONING_RACK = block(FarmhouseDecorationsModBlocks.SEASONING_RACK);
	public static final Item TYPEWRITER = block(FarmhouseDecorationsModBlocks.TYPEWRITER);
	public static final Item WALL_SHELF = block(FarmhouseDecorationsModBlocks.WALL_SHELF);
	public static final Item ANCIENT_TV_STAND = block(FarmhouseDecorationsModBlocks.ANCIENT_TV_STAND);
	public static final Item CEILING_LAMP = block(FarmhouseDecorationsModBlocks.CEILING_LAMP);
	public static final Item CHANDELIER = block(FarmhouseDecorationsModBlocks.CHANDELIER);
	public static final Item CURTAIN_ROD = block(FarmhouseDecorationsModBlocks.CURTAIN_ROD);
	public static final Item CURTAINS_1W = block(FarmhouseDecorationsModBlocks.CURTAINS_1W);
	public static final Item CURTAINS_1W_LONG = block(FarmhouseDecorationsModBlocks.CURTAINS_1W_LONG);
	public static final Item CURTAINS_LEFT = block(FarmhouseDecorationsModBlocks.CURTAINS_LEFT);
	public static final Item CURTAINS_LEFT_LONG = block(FarmhouseDecorationsModBlocks.CURTAINS_LEFT_LONG);
	public static final Item CURTAINS_RIGHT = block(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT);
	public static final Item CURTAINS_RIGHT_LONG = block(FarmhouseDecorationsModBlocks.CURTAINS_RIGHT_LONG);
	public static final Item HANGING_SHELF = block(FarmhouseDecorationsModBlocks.HANGING_SHELF);
	public static final Item OLD_BATHROOM_RADIATOR = block(FarmhouseDecorationsModBlocks.OLD_BATHROOM_RADIATOR);
	public static final Item WALL_TELEPHONE = block(FarmhouseDecorationsModBlocks.WALL_TELEPHONE);
	public static final Item TOILET = block(FarmhouseDecorationsModBlocks.TOILET);
	public static final Item WALL_LAMP_CANDLE = block(FarmhouseDecorationsModBlocks.WALL_LAMP_CANDLE);
	public static final Item WALL_SHADE = block(FarmhouseDecorationsModBlocks.WALL_SHADE);
	public static final Item WINDOW_BLINDS = block(FarmhouseDecorationsModBlocks.WINDOW_BLINDS);
	public static final Item WINDOW_BLINDS_LONG = block(FarmhouseDecorationsModBlocks.WINDOW_BLINDS_LONG);
	public static void init() {
	}

	private static Item block(Block block) {
		return block(block, new Item.Properties());
	}

	private static Item block(Block block, Item.Properties properties) {
		return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(FarmhouseDecorationsMod.MODID, BuiltInRegistries.BLOCK.getKey(block).getPath()), new BlockItem(block, properties));
	}
}
