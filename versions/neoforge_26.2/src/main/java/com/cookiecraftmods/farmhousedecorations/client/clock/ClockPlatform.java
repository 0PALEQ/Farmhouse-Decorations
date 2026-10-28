package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.eqlib.core.clock.ClockHandMesh;

import com.cookiecraftmods.farmhousedecorations.block.entity.CuckooClockBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import java.io.IOException;

final class ClockPlatform {
    private ClockPlatform() {}

    static long time(CuckooClockBlockEntity clock) {
        return clock.getLevel().getOverworldClockTime();
    }

    private static Identifier id(String path) { return Identifier.fromNamespaceAndPath("farmhouse_decorations", path); }

    static RenderType layer(boolean wooden) {
        return RenderTypes.entityCutout(id("textures/block/cuckoo-clock-texture.png"));
    }

    static CuckooClockHands loadHands() {
        try (var reader = Minecraft.getInstance().getResourceManager()
                .getResourceOrThrow(id("models/custom/cuckoo-clock.json")).openAsReader()) {
            return CuckooClockHands.read(reader);
        } catch (IOException exception) {
            throw new IllegalStateException("Unable to load cuckoo clock hands", exception);
        }
    }

    static void draw(ClockHandMesh hand, PoseStack.Pose pose, VertexConsumer vertices, int light) {
        for (ClockHandMesh.Vertex v : hand.vertices()) {
            vertices.addVertex(pose.pose(), v.x(), v.y(), v.z()).setColor(255, 255, 255, 255)
                    .setUv(v.u(), v.v()).setOverlay(OverlayTexture.NO_OVERLAY).setLight(light)
                    .setNormal(pose, v.nx(), v.ny(), v.nz());
        }
    }
}
