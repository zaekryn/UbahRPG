package ubahRPG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class RenderElf extends RenderLiving
{
 protected ModelElf model;
 private static final ResourceLocation elfTexture =  new ResourceLocation("ubgms_rpg", "textures/mob/Elf.png");
 
 public RenderElf (ModelElf modelElf, float f)
 {
  super(modelElf, f);
  model = ((ModelElf)mainModel);
 }
 
 public void renderElf(EntityElf entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderElf((EntityElf)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderElf((EntityElf)par1Entity, par2, par4, par6, par8, par9);
    }

@Override
protected ResourceLocation func_110775_a(Entity entity) {
	
	return elfTexture;
}
}
