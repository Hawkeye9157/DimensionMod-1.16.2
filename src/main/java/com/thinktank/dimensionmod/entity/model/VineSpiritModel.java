/**
    @author csipes
    @createdOn 11/7/2024 at 9:20 PM
    @projectName DimensionMod
 @packageName com.thinktank.dimensionmod.entity.model;*/
package com.thinktank.dimensionmod.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class VineSpiritModel<T extends VineSpiritEntity> extends EntityModel<T> {



    @Override
    public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

    }
}
