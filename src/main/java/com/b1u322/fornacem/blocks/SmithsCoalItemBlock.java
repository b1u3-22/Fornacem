package com.b1u322.fornacem.blocks;

import com.b1u322.fornacem.fornacem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SmithsCoalItemBlock extends BlockItem {
    public SmithsCoalItemBlock(Block blockIn) {
        super(blockIn, new Item.Properties().group(fornacem.TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 25000;
    }
}
