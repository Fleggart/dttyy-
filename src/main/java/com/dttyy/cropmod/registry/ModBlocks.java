package com.dttyy.cropmod.registry;

import com.dttyy.cropmod.data.CropType; import com.dttyy.cropmod.data.StemCropType; import com.dttyy.cropmod.crop.BlockCropBase; import com.dttyy.cropmod.stem.BlockFruitBase; import com.dttyy.cropmod.stem.BlockStemBase;

import net.minecraft.block.Block; import net.minecraftforge.event.RegistryEvent; import net.minecraftforge.fml.common.Mod; import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap; import java.util.Map;

@Mod.EventBusSubscriber(modid = "cropmod") public class ModBlocks {

public static final Map<String, Block> CROPS = new HashMap<>();
public static final Map<String, Block> STEMS = new HashMap<>();
public static final Map<String, Block> FRUITS = new HashMap<>();

@SubscribeEvent
public static void registerBlocks(RegistryEvent.Register<Block> event) {

    for (CropType type : CropType.values()) {
        BlockCropBase crop = new BlockCropBase(type.getName());
        CROPS.put(type.getName(), crop);
        event.getRegistry().register(crop);
    }

    for (StemCropType type : StemCropType.values()) {

        BlockFruitBase fruit = new BlockFruitBase(type.getName() + "_fruit");
        BlockStemBase stem = new BlockStemBase(type.getName(), fruit);

        FRUITS.put(type.getName(), fruit);
        STEMS.put(type.getName(), stem);

        event.getRegistry().register(fruit);
        event.getRegistry().register(stem);
    }
}

}
