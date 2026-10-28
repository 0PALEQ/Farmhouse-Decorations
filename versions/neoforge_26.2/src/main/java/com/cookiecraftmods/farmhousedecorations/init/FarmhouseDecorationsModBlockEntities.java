package com.cookiecraftmods.farmhousedecorations.init;
import com.cookiecraftmods.farmhousedecorations.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

public final class FarmhouseDecorationsModBlockEntities {
    public static final net.neoforged.neoforge.registries.DeferredRegister<BlockEntityType<?>> REGISTRY = net.neoforged.neoforge.registries.DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, "farmhouse_decorations");
    public static final net.neoforged.neoforge.registries.DeferredHolder<BlockEntityType<?>, BlockEntityType<DecorationPlacementBlockEntity>> DECORATION_PLACEMENT = REGISTRY.register("decoration_placement", () -> new BlockEntityType<>(DecorationPlacementBlockEntity::new, net.minecraft.core.registries.BuiltInRegistries.BLOCK.stream().filter(com.cookiecraftmods.eqlib.placement.PrecisePlacement::supported).collect(java.util.stream.Collectors.toSet())));
    public static final net.neoforged.neoforge.registries.DeferredHolder<BlockEntityType<?>, BlockEntityType<CuckooClockBlockEntity>> CUCKOO_CLOCK = REGISTRY.register("cuckoo_clock", () -> new BlockEntityType<>(CuckooClockBlockEntity::new, java.util.Set.of(FarmhouseDecorationsModBlocks.CUCKOO_CLOCK.get())));
}
