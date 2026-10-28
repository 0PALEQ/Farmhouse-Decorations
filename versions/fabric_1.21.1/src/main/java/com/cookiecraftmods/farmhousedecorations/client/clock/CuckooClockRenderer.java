package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.eqlib.core.clock.ClockTime;
import com.cookiecraftmods.eqlib.core.clock.ClockHandMesh;
import com.cookiecraftmods.eqlib.placement.PrecisePlacement;

import com.cookiecraftmods.farmhousedecorations.block.CuckooClockBlock;
import com.cookiecraftmods.farmhousedecorations.block.entity.CuckooClockBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public final class CuckooClockRenderer implements BlockEntityRenderer<CuckooClockBlockEntity> {
    private final CuckooClockHands hands = ClockPlatform.loadHands();

    public CuckooClockRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(CuckooClockBlockEntity clock, float partialTick, PoseStack pose,
                       MultiBufferSource buffers, int light, int overlay) {
        if (clock.getLevel() == null) return;
        long time = ClockPlatform.time(clock);
        pose.pushPose();
        var placementOffset = com.cookiecraftmods.eqlib.placement.PrecisePlacement.offset(clock.getLevel(), clock.getBlockPos());
        pose.translate(placementOffset.x, placementOffset.y, placementOffset.z);
        pose.translate(0.5, 0.5, 0.5);
        pose.mulPose(Axis.YP.rotationDegrees(-clock.getBlockState()
                .getValue(CuckooClockBlock.FACING).toYRot() + 180));
        pose.translate(-0.5, -0.5, -0.5);
        for (int i = 0; i < 2; i++) {
            ClockHandMesh hand = hands.hand(i);
            pose.pushPose();
            pose.translate(hands.pivotX, hands.pivotY, hands.pivotZ - i * 0.001);
            pose.mulPose(Axis.ZP.rotationDegrees(hand.uprightRotation()
                    + (i == 0 ? ClockTime.hourAngle(time) : ClockTime.minuteAngle(time))));
            ClockPlatform.draw(hand, pose.last(), buffers.getBuffer(ClockPlatform.layer(false)), light);
            pose.popPose();
        }
        pose.popPose();
    }
}

