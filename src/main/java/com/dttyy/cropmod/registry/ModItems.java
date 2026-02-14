package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.ModConstants;
import com.dttyy.cropmod.data.CropType;
import com.dttyy.cropmod.data.StemCropType;
import com.dttyy.cropmod.item.CropSeedItem;
import com.dttyy.cropmod.item.StemSeedItem;
import com.dttyy.cropmod.block.BlockCropGeneric;
import com.dttyy.cropmod.block.BlockStemGeneric;
import com.dttyy.cropmod.block.BlockFruitGeneric;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModConstants.MODID)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {

        // 普通作物
        for (CropType type : CropType.values()) {
            String name = type.getName();

            Item seed = new CropSeedItem(ModBlocks.CROPS.get(name));
            seed.setRegistryName(ModConstants.MODID, name + "_seed");
            seed.setTranslationKey(ModConstants.MODID + "." + name + "_seed");
            e.getRegistry().register(seed);

            Item food = new ItemFood(type.getHunger(), type.getSaturation(), false);
            food.setRegistryName(ModConstants.MODID, name + "_food");
            food.setTranslationKey(ModConstants.MODID + "." + name + "_food");
            e.getRegistry().register(food);

            ItemBlock cropItem = new ItemBlock(ModBlocks.CROPS.get(name));
            cropItem.setRegistryName(ModBlocks.CROPS.get(name).getRegistryName());
            cropItem.setTranslationKey(ModConstants.MODID + ".crop_" + name);
            e.getRegistry().register(cropItem);
        }

        // 藤类作物
        for (StemCropType type : StemCropType.values()) {
            String name = type.getName();

            Item stemSeed = new StemSeedItem(ModBlocks.STEMS.get(name));
            stemSeed.setRegistryName(ModConstants.MODID, name + "_seed");
            stemSeed.setTranslationKey(ModConstants.MODID + "." + name + "_seed");
            e.getRegistry().register(stemSeed);

            ItemBlock fruitItem = new ItemBlock(ModBlocks.FRUITS.get(name));
            fruitItem.setRegistryName(ModBlocks.FRUITS.get(name).getRegistryName());
            fruitItem.setTranslationKey(ModConstants.MODID + "." + name + "_fruit");
            e.getRegistry().register(fruitItem);
        }
    }
}
