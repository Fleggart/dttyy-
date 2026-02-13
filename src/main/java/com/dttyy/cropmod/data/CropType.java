package com.dttyy.cropmod.data;

public enum CropType {

    ASPARAGUS("asparagus", 3, 0.6f, false),
    Oat("Oat", 3, 0.6f, false),
    rye("rye", 3, 0.6f, false),
    Corn("Corn", 3, 0.6f, false),
    Barley("Barley", 3, 0.6f, false);

    private final String name;
    private final int hunger;
    private final float saturation;

    CropType(String name, int hunger, float saturation) {
        this.name = name;
        this.hunger = hunger;
        this.saturation = saturation;
    }

    public String getName() { return name; }
    public int getHunger() { return hunger; }
    public float getSaturation() { return saturation; }
}
