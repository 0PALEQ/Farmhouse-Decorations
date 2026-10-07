package com.cookiecraftmods.farmhousedecorations.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModItems {
	public static final Item LIQUOR_CABINET = block("liquor_cabinet", FarmhouseDecorationsModBlocks.LIQUOR_CABINET);
	public static final Item KEROSENE_LANTERN = block("kerosene_lantern", FarmhouseDecorationsModBlocks.KEROSENE_LANTERN);
	public static final Item ACOUSTIC_GUITAR = block("acoustic_guitar", FarmhouseDecorationsModBlocks.ACOUSTIC_GUITAR);
	public static final Item DOUBLE_BED = block("double_bed", FarmhouseDecorationsModBlocks.DOUBLE_BED);
	public static final Item ANTIQUE_OVEN = block("antique_oven", FarmhouseDecorationsModBlocks.ANTIQUE_OVEN);
	public static final Item SINGLE_BED = block("single_bed", FarmhouseDecorationsModBlocks.SINGLE_BED);
	public static final Item TALL_BOOKSHELF = block("tall_bookshelf", FarmhouseDecorationsModBlocks.TALL_BOOKSHELF);
	public static final Item WINE_BOTTLE = block("wine_bottle", FarmhouseDecorationsModBlocks.WINE_BOTTLE);
	public static final Item RED_WINE_BOTTLE = block("red_wine_bottle", FarmhouseDecorationsModBlocks.RED_WINE_BOTTLE);
	public static final Item CUCKOO_CLOCK = block("cuckoo_clock", FarmhouseDecorationsModBlocks.CUCKOO_CLOCK);
	public static final Item DINING_CHAIR = block("dining_chair", FarmhouseDecorationsModBlocks.DINING_CHAIR);
	public static final Item DINING_TABLE_SIDE = block("dining_table_side", FarmhouseDecorationsModBlocks.DINING_TABLE_SIDE);
	public static final Item DINING_TABLE_MIDDLE = block("dining_table_middle", FarmhouseDecorationsModBlocks.DINING_TABLE_MIDDLE);
	public static final Item DRESSER = block("dresser", FarmhouseDecorationsModBlocks.DRESSER);
	public static final Item NIGHT_STAND = block("night_stand", FarmhouseDecorationsModBlocks.NIGHT_STAND);
	public static final Item PIANO = block("piano", FarmhouseDecorationsModBlocks.PIANO);
	public static final Item PIANO_WITH_STOOL = block("piano_with_stool", FarmhouseDecorationsModBlocks.PIANO_WITH_STOOL);
	public static final Item ROCKING_CHAIR = block("rocking_chair", FarmhouseDecorationsModBlocks.ROCKING_CHAIR);
	public static final Item ROUND_TABLE = block("round_table", FarmhouseDecorationsModBlocks.ROUND_TABLE);
	public static final Item STANDING_LAMP = block("standing_lamp", FarmhouseDecorationsModBlocks.STANDING_LAMP);
	public static final Item CHAINED_KEROSENE_LANTERN = block("chained_kerosene_lantern", FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN);
	public static final Item SOFA_LEFT = block("sofa_left", FarmhouseDecorationsModBlocks.SOFA_LEFT);
	public static final Item SOFA_RIGHT = block("sofa_right", FarmhouseDecorationsModBlocks.SOFA_RIGHT);
	public static final Item SOFA_MIDDLE = block("sofa_middle", FarmhouseDecorationsModBlocks.SOFA_MIDDLE);
	public static final Item TOOL_BOARD = block("tool_board", FarmhouseDecorationsModBlocks.TOOL_BOARD);
	public static final Item WARDROBE = block("wardrobe", FarmhouseDecorationsModBlocks.WARDROBE);
	public static final Item COAT_HANGER = block("coat_hanger", FarmhouseDecorationsModBlocks.COAT_HANGER);
	public static final Item WINE_GLASS = block("wine_glass", FarmhouseDecorationsModBlocks.WINE_GLASS);
	public static final Item WORKBENCH = block("workbench", FarmhouseDecorationsModBlocks.WORKBENCH);
	public static final Item KITCHEN_ANTIQUE_OVEN = block("kitchen_antique_oven", FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN);
	public static final Item KITCHEN_ANTIQUE_OVEN_DECORATED = block("kitchen_antique_oven_decorated", FarmhouseDecorationsModBlocks.KITCHEN_ANTIQUE_OVEN_DECORATED);
	public static final Item KITCHEN_COUNTER = block("kitchen_counter", FarmhouseDecorationsModBlocks.KITCHEN_COUNTER);
	public static final Item KITCHEN_CORNER_CABINET = block("kitchen_corner_cabinet", FarmhouseDecorationsModBlocks.KITCHEN_CORNER_CABINET);
	public static final Item KITCHEN_DRAWERS = block("kitchen_drawers", FarmhouseDecorationsModBlocks.KITCHEN_DRAWERS);
	public static final Item KITCHEN_HALFWALL_SHELF = block("kitchen_halfwall_shelf", FarmhouseDecorationsModBlocks.KITCHEN_HALFWALL_SHELF);
	public static final Item KITCHEN_SINK = block("kitchen_sink", FarmhouseDecorationsModBlocks.KITCHEN_SINK);
	public static final Item KITCHEN_WALL_CABINET = block("kitchen_wall_cabinet", FarmhouseDecorationsModBlocks.KITCHEN_WALL_CABINET);
	public static final Item KITCHEN_CORNER_WALL_CABINET = block("kitchen_corner_wall_cabinet", FarmhouseDecorationsModBlocks.KITCHEN_CORNER_WALL_CABINET);
	public static final Item KITCHEN_WALL_SHELF = block("kitchen_wall_shelf", FarmhouseDecorationsModBlocks.KITCHEN_WALL_SHELF);
	public static final Item BATHTUB = block("bathtub", FarmhouseDecorationsModBlocks.BATHTUB);
	public static final Item BATHROOM_CABINET = block("bathroom_cabinet", FarmhouseDecorationsModBlocks.BATHROOM_CABINET);
	public static final Item BATHROOM_COUNTER = block("bathroom_counter", FarmhouseDecorationsModBlocks.BATHROOM_COUNTER);
	public static final Item BATHROOM_SINK = block("bathroom_sink", FarmhouseDecorationsModBlocks.BATHROOM_SINK);
	public static final Item BIG_BATHROOM_MIRROR = block("big_bathroom_mirror", FarmhouseDecorationsModBlocks.BIG_BATHROOM_MIRROR);
	public static final Item SMALL_BATHROOM_MIRROR = block("small_bathroom_mirror", FarmhouseDecorationsModBlocks.SMALL_BATHROOM_MIRROR);
	public static final Item TOWEL_HANGER = block("towel_hanger", FarmhouseDecorationsModBlocks.TOWEL_HANGER);
	public static final Item FRIDGE = block("fridge", FarmhouseDecorationsModBlocks.FRIDGE);
	public static final Item LAMP = block("lamp", FarmhouseDecorationsModBlocks.LAMP);
	public static final Item CIGAR_BOX = block("cigar_box", FarmhouseDecorationsModBlocks.CIGAR_BOX);
	public static final Item GRAMOPHONE = block("gramophone", FarmhouseDecorationsModBlocks.GRAMOPHONE);
	public static final Item RADIATOR = block("radiator", FarmhouseDecorationsModBlocks.RADIATOR);
	public static final Item PHONE = block("phone", FarmhouseDecorationsModBlocks.PHONE);
	public static final Item ANCIENT_TV_WITH_LEGS = block("ancient_tv_with_legs", FarmhouseDecorationsModBlocks.ANCIENT_TV_WITH_LEGS);
	public static final Item ANCIENT_TV = block("ancient_tv", FarmhouseDecorationsModBlocks.ANCIENT_TV);
	public static final Item COFFEE_TABLE = block("coffee_table", FarmhouseDecorationsModBlocks.COFFEE_TABLE);
	public static final Item PILE_OF_BOOKS = block("pile_of_books", FarmhouseDecorationsModBlocks.PILE_OF_BOOKS);
	public static final Item DESK = block("desk", FarmhouseDecorationsModBlocks.DESK);
	public static final Item DOOR_MAT = block("door_mat", FarmhouseDecorationsModBlocks.DOOR_MAT);
	public static final Item SCREEN_CLOTH_1 = block("screen_cloth_1", FarmhouseDecorationsModBlocks.SCREEN_CLOTH_1);
	public static final Item SCREEN_CLOTH_2 = block("screen_cloth_2", FarmhouseDecorationsModBlocks.SCREEN_CLOTH_2);
	public static final Item SCREEN_WOOD_1 = block("screen_wood_1", FarmhouseDecorationsModBlocks.SCREEN_WOOD_1);
	public static final Item SCREEN_WOOD_2 = block("screen_wood_2", FarmhouseDecorationsModBlocks.SCREEN_WOOD_2);
	public static final Item RADIO = block("radio", FarmhouseDecorationsModBlocks.RADIO);
	public static final Item RUG_1X_3 = block("rug_1x_3", FarmhouseDecorationsModBlocks.RUG_1X_3);
	public static final Item RUG_3X_3 = block("rug_3x_3", FarmhouseDecorationsModBlocks.RUG_3X_3);
	public static final Item SEASONING_RACK = block("seasoning_rack", FarmhouseDecorationsModBlocks.SEASONING_RACK);
	public static final Item TYPEWRITER = block("typewriter", FarmhouseDecorationsModBlocks.TYPEWRITER);
	public static final Item WALL_SHELF = block("wall_shelf", FarmhouseDecorationsModBlocks.WALL_SHELF);
	public static final Item ANCIENT_TV_STAND = block("ancient_tv_stand", FarmhouseDecorationsModBlocks.ANCIENT_TV_STAND);
	public static final Item CEILING_LAMP = block("ceiling_lamp", FarmhouseDecorationsModBlocks.CEILING_LAMP);
	public static final Item CHANDELIER = block("chandelier", FarmhouseDecorationsModBlocks.CHANDELIER);
	public static final Item CURTAIN_ROD = block("curtain_rod", FarmhouseDecorationsModBlocks.CURTAIN_ROD);
	public static final Item CURTAINS_1W = block("curtains_1w", FarmhouseDecorationsModBlocks.CURTAINS_1W);
	public static final Item CURTAINS_1W_LONG = block("curtains_1w_long", FarmhouseDecorationsModBlocks.CURTAINS_1W_LONG);
	public static final Item CURTAINS_LEFT = block("curtains_left", FarmhouseDecorationsModBlocks.CURTAINS_LEFT);
	public static final Item CURTAINS_LEFT_LONG = block("curtains_left_long", FarmhouseDecorationsModBlocks.CURTAINS_LEFT_LONG);
	public static final Item CURTAINS_RIGHT = block("curtains_right", FarmhouseDecorationsModBlocks.CURTAINS_RIGHT);
	public static final Item CURTAINS_RIGHT_LONG = block("curtains_right_long", FarmhouseDecorationsModBlocks.CURTAINS_RIGHT_LONG);
	public static final Item HANGING_SHELF = block("hanging_shelf", FarmhouseDecorationsModBlocks.HANGING_SHELF);
	public static final Item OLD_BATHROOM_RADIATOR = block("old_bathroom_radiator", FarmhouseDecorationsModBlocks.OLD_BATHROOM_RADIATOR);
	public static final Item WALL_TELEPHONE = block("wall_telephone", FarmhouseDecorationsModBlocks.WALL_TELEPHONE);
	public static final Item TOILET = block("toilet", FarmhouseDecorationsModBlocks.TOILET);
	public static final Item WALL_LAMP_CANDLE = block("wall_lamp_candle", FarmhouseDecorationsModBlocks.WALL_LAMP_CANDLE);
	public static final Item WALL_SHADE = block("wall_shade", FarmhouseDecorationsModBlocks.WALL_SHADE);
	public static final Item WINDOW_BLINDS = block("window_blinds", FarmhouseDecorationsModBlocks.WINDOW_BLINDS);
	public static final Item WINDOW_BLINDS_LONG = block("window_blinds_long", FarmhouseDecorationsModBlocks.WINDOW_BLINDS_LONG);
	private FarmhouseDecorationsModItems() {
	}

	public static void init() {
	}

	private static Item block(String id, Block block) {
		ResourceLocation resourceLocation = new ResourceLocation(FarmhouseDecorationsMod.MODID, id);
		return Registry.register(BuiltInRegistries.ITEM, resourceLocation, new BlockItem(block, new Item.Properties()));
	}
}
