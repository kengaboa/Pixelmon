// Date: 2/12/2013 3:01:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.pokemon;

import java.util.Random;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.SkeletonBase;

public class ModelMagnemite extends PixelmonModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LeftMagnet;
    ModelRenderer RightMagnet;
    
  public ModelMagnemite()
  {
    textureWidth = 64;
    textureHeight = 64;
    
    
      Body = new ModelRenderer(this, "Body");
      Body.setRotationPoint(0, 1, 0);
      ModelRenderer Body0 = new ModelRenderer(this, 0, 0);
      Body0.addBox(-1.5F, -7.5F, -2.5F, 3, 15, 5);
      Body0.setTextureSize(64, 64);
      Body0.mirror = true;
      setRotation(Body0, 0F, 0F, 0F);
      Body.addChild(Body0);
      ModelRenderer Body1 = new ModelRenderer(this, 0, 0);
      Body1.addBox(-4.5F, -4.5F, -4.5F, 9, 9, 9);
      Body1.setTextureSize(64, 64);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Body.addChild(Body1);
      ModelRenderer Body2 = new ModelRenderer(this, 0, 0);
      Body2.addBox(-2.5F, -1.5F, -5.5F, 5, 3, 13);
      Body2.setTextureSize(64, 64);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Body.addChild(Body2);
      ModelRenderer Body3 = new ModelRenderer(this, 0, 0);
      Body3.addBox(-4.5F, -5.5F, -3.5F, 9, 11, 7);
      Body3.setTextureSize(64, 64);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0F);
      Body.addChild(Body3);
      ModelRenderer Body4 = new ModelRenderer(this, 0, 0);
      Body4.addBox(-7.5F, -2.5F, -1.5F, 15, 5, 3);
      Body4.setTextureSize(64, 64);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0F);
      Body.addChild(Body4);
      ModelRenderer Body5 = new ModelRenderer(this, 0, 0);
      Body5.addBox(-3.5F, -5.5F, -4.5F, 7, 11, 9);
      Body5.setTextureSize(64, 64);
      Body5.mirror = true;
      setRotation(Body5, 0F, 0F, 0F);
      ModelRenderer Body6 = new ModelRenderer(this, 0, 0);
      Body.addChild(Body5);
      Body6.addBox(-2.5F, -6.5F, -4.5F, 5, 13, 9);
      Body6.setTextureSize(64, 64);
      Body6.mirror = true;
      setRotation(Body6, 0F, 0F, 0F);
      Body.addChild(Body6);
      ModelRenderer Body7 = new ModelRenderer(this, 0, 0);
      Body7.addBox(-5.5F, -4.5F, -3.5F, 11, 9, 7);
      Body7.setTextureSize(64, 64);
      Body7.mirror = true;
      setRotation(Body7, 0F, 0F, 0F);
      Body.addChild(Body7);
      ModelRenderer Body8 = new ModelRenderer(this, 0, 0);
      Body8.addBox(-2.5F, -4.5F, -5.5F, 5, 9, 12);
      Body8.setTextureSize(64, 64);
      Body8.mirror = true;
      setRotation(Body8, 0F, 0F, 0F);
      Body.addChild(Body8);
      ModelRenderer Body9 = new ModelRenderer(this, 0, 0);
      Body9.addBox(-5.5F, -3.5F, -4.5F, 11, 7, 9);
      Body9.setTextureSize(64, 64);
      Body9.mirror = true;
      setRotation(Body9, 0F, 0F, 0F);
      Body.addChild(Body9);
      ModelRenderer Body10 = new ModelRenderer(this, 0, 0);
      Body10.addBox(-6.5F, -4.5F, -2.5F, 13, 9, 5);
      Body10.setTextureSize(64, 64);
      Body10.mirror = true;
      setRotation(Body10, 0F, 0F, 0F);
      Body.addChild(Body10);
      ModelRenderer Body11 = new ModelRenderer(this, 0, 0);
      Body11.addBox(-5.5F, -2.5F, -5.5F, 11, 5, 11);
      Body11.setTextureSize(64, 64);
      Body11.mirror = true;
      setRotation(Body11, 0F, 0F, 0F);
      Body.addChild(Body11);
      ModelRenderer Body12 = new ModelRenderer(this, 0, 0);
      Body12.addBox(-2.5F, 3.5F, -6.5F, 5, 1, 2);
      Body12.setTextureSize(64, 64);
      Body12.mirror = true;
      setRotation(Body12, 0F, 0F, 0F);
      Body.addChild(Body12);
      ModelRenderer Body13 = new ModelRenderer(this, 0, 0);
      Body13.addBox(-5.5F, -2.5F, -5.5F, 11, 5, 11);
      Body13.setTextureSize(64, 64);
      Body13.mirror = true;
      setRotation(Body13, 0F, 0F, 0F);
      Body.addChild(Body13);
      ModelRenderer Body14 = new ModelRenderer(this, 0, 0);
      Body14.addBox(-2.5F, -7.5F, -1.5F, 5, 15, 3);
      Body14.setTextureSize(64, 64);
      Body14.mirror = true;
      setRotation(Body14, 0F, 0F, 0F);
      Body.addChild(Body14);
      ModelRenderer Body15 = new ModelRenderer(this, 0, 0);
      Body15.addBox(-4.5F, -3.5F, -5.5F, 9, 7, 11);
      Body15.setTextureSize(64, 64);
      Body15.mirror = true;
      setRotation(Body15, 0F, 0F, 0F);
      Body.addChild(Body15);
      ModelRenderer Body16 = new ModelRenderer(this, 0, 0);
      Body16.addBox(-1.5F, -2.5F, -5.5F, 3, 5, 13);
      Body16.setTextureSize(64, 64);
      Body16.mirror = true;
      setRotation(Body16, 0F, 0F, 0F);
      Body.addChild(Body16);
      ModelRenderer Body17 = new ModelRenderer(this, 0, 0);
      Body17.addBox(-3.5F, -4.5F, -5.5F, 7, 9, 11);
      Body17.setTextureSize(64, 64);
      Body17.mirror = true;
      setRotation(Body17, 0F, 0F, 0F);
      Body.addChild(Body17);
      ModelRenderer Body18 = new ModelRenderer(this, 0, 0);
      Body18.addBox(-7.5F, -2.5F, -1.5F, 15, 5, 3);
      Body18.setTextureSize(64, 64);
      Body18.mirror = true;
      setRotation(Body18, 0F, 0F, 0F);
      Body.addChild(Body18);
      ModelRenderer Body19 = new ModelRenderer(this, 0, 0);
      Body19.addBox(-5.5F, -5.5F, -2.5F, 11, 11, 5);
      Body19.setTextureSize(64, 64);
      Body19.mirror = true;
      setRotation(Body19, 0F, 0F, 0F);
      Body.addChild(Body19);
      ModelRenderer Body20 = new ModelRenderer(this, 0, 0);
      Body20.addBox(-7.5F, -1.5F, -2.5F, 15, 3, 5);
      Body20.setTextureSize(64, 64);
      Body20.mirror = true;
      setRotation(Body20, 0F, 0F, 0F);
      Body.addChild(Body20);
      ModelRenderer Body21 = new ModelRenderer(this, 0, 0);
      Body21.addBox(-6.5F, -3.5F, -3.5F, 13, 7, 7);
      Body21.setTextureSize(64, 64);
      Body21.mirror = true;
      setRotation(Body21, 0F, 0F, 0F);
      Body.addChild(Body21);
      ModelRenderer Body22 = new ModelRenderer(this, 0, 0);
      Body22.addBox(-4.5F, -6.5F, -2.5F, 9, 13, 5);
      Body22.setTextureSize(64, 64);
      Body22.mirror = true;
      setRotation(Body22, 0F, 0F, 0F);
      Body.addChild(Body22);
      ModelRenderer Body23 = new ModelRenderer(this, 0, 9);
      Body23.addBox(-3.5F, -3.5F, -6.5F, 7, 7, 13);
      Body23.setTextureSize(64, 64);
      Body23.mirror = true;
      setRotation(Body23, 0F, 0F, 0F);
      Body.addChild(Body23);
      ModelRenderer Body24 = new ModelRenderer(this, 0, 0);
      Body24.addBox(-3.5F, -6.5F, -3.5F, 7, 13, 7);
      Body24.setTextureSize(64, 64);
      Body24.mirror = true;
      setRotation(Body24, 0F, 0F, 0F);
      Body.addChild(Body24);
      ModelRenderer Body25 = new ModelRenderer(this, 0, 0);
      Body25.addBox(-6.5F, -2.5F, -4.5F, 13, 5, 9);
      Body25.setTextureSize(64, 64);
      Body25.mirror = true;
      setRotation(Body25, 0F, 0F, 0F);
      Body.addChild(Body25);
      ModelRenderer Body26 = new ModelRenderer(this, 0, 0);
      Body26.addBox(-4.5F, -2.5F, -5.5F, 9, 5, 12);
      Body26.setTextureSize(64, 64);
      Body26.mirror = true;
      setRotation(Body26, 0F, 0F, 0F);
      Body.addChild(Body26);
      ModelRenderer Body27 = new ModelRenderer(this, 0, 0);
      Body27.addBox(-2.5F, -5.5F, -5.5F, 5, 11, 11);
      Body27.setTextureSize(64, 64);
      Body27.mirror = true;
      setRotation(Body27, 0F, 0F, 0F);
      Body.addChild(Body27);
      ModelRenderer Body28 = new ModelRenderer(this, 0, 0);
      Body28.addBox(3.5F, -2.5F, -6.5F, 1, 5, 2);
      Body28.setTextureSize(64, 64);
      Body28.mirror = true;
      setRotation(Body28, 0F, 0F, 0F);
      Body.addChild(Body28);
      ModelRenderer Body29 = new ModelRenderer(this, 0, 0);
      Body29.addBox(-2.5F, -4.5F, -6.5F, 5, 1, 2);
      Body29.setTextureSize(64, 64);
      Body29.mirror = true;
      setRotation(Body29, 0F, 0F, 0F);
      Body.addChild(Body29);
      ModelRenderer Body30 = new ModelRenderer(this, 0, 0);
      Body30.addBox(-4.5F, -2.5F, -6.5F, 1, 5, 2);
      Body30.setTextureSize(64, 64);
      Body30.mirror = true;
      setRotation(Body30, 0F, 0F, 0F);
      Body.addChild(Body30);
      
      
      ModelRenderer Shape0 = new ModelRenderer(this, 46, 18);
      Shape0.addBox(-2.02F, -4F, -0.2F, 4, 1, 1);
      Shape0.setRotationPoint(4F, 5F, -3F);
      Shape0.setTextureSize(64, 64);
      Shape0.mirror = true;
      setRotation(Shape0, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape0);
      ModelRenderer Shape1 = new ModelRenderer(this, 56, 0);
      Shape1.addBox(-1F, -4.2F, -1F, 2, 6, 2);
      Shape1.setRotationPoint(4F, 5F, -3F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape1);
      ModelRenderer Shape2 = new ModelRenderer(this, 46, 18);
      Shape2.addBox(-2.02F, -4F, -0.85F, 4, 1, 1);
      Shape2.setRotationPoint(4F, 5F, -3F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape2);
      ModelRenderer  Shape3 = new ModelRenderer(this, 46, 18);
      Shape3.addBox(-1.5F, -4F, -1.5F, 3, 1, 3);
      Shape3.setRotationPoint(-4F, 5F, -3F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape3);
      ModelRenderer Shape4 = new ModelRenderer(this, 46, 18);
      Shape4.addBox(-1.5F, -4F, -1.5F, 3, 1, 3);
      Shape4.setRotationPoint(4F, 5F, -3F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape4);
      ModelRenderer Shape5 = new ModelRenderer(this, 46, 18);
      Shape5.addBox(-0.2F, -4F, -2.02F, 1, 1, 4);
      Shape5.setRotationPoint(-4F, 5F, -3F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape5);
      ModelRenderer Shape6 = new ModelRenderer(this, 46, 18);
      Shape6.addBox(-0.84F, -4F, -2.02F, 1, 1, 4);
      Shape6.setRotationPoint(-4F, 5F, -3F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape6);
      ModelRenderer Shape7 = new ModelRenderer(this, 46, 0);
      Shape7.addBox(-1.5F, -4F, -1F, 3, 1, 2);
      Shape7.setRotationPoint(0F, -7F, 0F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Body.addChild(Shape7);
      ModelRenderer Shape8 = new ModelRenderer(this, 46, 18);
      Shape8.addBox(-2.02F, -4F, -0.2F, 4, 1, 1);
      Shape8.setRotationPoint(-4F, 5F, -3F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape8);
      ModelRenderer Shape9 = new ModelRenderer(this, 46, 18);
      Shape9.addBox(-2.02F, -4F, -0.85F, 4, 1, 1);
      Shape9.setRotationPoint(-4F, 5F, -3F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape9);
      ModelRenderer Shape10 = new ModelRenderer(this, 46, 16);
      Shape10.addBox(-0.18F, -3.5F, -2.5F, 1, 1, 5);
      Shape10.setRotationPoint(0F, -7F, 0F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Body.addChild(Shape10);
      ModelRenderer Shape11 = new ModelRenderer(this, 56, 0);
      Shape11.addBox(-1F, -4.2F, -1F, 2, 6, 2);
      Shape11.setRotationPoint(-4F, 5F, -3F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 1.745329F, 0.2617994F, 0F);
      Body.addChild(Shape11);
      ModelRenderer Shape12 = new ModelRenderer(this, 46, 16);
      Shape12.addBox(-0.82F, -3.5F, -2.5F, 1, 1, 5);
      Shape12.setRotationPoint(0F, -7F, 0F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Body.addChild(Shape12);
      ModelRenderer Shape13 = new ModelRenderer(this, 46, 18);
      Shape13.addBox(-0.84F, -4F, -2.02F, 1, 1, 4);
      Shape13.setRotationPoint(4F, 5F, -3F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape13);
      ModelRenderer Shape14 = new ModelRenderer(this, 46, 18);
      Shape14.addBox(-0.2F, -4F, -2.02F, 1, 1, 4);
      Shape14.setRotationPoint(4F, 5F, -3F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 1.745329F, -0.2617994F, 0F);
      Body.addChild(Shape14);
      ModelRenderer Shape15 = new ModelRenderer(this, 46, 17);
      Shape15.addBox(-1.5F, -3.5F, -2F, 3, 1, 4);
      Shape15.setRotationPoint(0F, -7F, 0F);
      Shape15.setTextureSize(64, 64);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Body.addChild(Shape15);
      ModelRenderer Shape16 = new ModelRenderer(this, 46, 20);
      Shape16.addBox(-2.5F, -3.5F, -0.83F, 5, 1, 1);
      Shape16.setRotationPoint(0F, -7F, 0F);
      Shape16.setTextureSize(64, 64);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Body.addChild(Shape16);
      ModelRenderer Shape17 = new ModelRenderer(this, 46, 20);
      Shape17.addBox(-2.5F, -3.5F, -0.18F, 5, 1, 1);
      Shape17.setRotationPoint(0F, -7F, 0F);
      Shape17.setTextureSize(64, 64);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Body.addChild(Shape17);
      ModelRenderer Shape18 = new ModelRenderer(this, 46, 17);
      Shape18.addBox(-2F, -3.5F, -1.5F, 4, 1, 3);
      Shape18.setRotationPoint(0F, -7F, 0F);
      Shape18.setTextureSize(64, 64);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      Body.addChild(Shape18);
      ModelRenderer Shape19 = new ModelRenderer(this, 56, 0);
      Shape19.addBox(-1F, -3F, -1F, 2, 5, 2);
      Shape19.setRotationPoint(0F, -7F, 0F);
      Shape19.setTextureSize(64, 64);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0F);
      Body.addChild(Shape19);
      ModelRenderer Shape20 = new ModelRenderer(this, 46, 3);
      Shape20.addBox(-1F, -4F, -1.5F, 2, 1, 3);
      Shape20.setRotationPoint(0F, -7F, 0F);
      Shape20.setTextureSize(64, 64);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
      Body.addChild(Shape20);
      
      LeftMagnet = new ModelRenderer(this, "LeftMagnet");
      LeftMagnet.setRotationPoint(9, 0, 0);
      ModelRenderer MagnetL1 = new ModelRenderer(this, 46, 15);
      MagnetL1.addBox(-1.5F, -3F, -1.5F, 2, 3, 3);
      MagnetL1.setRotationPoint(1.3F, 2.9F, 0F);
      MagnetL1.setTextureSize(64, 64);
      MagnetL1.mirror = true;
      setRotation(MagnetL1, 0F, 0F, -0.5235988F);
      LeftMagnet.addChild(MagnetL1);
      ModelRenderer MagnetL2 = new ModelRenderer(this, 46, 15);
      MagnetL2.addBox(-0.5F, -1.5F, -1.5F, 2, 3, 3);
      MagnetL2.setTextureSize(64, 64);
      MagnetL2.mirror = true;
      setRotation(MagnetL2, 0F, 0F, 0F);
      LeftMagnet.addChild(MagnetL2);
      ModelRenderer MagnetL3 = new ModelRenderer(this, 46, 15);
      MagnetL3.addBox(-1.5F, 0F, -1.5F, 2, 3, 3);
      MagnetL3.setRotationPoint(0.75F, 2.3F, 0F);
      MagnetL3.setTextureSize(64, 64);
      MagnetL3.mirror = true;
      setRotation(MagnetL3, 0F, 0F, -1.047198F);
      LeftMagnet.addChild(MagnetL3);
      ModelRenderer MagnetL4 = new ModelRenderer(this, 46, 15);
      MagnetL4.addBox(-0.5F, -4.5F, -1.5F, 2, 5, 3);
      MagnetL4.setRotationPoint(-0.1F, -1.4F, 0F);
      MagnetL4.setTextureSize(64, 64);
      MagnetL4.mirror = true;
      setRotation(MagnetL4, 0F, 0F, 0.7853982F);
      LeftMagnet.addChild(MagnetL4);
      ModelRenderer MagnetL5 = new ModelRenderer(this, 46, 15);
      MagnetL5.addBox(-0.5F, -0.5F, -1.5F, 2, 5, 3);
      MagnetL5.setRotationPoint(-0.1F, 1.4F, 0F);
      MagnetL5.setTextureSize(64, 64);
      MagnetL5.mirror = true;
      setRotation(MagnetL5, 0F, 0F, -0.7853982F);
      LeftMagnet.addChild(MagnetL5);
      ModelRenderer MagnetL6 = new ModelRenderer(this, 52, 23);
      MagnetL6.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
      MagnetL6.setRotationPoint(2.6F, -3.6F, 0F);
      MagnetL6.setTextureSize(64, 64);
      MagnetL6.mirror = true;
      setRotation(MagnetL6, 0F, 0F, -1.570796F);
      LeftMagnet.addChild(MagnetL6);
      ModelRenderer MagnetL7 = new ModelRenderer(this, 46, 15);
      MagnetL7.addBox(-1.5F, -1F, -1.5F, 2, 2, 3);
      MagnetL7.setTextureSize(64, 64);
      MagnetL7.mirror = true;
      setRotation(MagnetL7, 0F, 0F, 0F);
      LeftMagnet.addChild(MagnetL7);
      ModelRenderer MagnetL8 = new ModelRenderer(this, 46, 15);
      MagnetL8.addBox(-1.5F, -3F, -1.5F, 2, 3, 3);
      MagnetL8.setRotationPoint(0.75F, -2.3F, 0F);
      MagnetL8.setTextureSize(64, 64);
      MagnetL8.mirror = true;
      setRotation(MagnetL8, 0F, 0F, 1.047198F);
      LeftMagnet.addChild(MagnetL8);
      ModelRenderer MagnetL9 = new ModelRenderer(this, 46, 15);
      MagnetL9.addBox(-1.5F, 0F, -1.5F, 2, 3, 3);
      MagnetL9.setRotationPoint(1.3F, -2.9F, 0F);
      MagnetL9.setTextureSize(64, 64);
      MagnetL9.mirror = true;
      setRotation(MagnetL9, 0F, 0F, 0.5235988F);
      LeftMagnet.addChild(MagnetL9);
      ModelRenderer MagnetL10 = new ModelRenderer(this, 40, 23);
      MagnetL10.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
      MagnetL10.setRotationPoint(2.6F, 3.6F, 0F);
      MagnetL10.setTextureSize(64, 64);
      MagnetL10.mirror = true;
      setRotation(MagnetL10, 0F, 0F, -1.570796F);
      LeftMagnet.addChild(MagnetL10);
      Body.addChild(LeftMagnet);
      
      RightMagnet = new ModelRenderer(this, "RightMagnet");
      RightMagnet.setRotationPoint(-9, 0, 0);
      ModelRenderer MagnetR1 = new ModelRenderer(this, 46, 15);
      MagnetR1.addBox(-0.5F, 0F, -1.5F, 2, 3, 3);
      MagnetR1.setRotationPoint(-0.8F, 2.3F, 0F);
      MagnetR1.setTextureSize(64, 64);
      MagnetR1.mirror = true;
      setRotation(MagnetR1, 0F, 0F, 1.047198F);
      RightMagnet.addChild(MagnetR1);
      ModelRenderer MagnetR2 = new ModelRenderer(this, 46, 15);
      MagnetR2.addBox(-0.5F, -3F, -1.5F, 2, 3, 3);
      MagnetR2.setRotationPoint(-1.3F, 2.9F, 0F);
      MagnetR2.setTextureSize(64, 64);
      MagnetR2.mirror = true;
      setRotation(MagnetR2, 0F, 0F, 0.5235988F);
      RightMagnet.addChild(MagnetR2);
      ModelRenderer MagnetR3 = new ModelRenderer(this, 52, 23);
      MagnetR3.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
      MagnetR3.setRotationPoint(-2.6F, 3.6F, 0F);
      MagnetR3.setTextureSize(64, 64);
      MagnetR3.mirror = true;
      setRotation(MagnetR3, 3.141593F, 0F, -1.570796F);
      RightMagnet.addChild(MagnetR3);
      ModelRenderer MagnetR4 = new ModelRenderer(this, 46, 15);
      MagnetR4.addBox(-0.5F, 0F, -1.5F, 2, 3, 3);
      MagnetR4.setRotationPoint(-1.3F, -2.9F, 0F);
      MagnetR4.setTextureSize(64, 64);
      MagnetR4.mirror = true;
      setRotation(MagnetR4, 0F, 0F, -0.5235988F);
      RightMagnet.addChild(MagnetR4);
      ModelRenderer MagnetR5 = new ModelRenderer(this, 40, 23);
      MagnetR5.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
      MagnetR5.setRotationPoint(-2.6F, -3.6F, 0F);
      MagnetR5.setTextureSize(64, 64);
      MagnetR5.mirror = true;
      setRotation(MagnetR5, 3.141593F, 0F, -1.570796F);
      RightMagnet.addChild(MagnetR5);
      ModelRenderer MagnetR6 = new ModelRenderer(this, 46, 15);
      MagnetR6.addBox(-0.5F, -3F, -1.5F, 2, 3, 3);
      MagnetR6.setRotationPoint(-0.8F, -2.3F, 0F);
      MagnetR6.setTextureSize(64, 64);
      MagnetR6.mirror = true;
      setRotation(MagnetR6, 0F, 0F, -1.047198F);
      RightMagnet.addChild(MagnetR6);
      ModelRenderer MagnetR7 = new ModelRenderer(this, 46, 15);
      MagnetR7.addBox(-0.5F, -1F, -1.5F, 2, 2, 3);
      MagnetR7.setTextureSize(64, 64);
      MagnetR7.mirror = true;
      setRotation(MagnetR7, 0F, 0F, 0F);
      RightMagnet.addChild(MagnetR7);
      ModelRenderer MagnetR8 = new ModelRenderer(this, 46, 15);
      MagnetR8.addBox(-1.5F, -0.5F, -1.5F, 2, 5, 3);
      MagnetR8.setRotationPoint(0.1F, 1.4F, 0F);
      MagnetR8.setTextureSize(64, 64);
      MagnetR8.mirror = true;
      setRotation(MagnetR8, 0F, 0F, 0.7853982F);
      RightMagnet.addChild(MagnetR8);
      ModelRenderer  MagnetR9 = new ModelRenderer(this, 46, 15);
      MagnetR9.addBox(-1.5F, -1.5F, -1.5F, 2, 3, 3);
      MagnetR9.setTextureSize(64, 64);
      MagnetR9.mirror = true;
      setRotation(MagnetR9, 0F, 0F, 0F);
      RightMagnet.addChild(MagnetR9);
      ModelRenderer MagnetR10 = new ModelRenderer(this, 46, 15);
      MagnetR10.addBox(-1.5F, -4.5F, -1.5F, 2, 5, 3);
      MagnetR10.setRotationPoint(0.1F, -1.4F, 0F);
      MagnetR10.setTextureSize(64, 64);
      MagnetR10.mirror = true;
      setRotation(MagnetR10, 0F, 0F, -0.7853982F);
      RightMagnet.addChild(MagnetR10);
      Body.addChild(RightMagnet);
      
      skeleton = new SkeletonBase(Body);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  Random randomGenerator = new Random();
	int[] count = { 0, 0, 0, 0, 0, 0, 0 };
	boolean[] Headisrotating = { false, false, false, false, false, false, false };
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  Body.rotationPointY = MathHelper.cos(.2F * f2) * 5F * .5F - 5F;

		int randomInt = randomGenerator.nextInt(200);

		if (randomInt == 4) { // right magnet
			Headisrotating[1] = true;
		} else if (Headisrotating[1] == true) {
			RightMagnet.rotateAngleX += 0.0981747704F;
			count[1]++;
		}

		if (count[1] >= 31) {
			Headisrotating[1] = false;
			count[1] = 0;
		}

		if (randomInt == 5) { // left magnet
			Headisrotating[2] = true;
		} else if (Headisrotating[2] == true) {
			LeftMagnet.rotateAngleX -= 0.0981747704F;
			count[2]++;
			
		}
		
		if (count[2] >= 31) {
			Headisrotating[2] = false;
			count[2] = 0;
		}
  }
}
