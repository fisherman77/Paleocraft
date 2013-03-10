// Date: 12/30/2012 2:54:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDromaeosaurus extends ModelBase
{
  //fields
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Tail4;
    ModelRenderer TailFan;
    ModelRenderer Tail5;
    ModelRenderer Tail1;
    ModelRenderer Tail3;
    ModelRenderer Tail2;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Crest;
    ModelRenderer Snout;
    ModelRenderer RightThigh;
    ModelRenderer RightLeg;
    ModelRenderer RightFoot;
    ModelRenderer RightClaw;
    ModelRenderer LeftThigh;
    ModelRenderer LeftLeg;
    ModelRenderer LeftFoot;
    ModelRenderer LeftClaw;
  
  public ModelDromaeosaurus()
  {
    textureWidth = 100;
    textureHeight = 100;
    
      LeftArm = new ModelRenderer(this, 0, -9);
      LeftArm.addBox(0F, 0F, -3F, 0, 15, 9);
      LeftArm.setRotationPoint(3F, 12F, -4F);
      LeftArm.setTextureSize(100, 100);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0.6806784F, 0.3665191F, -0.5410521F);
      RightArm = new ModelRenderer(this, 0, -9);
      RightArm.addBox(0F, 0F, -3F, 0, 15, 9);
      RightArm.setRotationPoint(-3F, 12F, -4F);
      RightArm.setTextureSize(100, 100);
      RightArm.mirror = true;
      setRotation(RightArm, 0.6806784F, -0.3665191F, 0.5410521F);
      Neck1 = new ModelRenderer(this, 9, 23);
      Neck1.addBox(-2F, -4F, -4F, 4, 5, 4);
      Neck1.setRotationPoint(0F, 11F, -3F);
      Neck1.setTextureSize(100, 100);
      Neck1.mirror = true;
      setRotation(Neck1, -0.418879F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 12, 41);
      Neck2.addBox(-1F, -2F, -7F, 2, 4, 7);
      Neck2.setRotationPoint(0F, 9F, -5F);
      Neck2.setTextureSize(100, 100);
      Neck2.mirror = true;
      setRotation(Neck2, -1.186824F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 65, 41);
      Tail4.addBox(-1F, -1F, 0F, 2, 3, 9);
      Tail4.setRotationPoint(0F, 7F, 20F);
      Tail4.setTextureSize(100, 100);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      TailFan = new ModelRenderer(this, 43, 0);
      TailFan.addBox(-1F, 0F, 0F, 7, 17, 0);
      TailFan.setRotationPoint(-2.5F, 6F, 32F);
      TailFan.setTextureSize(100, 100);
      TailFan.mirror = true;
      setRotation(TailFan, 1.570796F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 17, 57);
      Tail5.addBox(-1F, 0F, 0F, 2, 2, 9);
      Tail5.setRotationPoint(0F, 6F, 29F);
      Tail5.setTextureSize(100, 100);
      Tail5.mirror = true;
      setRotation(Tail5, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 75, 12);
      Tail1.addBox(-3F, 4F, 0F, 6, 7, 3);
      Tail1.setRotationPoint(0F, 2F, 4.5F);
      Tail1.setTextureSize(100, 100);
      Tail1.mirror = true;
      setRotation(Tail1, 0.122173F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 42, 48);
      Tail3.addBox(-1F, -1F, 0F, 2, 4, 9);
      Tail3.setRotationPoint(0F, 7F, 11F);
      Tail3.setTextureSize(100, 100);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 72, 23);
      Tail2.addBox(-2F, -2F, 0F, 4, 6, 5);
      Tail2.setRotationPoint(0F, 8F, 7F);
      Tail2.setTextureSize(100, 100);
      Tail2.mirror = true;
      setRotation(Tail2, 0.0872665F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 15);
      Body.addBox(-3F, -3F, 0F, 6, 8, 11);
      Body.setRotationPoint(0F, 9F, -5F);
      Body.setTextureSize(100, 100);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 57, 0);
      Head.addBox(-2F, -2F, -4F, 4, 4, 5);
      Head.setRotationPoint(0F, 2F, -7F);
      Head.setTextureSize(100, 100);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 19, -8);
      Crest.addBox(0F, -5F, -4F, 0, 5, 8);
      Crest.setRotationPoint(0F, 2F, -7F);
      Crest.setTextureSize(100, 100);
      Crest.mirror = true;
      setRotation(Crest, 0F, 0F, 0F);
      Snout = new ModelRenderer(this, 25, 8);
      Snout.addBox(-1F, -1F, -8F, 2, 3, 4);
      Snout.setRotationPoint(0F, 2F, -7F);
      Snout.setTextureSize(100, 100);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      RightThigh = new ModelRenderer(this, 51, 18);
      RightThigh.addBox(-2F, -2F, -2F, 2, 8, 5);
      RightThigh.setRotationPoint(-2F, 11F, 3F);
      RightThigh.setTextureSize(100, 100);
      RightThigh.mirror = true;
      setRotation(RightThigh, 0F, 0F, -0.0174533F);
      RightLeg = new ModelRenderer(this, 36, 33);
      RightLeg.addBox(-2F, 5F, 2F, 2, 7, 2);
      RightLeg.setRotationPoint(-2F, 11F, 3F);
      RightLeg.setTextureSize(100, 100);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, -0.0174533F);
      RightFoot = new ModelRenderer(this, 56, 33);
      RightFoot.addBox(-2F, 12F, 0F, 2, 1, 4);
      RightFoot.setRotationPoint(-2F, 11F, 3F);
      RightFoot.setTextureSize(100, 100);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, 0F, -0.0174533F);
      RightClaw = new ModelRenderer(this, 37, -1);
      RightClaw.addBox(0F, 10F, 0F, 0, 2, 2);
      RightClaw.setRotationPoint(-2F, 11F, 3F);
      RightClaw.setTextureSize(100, 100);
      RightClaw.mirror = true;
      setRotation(RightClaw, 0F, 0F, -0.0174533F);
      LeftThigh = new ModelRenderer(this, 35, 18);
      LeftThigh.addBox(0F, -2F, -2F, 2, 8, 5);
      LeftThigh.setRotationPoint(2F, 11F, 3F);
      LeftThigh.setTextureSize(100, 100);
      LeftThigh.mirror = true;
      setRotation(LeftThigh, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 47, 33);
      LeftLeg.addBox(0F, 5F, 2F, 2, 7, 2);
      LeftLeg.setRotationPoint(2F, 11F, 3F);
      LeftLeg.setTextureSize(100, 100);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftFoot = new ModelRenderer(this, 56, 33);
      LeftFoot.addBox(0F, 12F, 0F, 2, 1, 4);
      LeftFoot.setRotationPoint(2F, 11F, 3F);
      LeftFoot.setTextureSize(100, 100);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0F, 0F);
      LeftClaw = new ModelRenderer(this, 37, -1);
      LeftClaw.addBox(0F, 10F, 0F, 0, 2, 2);
      LeftClaw.setRotationPoint(2F, 11F, 3F);
      LeftClaw.setTextureSize(100, 100);
      LeftClaw.mirror = true;
      setRotation(LeftClaw, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Tail4.render(f5);
    TailFan.render(f5);
    Tail5.render(f5);
    Tail1.render(f5);
    Tail3.render(f5);
    Tail2.render(f5);
    Body.render(f5);
    Head.render(f5);
    Crest.render(f5);
    Snout.render(f5);
    RightThigh.render(f5);
    RightLeg.render(f5);
    RightFoot.render(f5);
    RightClaw.render(f5);
    LeftThigh.render(f5);
    LeftLeg.render(f5);
    LeftFoot.render(f5);
    LeftClaw.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
