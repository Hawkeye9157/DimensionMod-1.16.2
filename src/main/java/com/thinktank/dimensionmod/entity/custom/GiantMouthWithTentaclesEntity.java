/**
 * @author csipes
 * @createdOn 11/11/2024 at 3:30 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity.custom;
 */
package com.thinktank.dimensionmod.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.EntityTeleportEvent;

public class GiantMouthWithTentaclesEntity extends EndermanEntity {
    public GiantMouthWithTentaclesEntity(EntityType<? extends EndermanEntity> entity, World world) {
        super(entity, world);
    }
    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.MOVEMENT_SPEED, 0.3d)
                .add(Attributes.ATTACK_DAMAGE,13.0d).add(Attributes.FOLLOW_RANGE,50.0d);
    }

    @Override
    public void registerGoals(){
        super.registerGoals();
        //add custom behavior here
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
    @Override
    public boolean doHurtTarget(Entity entity) {
        if(!super.doHurtTarget(entity)) return false;
        else {
            if(entity instanceof LivingEntity) {

            }
            return true;
        }

    }
}
