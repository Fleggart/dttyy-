package com.dttyy.cropmod;

public enum CropType {
    CORN("corn"),
    TOMATO("tomato"),
    CARROT("carrot");

    private final String name;

    CropType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}