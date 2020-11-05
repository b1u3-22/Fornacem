package com.b1u322.fornacem.blocks;

import com.b1u322.fornacem.fornacem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(fornacem.TAB));
    }
}
