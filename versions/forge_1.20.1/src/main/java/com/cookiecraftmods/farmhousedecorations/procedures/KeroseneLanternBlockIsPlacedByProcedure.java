package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;

public class KeroseneLanternBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN.get().defaultBlockState(), 3);
		}
		world.setBlock(BlockPos.containing(x, y, z), FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN.get().defaultBlockState(), 3);
	}
}
