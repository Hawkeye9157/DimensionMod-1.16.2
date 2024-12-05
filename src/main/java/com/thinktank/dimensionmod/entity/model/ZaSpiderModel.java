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
    private final ModelRenderer topRow;
    private final ModelRenderer btmRow;
    private final ModelRenderer Base;
    private final ModelRenderer TopTentacle;
    private final ModelRenderer baseTT;
    private final ModelRenderer cube_r1;
    private final ModelRenderer middleTT;
    private final ModelRenderer tipTT;
    private final ModelRenderer Btm_L_Tentacle;
    private final ModelRenderer baseBLT;
    private final ModelRenderer cube_r2;
    private final ModelRenderer middleBLT;
    private final ModelRenderer tipBLT;
    private final ModelRenderer Btm_R_Tentacle;
    private final ModelRenderer baseBRT;
    private final ModelRenderer cube_r3;
    private final ModelRenderer middleBRT;
    private final ModelRenderer tipBRT;
    private final ModelRenderer L_Top_Tentacle;
    private final ModelRenderer baseLTT;
    private final ModelRenderer middleLTT;
    private final ModelRenderer tipLTT;
    private final ModelRenderer cube_r4;
    private final ModelRenderer L_Btm_Tentacle;
    private final ModelRenderer baseLBT;
    private final ModelRenderer middleLBT;
    private final ModelRenderer tipLBT;
    private final ModelRenderer cube_r5;
    private final ModelRenderer R_Top_Tentacle;
    private final ModelRenderer baseRTT;
    private final ModelRenderer middleRTT;
    private final ModelRenderer tipRTT;
    private final ModelRenderer cube_r6;
    private final ModelRenderer R_Btm_Tentacle;
    private final ModelRenderer baseRBT;
    private final ModelRenderer middleRBT;
    private final ModelRenderer tipRBT;
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
        Lips.texOffs(0, 54).addBox(0.0F, -9.0F, -4.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);
        Lips.texOffs(28, 62).addBox(-3.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(20, 62).addBox(0.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(54, 62).addBox(-11.0F, -9.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(48, 62).addBox(9.0F, -9.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(42, 62).addBox(7.0F, -9.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(20, 65).addBox(11.0F, -8.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(24, 59).addBox(-12.0F, -8.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Lips.texOffs(8, 65).addBox(-9.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(4, 65).addBox(8.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(0, 65).addBox(7.0F, -9.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(64, 56).addBox(-8.0F, -9.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(36, 62).addBox(-9.0F, -9.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(12, 62).addBox(4.0F, -9.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 29).addBox(-7.0F, -9.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 25).addBox(-7.0F, -9.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(60, 21).addBox(4.0F, -9.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        Lips.texOffs(0, 18).addBox(-4.0F, -9.0F, 2.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
        Lips.texOffs(14, 54).addBox(-5.0F, -9.0F, -4.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);

        Teeth = new ModelRenderer(this);
        Teeth.setPos(0.0F, 0.0F, 0.0F);
        Mouth.addChild(Teeth);


        topRow = new ModelRenderer(this);
        topRow.setPos(0.0F, 0.0F, 0.0F);
        Teeth.addChild(topRow);
        topRow.texOffs(12, 59).addBox(0.0F, -8.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        topRow.texOffs(60, 18).addBox(-4.0F, -8.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        topRow.texOffs(58, 46).addBox(4.0F, -8.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        topRow.texOffs(60, 54).addBox(-7.0F, -8.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        btmRow = new ModelRenderer(this);
        btmRow.setPos(0.0F, 0.0F, 0.0F);
        Teeth.addChild(btmRow);
        btmRow.texOffs(44, 54).addBox(0.0F, -8.0F, 1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        btmRow.texOffs(28, 54).addBox(-7.0F, -8.0F, 1.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        Base = new ModelRenderer(this);
        Base.setPos(0.0F, 24.0F, 0.0F);
        setRotationAngle(Base, 0.0F, 3.1416F, 0.0F);
        Base.texOffs(0, 0).addBox(-13.0F, -6.0F, -8.0F, 26.0F, 2.0F, 16.0F, 0.0F, false);

        TopTentacle = new ModelRenderer(this);
        TopTentacle.setPos(0.0F, 24.0F, 0.0F);


        baseTT = new ModelRenderer(this);
        baseTT.setPos(-2.0F, 0.0F, 9.0F);
        TopTentacle.addChild(baseTT);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 3.0F, 0.0F);
        baseTT.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.texOffs(40, 26).addBox(-1.0F, -9.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleTT = new ModelRenderer(this);
        middleTT.setPos(0.0F, 0.0F, 0.0F);
        TopTentacle.addChild(middleTT);
        middleTT.texOffs(42, 18).addBox(-2.0F, -6.0F, 12.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        tipTT = new ModelRenderer(this);
        tipTT.setPos(0.0F, 0.0F, 0.0F);
        TopTentacle.addChild(tipTT);
        tipTT.texOffs(54, 48).addBox(-1.0F, -6.0F, 17.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        Btm_L_Tentacle = new ModelRenderer(this);
        Btm_L_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseBLT = new ModelRenderer(this);
        baseBLT.setPos(0.0F, 0.0F, 0.0F);
        Btm_L_Tentacle.addChild(baseBLT);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-9.0F, 3.0F, -9.0F);
        baseBLT.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.texOffs(0, 40).addBox(-3.0F, -9.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleBLT = new ModelRenderer(this);
        middleBLT.setPos(0.0F, 0.0F, 0.0F);
        Btm_L_Tentacle.addChild(middleBLT);
        middleBLT.texOffs(40, 34).addBox(-9.0F, -6.0F, -17.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        tipBLT = new ModelRenderer(this);
        tipBLT.setPos(0.0F, 0.0F, 0.0F);
        Btm_L_Tentacle.addChild(tipBLT);
        tipBLT.texOffs(28, 56).addBox(-8.0F, -6.0F, -21.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        Btm_R_Tentacle = new ModelRenderer(this);
        Btm_R_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseBRT = new ModelRenderer(this);
        baseBRT.setPos(0.0F, 0.0F, 0.0F);
        Btm_R_Tentacle.addChild(baseBRT);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(4.0F, 3.0F, -9.0F);
        baseBRT.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        cube_r3.texOffs(20, 34).addBox(-3.0F, -9.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleBRT = new ModelRenderer(this);
        middleBRT.setPos(0.0F, 0.0F, 0.0F);
        Btm_R_Tentacle.addChild(middleBRT);
        middleBRT.texOffs(40, 41).addBox(4.0F, -6.0F, -17.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        tipBRT = new ModelRenderer(this);
        tipBRT.setPos(0.0F, 0.0F, 0.0F);
        Btm_R_Tentacle.addChild(tipBRT);
        tipBRT.texOffs(40, 56).addBox(5.0F, -6.0F, -21.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        L_Top_Tentacle = new ModelRenderer(this);
        L_Top_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseLTT = new ModelRenderer(this);
        baseLTT.setPos(0.0F, 0.0F, 0.0F);
        L_Top_Tentacle.addChild(baseLTT);
        baseLTT.texOffs(22, 18).addBox(-17.0F, -6.0F, 1.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleLTT = new ModelRenderer(this);
        middleLTT.setPos(0.0F, 0.0F, 0.0F);
        L_Top_Tentacle.addChild(middleLTT);
        middleLTT.texOffs(20, 42).addBox(-22.0F, -6.0F, 2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        tipLTT = new ModelRenderer(this);
        tipLTT.setPos(0.0F, 0.0F, 0.0F);
        L_Top_Tentacle.addChild(tipLTT);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-23.0F, 3.0F, 4.0F);
        tipLTT.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
        cube_r4.texOffs(58, 40).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        L_Btm_Tentacle = new ModelRenderer(this);
        L_Btm_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseLBT = new ModelRenderer(this);
        baseLBT.setPos(0.0F, 0.0F, 0.0F);
        L_Btm_Tentacle.addChild(baseLBT);
        baseLBT.texOffs(0, 24).addBox(-17.0F, -6.0F, -7.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleLBT = new ModelRenderer(this);
        middleLBT.setPos(0.0F, 0.0F, 0.0F);
        L_Btm_Tentacle.addChild(middleLBT);
        middleLBT.texOffs(0, 48).addBox(-22.0F, -6.0F, -6.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        tipLBT = new ModelRenderer(this);
        tipLBT.setPos(0.0F, 0.0F, 0.0F);
        L_Btm_Tentacle.addChild(tipLBT);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-23.0F, 3.0F, -4.0F);
        tipLBT.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
        cube_r5.texOffs(0, 59).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);

        R_Top_Tentacle = new ModelRenderer(this);
        R_Top_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseRTT = new ModelRenderer(this);
        baseRTT.setPos(0.0F, 0.0F, 0.0F);
        R_Top_Tentacle.addChild(baseRTT);
        baseRTT.texOffs(0, 32).addBox(13.0F, -6.0F, 1.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleRTT = new ModelRenderer(this);
        middleRTT.setPos(0.0F, 0.0F, 0.0F);
        R_Top_Tentacle.addChild(middleRTT);
        middleRTT.texOffs(36, 48).addBox(17.0F, -6.0F, 2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        tipRTT = new ModelRenderer(this);
        tipRTT.setPos(0.0F, 0.0F, 0.0F);
        R_Top_Tentacle.addChild(tipRTT);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(25.0F, 3.0F, 4.0F);
        tipRTT.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
        cube_r6.texOffs(58, 34).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        R_Btm_Tentacle = new ModelRenderer(this);
        R_Btm_Tentacle.setPos(0.0F, 24.0F, 0.0F);


        baseRBT = new ModelRenderer(this);
        baseRBT.setPos(0.0F, 0.0F, 0.0F);
        R_Btm_Tentacle.addChild(baseRBT);
        baseRBT.texOffs(20, 26).addBox(13.0F, -6.0F, -7.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

        middleRBT = new ModelRenderer(this);
        middleRBT.setPos(0.0F, 0.0F, 0.0F);
        R_Btm_Tentacle.addChild(middleRBT);
        middleRBT.texOffs(18, 48).addBox(17.0F, -6.0F, -6.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        tipRBT = new ModelRenderer(this);
        tipRBT.setPos(0.0F, 0.0F, 0.0F);
        R_Btm_Tentacle.addChild(tipRBT);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(25.0F, 3.0F, -4.0F);
        tipRBT.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 1.5708F, 0.0F);
        cube_r7.texOffs(52, 56).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
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
        TopTentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Btm_L_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Btm_R_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        L_Top_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        L_Btm_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        R_Top_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        R_Btm_Tentacle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
