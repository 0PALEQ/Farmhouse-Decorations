package com.cookiecraftmods.farmhousedecorations.block.entity;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public final class CuckooClockBlockEntity extends BlockEntity {
    public CuckooClockBlockEntity(BlockPos pos, BlockState state) {
        super(FarmhouseDecorationsModBlockEntities.CUCKOO_CLOCK.get(), pos, state);
    }
}
