/**
 * @author cschade
 * @createdOn 11/7/2024 at 1:31 PM
 * @projectName DimensionMod-1.16.5
 * @packageName com.thinktank.dimensionmod.init;
 */
package com.thinktank.dimensionmod.init;

import com.thinktank.dimensionmod.DimensionMod;
import net.minecraft.block.Block;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryManager;


public class DimensionInit {


    public static final RegistryKey<Dimension> ExampleWorld  = RegistryKey.create(Registry.LEVEL_STEM_REGISTRY,
            new ResourceLocation("example_world"));



}
