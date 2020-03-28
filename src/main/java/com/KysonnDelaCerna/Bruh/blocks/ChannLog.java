package com.KysonnDelaCerna.Bruh.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChannLog extends BlockRotatedBase {
	public ChannLog(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(10.0f);
		setHarvestLevel("axe", 0);
	}
}
