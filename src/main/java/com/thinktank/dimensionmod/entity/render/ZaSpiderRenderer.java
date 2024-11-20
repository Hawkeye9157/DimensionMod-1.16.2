/**
    @author csipes
    @createdOn 11/20/2024 at 9:41 AM
    @projectName DimensionMod
 @packageName com.thinktank.dimensionmod.entity.render;*/
package com.thinktank.dimensionmod.entity.render;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.custom.ZaSpiderEntity;
import com.thinktank.dimensionmod.entity.model.ZaSpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.util.ResourceLocation;


public class ZaSpiderRenderer extends MobRenderer<ZaSpiderEntity, ZaSpiderModel<ZaSpiderEntity>> {


    protected static final ResourceLocation TEXTURE = new ResourceLocation(DimensionMod.MOD_ID,
            "textures/entity/zaspider.png");

    public ZaSpiderRenderer(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new ZaSpiderModel<>(), 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(ZaSpiderEntity p_110775_1_) {
        return TEXTURE;
    }
}
