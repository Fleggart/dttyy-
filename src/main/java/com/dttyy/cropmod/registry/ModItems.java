package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.ModConstants;
import com.dttyy.cropmod.data.CropType;
import com.dttyy.cropmod.data.StemCropType;
import com.dttyy.cropmod.item.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModConstants.MODID)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        for (CropType type : CropType.values()) {

            CropSeedItem seed = new CropSeedItem(ModBlocks.CROPS.get(type.getName()));
            seed.setRegistryName(ModConstants.MODID, type.getName() + "_seed");
            event.getRegistry().register(seed);

            CropFoodItem food = new CropFoodItem(type.getHunger(), type.getSaturation());
            food.setRegistryName(ModConstants.MODID, type.getName() + "_food");
            event.getRegistry().register(food);

            event.getRegistry().register(
                    new ItemBlock(ModBlocks.CROPS.get(type.getName()))
                            .setRegistryName(ModBlocks.CROPS.get(type.getName()).getRegistryName())
            );
        }

        for (StemCropType type : StemCropType.values()) {

            StemSeedItem seed = new StemSeedItem(ModBlocks.STEMS.get(type.getName()));
            seed.setRegistryName(ModConstants.MODID, type.getName() + "_seed");
            event.getRegistry().register(seed);

            event.getRegistry().register(
                    new ItemBlock(ModBlocks.FRUITS.get(type.getName()))
                            .setRegistryName(ModBlocks.FRUITS.get(type.getName()).getRegistryName())
            );
        }
    }
}
