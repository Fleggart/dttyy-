package com.dttyy.cropmod.item;

import net.minecraft.item.ItemSeeds;
import net.minecraft.init.Blocks;
import com.dttyy.cropmod.ModBlocks;

public class ItemCornSeed extends ItemSeeds {
    public ItemCornSeed(Block crop) {
        super(crop, Blocks.FARMLAND);
        setRegistryName("cropmod", crop.getRegistryName().getResourcePath() + "_seed");
        setTranslationKey("cropmod." + crop.getRegistryName().getResourcePath() + "_seed");
    }
}