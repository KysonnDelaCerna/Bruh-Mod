package com.KysonnDelaCerna.Bruh.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DeaniumBlock extends BlockBase {
	public DeaniumBlock (String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(15.0f);
		setResistance(1000.0f);
		setHarvestLevel("pickaxe", 2);
	}
}
