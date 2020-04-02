package com.KysonnDelaCerna.Bruh.blocks.slabs;

import com.KysonnDelaCerna.Bruh.Main;
import com.KysonnDelaCerna.Bruh.init.ModItems;
import com.KysonnDelaCerna.Bruh.util.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;

public class BlockSlabHalfBase extends BlockSlabBase implements IHasModel
{
	public BlockSlabHalfBase(String name, Material materialIn, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, materialIn, half);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}