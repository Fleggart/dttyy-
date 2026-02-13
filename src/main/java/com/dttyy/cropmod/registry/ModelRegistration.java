package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.ModConstants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ModConstants.MODID, value = Side.CLIENT)
public class ModelRegistration {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        // 为 cropmod 下所有 item 注册模型
        for (Item item : ForgeRegistries.ITEMS) {

            if (item.getRegistryName().getNamespace().equals(ModConstants.MODID)) {

                ModelLoader.setCustomModelResourceLocation(
                        item, 0,
                        new ModelResourceLocation(item.getRegistryName(), "inventory")
                );
            }
        }
    }
}
