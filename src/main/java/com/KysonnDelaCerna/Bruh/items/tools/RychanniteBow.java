package com.KysonnDelaCerna.Bruh.items.tools;

import com.KysonnDelaCerna.Bruh.Main;
import com.KysonnDelaCerna.Bruh.init.ModItems;
import com.KysonnDelaCerna.Bruh.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

public class RychanniteBow extends ItemBow implements IHasModel {
	public RychanniteBow (String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ModItems.ITEMS.add(this);
		
		setMaxDamage(1000);
		setMaxStackSize(1);
	}
	
	@Override
	public int getItemEnchantability()
    {
        return 22;
    }
	
	public static float getArrowVelocity(int charge)
    {
        float f = (float)charge / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;

        if (f > 1.2F)
        {
            f = 1.2F;
        }

        return f;
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
