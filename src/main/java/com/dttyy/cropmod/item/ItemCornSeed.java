package com.dttyy.cropmod.item;

import net.minecraft.item.ItemSeeds;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import com.dttyy.cropmod.ModBlocks;

public class ItemCornSeed extends ItemSeeds {
    public ItemCornSeed() {
        super((Block) ModBlocks.CROP_CORN, Blocks.FARMLAND);
        setRegistryName("cropmod", "corn_seed");
        setTranslationKey("cropmod.corn_seed");
    }
}
