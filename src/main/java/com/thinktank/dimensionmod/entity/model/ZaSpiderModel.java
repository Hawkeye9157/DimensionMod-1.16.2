/**
    @author csipes
    @createdOn 11/20/2024 at 9:41 AM
    @projectName DimensionMod
 @packageName com.thinktank.dimensionmod.entity.model;*/
package com.thinktank.dimensionmod.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thinktank.dimensionmod.entity.custom.ZaSpiderEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ZaSpiderModel<T extends ZaSpiderEntity> extends EntityModel<T> {

    private final ModelRenderer Mouth;
    private final ModelRenderer Lips;
    private final ModelRenderer Teeth;
    private final ModelRenderer Base;
    private final ModelRenderer Tentacles;
    private final ModelRenderer TopL_Tentacle;
    private final ModelRenderer cube_r1;
    private final ModelRenderer TopR_Tentacle;
    private final ModelRenderer cube_r2;
    private final ModelRenderer LeftT_Tentacle;
    private final ModelRenderer cube_r3;
    private final ModelRenderer LeftB_Tentacle;
    private final ModelRenderer cube_r4;
    private final ModelRenderer RightT_Tentacle;
    private final ModelRenderer cube_r5;
    private final ModelRenderer RightB_Tentacle;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Bottom_Tentacle;
    private final ModelRenderer cube_r7;

    public ZaSpiderModel() {
        texWidth = 128;
        texHeight = 128;

        Mouth = new ModelRenderer(this);
        Mouth.setPos(0.0F, 24.0F, 0.0F);
        setRotationAngle(Mouth, 0.0F, 3.1416F, 0.0F);


        Lips = new ModelRenderer(this);
        Lips.setPos(0.0F, 0.0F, 0.0F);
        Mouth.addChild(Lips);
        Lips.texOffs(0, 54).addBox(0.0F, -5.0F, -4.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);
        Lips.texOffs(28, 62).addBox(-3.0F, -4.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(20, 62).addBox(0.0F, -4.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(54, 62).addBox(-11.0F, -5.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(48, 62).addBox(9.0F, -5.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(42, 62).addBox(7.0F, -5.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(20, 65).addBox(11.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(24, 59).addBox(-12.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(8, 65).addBox(-9.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(4, 65).addBox(8.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(0, 65).addBox(7.0F, -5.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(64, 56).addBox(-8.0F, -5.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(36, 62).addBox(-9.0F, -5.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(12, 62).addBox(4.0F, -5.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 29).addBox(-7.0F, -5.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 25).addBox(-7.0F, -5.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 21).addBox(4.0F, -5.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(0, 18).addBox(-4.0F, -5.0F, 2.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
        Lips.texOffs(14, 54).addBox(-5.0F, -5.0F, -4.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);

        Teeth = new ModelRenderer(this);
        Teeth.setPos(0.0F, 0.0F, 0.0F);
        Mouth.addChild(Teeth);
        Teeth.texOffs(12, 59).addBox(0.0F, -4.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth.texOffs(60, 18).addBox(-4.0F, -4.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        Teeth.texOffs(58, 46).addBox(4.0F, -4.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Teeth.texOffs(60, 54).addBox(-7.0F, -4.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Teeth.texOffs(44, 54).addBox(0.0F, -4.0F, 1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        Teeth.texOffs(28, 54).addBox(-7.0F, -4.0F, 1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        Base = new ModelRenderer(this);
        Base.setPos(0.0F, 24.0F, 0.0F);
        setRotationAngle(Base, 0.0F, 3.1416F, 0.0F);
        Base.texOffs(0, 0).addBox(-13.0F, -2.0F, -8.0F, 26.0F, 2.0F, 16.0F, 0.0F, false);

        Tentacles = new ModelRenderer(this);
        Tentacles.setPos(0.0F, 0.0F, 0.0F);
        Base.addChild(Tentacles);


        TopL_Tentacle = new ModelRenderer(this);
        TopL_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(TopL_Tentacle);
        TopL_Tentacle.texOffs(40, 41).addBox(4.0F, -2.0F, -17.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        TopL_Tentacle.texOffs(40, 56).addBox(5.0F, -2.0F, -21.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(4.0F, 0.0F, -9.0F);
        TopL_Tentacle.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.texOffs(20, 34).addBox(-3.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        TopR_Tentacle = new ModelRenderer(this);
        TopR_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(TopR_Tentacle);
        TopR_Tentacle.texOffs(40, 34).addBox(-9.0F, -2.0F, -17.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        TopR_Tentacle.texOffs(28, 56).addBox(-8.0F, -2.0F, -21.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-9.0F, 0.0F, -9.0F);
        TopR_Tentacle.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.texOffs(0, 40).addBox(-3.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        LeftT_Tentacle = new ModelRenderer(this);
        LeftT_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(LeftT_Tentacle);
        LeftT_Tentacle.texOffs(0, 24).addBox(-17.0F, -2.0F, -7.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
        LeftT_Tentacle.texOffs(0, 48).addBox(-22.0F, -2.0F, -6.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-23.0F, 0.0F, -4.0F);
        LeftT_Tentacle.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        cube_r3.texOffs(0, 59).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        LeftB_Tentacle = new ModelRenderer(this);
        LeftB_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(LeftB_Tentacle);
        LeftB_Tentacle.texOffs(22, 18).addBox(-17.0F, -2.0F, 1.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
        LeftB_Tentacle.texOffs(20, 42).addBox(-22.0F, -2.0F, 2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-23.0F, 0.0F, 4.0F);
        LeftB_Tentacle.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
        cube_r4.texOffs(58, 40).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        RightT_Tentacle = new ModelRenderer(this);
        RightT_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(RightT_Tentacle);
        RightT_Tentacle.texOffs(20, 26).addBox(13.0F, -2.0F, -7.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
        RightT_Tentacle.texOffs(18, 48).addBox(17.0F, -2.0F, -6.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(25.0F, 0.0F, -4.0F);
        RightT_Tentacle.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
        cube_r5.texOffs(52, 56).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        RightB_Tentacle = new ModelRenderer(this);
        RightB_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(RightB_Tentacle);
        RightB_Tentacle.texOffs(0, 32).addBox(13.0F, -2.0F, 1.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
        RightB_Tentacle.texOffs(36, 48).addBox(17.0F, -2.0F, 2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(25.0F, 0.0F, 4.0F);
        RightB_Tentacle.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
        cube_r6.texOffs(58, 34).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        Bottom_Tentacle = new ModelRenderer(this);
        Bottom_Tentacle.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(Bottom_Tentacle);
        Bottom_Tentacle.texOffs(42, 18).addBox(-2.0F, -2.0F, 12.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        Bottom_Tentacle.texOffs(54, 48).addBox(-1.0F, -2.0F, 17.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-2.0F, 0.0F, 9.0F);
        Bottom_Tentacle.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
        cube_r7.texOffs(40, 26).addBox(-1.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Mouth.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
