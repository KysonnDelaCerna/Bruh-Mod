package com.KysonnDelaCerna.Bruh.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init () {
		GameRegistry.addSmelting(ModItems.DEANIUM_MIX, new ItemStack(ModItems.DEANIUM_INGOT, 1), 1f);
		GameRegistry.addSmelting(ModBlocks.CHANN_LOG, new ItemStack(ModItems.CHANN_ASH, 1), 1f);
	}
}
