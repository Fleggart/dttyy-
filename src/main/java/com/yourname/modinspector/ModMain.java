package com.yourname.modinspector;

import com.cleanroom.loader.api.Mod; // 假设 Cleanroom Loader 提供的注解

@Mod(
    id = ModInfo.MOD_ID,
    name = ModInfo.NAME,
    version = ModInfo.VERSION
)
public class ModMain {

    public void onInitialize() {
        System.out.println(ModInfo.NAME + " initialized on Cleanroom Loader!");
        platform.cleanroom.CleanroomBootstrap.bootstrap();
    }
}
