package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlockEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = "farmhouse_decorations", value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public final class ClockClient {
    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(FarmhouseDecorationsModBlockEntities.CUCKOO_CLOCK.get(), CuckooClockRenderer::new);
    }
}

