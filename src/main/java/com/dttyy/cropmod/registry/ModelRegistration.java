package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.CropMod;
import com.dttyy.cropmod.data.CropType;
import com.dttyy.cropmod.data.StemCropType;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = CropMod.MODID, value = Side.CLIENT)
public class ModelRegistration {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        // ===== 普通作物 =====
        for (CropType type : CropType.values()) {

            // 种子
            Item seed = ModItems.SEEDS.get(type.getName());
            ModelLoader.setCustomModelResourceLocation(
                    seed,
                    0,
                    new ModelResourceLocation(
                            CropMod.MODID + ":" + type.getName() + "_seed",
                            "inventory"
                    )
            );

            // 食物
            Item food = ModItems.FOODS.get(type.getName());
            ModelLoader.setCustomModelResourceLocation(
                    food,
                    0,
                    new ModelResourceLocation(
                            CropMod.MODID + ":" + type.getName() + "_food",
                            "inventory"
                    )
            );

            // 作物方块 item
            Item cropItem = Item.getItemFromBlock(ModBlocks.CROPS.get(type.getName()));
            ModelLoader.setCustomModelResourceLocation(
                    cropItem,
                    0,
                    new ModelResourceLocation(
                            CropMod.MODID + ":crop_" + type.getName(),
                            "inventory"
                    )
            );
        }

        // ===== 茎作物 =====
        for (StemCropType type : StemCropType.values()) {

            // 茎种子
            Item seed = ModItems.STEM_SEEDS.get(type.getName());
            ModelLoader.setCustomModelResourceLocation(
                    seed,
                    0,
                    new ModelResourceLocation(
                            CropMod.MODID + ":" + type.getName() + "_seed",
                            "inventory"
                    )
            );

            // 果实方块 item
            Item fruitItem = Item.getItemFromBlock(ModBlocks.FRUITS.get(type.getName()));
            ModelLoader.setCustomModelResourceLocation(
                    fruitItem,
                    0,
                    new ModelResourceLocation(
                            CropMod.MODID + ":" + type.getName() + "_fruit",
                            "inventory"
                    )
            );
        }
    }
}
