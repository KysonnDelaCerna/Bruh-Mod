package com.KysonnDelaCerna.Bruh.blocks.slabs;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSlabDoubleBase extends BlockSlabBase
{
	public BlockSlabDoubleBase(String name, Material materialIn, BlockSlab half) 
	{
		super(name, materialIn, half);
	}

	@Override
	public boolean isDouble() 
	{	
		return true;
	}
}
