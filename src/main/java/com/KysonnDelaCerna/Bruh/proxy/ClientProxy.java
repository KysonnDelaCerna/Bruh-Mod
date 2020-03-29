package com.KysonnDelaCerna.Bruh.proxy;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer (Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
    public void setGraphicsLevel(BlockLeaves parBlock, boolean parFancyEnabled)
    {
        parBlock.setGraphicsLevel(parFancyEnabled);
    }
}
