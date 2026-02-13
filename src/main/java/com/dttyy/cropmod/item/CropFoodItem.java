package com.dttyy.cropmod.item;

import net.minecraft.item.ItemFood;

public class CropFoodItem extends ItemFood {

    public CropFoodItem(int hunger, float saturation) {
        super(hunger, saturation, false);
    }
}
