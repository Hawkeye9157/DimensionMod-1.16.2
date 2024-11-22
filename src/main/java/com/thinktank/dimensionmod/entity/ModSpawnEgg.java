/**
 * @author csipes
 * @createdOn 11/13/2024 at 3:18 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.entity;
 */
package com.thinktank.dimensionmod.entity;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModSpawnEgg extends SpawnEggItem {

    protected static final List<ModSpawnEgg> UNADDED_EGGS = new ArrayList<>();
    private final Lazy<? extends EntityType<?>> entityTypeSupplier;

    public ModSpawnEgg(final RegistryObject<? extends EntityType<?>> entityType, int primaryColorIn, int secondaryColorIn, Properties builder) {
        super(null, primaryColorIn, secondaryColorIn, builder);
        this.entityTypeSupplier = Lazy.of(entityType::get);
        UNADDED_EGGS.add(this);
    }
    public static void initSpawnEggs() {
        final Map<EntityType<?>,SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class,null,"field");
        DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior() {
            //@Override
            public ItemStack dispenseStack(IBlockSource source,ItemStack stack){
                Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
                EntityType<?> type = ((SpawnEggItem)stack.getItem()).getType(stack.getTag());
                type.spawn(source.getLevel(),stack,null,source.getPos(),SpawnReason.DISPENSER,
                        direction != Direction.UP,false);
                stack.shrink(1);
                return stack;
            }
        };
        for (final ModSpawnEgg egg : UNADDED_EGGS) {
            EGGS.put(egg.getType(null), egg);
            DispenserBlock.registerBehavior(egg, defaultDispenseItemBehavior);
        }
        UNADDED_EGGS.clear();
    }


}
