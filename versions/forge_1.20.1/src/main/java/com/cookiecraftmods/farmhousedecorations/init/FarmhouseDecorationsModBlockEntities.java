package com.cookiecraftmods.farmhousedecorations.init;
import com.cookiecraftmods.farmhousedecorations.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;

public final class FarmhouseDecorationsModBlockEntities {
    public static final net.minecraftforge.registries.DeferredRegister<BlockEntityType<?>> REGISTRY = net.minecraftforge.registries.DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, "farmhouse_decorations");
    public static final net.minecraftforge.registries.RegistryObject<BlockEntityType<DecorationPlacementBlockEntity>> DECORATION_PLACEMENT = REGISTRY.register("decoration_placement", () -> BlockEntityType.Builder.of(DecorationPlacementBlockEntity::new, net.minecraft.core.registries.BuiltInRegistries.BLOCK.stream().filter(com.cookiecraftmods.eqlib.placement.PrecisePlacement::supported).toArray(net.minecraft.world.level.block.Block[]::new)).build(null));
    public static final net.minecraftforge.registries.RegistryObject<BlockEntityType<CuckooClockBlockEntity>> CUCKOO_CLOCK = REGISTRY.register("cuckoo_clock", () -> BlockEntityType.Builder.of(CuckooClockBlockEntity::new, FarmhouseDecorationsModBlocks.CUCKOO_CLOCK.get()).build(null));
}
