/**
 * @author csipes
 * @createdOn 11/7/2024 at 3:39 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.custom;
 */
package com.thinktank.dimensionmod.entity;

import com.thinktank.dimensionmod.DimensionMod;

import com.thinktank.dimensionmod.entity.custom.GiantMouthWithTentaclesEntity;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, DimensionMod.MOD_ID);

    public static final RegistryObject<EntityType<VineSpiritEntity>> DA_BOI = ENTITY_TYPES.register("vinespirit",
            () -> EntityType.Builder.of(VineSpiritEntity::new,EntityClassification.MONSTER).sized(1.0f,0.5f)
                    .build(new ResourceLocation(DimensionMod.MOD_ID,"vinespirit").toString()));
    public static final RegistryObject<EntityType<GiantMouthWithTentaclesEntity>> SQUIDWARD = ENTITY_TYPES.register("squidward",
            () -> EntityType.Builder.of(GiantMouthWithTentaclesEntity::new,EntityClassification.MONSTER).sized(1.0f,1.0f)
                    .build(new ResourceLocation(DimensionMod.MOD_ID,"squidward").toString()));


    public static void Register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
