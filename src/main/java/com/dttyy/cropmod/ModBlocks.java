package com.dttyy.cropmod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.dttyy.cropmod.block.BlockCropCorn;

@EventBusSubscriber(modid = "cropmod")
public class ModBlocks {

    public static BlockCropCorn CROP_CORN;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        CROP_CORN = new BlockCropCorn();
        event.getRegistry().register(CROP_CORN);
    }
}
