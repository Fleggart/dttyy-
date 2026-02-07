package com.dttyy.cropmod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.init.Blocks;

public class ItemCornSeed extends ItemSeeds {
    public ItemCornSeed(Block crop) {
        super(crop, Blocks.FARMLAND);
    }
}