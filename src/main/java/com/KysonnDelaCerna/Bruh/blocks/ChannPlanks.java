package com.KysonnDelaCerna.Bruh.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChannPlanks extends BlockBase {
	public ChannPlanks (String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(1.0f);
		setResistance(50.0f);
	}
}
