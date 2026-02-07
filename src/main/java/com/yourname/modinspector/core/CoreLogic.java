package com.yourname.modinspector.core;

import java.io.*;
import java.nio.file.*;
import java.util.jar.*;
import java.util.zip.*;
import java.util.*;
import org.json.*; // 需要 json 库，例如 org.json:json

public final class CoreLogic {

    // 常见开源许可证白名单
    private static final List<String> OPEN_SOURCE_LICENSES = Arrays.asList(
        "MIT", "Apache", "GPL", "BSD"
    );

    public static void run() {
        System.out.println("Core logic executed!");

        Path modsDir = Paths.get("mods"); // 可以改成你 mods 文件夹路径
        if (!Files.exists(modsDir) || !Files.isDirectory(modsDir)) {
            System.out.println("mods directory not found: " + modsDir.toAbsolutePath());
            return;
        }

        try {
            Files.list(modsDir)
                .filter(path -> path.toString().endsWith(".jar"))
                .forEach(CoreLogic::processJar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processJar(Path jarPath) {
        System.out.println("\nScanning mod: " + jarPath.getFileName());

        try (JarFile jar = new JarFile(jarPath.toFile())) {
            // 1. 检查 Forge mods.toml
            JarEntry tomlEntry = jar.getJarEntry("META-INF/mods.toml");
            if (tomlEntry != null) {
                try (InputStream in = jar.getInputStream(tomlEntry);
                     BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.startsWith("modid")) {
                            System.out.println(line.trim());
                        } else if (line.startsWith("name")) {
                            System.out.println(line.trim());
                        } else if (line.startsWith("license")) {
                            String license = line.split("=")[1].replace("\"","").trim();
                            System.out.println("license: " + license);
                            checkOpenSource(license);
                        }
                    }
                }
            }

            // 2. 检查 Fabric mod json
            JarEntry jsonEntry = jar.getJarEntry("fabric.mod.json");
            if (jsonEntry != null) {
                try (InputStream in = jar.getInputStream(jsonEntry)) {
                    String content = new String(in.readAllBytes());
                    JSONObject obj = new JSONObject(content);
                    String id = obj.optString("id");
                    String name = obj.optString("name");
                    String license = obj.optString("license");
                    System.out.println("id: " + id);
                    System.out.println("name: " + name);
                    if (!license.isEmpty()) {
                        System.out.println("license: " + license);
                        checkOpenSource(license);
                    }
                }
            }

            // 3. 可以扩展 mcmod.info 等老格式

        } catch (IOException | JSONException e) {
            System.out.println("Failed to read jar: " + jarPath.getFileName());
            e.printStackTrace();
        }
    }

    private static void checkOpenSource(String license) {
        for (String open : OPEN_SOURCE_LICENSES) {
            if (license.toUpperCase().contains(open.toUpperCase())) {
                System.out.println("This mod appears to be open source (" + open + ")");
                return;
            }
        }
        System.out.println("This mod license is unknown or proprietary");
    }
}
