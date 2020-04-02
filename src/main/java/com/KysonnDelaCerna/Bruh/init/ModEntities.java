package com.KysonnDelaCerna.Bruh.init;

import com.KysonnDelaCerna.Bruh.Main;
import com.KysonnDelaCerna.Bruh.entities.EntityChannBoat;
import com.KysonnDelaCerna.Bruh.util.ModConfiguration;
import com.KysonnDelaCerna.Bruh.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities()
	{
		registerEntity("chann_boat", EntityChannBoat.class, ModConfiguration.ENTITY_CHANN_BOAT, 50, 11437146, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
