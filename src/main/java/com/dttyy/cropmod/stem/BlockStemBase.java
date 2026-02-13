package com.dttyy.cropmod.stem;

import net.minecraft.block.BlockStem; import net.minecraft.block.Block;

public class BlockStemBase extends BlockStem {

public BlockStemBase(String name, Block fruit) {
    super(fruit);
    setRegistryName("cropmod", name + "_stem");
    setTranslationKey("cropmod." + name + "_stem");
    setTickRandomly(true);
}

}
