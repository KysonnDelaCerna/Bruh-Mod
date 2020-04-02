package com.KysonnDelaCerna.Bruh.util.handlers;

import com.KysonnDelaCerna.Bruh.entities.EntityChannBoat;
import com.KysonnDelaCerna.Bruh.renderers.RenderChannBoat;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityChannBoat.class, new IRenderFactory<EntityChannBoat>()
		{
			@Override
			public Render<? super EntityChannBoat> createRenderFor(RenderManager manager) 
			{
				return new RenderChannBoat(manager);
			}
		});
	}
}
