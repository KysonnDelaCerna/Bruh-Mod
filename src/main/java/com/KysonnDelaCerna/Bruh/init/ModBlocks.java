package com.KysonnDelaCerna.Bruh.init;

import java.util.ArrayList;
import java.util.List;
import com.KysonnDelaCerna.Bruh.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block DEANIUM_BLOCK = new DeaniumBlock("deanium_block", Material.IRON);
	public static final Block DEANIUM_ORE = new DeaniumOre("deanium_ore", Material.ROCK);
}
