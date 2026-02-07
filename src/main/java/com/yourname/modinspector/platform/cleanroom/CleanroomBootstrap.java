package com.yourname.modinspector.platform.cleanroom;

import com.yourname.modinspector.core.CoreLogic;

public final class CleanroomBootstrap {

    public static void bootstrap() {
        System.out.println("CleanroomBootstrap running...");
        CoreLogic.run();
    }

    public static void main(String[] args) {
        bootstrap(); // 可以直接运行测试
    }
}
