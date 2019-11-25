package barryflash.superheroes.client.render.layers;

import org.lwjgl.opengl.GL11;

import barryflash.superheroes.Reference;
import barryflash.superheroes.capabilities.BatmanProvider;
import barryflash.superheroes.capabilities.DoctorStrangeProvider;
import barryflash.superheroes.capabilities.IBatman;
import barryflash.superheroes.capabilities.IDoctorStrange;
import barryflash.superheroes.capabilities.IShazam;
import barryflash.superheroes.capabilities.ISuperman;
import barryflash.superheroes.capabilities.ShazamProvider;
import barryflash.superheroes.capabilities.SupermanProvider;
import barryflash.superheroes.init.ModItems;
import barryflash.superheroes.items.armor.ItemBatmanArmor;
import barryflash.superheroes.items.armor.ItemDoctorStrangeArmor;
import barryflash.superheroes.items.armor.ItemShazamArmor;
import barryflash.superheroes.items.armor.ItemSupermanArmor;
import barryflash.superheroes.models.ModelAntmanLights;
import barryflash.superheroes.models.ModelAntmanTrans;
import barryflash.superheroes.models.ModelBatmanCape;
import barryflash.superheroes.models.ModelDoctorStrangeCape;
import barryflash.superheroes.models.ModelHero;
import barryflash.superheroes.models.ModelShazamCape;
import barryflash.superheroes.models.ModelShazamGlow;
import barryflash.superheroes.models.ModelSupermanCape;
import barryflash.superheroes.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderShazamLayer implements LayerRenderer<AbstractClientPlayer> {

	  private final RenderLivingBase<?> renderer;
	  
	    public RenderShazamLayer(RenderLivingBase<?> rendererIn)
	    {
	        this.renderer = rendererIn;
	       
	    }
	
	public void doRenderLayer(AbstractClientPlayer entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		
		if (ItemShazamArmor.isWearingShazam(entitylivingbaseIn)) {
			IShazam shazamcap = entitylivingbaseIn.getCapability(ShazamProvider.SHAZAM_CAP, null);
			if (shazamcap.isShazam()) {
			//ISuperman supercap = entitylivingbaseIn.getCapability(SupermanProvider.SUPERMAN_CAP, null);
			ModelShazamGlow modelL = new ModelShazamGlow(scale);
		
		
			float brightnessX = OpenGlHelper.lastBrightnessX;
			float brightnessY = OpenGlHelper.lastBrightnessY;
			modelL.bipedLeftArmwear.showModel = false;
			modelL.bipedRightArmwear.showModel = false;
			modelL.bipedRightLeg.showModel = false;
			modelL.bipedLeftLeg.showModel = false;
			modelL.bipedHeadwear.showModel = false;
			modelL.bipedLeftLegwear.showModel = false;
			modelL.bipedRightLegwear.showModel = false;
			modelL.bipedBodyWear.showModel = false;
			modelL.bipedHead.showModel = false;

			GlStateManager.pushMatrix();
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MODID + ":textures/models/armor/shazam_glow.png"));
			modelL.setModelAttributes(this.renderer.getMainModel());
			modelL.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
			modelL.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, brightnessX, brightnessY);
			GlStateManager.popMatrix();

			ModelShazamCape model = new ModelShazamCape();
		GlStateManager.pushMatrix();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			
		 GlStateManager.translate(0.0F, -0.05F, 0.275F);
		  double d0 = entitylivingbaseIn.prevChasingPosX + (entitylivingbaseIn.chasingPosX - entitylivingbaseIn.prevChasingPosX) * (double)partialTicks - (entitylivingbaseIn.prevPosX + (entitylivingbaseIn.posX - entitylivingbaseIn.prevPosX) * (double)partialTicks);
          double d1 = entitylivingbaseIn.prevChasingPosY + (entitylivingbaseIn.chasingPosY - entitylivingbaseIn.prevChasingPosY) * (double)partialTicks - (entitylivingbaseIn.prevPosY + (entitylivingbaseIn.posY - entitylivingbaseIn.prevPosY) * (double)partialTicks);
          double d2 = entitylivingbaseIn.prevChasingPosZ + (entitylivingbaseIn.chasingPosZ - entitylivingbaseIn.prevChasingPosZ) * (double)partialTicks - (entitylivingbaseIn.prevPosZ + (entitylivingbaseIn.posZ - entitylivingbaseIn.prevPosZ) * (double)partialTicks);
          float f = entitylivingbaseIn.prevRenderYawOffset + (entitylivingbaseIn.renderYawOffset - entitylivingbaseIn.prevRenderYawOffset) * partialTicks;
          double d3 = (double)MathHelper.sin(f * 0.017453292F);
          double d4 = (double)(-MathHelper.cos(f * 0.017453292F));
          float f1 = (float)d1 * 10.0F;
          f1 = MathHelper.clamp(f1, -6.0F, 32.0F);
          float f2 = (float)(d0 * d3 + d2 * d4) * 100.0F;
          float f3 = (float)(d0 * d4 - d2 * d3) * 100.0F;

          if (f2 < 0.0F)
          {
              f2 = 0.0F;
          }

          float f4 = entitylivingbaseIn.prevCameraYaw + (entitylivingbaseIn.cameraYaw - entitylivingbaseIn.prevCameraYaw) * partialTicks;
          f1 = f1 + MathHelper.sin((entitylivingbaseIn.prevDistanceWalkedModified + (entitylivingbaseIn.distanceWalkedModified - entitylivingbaseIn.prevDistanceWalkedModified) * partialTicks) * 6.0F) * 32.0F * f4;

          if (entitylivingbaseIn.isSneaking())
          {
              f1 += 25.0F;
              GlStateManager.translate(0.0F, 0.1F, -0.025F);
          }
          model.cape.rotateAngleX = -0.1F;
         if (shazamcap.isFlying() && shazamcap.getFlyTicks() != 0) {
        	 GlStateManager.rotate(15, 8.0F, 0.0F, 0.0F);
         
         } else {
        	 GlStateManager.rotate(8.0F + f2 / 3.5F + f1, 8.0F, 0.0F, 0.0F);
         }
         GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MODID + ":textures/models/armor/shazam.png"));
		model.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		GlStateManager.popMatrix();
			}
	}
	}

	@Override
	public boolean shouldCombineTextures() {
		// TODO Auto-generated method stub
		return false;
	}
	
}