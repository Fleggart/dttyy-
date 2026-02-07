package com.yourname.modinspector;

import com.cleanroom.mod.api.Mod; // 假设 Cleanroom mod 注解

@Mod(
    id = ModInfo.MOD_ID,
    name = ModInfo.NAME,
    version = ModInfo.VERSION
)
public class ModMain {

    public void onInitialize() {
        System.out.println(ModInfo.NAME + " initialized as a Cleanroom Mod!");
        platform.cleanroom.CleanroomBootstrap.bootstrap();
    }
}
