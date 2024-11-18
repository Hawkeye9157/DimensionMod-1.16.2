/**
    @author csipes
    @createdOn 11/7/2024 at 9:20 PM
    @projectName DimensionMod
 @packageName com.thinktank.dimensionmod.entity.model;*/
package com.thinktank.dimensionmod.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class VineSpiritModel<T extends VineSpiritEntity> extends EntityModel<T> {
    private final ModelRenderer Wig;
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer L_Arm;
    private final ModelRenderer R_Arm;
    private final ModelRenderer L_Leg;
    private final ModelRenderer R_Leg;

    public VineSpiritModel() {


        Wig = new ModelRenderer(this);
        Wig.setPos(0.0F, 24.0F, 0.0F);
        Wig.texOffs(26, 0).addBox(-1.0F, -12.0F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
        Wig.texOffs(23, 19).addBox(2.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Wig.texOffs(24, 20).addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Wig.texOffs(0, 31).addBox(1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Wig.texOffs(6, 31).addBox(1.0F, -11.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Wig.texOffs(14, 24).addBox(1.0F, -10.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
        Wig.texOffs(18, 24).addBox(1.0F, -10.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
        Wig.texOffs(22, 23).addBox(-5.0F, -7.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        Wig.texOffs(22, 13).addBox(-6.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
        Wig.texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 5.0F, 5.0F, 8.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, 24.0F, 0.0F);
        Head.texOffs(0, 13).addBox(-3.0F, -10.0F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
        Head.texOffs(26, 5).addBox(1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(2.0F, 21.0F, 0.0F);
        Body.texOffs(0, 24).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        L_Arm = new ModelRenderer(this);
        L_Arm.setPos(0.0F, 24.0F, 0.0F);
        L_Arm.texOffs(22, 31).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        R_Arm = new ModelRenderer(this);
        R_Arm.setPos(0.0F, 24.0F, 0.0F);
        R_Arm.texOffs(26, 31).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        R_Arm.texOffs(0, 0).addBox(-1.0F, -3.0F, 10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        L_Leg = new ModelRenderer(this);
        L_Leg.setPos(0.0F, 24.0F, 0.0F);
        L_Leg.texOffs(30, 11).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        R_Leg = new ModelRenderer(this);
        R_Leg.setPos(0.0F, 24.0F, 0.0F);
        R_Leg.texOffs(26, 32).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }


    @Override
    public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Wig.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        L_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        R_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        L_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        R_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
