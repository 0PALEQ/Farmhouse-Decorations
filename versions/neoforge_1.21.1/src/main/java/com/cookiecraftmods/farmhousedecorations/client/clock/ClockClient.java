package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlockEntities;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = "farmhouse_decorations", value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public final class ClockClient {
    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(FarmhouseDecorationsModBlockEntities.CUCKOO_CLOCK.get(), CuckooClockRenderer::new);
    }
}

