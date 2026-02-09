package com.dttyy.cropmod;

public enum CropType {

    CORN("corn", true, true),
    TOMATO("tomato", true, false),
    POTATO("potato", true, true);

    private final String name;
    private final boolean hasFood;
    private final boolean hasMaterial;

    CropType(String name, boolean hasFood, boolean hasMaterial) {
        this.name = name;
        this.hasFood = hasFood;
        this.hasMaterial = hasMaterial;
    }

    public String getName() {
        return name;
    }

    public boolean hasFood() {
        return hasFood;
    }

    public boolean hasMaterial() {
        return hasMaterial;
    }
}
