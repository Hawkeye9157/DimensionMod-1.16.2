/**
 * @author csipes
 * @createdOn 12/2/2024 at 12:53 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.custom;
 */
package com.thinktank.dimensionmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.world.World;

public class HandEntity extends ShulkerEntity {
    public HandEntity(EntityType<? extends ShulkerEntity> p_i50196_1_, World p_i50196_2_) {
        super(p_i50196_1_, p_i50196_2_);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return null;
    }

    @Override
    public void registerGoals() {

    }

}
