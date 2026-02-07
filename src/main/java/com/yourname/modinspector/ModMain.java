package com.yourname.modinspector;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = ModMain.MOD_ID,
    name = ModMain.NAME,
    version = ModMain.VERSION
)
public class ModMain {

    public static final String MOD_ID = "mc_mod_inspector";
    public static final String NAME   = "MC Mod Inspector";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(NAME + " initialized!");
    }
}