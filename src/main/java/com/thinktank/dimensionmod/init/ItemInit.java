/**
 * @author csipes
 * @createdOn 11/5/2024 at 8:36 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.init;
 */
package com.thinktank.dimensionmod.init;

import com.thinktank.dimensionmod.DimensionMod;
import com.thinktank.dimensionmod.Util.ModArmorMaterial;
import com.thinktank.dimensionmod.Util.ModItemTier;
import com.thinktank.dimensionmod.Util.SapphireArmorItem;
import com.thinktank.dimensionmod.entity.ModEntityType;
import com.thinktank.dimensionmod.entity.ModSpawnEgg;
import com.thinktank.dimensionmod.entity.custom.VineSpiritEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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

    //Creates a food Item
    public static final RegistryObject<Item> Example = ITEMS.register("example",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)
                    .food(new Food.Builder().nutrition(4).saturationMod(0.6f)
                            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED,2000,0),15.0F)
                            .effect(() -> new EffectInstance(Effects.JUMP,2000,0),15.0F).build())));
    //default item/material creation
    public static final RegistryObject<Item> Tentacle = ITEMS.register("tentacle",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> CursedSapphire = ITEMS.register("cursed_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> Nail = ITEMS.register("nail",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

    //custom tools
    public static final RegistryObject<Item> TENT_SWORD = ITEMS.register("tentacle_sword",
            () -> new SwordItem(ModItemTier.TENT,3,-2.4f,new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> TENT_PICK = ITEMS.register("tentacle_pickaxe",
            () -> new PickaxeItem(ModItemTier.TENT,3,-2.4f,new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> TENT_AXE = ITEMS.register("tentacle_axe",
            () -> new AxeItem(ModItemTier.TENT,3,-2.4f,new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> TENT_SHOVEL = ITEMS.register("tentacle_shovel",
            () -> new ShovelItem(ModItemTier.TENT,3,-2.4f,new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> TENT_HOE = ITEMS.register("tentacle_hoe",
            () -> new HoeItem(ModItemTier.TENT,3,-2.4f,new Item.Properties().tab(ModCreativeTab.instance)));

    //custom armor
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new SapphireArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new SapphireArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new SapphireArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new SapphireArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().tab(ModCreativeTab.instance)));

    //mod eggs
    public static final RegistryObject<ModSpawnEgg> VINE_SPIRIT_EGG = ITEMS.register("vine_spirit_egg",
            () -> new ModSpawnEgg(ModEntityType.DA_BOI,0x464f56,0x1D6336,
                    new Item.Properties().tab(ModCreativeTab.instance)));


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

