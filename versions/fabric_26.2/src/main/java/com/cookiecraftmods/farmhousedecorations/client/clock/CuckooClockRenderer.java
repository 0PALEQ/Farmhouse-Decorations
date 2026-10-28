package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.eqlib.core.clock.ClockTime;
import com.cookiecraftmods.eqlib.core.clock.ClockHandMesh;
import com.cookiecraftmods.eqlib.placement.PrecisePlacement;

import com.cookiecraftmods.farmhousedecorations.block.CuckooClockBlock;
import com.cookiecraftmods.farmhousedecorations.block.entity.CuckooClockBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;

public final class CuckooClockRenderer implements BlockEntityRenderer<CuckooClockBlockEntity, CuckooClockRenderer.State> {
    private final CuckooClockHands hands = ClockPlatform.loadHands();

    public CuckooClockRenderer(BlockEntityRendererProvider.Context context) {}

    public static final class State extends BlockEntityRenderState {
        Vec3 placementOffset;
        float facing, hour, minute;
    }

    @Override
    public State createRenderState() { return new State(); }

    @Override
    public void extractRenderState(CuckooClockBlockEntity clock, State state, float partialTick,
                                   Vec3 camera, ModelFeatureRenderer.CrumblingOverlay breaking) {
        BlockEntityRenderer.super.extractRenderState(clock, state, partialTick, camera, breaking);
        state.placementOffset = com.cookiecraftmods.eqlib.placement.PrecisePlacement.offset(clock.getLevel(), clock.getBlockPos());
        state.facing = -clock.getBlockState().getValue(CuckooClockBlock.FACING).toYRot() + 180;
        long time = clock.getLevel() == null ? 0 : ClockPlatform.time(clock);
        state.hour = ClockTime.hourAngle(time);
        state.minute = ClockTime.minuteAngle(time);
    }

    @Override
    public void submit(State state, PoseStack pose, SubmitNodeCollector collector, CameraRenderState camera) {
        pose.pushPose();
        pose.translate(state.placementOffset.x, state.placementOffset.y, state.placementOffset.z);
        pose.translate(0.5, 0.5, 0.5);
        pose.mulPose(new org.joml.Matrix4f().rotation(Axis.YP.rotationDegrees(state.facing)));
        pose.translate(-0.5, -0.5, -0.5);
        for (int i = 0; i < 2; i++) {
            ClockHandMesh hand = hands.hand(i);
            pose.pushPose();
            pose.translate(hands.pivotX, hands.pivotY, hands.pivotZ - i * 0.001);
            pose.mulPose(new org.joml.Matrix4f().rotation(Axis.ZP.rotationDegrees(
                    hand.uprightRotation() + (i == 0 ? state.hour : state.minute))));
            int light = state.lightCoords;
            collector.submitCustomGeometry(pose, ClockPlatform.layer(false),
                    (transformedPose, vertices) -> ClockPlatform.draw(hand, transformedPose, vertices, light));
            pose.popPose();
        }
        pose.popPose();
    }
}
