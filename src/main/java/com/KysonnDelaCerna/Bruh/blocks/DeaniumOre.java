package com.KysonnDelaCerna.Bruh.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DeaniumOre extends BlockBase {
	public DeaniumOre (String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(7.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 2);
	}
}