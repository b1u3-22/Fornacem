package com.b1u322.fornacem.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SmithsCoalBlock extends Block {
    public SmithsCoalBlock() {
        super(Block.Properties.create(Material.MISCELLANEOUS)
                .hardnessAndResistance(5.0f, 5.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(11)
        );

    }
}
