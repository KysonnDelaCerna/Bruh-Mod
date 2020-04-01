package com.KysonnDelaCerna.Bruh.blocks;

import java.util.Random;

import com.KysonnDelaCerna.Bruh.Main;
import com.KysonnDelaCerna.Bruh.init.ModBlocks;
import com.KysonnDelaCerna.Bruh.init.ModItems;
import com.KysonnDelaCerna.Bruh.util.IHasModel;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChannSapling extends BlockSapling implements IHasModel {
	public ChannSapling (String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHardness(0.0F);
        setSoundType(SoundType.PLANT);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        WorldGenerator worldgenerator = new WorldGenTrees(false, 4, ModBlocks.CHANN_LOG.getDefaultState(), ModBlocks.CHANN_LEAVES.getDefaultState(), false);;

        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 4);

        worldgenerator.generate(worldIn, rand, pos);
    }
	
	@Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this));
    }
}
