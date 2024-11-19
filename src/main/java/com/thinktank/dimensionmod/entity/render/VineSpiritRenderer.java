/**
 * @author csipes
 * @createdOn 11/7/2024 at 9:21 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.render;
 */
package com.thinktank.dimensionmod.entity.render;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import com.thinktank.dimensionmod.entity.model.VineSpiritModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VineSpiritRenderer extends MobRenderer<VineSpiritEntity, VineSpiritModel<VineSpiritEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(DimensionMod.MOD_ID,
            "textures/entity/vinespirit.png");
    public VineSpiritRenderer(EntityRendererManager manager) {
        super(manager, new VineSpiritModel<>(), 0.2F);
    }


    @Override
    public ResourceLocation getTextureLocation(VineSpiritEntity spirit) {
        return TEXTURE;
    }
}
