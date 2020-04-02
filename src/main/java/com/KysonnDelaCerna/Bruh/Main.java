package com.KysonnDelaCerna.Bruh;

import java.io.File;

import com.KysonnDelaCerna.Bruh.init.ModEntities;
import com.KysonnDelaCerna.Bruh.init.ModRecipes;
import com.KysonnDelaCerna.Bruh.proxy.CommonProxy;
import com.KysonnDelaCerna.Bruh.util.Reference;
import com.KysonnDelaCerna.Bruh.util.handlers.RenderHandler;
import com.KysonnDelaCerna.Bruh.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static File config;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
