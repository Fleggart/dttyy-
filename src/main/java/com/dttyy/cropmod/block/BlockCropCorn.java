package com.dttyy.cropmod.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import com.dttyy.cropmod.ModItems;

public class BlockCropCorn extends BlockCrops {

    public BlockCropCorn() {
        setUnlocalizedName("crop_corn");
        setRegistryName("cropmod", "crop_corn");
    }

    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
