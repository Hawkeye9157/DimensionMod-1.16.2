/**
 * @author csipes
 * @createdOn 11/11/2024 at 3:43 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.model;
 */
package com.thinktank.dimensionmod.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thinktank.dimensionmod.entity.custom.GiantMouthWithTentaclesEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GiantMouthWithTentaclesModel <T extends GiantMouthWithTentaclesEntity> extends EntityModel<T> {

    private final ModelRenderer Head;
    private final ModelRenderer Torso;
    private final ModelRenderer LowerBody;
    private final ModelRenderer Tentacles;
    private final ModelRenderer Front;
    private final ModelRenderer Back;
    private final ModelRenderer Left;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Right;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;

    public GiantMouthWithTentaclesModel() {
        texWidth = 64;
        texHeight = 64;

        Head = new ModelRenderer(this);
        Head.setPos(-6.0F, 24.0F, -1.0F);
        Head.texOffs(24, 21).addBox(4.0F, -29.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        Head.texOffs(14, 35).addBox(5.0F, -25.0F, -1.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
        Head.texOffs(16, 26).addBox(4.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Head.texOffs(20, 46).addBox(7.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        Torso = new ModelRenderer(this);
        Torso.setPos(-6.0F, 24.0F, -1.0F);
        Torso.texOffs(46, 17).addBox(5.0F, -25.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        Torso.texOffs(24, 16).addBox(2.0F, -23.0F, 0.0F, 8.0F, 2.0F, 3.0F, 0.0F, false);
        Torso.texOffs(0, 26).addBox(3.0F, -21.0F, 0.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        Torso.texOffs(46, 27).addBox(4.0F, -17.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Torso.texOffs(46, 30).addBox(7.0F, -17.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        Torso.texOffs(46, 12).addBox(5.0F, -17.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        LowerBody = new ModelRenderer(this);
        LowerBody.setPos(0.0F, 9.0F, 0.0F);
        LowerBody.texOffs(16, 29).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        LowerBody.texOffs(0, 16).addBox(-3.0F, 3.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
        LowerBody.texOffs(0, 0).addBox(-4.0F, 7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        Tentacles = new ModelRenderer(this);
        Tentacles.setPos(0.0F, 9.0F, 0.0F);


        Front = new ModelRenderer(this);
        Front.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(Front);
        Front.texOffs(32, 29).addBox(-2.0F, 11.0F, -7.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
        Front.texOffs(20, 35).addBox(-1.0F, 12.0F, -10.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        Front.texOffs(40, 36).addBox(-1.0F, 13.0F, -13.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        Front.texOffs(0, 46).addBox(-1.0F, 14.0F, -16.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        Back = new ModelRenderer(this);
        Back.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(Back);
        Back.texOffs(32, 8).addBox(-2.0F, 11.0F, 4.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
        Back.texOffs(30, 36).addBox(-1.0F, 12.0F, 7.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        Back.texOffs(20, 41).addBox(-1.0F, 13.0F, 10.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        Back.texOffs(46, 0).addBox(-1.0F, 14.0F, 13.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        Left = new ModelRenderer(this);
        Left.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(Left);
        Left.texOffs(32, 0).addBox(4.0F, 11.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(14.0F, 15.0F, 0.0F);
        Left.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.texOffs(46, 4).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(11.0F, 15.0F, 0.0F);
        Left.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.texOffs(30, 42).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(8.0F, 15.0F, 0.0F);
        Left.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        cube_r3.texOffs(40, 21).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        Right = new ModelRenderer(this);
        Right.setPos(0.0F, 0.0F, 0.0F);
        Tentacles.addChild(Right);
        Right.texOffs(0, 32).addBox(-7.0F, 11.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-15.0F, 15.0F, 0.0F);
        Right.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
        cube_r4.texOffs(46, 8).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-12.0F, 15.0F, 0.0F);
        Right.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
        cube_r5.texOffs(40, 41).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-9.0F, 15.0F, 0.0F);
        Right.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        cube_r6.texOffs(0, 40).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
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
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha) {
        Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Torso.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Tentacles.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
