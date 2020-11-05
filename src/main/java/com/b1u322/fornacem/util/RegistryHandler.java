package com.b1u322.fornacem.util;

import com.b1u322.fornacem.blocks.BlockItemBase;
import com.b1u322.fornacem.blocks.SmithsCoalBlock;
import com.b1u322.fornacem.fornacem;
import com.b1u322.fornacem.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, fornacem.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, fornacem.MOD_ID);

    public static void init() {
        ITEMS.register((FMLJavaModLoadingContext.get().getModEventBus()));
        BLOCKS.register((FMLJavaModLoadingContext.get().getModEventBus()));
    }

    // For items only
    public static final RegistryObject<Item> COMBINED_COAL = ITEMS.register("combined_coal", ItemBase::new);
    public static final RegistryObject<Item> SMITHS_COAL = ITEMS.register("smiths_coal", ItemBase::new);

    // For Blocks only
    public static final RegistryObject<Block> SMITHS_COAL_BLOCK = BLOCKS.register("smiths_coal_block", SmithsCoalBlock::new);

    // For Block Items only
    public static final RegistryObject<Item> SMITHS_COAL_BLOCK_ITEM = ITEMS.register("smiths_coal_block", () -> new BlockItemBase(SMITHS_COAL_BLOCK.get()));
}
