// Date: 1/26/2015 4:13:35 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDimorphodon extends ModelBase
{
  //fields
    ModelRenderer RightFoot;
    ModelRenderer LeftFoot;
    ModelRenderer TailFin;
    ModelRenderer RightLeg1;
    ModelRenderer RightLeg2;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer LeftLeg1;
    ModelRenderer LeftLeg2;
    ModelRenderer Tail;
    ModelRenderer TailMembrane;
    ModelRenderer Neck;
    ModelRenderer HeadPiece;
    ModelRenderer LeftWingPiece1;
    ModelRenderer RightWingPiece1;
  ModelRenderer Head;
  ModelRenderer SnoutTip;
  ModelRenderer Snout;
  ModelRenderer LeftArm1;
  ModelRenderer LeftWing1;
  ModelRenderer LeftArm2;
  ModelRenderer LeftWing2;
 ModelRenderer LeftWingPiece2;
 ModelRenderer RightArm1;
 ModelRenderer RightWing1;
 ModelRenderer RightArm2;
 ModelRenderer RightWing2;
 ModelRenderer RingWingPiece2;
 
    
    
    
    public ModelDimorphodon()
  {
    textureWidth = 150;
    textureHeight = 150;
    
      RightFoot = new ModelRenderer(this, 17, 61);
      RightFoot.addBox(-1.5F, -0.5F, 10F, 2, 1, 3);
      RightFoot.setRotationPoint(-2F, 16F, 9F);
      RightFoot.setTextureSize(150, 150);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, 0F, 0F);
      LeftFoot = new ModelRenderer(this, 17, 61);
      LeftFoot.addBox(-0.5F, -0.5F, 10F, 2, 1, 3);
      LeftFoot.setRotationPoint(1F, 16F, 9F);
      LeftFoot.setTextureSize(150, 150);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0F, 0F);
      TailFin = new ModelRenderer(this, 8, 107);
      TailFin.addBox(-3F, 0.5F, 29F, 6, 1, 8);
      TailFin.setRotationPoint(-0.5F, 15F, 10F);
      TailFin.setTextureSize(150, 150);
      TailFin.mirror = true;
      setRotation(TailFin, 0F, 0F, 0F);
      RightLeg1 = new ModelRenderer(this, 13, 50);
      RightLeg1.addBox(-1F, -1F, 0F, 1, 2, 5);
      RightLeg1.setRotationPoint(-2F, 16F, 9F);
      RightLeg1.setTextureSize(150, 150);
      RightLeg1.mirror = true;
      setRotation(RightLeg1, 0F, 0F, 0F);
      RightLeg2 = new ModelRenderer(this, 29, 50);
      RightLeg2.addBox(-1F, -0.5F, 5F, 1, 1, 5);
      RightLeg2.setRotationPoint(-2F, 16F, 9F);
      RightLeg2.setTextureSize(150, 150);
      RightLeg2.mirror = true;
      setRotation(RightLeg2, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 5, 120);
      Body1.addBox(0F, 0.5F, 0F, 5, 5, 6);
      Body1.setRotationPoint(-3F, 13F, -1F);
      Body1.setTextureSize(150, 150);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 100, 103);
      Body2.addBox(0.5F, 1F, 6F, 4, 4, 5);
      Body2.setRotationPoint(-3F, 13F, -1F);
      Body2.setTextureSize(150, 150);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      LeftLeg1 = new ModelRenderer(this, 13, 50);
      LeftLeg1.addBox(0F, -1F, 0F, 1, 2, 5);
      LeftLeg1.setRotationPoint(1F, 16F, 9F);
      LeftLeg1.setTextureSize(150, 150);
      LeftLeg1.mirror = true;
      setRotation(LeftLeg1, 0F, 0F, 0F);
      LeftLeg2 = new ModelRenderer(this, 29, 50);
      LeftLeg2.addBox(0F, -0.5F, 5F, 1, 1, 5);
      LeftLeg2.setRotationPoint(1F, 16F, 9F);
      LeftLeg2.setTextureSize(150, 150);
      LeftLeg2.mirror = true;
      setRotation(LeftLeg2, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 16, 107);
      Tail.addBox(-0.5F, 0F, 0F, 1, 1, 34);
      Tail.setRotationPoint(-0.5F, 15F, 10F);
      Tail.setTextureSize(150, 150);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      TailMembrane = new ModelRenderer(this, 47, 40);
      TailMembrane.addBox(-1.5F, 0F, 0F, 3, 1, 3);
      TailMembrane.setRotationPoint(-0.5F, 15.5F, 10F);
      TailMembrane.setTextureSize(150, 150);
      TailMembrane.mirror = true;
      setRotation(TailMembrane, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 62, 48);
      Neck.addBox(-1F, 0F, 0F, 3, 4, 5);
      Neck.setRotationPoint(-1F, 14F, -6F);
      Neck.setTextureSize(150, 150);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
    HeadPiece = new ModelRenderer(this, "HeadPiece");
    HeadPiece.setRotationPoint(-0.5F, 16F, -6F);
    setRotation(HeadPiece, 0F, 0F, 0F);
    HeadPiece.mirror = true;
   //   HeadPiece.addBox("Head", -1.5F, -3F, -8F, 3, 6, 8);
   //   HeadPiece.addBox("SnoutTip", -1F, -1F, -12F, 2, 4, 2);
    //  HeadPiece.addBox("Snout", -1.5F, -2F, -10F, 3, 5, 2);
    ModelRenderer Head = new ModelRenderer(this, 66, 109);
    Head.addBox(-1.5F, -3F, -8F, 3, 6, 8);
    ModelRenderer SnoutTip = new ModelRenderer(this, 59, 28);
    SnoutTip.addBox(-1F, -1F, -12F, 2, 4, 2);  
    ModelRenderer Snout = new ModelRenderer(this, 76, 34);
    Snout.addBox(-1.5F, -2F, -10F, 3, 5, 2);
  
    
    //   modelDimorph.addChildModelRenderer(HeadPiece);
    LeftWingPiece1 = new ModelRenderer(this, "LeftWingPiece1");
    LeftWingPiece1.setRotationPoint(2F, 15.5F, 0F);
    setRotation(LeftWingPiece1, 0F, 0F, 0F);
    LeftWingPiece1.mirror = true;
    //  LeftWingPiece1.addBox("LeftArm1", 0F, -0.5F, -0.5F, 13, 1, 1);
    //  LeftWingPiece1.addBox("LeftWing1", -1F, 0F, 0.5F, 14, 1, 11);
    ModelRenderer LeftArm1 = new ModelRenderer(this, 113, 65);
    LeftArm1.addBox(0F, -0.5F, -0.5F, 13, 1, 1);
    ModelRenderer LeftWing1 = new ModelRenderer(this, 10, 76);
    LeftWing1.addBox(-1F, 0F, 0.5F, 14, 1, 11);
      
      
      LeftWingPiece2 = new ModelRenderer(this, "LeftWingPiece2");
    LeftWingPiece2.setRotationPoint(13F, 0F, 0F);
    setRotation(LeftWingPiece2, 0F, 0F, 0F);
    LeftWingPiece2.mirror = true;
   //   LeftWingPiece2.addBox("LeftArm2", 0F, -0.5F, -0.5F, 25, 1, 1);
   //   LeftWingPiece2.addBox("LeftWing2", 0F, 0F, 0.5F, 25, 1, 7);
     // LeftWingPiece1.addChildModelRenderer(LeftWingPiece2);
    //  modelDimorph.addChildModelRenderer(LeftWingPiece1);
    ModelRenderer LeftArm2 = new ModelRenderer(this, 89, 51);
   LeftArm2.addBox(0F, -0.5F, -0.5F, 25, 1, 1);
   ModelRenderer LeftWing2 = new ModelRenderer(this, 14, 90);
   LeftWing2.addBox(0F, 0F, 0.5F, 25, 1, 7);
      
    
   
   
   RightWingPiece1 = new ModelRenderer(this, "RightWingPiece1");
    RightWingPiece1.setRotationPoint(-3F, 15.5F, 0F);
    setRotation(RightWingPiece1, 0F, 0F, 0F);
    RightWingPiece1.mirror = true;
    //  RightWingPiece1.addBox("RightArm1", -13F, -0.5F, -0.5F, 13, 1, 1);
    //  RightWingPiece1.addBox("RightWing1", -13F, 0F, 0.5F, 14, 1, 11);
    ModelRenderer RightArm1 = new ModelRenderer(this, 113, 62);
    RightArm1.addBox(-13F, -0.5F, -0.5F, 13, 1, 1);
    ModelRenderer RightWing1 = new ModelRenderer(this, 80, 76);
    RightWing1.addBox(-13F, 0F, 0.5F, 14, 1, 11);
      
      RingWingPiece2 = new ModelRenderer(this, "RingWingPiece2");
    RingWingPiece2.setRotationPoint(-13F, 0F, 0F);
    setRotation(RingWingPiece2, 0F, 0F, 0F);
    RingWingPiece2.mirror = true;
     // RingWingPiece2.addBox("RightArm2", -25F, -0.5F, -0.5F, 25, 1, 1);
    //  RingWingPiece2.addBox("RightWing2", -25F, 0F, 0.5F, 25, 1, 7);
    //  RightWingPiece1.addChildModelRenderer(RingWingPiece2);
   //   modelDimorph.addChildModelRenderer(RightWingPiece1);
    ModelRenderer RightArm2 = new ModelRenderer(this, 89, 47);
    RightArm2.addBox(-25F, -0.5F, -0.5F, 25, 1, 1);
    ModelRenderer RightWing2 = new ModelRenderer(this, 73, 90);
    RightWing2.addBox(-25F, 0F, 0.5F, 25, 1, 7);
  
    RightWingPiece1.addChild(RingWingPiece2);
    LeftWingPiece1.addChild(LeftWingPiece2);
  
    HeadPiece.addChild(Head);
    HeadPiece.addChild(SnoutTip);
    HeadPiece.addChild(Snout);
   LeftWingPiece1.addChild(LeftArm1);
   LeftWingPiece1.addChild(LeftWing1);
   LeftWingPiece2.addChild(LeftArm2);
   LeftWingPiece2.addChild(LeftWing2);
   RightWingPiece1.addChild(RightArm1);
   RightWingPiece1.addChild(RightWing1);
   RingWingPiece2.addChild(RightArm2);
   RingWingPiece2.addChild(RightWing2);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    RightFoot.render(f5);
    LeftFoot.render(f5);
    TailFin.render(f5);
    RightLeg1.render(f5);
    RightLeg2.render(f5);
    Body1.render(f5);
    Body2.render(f5);
    LeftLeg1.render(f5);
    LeftLeg2.render(f5);
    Tail.render(f5);
    TailMembrane.render(f5);
    Neck.render(f5);
    HeadPiece.render(f5);
    LeftWingPiece1.render(f5);
    RightWingPiece1.render(f5);
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
    this.LeftWingPiece1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  		this.RightWingPiece1.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  		 HeadPiece.rotateAngleY = f3 / 57.29578F;
  		  HeadPiece.rotateAngleX = f4 / 57.29578F;
  }

}
