package com.cookiecraftmods.farmhousedecorations.init;

import com.cookiecraftmods.farmhousedecorations.block.AncientTVStandBlock;
import com.cookiecraftmods.farmhousedecorations.block.CeilingLampBlock;
import com.cookiecraftmods.farmhousedecorations.block.ChandelierBlock;
import com.cookiecraftmods.farmhousedecorations.block.CurtainRodBlock;
import com.cookiecraftmods.farmhousedecorations.block.Curtains1wBlock;
import com.cookiecraftmods.farmhousedecorations.block.Curtains1wLongBlock;
import com.cookiecraftmods.farmhousedecorations.block.CurtainsLeftBlock;
import com.cookiecraftmods.farmhousedecorations.block.CurtainsLeftLongBlock;
import com.cookiecraftmods.farmhousedecorations.block.CurtainsRightBlock;
import com.cookiecraftmods.farmhousedecorations.block.CurtainsRightLongBlock;
import com.cookiecraftmods.farmhousedecorations.block.HangingShelfBlock;
import com.cookiecraftmods.farmhousedecorations.block.OldBathroomRadiatorBlock;
import com.cookiecraftmods.farmhousedecorations.block.WallTelephoneBlock;
import com.cookiecraftmods.farmhousedecorations.block.ToiletBlock;
import com.cookiecraftmods.farmhousedecorations.block.WallLampCandleBlock;
import com.cookiecraftmods.farmhousedecorations.block.WallShadeBlock;
import com.cookiecraftmods.farmhousedecorations.block.WindowBlindsBlock;
import com.cookiecraftmods.farmhousedecorations.block.WindowBlindsLongBlock;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.core.Registry;

import com.cookiecraftmods.farmhousedecorations.block.*;
import com.cookiecraftmods.farmhousedecorations.FarmhouseDecorationsMod;

public class FarmhouseDecorationsModBlocks {
	public static final Block LIQUOR_CABINET = register("liquor_cabinet", new LiquorCabinetBlock());
	public static final Block KEROSENE_LANTERN = register("kerosene_lantern", new KeroseneLanternBlock());
	public static final Block ACOUSTIC_GUITAR = register("acoustic_guitar", new AcousticGuitarBlock());
	public static final Block DOUBLE_BED = register("double_bed", new DoubleBedBlock());
	public static final Block ANTIQUE_OVEN = register("antique_oven", new AntiqueOvenBlock());
	public static final Block SINGLE_BED = register("single_bed", new SingleBedBlock());
	public static final Block TALL_BOOKSHELF = register("tall_bookshelf", new TallBookshelfBlock());
	public static final Block WINE_BOTTLE = register("wine_bottle", new WineBottleBlock());
	public static final Block RED_WINE_BOTTLE = register("red_wine_bottle", new RedWineBottleBlock());
	public static final Block CUCKOO_CLOCK = register("cuckoo_clock", new CuckooClockBlock());
	public static final Block DINING_CHAIR = register("dining_chair", new DiningChairBlock());
	public static final Block DINING_TABLE_SIDE = register("dining_table_side", new DiningTableSideBlock());
	public static final Block DINING_TABLE_MIDDLE = register("dining_table_middle", new DiningTableMiddleBlock());
	public static final Block DRESSER = register("dresser", new DresserBlock());
	public static final Block NIGHT_STAND = register("night_stand", new NightStandBlock());
	public static final Block PIANO = register("piano", new PianoBlock());
	public static final Block PIANO_WITH_STOOL = register("piano_with_stool", new PianoWithStoolBlock());
	public static final Block ROCKING_CHAIR = register("rocking_chair", new RockingChairBlock());
	public static final Block ROUND_TABLE = register("round_table", new RoundTableBlock());
	public static final Block STANDING_LAMP = register("standing_lamp", new StandingLampBlock());
	public static final Block CHAINED_KEROSENE_LANTERN = register("chained_kerosene_lantern", new ChainedKeroseneLanternBlock());
	public static final Block SOFA_LEFT = register("sofa_left", new SofaLeftBlock());
	public static final Block SOFA_RIGHT = register("sofa_right", new SofaRightBlock());
	public static final Block SOFA_MIDDLE = register("sofa_middle", new SofaMiddleBlock());
	public static final Block TOOL_BOARD = register("tool_board", new ToolBoardBlock());
	public static final Block WARDROBE = register("wardrobe", new WardrobeBlock());
	public static final Block COAT_HANGER = register("coat_hanger", new CoatHangerBlock());
	public static final Block WINE_GLASS = register("wine_glass", new WineGlassBlock());
	public static final Block WORKBENCH = register("workbench", new WorkbenchBlock());
	public static final Block KITCHEN_ANTIQUE_OVEN = register("kitchen_antique_oven", new KitchenAntiqueOvenBlock());
	public static final Block KITCHEN_ANTIQUE_OVEN_DECORATED = register("kitchen_antique_oven_decorated", new KitchenAntiqueOvenDecoratedBlock());
	public static final Block KITCHEN_COUNTER = register("kitchen_counter", new KitchenCounterBlock());
	public static final Block KITCHEN_CORNER_CABINET = register("kitchen_corner_cabinet", new KitchenCornerCabinetBlock());
	public static final Block KITCHEN_DRAWERS = register("kitchen_drawers", new KitchenDrawersBlock());
	public static final Block KITCHEN_HALFWALL_SHELF = register("kitchen_halfwall_shelf", new KitchenHalfwallShelfBlock());
	public static final Block KITCHEN_SINK = register("kitchen_sink", new KitchenSinkBlock());
	public static final Block KITCHEN_WALL_CABINET = register("kitchen_wall_cabinet", new KitchenWallCabinetBlock());
	public static final Block KITCHEN_CORNER_WALL_CABINET = register("kitchen_corner_wall_cabinet", new KitchenCornerWallCabinetBlock());
	public static final Block KITCHEN_WALL_SHELF = register("kitchen_wall_shelf", new KitchenWallShelfBlock());
	public static final Block BATHTUB = register("bathtub", new BathtubBlock());
	public static final Block BATHROOM_CABINET = register("bathroom_cabinet", new BathroomCabinetBlock());
	public static final Block BATHROOM_COUNTER = register("bathroom_counter", new BathroomCounterBlock());
	public static final Block BATHROOM_SINK = register("bathroom_sink", new BathroomSinkBlock());
	public static final Block BIG_BATHROOM_MIRROR = register("big_bathroom_mirror", new BigBathroomMirrorBlock());
	public static final Block SMALL_BATHROOM_MIRROR = register("small_bathroom_mirror", new SmallBathroomMirrorBlock());
	public static final Block TOWEL_HANGER = register("towel_hanger", new TowelHangerBlock());
	public static final Block FRIDGE = register("fridge", new FridgeBlock());
	public static final Block LAMP = register("lamp", new LampBlock());
	public static final Block CIGAR_BOX = register("cigar_box", new CigarBoxBlock());
	public static final Block GRAMOPHONE = register("gramophone", new GramophoneBlock());
	public static final Block RADIATOR = register("radiator", new RadiatorBlock());
	public static final Block PHONE = register("phone", new PhoneBlock());
	public static final Block ANCIENT_TV_WITH_LEGS = register("ancient_tv_with_legs", new AncientTVWithLegsBlock());
	public static final Block ANCIENT_TV = register("ancient_tv", new AncientTVBlock());
	public static final Block COFFEE_TABLE = register("coffee_table", new CoffeeTableBlock());
	public static final Block PILE_OF_BOOKS = register("pile_of_books", new PileOfBooksBlock());
	public static final Block DESK = register("desk", new DeskBlock());
	public static final Block DOOR_MAT = register("door_mat", new DoorMatBlock());
	public static final Block SCREEN_CLOTH_1 = register("screen_cloth_1", new ScreenCloth1Block());
	public static final Block SCREEN_CLOTH_2 = register("screen_cloth_2", new ScreenCloth2Block());
	public static final Block SCREEN_WOOD_1 = register("screen_wood_1", new ScreenWood1Block());
	public static final Block SCREEN_WOOD_2 = register("screen_wood_2", new ScreenWood2Block());
	public static final Block RADIO = register("radio", new RadioBlock());
	public static final Block RUG_1X_3 = register("rug_1x_3", new Rug1x3Block());
	public static final Block RUG_3X_3 = register("rug_3x_3", new Rug3x3Block());
	public static final Block SEASONING_RACK = register("seasoning_rack", new SeasoningRackBlock());
	public static final Block TYPEWRITER = register("typewriter", new TypewriterBlock());
	public static final Block WALL_SHELF = register("wall_shelf", new WallShelfBlock());
	public static final Block ANCIENT_TV_STAND = register("ancient_tv_stand", new AncientTVStandBlock());
	public static final Block CEILING_LAMP = register("ceiling_lamp", new CeilingLampBlock());
	public static final Block CHANDELIER = register("chandelier", new ChandelierBlock());
	public static final Block CURTAIN_ROD = register("curtain_rod", new CurtainRodBlock());
	public static final Block CURTAINS_1W = register("curtains_1w", new Curtains1wBlock());
	public static final Block CURTAINS_1W_LONG = register("curtains_1w_long", new Curtains1wLongBlock());
	public static final Block CURTAINS_LEFT = register("curtains_left", new CurtainsLeftBlock());
	public static final Block CURTAINS_LEFT_LONG = register("curtains_left_long", new CurtainsLeftLongBlock());
	public static final Block CURTAINS_RIGHT = register("curtains_right", new CurtainsRightBlock());
	public static final Block CURTAINS_RIGHT_LONG = register("curtains_right_long", new CurtainsRightLongBlock());
	public static final Block HANGING_SHELF = register("hanging_shelf", new HangingShelfBlock());
	public static final Block OLD_BATHROOM_RADIATOR = register("old_bathroom_radiator", new OldBathroomRadiatorBlock());
	public static final Block WALL_TELEPHONE = register("wall_telephone", new WallTelephoneBlock());
	public static final Block TOILET = register("toilet", new ToiletBlock());
	public static final Block WALL_LAMP_CANDLE = register("wall_lamp_candle", new WallLampCandleBlock());
	public static final Block WALL_SHADE = register("wall_shade", new WallShadeBlock());
	public static final Block WINDOW_BLINDS = register("window_blinds", new WindowBlindsBlock());
	public static final Block WINDOW_BLINDS_LONG = register("window_blinds_long", new WindowBlindsLongBlock());
	public static void init() {
	}

	private static Block register(String path, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(FarmhouseDecorationsMod.MODID, path), block);
	}
}
