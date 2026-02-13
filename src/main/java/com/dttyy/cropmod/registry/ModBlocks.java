package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.ModConstants;
import com.dttyy.cropmod.block.*;
import com.dttyy.cropmod.data.CropType;
import com.dttyy.cropmod.data.StemCropType;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = ModConstants.MODID)
public class ModBlocks {

    public static final Map<String, BlockCropGeneric> CROPS = new HashMap<>();
    public static final Map<String, BlockStemGeneric> STEMS = new HashMap<>();
    public static final Map<String, BlockFruitGeneric> FRUITS = new HashMap<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        for (CropType type : CropType.values()) {
            BlockCropGeneric crop = new BlockCropGeneric(type.getName());
            CROPS.put(type.getName(), crop);
            event.getRegistry().register(crop);
        }

        for (StemCropType type : StemCropType.values()) {
            BlockFruitGeneric fruit = new BlockFruitGeneric();
            fruit.setRegistryName(ModConstants.MODID, type.getName() + "_fruit");
            FRUITS.put(type.getName(), fruit);
            event.getRegistry().register(fruit);

            BlockStemGeneric stem = new BlockStemGeneric(fruit);
            stem.setRegistryName(ModConstants.MODID, type.getName() + "_stem");
            STEMS.put(type.getName(), stem);
            event.getRegistry().register(stem);
        }
    }
}
