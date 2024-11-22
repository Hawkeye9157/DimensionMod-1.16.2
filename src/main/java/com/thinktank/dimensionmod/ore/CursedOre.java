/**
 * @author csipes
 * @createdOn 11/12/2024 at 3:14 PM
 * @projectName DimensionMod
 * @packageName com.thinktank.dimensionmod.ore;
 */
package com.thinktank.dimensionmod.ore;

import com.thinktank.dimensionmod.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class CursedOre extends OreBlock {

    public CursedOre(Properties p_i48357_1_) {
        super(p_i48357_1_);
    }
    @Override
    protected int xpOnDrop(Random rand) {
        return MathHelper.nextInt(rand, 3, 5);

    }

}
