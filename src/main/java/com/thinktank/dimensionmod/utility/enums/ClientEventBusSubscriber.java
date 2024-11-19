/**
 * @author csipes
 * @createdOn 11/18/2024 at 4:07 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.utility.enums;
 */
package com.thinktank.dimensionmod.utility.enums;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.ModEntityType;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import com.thinktank.dimensionmod.entity.render.VineSpiritRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.jar.Attributes;

@Mod.EventBusSubscriber(modid = DimensionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.DA_BOI.get(), VineSpiritRenderer::new);

    }
    @SubscribeEvent
    public static void newEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityType.DA_BOI.get(), VineSpiritEntity.createAttributes().build());
    }
}
