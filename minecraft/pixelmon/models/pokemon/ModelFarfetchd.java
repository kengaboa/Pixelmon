package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelFarfetchd extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer HeadTop;
    ModelRenderer HeadFluffMiddle;
    ModelRenderer HeadFluffRight;
    ModelRenderer HeadFluffLeft;
    ModelRenderer BeakLeft;
    ModelRenderer BeakLeft1;
    ModelRenderer BeakRight;
    ModelRenderer BeakJawInner;
    ModelRenderer BeakJawOuter;
    ModelRenderer BeakRight1;
    ModelRenderer Body;
    ModelRenderer BodyBulk;
    ModelRenderer TailBase;
    ModelRenderer TailBaseBulk;
    ModelRenderer Tailtip;
    ModelRenderer Butt;
    ModelRenderer LWingBase;
    ModelRenderer LWingTip1;
    ModelRenderer LWingTip2;
    ModelRenderer LWingTip3;
    ModelRenderer Leek;
    ModelRenderer LeekBranch;
    ModelRenderer RWingBase;
    ModelRenderer RWingTip1;
    ModelRenderer RWingTip2;
    ModelRenderer RWingTip3;
    ModelRenderer HeadBase;
    ModelRenderer LeftLeg;
    ModelRenderer LeftFoot;
    ModelRenderer RightLeg;
    ModelRenderer RightFoot;
    ModelRenderer RightWing;
    ModelRenderer LeftWing;
    ModelRenderer LegL;
    ModelRenderer LegR;
  
  public ModelFarfetchd()
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("HeadBase.Head", 0, 0);
    
    HeadBase = new ModelRenderer(this, "HeadBase");
    HeadBase.setRotationPoint(0F, 17.5F, -1F);
    setRotation(HeadBase, 0F, 0F, 0F);
    HeadBase.mirror = true;
      Head = new ModelRenderer(this, 16, 26);
      Head.addBox(-1.5F, -3F, -2.1F, 3, 3, 3);
      Head.setRotationPoint(0F, 0.5F, 1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      HeadTop = new ModelRenderer(this, 16, 23);
      HeadTop.addBox(-1F, -3.3F, -1.6F, 2, 1, 2);
      HeadTop.setRotationPoint(0F, 0.5F, 1F);
      HeadTop.setTextureSize(64, 32);
      HeadTop.mirror = true;
      setRotation(HeadTop, 0F, 0F, 0F);
      HeadFluffMiddle = new ModelRenderer(this, 20, 0);
      HeadFluffMiddle.addBox(-0.5F, -5.2F, -0.9F, 1, 2, 0);
      HeadFluffMiddle.setRotationPoint(0F, 0.5F, 1F);
      HeadFluffMiddle.setTextureSize(64, 32);
      HeadFluffMiddle.mirror = true;
      setRotation(HeadFluffMiddle, -0.0349066F, 0F, 0F);
      HeadFluffRight = new ModelRenderer(this, 18, 0);
      HeadFluffRight.addBox(-0.6F, -5F, -0.9F, 1, 2, 0);
      HeadFluffRight.setRotationPoint(0F, 0.5F, 1F);
      HeadFluffRight.setTextureSize(64, 32);
      HeadFluffRight.mirror = true;
      setRotation(HeadFluffRight, -0.0698132F, 0.1745329F, -0.1745329F);
      HeadFluffLeft = new ModelRenderer(this, 22, 0);
      HeadFluffLeft.addBox(-0.4F, -5F, -0.9F, 1, 2, 0);
      HeadFluffLeft.setRotationPoint(0F, 0.5F, 1F);
      HeadFluffLeft.setTextureSize(64, 32);
      HeadFluffLeft.mirror = true;
      setRotation(HeadFluffLeft, -0.0698132F, -0.1745329F, 0.1745329F);
      BeakLeft1 = new ModelRenderer(this, 18, 2);
      BeakLeft1.addBox(-0.9F, -0.7F, -4F, 1, 0, 2);
      BeakLeft1.setRotationPoint(0F, 0.5F, 1F);
      BeakLeft1.setTextureSize(64, 32);
      BeakLeft1.mirror = true;
      setRotation(BeakLeft1, 0F, 0F, -0.1396263F);
      BeakLeft = new ModelRenderer(this, 24, 2);
      BeakLeft.addBox(-0.9F, -0.9F, -4F, 1, 0, 2);
      BeakLeft.setRotationPoint(0F, 0.5F, 1F);
      BeakLeft.setTextureSize(64, 32);
      BeakLeft.mirror = true;
      setRotation(BeakLeft, 0.0523599F, 0F, -0.1396263F);
      BeakRight1 = new ModelRenderer(this, 24, 2);
      BeakRight1.addBox(-0.1F, -0.9F, -4F, 1, 0, 2);
      BeakRight1.setRotationPoint(0F, 0.5F, 1F);
      BeakRight1.setTextureSize(64, 32);
      BeakRight1.mirror = true;
      setRotation(BeakRight1, 0.0523599F, 0F, 0.122173F);
      BeakJawInner = new ModelRenderer(this, 17, 4);
      BeakJawInner.addBox(-1F, -0.4F, -4F, 2, 0, 2);
      BeakJawInner.setRotationPoint(0F, 0.5F, 1F);
      BeakJawInner.setTextureSize(64, 32);
      BeakJawInner.mirror = true;
      setRotation(BeakJawInner, 0.1396263F, 0F, 0F);
      BeakJawOuter = new ModelRenderer(this, 17, 6);
      BeakJawOuter.addBox(-1F, -0.2F, -4F, 2, 0, 2);
      BeakJawOuter.setRotationPoint(0F, 0.5F, 1F);
      BeakJawOuter.setTextureSize(64, 32);
      BeakJawOuter.mirror = true;
      setRotation(BeakJawOuter, 0.0872665F, 0F, 0F);
      BeakRight = new ModelRenderer(this, 18, 2);
      BeakRight.addBox(-0.1F, -0.7F, -4F, 1, 0, 2);
      BeakRight.setRotationPoint(0F, 0.5F, 1F);
      BeakRight.setTextureSize(64, 32);
      BeakRight.mirror = true;
      setRotation(BeakRight, 0F, 0F, 0.1396263F);   
      
      HeadBase.addChild(Head);
      HeadBase.addChild(HeadTop);
      HeadBase.addChild(HeadFluffMiddle);
      HeadBase.addChild(HeadFluffRight);
      HeadBase.addChild(HeadFluffLeft);
      HeadBase.addChild(BeakRight);
      HeadBase.addChild(BeakRight1);
      HeadBase.addChild(BeakLeft);
      HeadBase.addChild(BeakLeft1);
      HeadBase.addChild(BeakJawInner);
      HeadBase.addChild(BeakJawOuter);
        
      Body = new ModelRenderer(this, 0, 24);
      Body.addBox(-2F, -2F, -2F, 4, 4, 4);
      Body.setRotationPoint(0F, 20F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      BodyBulk = new ModelRenderer(this, 0, 16);
      BodyBulk.addBox(-1.5F, -1.7F, -2.3F, 3, 4, 4);
      BodyBulk.setRotationPoint(0F, 20F, 0F);
      BodyBulk.setTextureSize(64, 32);
      BodyBulk.mirror = true;
      setRotation(BodyBulk, -0.0174533F, 0F, 0F);
      TailBase = new ModelRenderer(this, 0, 6);
      TailBase.addBox(-1F, 0.4F, 0.3F, 2, 3, 2);
      TailBase.setRotationPoint(0F, 20F, 0F);
      TailBase.setTextureSize(64, 32);
      TailBase.mirror = true;
      setRotation(TailBase, 0.7853982F, 0F, 0F);
      TailBaseBulk = new ModelRenderer(this, 0, 11);
      TailBaseBulk.addBox(-1.5F, -0.5F, 0F, 3, 3, 2);
      TailBaseBulk.setRotationPoint(0F, 20F, 0F);
      TailBaseBulk.setTextureSize(64, 32);
      TailBaseBulk.mirror = true;
      setRotation(TailBaseBulk, 0.6283185F, 0F, 0F);
      Tailtip = new ModelRenderer(this, 0, 2);
      Tailtip.addBox(-0.5F, 1.8F, 1.5F, 1, 1, 3);
      Tailtip.setRotationPoint(0F, 20F, 0F);
      Tailtip.setTextureSize(64, 32);
      Tailtip.mirror = true;
      setRotation(Tailtip, 0.296706F, 0F, 0F);
      Butt = new ModelRenderer(this, 0, 0);
      Butt.addBox(-1F, 1.5F, 1.3F, 2, 1, 1);
      Butt.setRotationPoint(0F, 20F, 0F);
      Butt.setTextureSize(64, 32);
      Butt.mirror = true;
      setRotation(Butt, 0.122173F, 0F, 0F);
    RightWing = new ModelRenderer(this, "RightWing");
    RightWing.setRotationPoint(-2F, 19F, -0.1F);
    setRotation(RightWing, 0F, 0F, 0F);
    RightWing.mirror = true;
      RWingBase = new ModelRenderer(this, 16, 18);
      RWingBase.addBox(-0.9F, -0.7F, -2.3F, 1, 2, 3);
      RWingBase.setRotationPoint(0F, 0F, 0F);
      RWingBase.setTextureSize(64, 32);
      RWingBase.mirror = true;
      setRotation(RWingBase, 0.2268928F, -0.0872665F, 0F);
      RWingTip1 = new ModelRenderer(this, 16, 15);
      RWingTip1.addBox(-0.9F, 1.5F, -0.8F, 1, 1, 2);
      RWingTip1.setRotationPoint(0F, 0F, 0F);
      RWingTip1.setTextureSize(64, 32);
      RWingTip1.mirror = true;
      setRotation(RWingTip1, -0.5235988F, -0.0872665F, 0F);
      RWingTip2 = new ModelRenderer(this, 16, 11);
      RWingTip2.addBox(-0.9F, 1.1F, -1.2F, 1, 1, 3);
      RWingTip2.setRotationPoint(0F, 0F, 0F);
      RWingTip2.setTextureSize(64, 32);
      RWingTip2.mirror = true;
      setRotation(RWingTip2, -0.3490659F, -0.0872665F, 0F);
      RWingTip3 = new ModelRenderer(this, 16, 11);
      RWingTip3.addBox(-0.9F, 0.8F, -0.9F, 1, 1, 3);
      RWingTip3.setRotationPoint(0F, 0F, 0F);
      RWingTip3.setTextureSize(64, 32);
      RWingTip3.mirror = true;
      setRotation(RWingTip3, 0.1047198F, -0.0872665F, 0F);
      
      RightWing.addChild(RWingBase);
      RightWing.addChild(RWingTip1);
      RightWing.addChild(RWingTip2);
      RightWing.addChild(RWingTip3);
      
    LeftWing = new ModelRenderer(this, "LeftWing");
    LeftWing.setRotationPoint(2F, 19F, -0.1F);
    setRotation(LeftWing, 0F, 0F, 0F);
    LeftWing.mirror = true;
      LWingBase = new ModelRenderer(this, 16, 18);
      LWingBase.addBox(0F, -0.7F, -2.3F, 1, 2, 3);
      LWingBase.setRotationPoint(0F, 0F, 0F);
      LWingBase.setTextureSize(64, 32);
      LWingBase.mirror = true;
      setRotation(LWingBase, 0.0872665F, -0.0872665F, 0F);
      LWingTip1 = new ModelRenderer(this, 16, 15);
      LWingTip1.addBox(1.4F, -0.7F, -2.5F, 1, 1, 2);
      LWingTip1.setRotationPoint(0F, 0F, 0F);
      LWingTip1.setTextureSize(64, 32);
      LWingTip1.mirror = true;
      setRotation(LWingTip1, 0.0872665F, 0.8901179F, 0.0698132F);
      LWingTip2 = new ModelRenderer(this, 16, 15);
      LWingTip2.addBox(1.2F, -0.1F, -3.2F, 1, 1, 2);
      LWingTip2.setRotationPoint(0F, 0F, 0F);
      LWingTip2.setTextureSize(64, 32);
      LWingTip2.mirror = true;
      setRotation(LWingTip2, 0.3141593F, 0.6283185F, 0.1047198F);
      LWingTip3 = new ModelRenderer(this, 16, 15);
      LWingTip3.addBox(-1.5F, 0.1F, -3.2F, 1, 1, 2);
      LWingTip3.setRotationPoint(0F, 0F, 0F);
      LWingTip3.setTextureSize(64, 32);
      LWingTip3.mirror = true;
      setRotation(LWingTip3, -0.9424778F, 0.122173F, -2.827433F);
      Leek = new ModelRenderer(this, 11, 9);
      Leek.addBox(-0.6F, -2.7F, -2.5F, 1, 6, 1);
      Leek.setRotationPoint(0F, 0F, 0F);
      Leek.setTextureSize(64, 32);
      Leek.mirror = true;
      setRotation(Leek, -0.1745329F, 0F, 0.3141593F);
      LeekBranch = new ModelRenderer(this, 11, 9);
      LeekBranch.addBox(-0.6F, -1F, -2.5F, 1, 2, 1);
      LeekBranch.setRotationPoint(0F, 0F, 0F);
      LeekBranch.setTextureSize(64, 32);
      LeekBranch.mirror = true;
      setRotation(LeekBranch, -0.9424778F, 0F, 0.3141593F);
      
      LeftWing.addChild(LWingBase);
      LeftWing.addChild(LWingTip1);
      LeftWing.addChild(LWingTip2);
      LeftWing.addChild(LWingTip3);
      LeftWing.addChild(Leek);
      LeftWing.addChild(LeekBranch);
      
    LegL = new ModelRenderer(this, "LegL");
    LegL.setRotationPoint(-1.2F, 22F, 0F);
    setRotation(LegL, 0F, 0F, 0F);
    LegL.mirror = true;
      LeftLeg = new ModelRenderer(this, 11, 0);
      LeftLeg.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LeftLeg.setRotationPoint(0F, 0F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0.1745329F, 0F);
      LeftFoot = new ModelRenderer(this, 9, 3);
      LeftFoot.addBox(-1F, 1.9F, -1.6F, 2, 0, 2);
      LeftFoot.setRotationPoint(0F, 0F, 0F);
      LeftFoot.setTextureSize(64, 32);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0.0698132F, 0.1745329F, 0F);
      
      LegL.addChild(LeftLeg);
      LegL.addChild(LeftFoot);
      
    LegR = new ModelRenderer(this, "LegR");
    LegR.setRotationPoint(1.2F, 22F, 0F);
    setRotation(LegR, 0F, 0F, 0F);
    LegR.mirror = true;
      RightLeg = new ModelRenderer(this, 11, 0);
      RightLeg.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      RightLeg.setRotationPoint(0F, 0F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, -0.1745329F, 0F);
      RightFoot = new ModelRenderer(this, 9, 3);
      RightFoot.addBox(-1F, 1.9F, -1.6F, 2, 0, 2);
      RightFoot.setRotationPoint(0F, 0F, 0F);
      RightFoot.setTextureSize(64, 32);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0.0698132F, -0.1745329F, 0F);
      
      LegR.addChild(RightLeg);
      LegR.addChild(RightFoot);    
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    HeadBase.render(f5);
    Body.render(f5);
    BodyBulk.render(f5);
    TailBase.render(f5);
    TailBaseBulk.render(f5);
    Tailtip.render(f5);
    Butt.render(f5);
    RightWing.render(f5);
    LeftWing.render(f5);
    LegL.render(f5);
    LegR.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
