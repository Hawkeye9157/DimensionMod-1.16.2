/**
 * @author csipes
 * @createdOn 11/5/2024 at 8:36 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.init;
 */
package com.thinktank.dimensionmod.init;

import com.thinktank.dimensionmod.DimensionMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

//class of added items
public class ItemInit { //Initializes our custom Items

    //Creates a register of our Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DimensionMod.MOD_ID);

    //Creates an Item
    public static final RegistryObject<Item> Example = ITEMS.register("example",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)
                    .food(new Food.Builder().nutrition(4).saturationMod(0.6f)
                            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED,2000,0),15.0F)
                            .effect(() -> new EffectInstance(Effects.JUMP,2000,0),15.0F).build())));
    //default item creation
    public static final RegistryObject<Item> Gun = ITEMS.register("gun",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

    //creating creative tab with our items
    public static class ModCreativeTab extends ItemGroup {
        public ModCreativeTab(int index,String label) {
            super(index, label);
        }
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Example.get());
        }
        public static final ModCreativeTab instance = new ModCreativeTab(ItemGroup.TABS.length, "dimensionmod");

    }


}

