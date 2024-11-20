/**
 * @author csipes
 * @createdOn 11/19/2024 at 5:01 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.custom;
 */
package com.thinktank.dimensionmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.world.World;

public class ZaSpiderEntity extends SpiderEntity {
    public ZaSpiderEntity(EntityType<? extends SpiderEntity> p_i48550_1_, World p_i48550_2_) {
        super(p_i48550_1_, p_i48550_2_);
    }
    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return null;
    }
    @Override
    public void registerGoals() {
        super.registerGoals();
    }

}
