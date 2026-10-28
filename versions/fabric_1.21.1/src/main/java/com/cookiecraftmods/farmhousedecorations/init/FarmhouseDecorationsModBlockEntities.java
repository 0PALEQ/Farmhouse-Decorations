package com.cookiecraftmods.farmhousedecorations.init;
import com.cookiecraftmods.farmhousedecorations.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;

public final class FarmhouseDecorationsModBlockEntities {
    public static final BlockEntityType<DecorationPlacementBlockEntity> DECORATION_PLACEMENT = register("decoration_placement", BlockEntityType.Builder.of(DecorationPlacementBlockEntity::new, net.minecraft.core.registries.BuiltInRegistries.BLOCK.stream().filter(com.cookiecraftmods.eqlib.placement.PrecisePlacement::supported).toArray(net.minecraft.world.level.block.Block[]::new)).build(null));
    public static final BlockEntityType<CuckooClockBlockEntity> CUCKOO_CLOCK = register("cuckoo_clock", BlockEntityType.Builder.of(CuckooClockBlockEntity::new, FarmhouseDecorationsModBlocks.CUCKOO_CLOCK).build(null));
    private static <T extends net.minecraft.world.level.block.entity.BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return net.minecraft.core.Registry.register(net.minecraft.core.registries.BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("farmhouse_decorations", name), type);
    }
    public static void init() {}
}
