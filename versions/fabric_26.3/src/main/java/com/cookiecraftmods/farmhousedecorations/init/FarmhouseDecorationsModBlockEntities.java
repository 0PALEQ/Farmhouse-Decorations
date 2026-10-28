package com.cookiecraftmods.farmhousedecorations.init;
import com.cookiecraftmods.farmhousedecorations.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

public final class FarmhouseDecorationsModBlockEntities {
    public static final BlockEntityType<DecorationPlacementBlockEntity> DECORATION_PLACEMENT = register("decoration_placement", new BlockEntityType<>(DecorationPlacementBlockEntity::new, net.minecraft.core.registries.BuiltInRegistries.BLOCK.stream().filter(com.cookiecraftmods.eqlib.placement.PrecisePlacement::supported).collect(java.util.stream.Collectors.toSet())));
    public static final BlockEntityType<CuckooClockBlockEntity> CUCKOO_CLOCK = register("cuckoo_clock", new BlockEntityType<>(CuckooClockBlockEntity::new, java.util.Set.of(FarmhouseDecorationsModBlocks.CUCKOO_CLOCK)));
    private static <T extends net.minecraft.world.level.block.entity.BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return net.minecraft.core.Registry.register(net.minecraft.core.registries.BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath("farmhouse_decorations", name), type);
    }
    public static void init() {}
}
