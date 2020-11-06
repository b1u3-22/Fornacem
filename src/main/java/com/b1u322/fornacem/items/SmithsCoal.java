package com.b1u322.fornacem.items;

import com.b1u322.fornacem.fornacem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SmithsCoal extends Item {
    public SmithsCoal() {
        super(new Item.Properties().group(fornacem.TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 2500;
    }
}

