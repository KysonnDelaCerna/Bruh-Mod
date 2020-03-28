package com.KysonnDelaCerna.Bruh.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChannLeaves extends BlockBase {
	public ChannLeaves(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(1.0f);
		setResistance(0.0f);
	}
}
