package com.cookiecraftmods.farmhousedecorations.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;

public class KeroseneLanternBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level level && !level.isClientSide() && world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), FarmhouseDecorationsModBlocks.CHAINED_KEROSENE_LANTERN.defaultBlockState(), 3);
		}
	}
}
