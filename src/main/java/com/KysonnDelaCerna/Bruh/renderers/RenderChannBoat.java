package com.KysonnDelaCerna.Bruh.renderers;

import com.KysonnDelaCerna.Bruh.entities.EntityChannBoat;
import com.KysonnDelaCerna.Bruh.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChannBoat extends Render<EntityChannBoat> {
	private static ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/boat/chann_boat.png");
	
	protected ModelBase modelBase = new ModelBoat();
	
	public RenderChannBoat(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityChannBoat entity) {
		return TEXTURE;
	}
	
	@Override
    public void doRender(EntityChannBoat entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
		GlStateManager.pushMatrix();
        this.setupTranslation(x, y, z);
        this.setupRotation(entity, entityYaw, partialTicks);
        this.bindEntityTexture(entity);

        if (this.renderOutlines)
        {
            GlStateManager.enableColorMaterial();
            GlStateManager.enableOutlineMode(this.getTeamColor(entity));
        }
        
        this.modelBase.render(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

        if (this.renderOutlines)
        {
            GlStateManager.disableOutlineMode();
            GlStateManager.disableColorMaterial();
        }

        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

	 public void setupRotation(EntityChannBoat entity, float p_188311_2_, float p_188311_3_)
    {
        GlStateManager.rotate(180.0F - p_188311_2_, 0.0F, 1.0F, 0.0F);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
    }

    public void setupTranslation(double x, double y, double z)
    {
        GlStateManager.translate((float)x, (float)y+ 0.375F, (float)z);
    }
}
