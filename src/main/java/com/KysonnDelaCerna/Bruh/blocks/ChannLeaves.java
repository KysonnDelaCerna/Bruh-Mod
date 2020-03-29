package com.KysonnDelaCerna.Bruh.blocks;

import java.util.Random;

import com.KysonnDelaCerna.Bruh.init.ModBlocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class ChannLeaves extends BlockLeavesBase {
	public ChannLeaves(String name) {
		super(name);
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.DEANIUM_BLOCK);
    }
}
