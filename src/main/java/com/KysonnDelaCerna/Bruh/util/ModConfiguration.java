package com.KysonnDelaCerna.Bruh.util;

import java.io.File;

import com.KysonnDelaCerna.Bruh.Main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration {
	public static Configuration config;
	
	public static int ENTITY_CHANN_BOAT = 201;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		ENTITY_CHANN_BOAT = config.getInt("ENTITY_CHANN_BOAT", category, 201, 201, 999, "Entity IDs below 201 are used by Minecraft");	
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}
