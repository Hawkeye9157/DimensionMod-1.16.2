/**
 * @author csipes
 * @createdOn 11/14/2024 at 4:06 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.world.gen;
 */
package com.thinktank.dimensionmod.world.gen;

import net.minecraft.entity.EntityType;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;
import java.util.List;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {

    }
    private static void addEntityToAllBiomesExceptThese(BiomeLoadingEvent event, EntityType<?> type,
                                                        int weight, int minCount, int maxCount, RegistryKey<Biome> ... biomes) {
        boolean isBiomeSelected = Arrays.stream(biomes).map(RegistryKey::location).map(Object::toString)
                .anyMatch(s -> s.equals(event.getName().toString()));
        if(!isBiomeSelected){
            addEntityToAllBiomes(event.getSpawns(),type,weight,minCount,maxCount);
        }
    }
    private static void addEntityToSpecificBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                        int weight, int minCount, int maxCount, RegistryKey<Biome> ... biomes) {
        boolean isBiomeSelected = Arrays.stream(biomes).map(RegistryKey::location).map(Object::toString)
                .anyMatch(s -> s.equals(event.getName().toString()));
        if(isBiomeSelected){
            addEntityToAllBiomes(event.getSpawns(),type,weight,minCount,maxCount);
        }
    }
    private static void addEntityToAllBiomes(MobSpawnInfoBuilder spawns, EntityType<?> type,
                                             int weight, int minCount, int maxCount, RegistryKey<Biome> ... biomes){
        List<MobSpawnInfo.Spawners> base = spawns.getSpawner(type.getCategory());
        base.add(new MobSpawnInfo.Spawners(type, weight, minCount, maxCount));  
    }

}
