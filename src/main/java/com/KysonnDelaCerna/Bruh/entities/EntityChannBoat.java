package com.KysonnDelaCerna.Bruh.entities;

import com.KysonnDelaCerna.Bruh.init.ModItems;
import com.KysonnDelaCerna.Bruh.util.IHasModel;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.world.World;

public class EntityChannBoat extends EntityBoat {
	public EntityChannBoat(World worldIn) {
		super(worldIn);
	}
	
	public EntityChannBoat(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
	
	@Override
	public Item getItemBoat()
    {
        return ModItems.CHANN_BOAT;
    }
}
