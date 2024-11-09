/**
 * @author csipes
 * @createdOn 11/8/2024 at 4:12 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.Util;
 */
package com.thinktank.dimensionmod.Util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {

    TENT(3, 3000, 10.0F, 5.0F, 5);

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;

    ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
