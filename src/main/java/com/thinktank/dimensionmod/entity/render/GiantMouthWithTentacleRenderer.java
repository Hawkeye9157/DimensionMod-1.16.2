/**
 * @author csipes
 * @createdOn 11/11/2024 at 3:44 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.render;
 */
package com.thinktank.dimensionmod.entity.render;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.custom.GiantMouthWithTentaclesEntity;
import com.thinktank.dimensionmod.entity.model.GiantMouthWithTentaclesModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class GiantMouthWithTentacleRenderer extends MobRenderer<GiantMouthWithTentaclesEntity,
        GiantMouthWithTentaclesModel<GiantMouthWithTentaclesEntity>>{

    protected static final ResourceLocation TEXTURE = new ResourceLocation(DimensionMod.MOD_ID,
            "textures/entity/squidward.png");
    public GiantMouthWithTentacleRenderer(EntityRendererManager manager) {
        super (manager, new GiantMouthWithTentaclesModel(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(GiantMouthWithTentaclesEntity giantMouthWithTentaclesEntity) {
        return TEXTURE;
    }
}
