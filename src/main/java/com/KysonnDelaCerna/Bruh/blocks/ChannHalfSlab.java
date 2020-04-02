package com.KysonnDelaCerna.Bruh.blocks;

import java.util.Random;

import com.KysonnDelaCerna.Bruh.blocks.slabs.BlockSlabHalfBase;
import com.KysonnDelaCerna.Bruh.init.ModBlocks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChannHalfSlab extends BlockSlabHalfBase {
	public ChannHalfSlab(String name, Material material) {
		super(name, material, ModBlocks.CHANN_HALF_SLAB, new ChannDoubleSlab("chann_double_slab", Material.WOOD));
		setSoundType(SoundType.WOOD);
		setHardness(1.0f);
		setResistance(50.0f);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) 
	{
		return new ItemStack(this);
	}
}
