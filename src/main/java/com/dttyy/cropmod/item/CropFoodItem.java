package com.dttyy.cropmod.item;

import net.minecraft.item.ItemFood;

public class CropFoodItem extends ItemFood {

    // 构造方法：传入恢复饥饿值、饱和度、是否狼可吃
    public CropFoodItem(int hunger, float saturation, boolean canWolfEat) {
        super(hunger, saturation, canWolfEat);
        // 你可以在这里设置 Item 属性，例如：
        // this.setCreativeTab(CreativeTabs.FOOD); // 放到食物标签页
    }
}
