package com.yourname.modinspector;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = ModInfo.MOD_ID,
    name = ModInfo.NAME,
    version = ModInfo.VERSION
)
public class ModMain {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(ModInfo.NAME + " is initializing!");
        platform.forge.ForgeBootstrap.bootstrap();
    }
}
