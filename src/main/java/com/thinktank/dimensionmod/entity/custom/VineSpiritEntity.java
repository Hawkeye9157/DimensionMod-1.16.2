/**
 * @author csipes
 * @createdOn 11/7/2024 at 3:50 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.custom;
 */
package com.thinktank.dimensionmod.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;



public class VineSpiritEntity extends AnimalEntity {
    public VineSpiritEntity(EntityType<? extends AnimalEntity> type, World worldIn) {

        super(type, worldIn);
    }
    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.MOVEMENT_SPEED, 1.3d)
                .add(Attributes.ATTACK_DAMAGE,13.0d);
    }
    @Override
    public void registerGoals() {
        super.registerGoals();

    }

    @Override
    protected int getExperienceReward(PlayerEntity player) {return 3;}

    @Override
    protected SoundEvent getAmbientSound() {return SoundEvents.COW_MILK;}

    @Override
    protected SoundEvent getDeathSound() {return SoundEvents.COW_DEATH;}

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {return SoundEvents.COW_HURT;}

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.COW_STEP, 0.15F, 1.0F);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return null;
    }
}
