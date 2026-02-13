package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.ModConstants;
import com.dttyy.cropmod.data.CropType;
import com.dttyy.cropmod.data.StemCropType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = ModConstants.MODID, value = Side.CLIENT)
public class ModelRegistration {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        // 普通作物种子 + 食物 + 方块 Item
        for (CropType type : CropType.values()) {
            String name = type.getName();

            // 种子模型
            Item seed = net.minecraft.item.Item.getByNameOrId(ModConstants.MODID + ":" + name + "_seed");
            if (seed != null) {
                ModelLoader.setCustomModelResourceLocation(
                        seed, 0,
                        new ModelResourceLocation(ModConstants.MODID + ":" + name + "_seed", "inventory")
                );
            }

            // 食物模型
            Item food = net.minecraft.item.Item.getByNameOrId(ModConstants.MODID + ":" + name + "_food");
            if (food != null) {
                ModelLoader.setCustomModelResourceLocation(
                        food, 0,
                        new ModelResourceLocation(ModConstants.MODID + ":" + name + "_food", "inventory")
                );
            }

            // 方块作物 Item 模型
            Item cropItem = Item.getItemFromBlock(ModBlocks.CROPS.get(name));
            if (cropItem != null) {
                ModelLoader.setCustomModelResourceLocation(
                        cropItem, 0,
                        new ModelResourceLocation(ModConstants.MODID + ":crop_" + name, "inventory")
                );
            }
        }

        // 茎类作物种子 + 果实 Item
        for (StemCropType type : StemCropType.values()) {
            String name = type.getName();

            // 茎作物的种子
            Item stemSeed = Item.getByNameOrId(ModConstants.MODID + ":" + name + "_seed");
            if (stemSeed != null) {
                ModelLoader.setCustomModelResourceLocation(
                        stemSeed, 0,
                        new ModelResourceLocation(ModConstants.MODID + ":" + name + "_seed", "inventory")
                );
            }

            // 果实 Item 模型
            Item fruitItem = Item.getItemFromBlock(ModBlocks.FRUITS.get(name));
            if (fruitItem != null) {
                ModelLoader.setCustomModelResourceLocation(
                        fruitItem, 0,
                        new ModelResourceLocation(ModConstants.MODID + ":" + name + "_fruit", "inventory")
                );
            }
        }
    }
}
