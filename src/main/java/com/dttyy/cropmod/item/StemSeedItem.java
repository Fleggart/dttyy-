package com.dttyy.cropmod.item;

import net.minecraft.item.ItemSeeds;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class StemSeedItem extends ItemSeeds {

    public StemSeedItem(Block stem) {
        super(stem, Blocks.FARMLAND);
    }
}
