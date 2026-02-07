package com.yourname.modid;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ModItems {

    public static Item cornSeed;
    public static Item corn;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        cornSeed = new Item()
            .setRegistryName("modid", "corn_seed")
            .setUnlocalizedName("corn_seed");
        corn = new Item()
            .setRegistryName("modid", "corn")
            .setUnlocalizedName("corn");

        event.getRegistry().registerAll(cornSeed, corn);
    }
}
