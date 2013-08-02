package ubahRPG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class RenderOrc extends RenderLiving
{
 protected ModelOrc model;
 private static final ResourceLocation orcTexture =  new ResourceLocation("ubgms_rpg", "textures/mob/Orc.png");
 
 public RenderOrc (ModelOrc modelOrc, float f)
 {
  super(modelOrc, f);
  model = ((ModelOrc)mainModel);
 }
 
 public void renderOrc(EntityOrc entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderOrc((EntityOrc)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderOrc((EntityOrc)par1Entity, par2, par4, par6, par8, par9);
    }

@Override
protected ResourceLocation func_110775_a(Entity entity) {
	
	return orcTexture;
}
}

