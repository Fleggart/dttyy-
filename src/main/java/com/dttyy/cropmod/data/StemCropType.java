package com.dttyy.cropmod.data;

public enum StemCropType {

    PUMPKIN("pumpkin"),
    MELON("melon");

    private final String name;

    StemCropType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
