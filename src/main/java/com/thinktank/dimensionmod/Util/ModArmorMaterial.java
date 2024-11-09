/**
 * @author csipes
 * @createdOn 11/8/2024 at 4:29 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.Util;
 */
package com.thinktank.dimensionmod.Util;

import com.thinktank.dimensionmod.DimensionMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ModArmorMaterial implements IArmorMaterial {
    SAPPHIRE(DimensionMod.MOD_ID + ":cursed_sapphire",20,new int[]{4,7,9,4}, SoundEvents.ARMOR_EQUIP_CHAIN,3.0f,0.1f);

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionPoints, SoundEvent sound, float toughness, float knockbackResistance) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = protectionPoints;
        this.enchantmentValue = protectionPoints[0];
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType equipmentSlotType) {
        return this.slotProtections[equipmentSlotType.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType equipmentSlotType) {
        return this.slotProtections[equipmentSlotType.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
