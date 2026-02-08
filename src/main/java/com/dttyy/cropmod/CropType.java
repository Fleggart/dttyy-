package com.dttyy.cropmod;

public enum CropType {
    CORN("corn", 4, 0.6F),
    TOMATO("tomato", 5, 0.8F),
    CARROT("carrot", 3, 0.6F);

    private final String name;
    private final int hunger;
    private final float saturation;

    CropType(String name, int hunger, float saturation) {
        this.name = name;
        this.hunger = hunger;
        this.saturation = saturation;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public float getSaturation() {
        return saturation;
    }
}
