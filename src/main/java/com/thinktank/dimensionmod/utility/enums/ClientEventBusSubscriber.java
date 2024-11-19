/**
 * @author csipes
 * @createdOn 11/18/2024 at 4:07 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.utility.enums;
 */
package com.thinktank.dimensionmod.utility.enums;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.entity.ModEntityType;
import com.thinktank.dimensionmod.entity.render.VineSpiritRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DimensionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.DA_BOI.get(), VineSpiritRenderer::new);
    }
}
