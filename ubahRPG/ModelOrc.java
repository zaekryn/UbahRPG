// Date: 8/2/2013 2:47:58 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package ubahRPG;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOrc extends ModelBase
{
  //fields
    ModelRenderer legRight;
    ModelRenderer legLeft;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer armRight;
    ModelRenderer armLeft;
    ModelRenderer coverFront;
    ModelRenderer coverBack;
  
  public ModelOrc()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      legRight = new ModelRenderer(this, 2, 33);
      legRight.addBox(0F, 0F, 0F, 5, 15, 3);
      legRight.setRotationPoint(-6F, 9F, -1F);
      legRight.setTextureSize(64, 32);
      legRight.mirror = true;
      setRotation(legRight, 0F, 0F, 0F);
      legLeft = new ModelRenderer(this, 26, 33);
      legLeft.addBox(0F, 0F, 0F, 5, 15, 3);
      legLeft.setRotationPoint(1F, 9F, -1F);
      legLeft.setTextureSize(64, 32);
      legLeft.mirror = true;
      setRotation(legLeft, 0F, 0F, 0F);
      body = new ModelRenderer(this, 2, 8);
      body.addBox(0F, 0F, 0F, 14, 16, 7);
      body.setRotationPoint(-7F, -7F, -4F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 59, 4);
      head.addBox(0F, 0F, 0F, 8, 8, 9);
      head.setRotationPoint(-4F, -15F, -5F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      armRight = new ModelRenderer(this, 45, 34);
      armRight.addBox(0F, 0F, 0F, 3, 11, 3);
      armRight.setRotationPoint(-10F, -4F, -2F);
      armRight.setTextureSize(64, 32);
      armRight.mirror = true;
      setRotation(armRight, 0F, 0F, 0F);
      armLeft = new ModelRenderer(this, 59, 34);
      armLeft.addBox(0F, 0F, 0F, 3, 11, 3);
      armLeft.setRotationPoint(7F, -4F, -2F);
      armLeft.setTextureSize(64, 32);
      armLeft.mirror = true;
      setRotation(armLeft, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    legRight.render(f5);
    legLeft.render(f5);
    body.render(f5);
    head.render(f5);
    armRight.render(f5);
    armLeft.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.legRight.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.armLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.legLeft.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.armRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
