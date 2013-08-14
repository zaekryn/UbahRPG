






package ubahRPG;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelUnicorn extends ModelBase
{
  //fields
    ModelRenderer legRightBack;
    ModelRenderer legLeftBack;
    ModelRenderer legRightFront;
    ModelRenderer legLeftFront;
    ModelRenderer body;
    ModelRenderer tail;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer horn1;
    ModelRenderer horn2;
  
  public ModelUnicorn()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      legRightBack = new ModelRenderer(this, 20, 42);
      legRightBack.addBox(0F, 0F, 0F, 4, 12, 4);
      legRightBack.setRotationPoint(-7F, 12F, 7F);
      legRightBack.setTextureSize(128, 64);
      legRightBack.mirror = true;
      setRotation(legRightBack, 0F, 0F, 0F);
      legLeftBack = new ModelRenderer(this, 20, 42);
      legLeftBack.addBox(0F, 0F, 0F, 4, 12, 4);
      legLeftBack.setRotationPoint(3F, 12F, 7F);
      legLeftBack.setTextureSize(128, 64);
      legLeftBack.mirror = true;
      setRotation(legLeftBack, 0F, 0F, 0F);
      legRightFront = new ModelRenderer(this, 20, 42);
      legRightFront.addBox(0F, 0F, 0F, 4, 12, 4);
      legRightFront.setRotationPoint(-7F, 12F, -11F);
      legRightFront.setTextureSize(128, 64);
      legRightFront.mirror = true;
      setRotation(legRightFront, 0F, 0F, 0F);
      legLeftFront = new ModelRenderer(this, 20, 42);
      legLeftFront.addBox(0F, 0F, 0F, 4, 12, 4);
      legLeftFront.setRotationPoint(3F, 12F, -11F);
      legLeftFront.setTextureSize(128, 64);
      legLeftFront.mirror = true;
      setRotation(legLeftFront, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 16, 10, 24);
      body.setRotationPoint(-8F, 4F, -12F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 45, 42);
      tail.addBox(0F, 0F, 0F, 2, 10, 1);
      tail.setRotationPoint(-1F, 6F, 11F);
      tail.setTextureSize(128, 64);
      tail.mirror = true;
      setRotation(tail, 0.7435722F, 0F, 0F);
      neck = new ModelRenderer(this, 83, 20);
      neck.addBox(0F, 0F, 0F, 6, 17, 6);
      neck.setRotationPoint(-3F, -11F, -16F);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, 0.2602503F, 0F, 0F);
      head = new ModelRenderer(this, 82, 2);
      head.addBox(0F, 0F, 0F, 6, 6, 10);
      head.setRotationPoint(-3F, -9F, -25F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0.260246F, 0F, 0F);
      horn1 = new ModelRenderer(this, 110, 33);
      horn1.addBox(0F, 0F, 0F, 4, 3, 4);
      horn1.setRotationPoint(-2F, -13F, -20F);
      horn1.setTextureSize(128, 64);
      horn1.mirror = true;
      setRotation(horn1, 0.260246F, 0F, 0F);
      horn2 = new ModelRenderer(this, 114, 20);
      horn2.addBox(0F, 0F, 0F, 2, 7, 2);
      horn2.setRotationPoint(-1F, -20F, -21F);
      horn2.setTextureSize(128, 64);
      horn2.mirror = true;
      setRotation(horn2, 0.260246F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    legRightBack.render(f5);
    legLeftBack.render(f5);
    legRightFront.render(f5);
    legLeftFront.render(f5);
    body.render(f5);
    tail.render(f5);
    neck.render(f5);
    head.render(f5);
    horn1.render(f5);
    horn2.render(f5);
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
    this.legRightBack.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.legLeftFront.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.legLeftBack.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.legRightFront.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}

