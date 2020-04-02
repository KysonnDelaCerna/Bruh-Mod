package com.KysonnDelaCerna.Bruh.init;

import java.util.ArrayList;
import java.util.List;
import com.KysonnDelaCerna.Bruh.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// BLOCKS
	public static final Block DEANIUM_BLOCK = new DeaniumBlock("deanium_block", Material.IRON);
	public static final Block DEANIUM_ORE = new DeaniumOre("deanium_ore", Material.ROCK);
	public static final Block CHANN_LOG = new ChannLog("chann_log");
	public static final Block CHANN_LEAVES = new ChannLeaves("chann_leaves");
	public static final Block CHANN_PLANKS = new ChannPlanks("chann_planks", Material.WOOD);
	
	// FLOWERS
	public static final BlockFlower RY_FLOWER = new RyFlower("ry_flower");
	
	// SAPLINGS
	public static final Block CHANN_SAPLING = new ChannSapling("chann_sapling");
	
	// DOORS
	public static final Block CHANN_DOOR = new ChannDoor("chann_door", Material.WOOD);
}