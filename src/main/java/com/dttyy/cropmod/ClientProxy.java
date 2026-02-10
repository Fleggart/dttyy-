package com.dttyy.cropmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerModels() {
        for (CropType type : CropType.values()) {
            ModelLoader.setCustomModelResourceLocation(
                    ModItems.SEEDS.get(type.getName()), 0,
                    new ModelResourceLocation(CropMod.MODID + ":" + type.getName() + "_seed", "inventory")
            );

            ModelLoader.setCustomModelResourceLocation(
                    ModItems.FOODS.get(type.getName()), 0,
                    new ModelResourceLocation(CropMod.MODID + ":" + type.getName() + "_food", "inventory")
            );

            if (ModItems.MATERIALS.containsKey(type.getName())) {
                ModelLoader.setCustomModelResourceLocation(
                        ModItems.MATERIALS.get(type.getName()), 0,
                        new ModelResourceLocation(CropMod.MODID + ":" + type.getName() + "_item", "inventory")
                );
            }

            Item cropItem = Item.getItemFromBlock(ModBlocks.CROPS.get(type.getName()));
            ModelLoader.setCustomModelResourceLocation(
                    cropItem, 0,
                    new ModelResourceLocation(CropMod.MODID + ":crop_" + type.getName(), "inventory")
            );
        }
    }
}
