package com.dttyy.cropmod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.dttyy.cropmod.item.ItemCornSeed;
import java.util.HashMap;
import java.util.Map;

@EventBusSubscriber(modid = CropMod.MODID)
public class ModItems {

    public static final Map<String, Item> SEEDS = new HashMap<>();
    public static final Map<String, Item> CROPS = new HashMap<>();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        for (CropType type : CropType.values()) {

            // 种子
            Item seed = new ItemCornSeed(ModBlocks.CROPS.get(type.getName()))
                    .setRegistryName("cropmod", type.getName() + "_seed")
                    .setTranslationKey("cropmod." + type.getName() + "_seed");
            SEEDS.put(type.getName(), seed);

            // 成熟作物掉落物
            Item cropItem = new Item()
                    .setRegistryName("cropmod", type.getName())
                    .setTranslationKey("cropmod." + type.getName());
            CROPS.put(type.getName(), cropItem);

            event.getRegistry().register(seed);
            event.getRegistry().register(cropItem);
        }
    }
}