package com.dttyy.cropmod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.dttyy.cropmod.block.BlockCropBase;
import java.util.HashMap;
import java.util.Map;

@EventBusSubscriber(modid = CropMod.MODID)
public class ModBlocks {
    
    public static final Map<String, BlockCropBase> CROPS = new HashMap<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        for (CropType type : CropType.values()) {
            BlockCropBase crop = new BlockCropBase(type.getName());
            CROPS.put(type.getName(), crop);
            event.getRegistry().register(crop);
        }
    }
}