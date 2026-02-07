package com.dttyy.cropmod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.dttyy.cropmod.item.ItemCornSeed;

@EventBusSubscriber(modid = CropMod.MODID)
public class ModItems {

    public static ItemCornSeed CORN_SEED;
    public static Item CORN;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        // Seeds
        CORN_SEED = new ItemCornSeed();
        
        // Crop item
        CORN = new Item()
            .setRegistryName("cropmod", "corn")
            .setTranslationKey("cropmod.corn");

        event.getRegistry().registerAll(CORN_SEED, CORN);
    }
}