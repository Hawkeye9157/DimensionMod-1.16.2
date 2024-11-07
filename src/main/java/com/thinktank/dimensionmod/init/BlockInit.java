/**
 * @author csipes
 * @createdOn 11/6/2024 at 12:24 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.init;
 */
package com.thinktank.dimensionmod.init;

import com.thinktank.dimensionmod.DimensionMod;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit { //Initializes our custom blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionMod.MOD_ID);

   // public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example-block",() -> new Block());
}
