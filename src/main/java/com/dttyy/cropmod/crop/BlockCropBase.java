package com.dttyy.cropmod.crop;

import com.dttyy.cropmod.registry.ModItems; import net.minecraft.block.BlockCrops; import net.minecraft.item.Item;

public class BlockCropBase extends BlockCrops {

private final String cropName;

public BlockCropBase(String cropName) {
    this.cropName = cropName;
    setRegistryName("cropmod", "crop_" + cropName);
    setTranslationKey("cropmod.crop_" + cropName);
}

@Override
protected Item getSeed() {
    return ModItems.SEEDS.get(cropName);
}

@Override
protected Item getCrop() {
    return ModItems.FOODS.get(cropName);
}

}

