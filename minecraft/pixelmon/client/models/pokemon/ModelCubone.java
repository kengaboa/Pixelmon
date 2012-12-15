// Date: 18/07/2012 4:39:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelCubone extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Belly1;
	ModelRenderer Belly2;
	ModelRenderer Belly3;
	ModelRenderer Back1;
	ModelRenderer Back2;
	ModelRenderer HEADPIECE;
	ModelRenderer RIGHTARM;
	ModelRenderer LEFTARM;
	ModelRenderer RIGHTLEG;
	ModelRenderer LEFTLEG;
	ModelRenderer TAIL;

	public ModelCubone() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this, 46, 7);
		Body.addBox(0F, 0F, 0F, 6, 7, 3);
		Body.setRotationPoint(-2.5F, 15F, -1F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Belly1 = new ModelRenderer(this, 39, 0);
		Belly1.addBox(0F, 0F, 0F, 4, 6, 1);
		Belly1.setRotationPoint(-1.5F, 15.5F, -1.5F);
		Belly1.setTextureSize(64, 32);
		Belly1.mirror = true;
		setRotation(Belly1, 0F, 0F, 0F);
		Belly2 = new ModelRenderer(this, 30, 0);
		Belly2.addBox(0F, 0F, 0F, 3, 5, 1);
		Belly2.setRotationPoint(-1F, 16.3F, -1.8F);
		Belly2.setTextureSize(64, 32);
		Belly2.mirror = true;
		setRotation(Belly2, 0F, 0F, 0F);
		Belly3 = new ModelRenderer(this, 32, 6);
		Belly3.addBox(0F, 0F, 0F, 2, 3, 1);
		Belly3.setRotationPoint(-0.5F, 18F, -2F);
		Belly3.setTextureSize(64, 32);
		Belly3.mirror = true;
		setRotation(Belly3, 0F, 0F, 0F);
		Back1 = new ModelRenderer(this, 0, 0);
		Back1.addBox(0F, 0F, 0F, 1, 1, 2);
		Back1.setRotationPoint(0F, 16.4F, 1.4F);
		Back1.setTextureSize(64, 32);
		Back1.mirror = true;
		setRotation(Back1, 0.1570796F, 0F, 0F);
		Back2 = new ModelRenderer(this, 0, 0);
		Back2.addBox(0F, 0F, 0F, 1, 1, 2);
		Back2.setRotationPoint(0F, 18.4F, 1.2F);
		Back2.setTextureSize(64, 32);
		Back2.mirror = true;
		setRotation(Back2, 0.1919862F, 0F, 0F);
		HEADPIECE = new ModelRenderer(this, "HEADPIECE");
		HEADPIECE.setRotationPoint(0.5F, 15F, 0.5F);
		setRotation(HEADPIECE, 0F, 0F, 0F);
		HEADPIECE.mirror = true;
		ModelRenderer otherpiece = new ModelRenderer(this, 36, 29);
		otherpiece.addBox(0F, 0F, 0F, 1, 1, 1);
		otherpiece.setRotationPoint(-1.51F, -1.5F, -4.5F);
		otherpiece.setTextureSize(64, 32);
		otherpiece.mirror = true;
		setRotation(otherpiece, 0F, 0F, 0F);
		ModelRenderer Shape5 = new ModelRenderer(this, 34, 29);
		Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5.setRotationPoint(0.51F, -1.5F, -4.5F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		ModelRenderer Head3 = new ModelRenderer(this, 44, 23);
		Head3.addBox(-3F, -2F, 0F, 1, 1, 2);
		Head3.setRotationPoint(1.48F, 0F, -4.4F);
		Head3.setTextureSize(64, 32);
		Head3.mirror = true;
		setRotation(Head3, 0.1858931F, 0F, 0F);
		ModelRenderer Head1 = new ModelRenderer(this, 57, 27);
		Head1.addBox(-1.5F, -3F, -2F, 1, 4, 1);
		Head1.setRotationPoint(-0.5F, -1F, -0.5F);
		Head1.setTextureSize(64, 32);
		Head1.mirror = true;
		setRotation(Head1, 0F, 0F, 0F);
		ModelRenderer Head4 = new ModelRenderer(this, 44, 23);
		Head4.addBox(0F, -2F, 0F, 1, 2, 1);
		Head4.setRotationPoint(-1.5F, -4F, 0.5F);
		Head4.setTextureSize(64, 32);
		Head4.mirror = true;
		setRotation(Head4, -0.6283185F, -0.6533108F, 0F);
		ModelRenderer Head5 = new ModelRenderer(this, 6, 0);
		Head5.addBox(0F, 0F, 0F, 3, 1, 2);
		Head5.setRotationPoint(-1.5F, -2F, -3.7F);
		Head5.setTextureSize(64, 32);
		Head5.mirror = true;
		setRotation(Head5, 0.8028515F, 0F, 0F);
		ModelRenderer Head6 = new ModelRenderer(this, 57, 27);
		Head6.addBox(-1.5F, -3F, -2F, 1, 4, 1);
		Head6.setRotationPoint(2.5F, -1F, -0.5F);
		Head6.setTextureSize(64, 32);
		Head6.mirror = true;
		setRotation(Head6, 0F, 0F, 0F);
		ModelRenderer Head7 = new ModelRenderer(this, 0, 15);
		Head7.addBox(0F, 0F, 0F, 3, 3, 3);
		Head7.setRotationPoint(-1.5F, -3F, -1.5F);
		Head7.setTextureSize(64, 32);
		Head7.mirror = true;
		setRotation(Head7, 0F, 0F, 0F);
		ModelRenderer Head8 = new ModelRenderer(this, 57, 27);
		Head8.addBox(-1.5F, -3F, -2F, 1, 4, 1);
		Head8.setRotationPoint(-0.5F, -1F, 2.5F);
		Head8.setTextureSize(64, 32);
		Head8.mirror = true;
		setRotation(Head8, 0F, 0F, 0F);
		ModelRenderer Head9 = new ModelRenderer(this, 57, 27);
		Head9.addBox(-1.5F, -3F, -2F, 1, 1, 2);
		Head9.setRotationPoint(-0.5F, -1F, 0.5F);
		Head9.setTextureSize(64, 32);
		Head9.mirror = true;
		setRotation(Head9, 0F, 0F, 0F);
		ModelRenderer Head10 = new ModelRenderer(this, 57, 27);
		Head10.addBox(-1.5F, -3F, -2F, 1, 1, 2);
		Head10.setRotationPoint(-0.5F, 2F, 0.5F);
		Head10.setTextureSize(64, 32);
		Head10.mirror = true;
		setRotation(Head10, 0F, 0F, 0F);
		ModelRenderer Head11 = new ModelRenderer(this, 57, 27);
		Head11.addBox(-1.5F, -3F, -2F, 1, 4, 1);
		Head11.setRotationPoint(2.5F, -1F, 2.5F);
		Head11.setTextureSize(64, 32);
		Head11.mirror = true;
		setRotation(Head11, 0F, 0F, 0F);
		ModelRenderer Head12 = new ModelRenderer(this, 57, 27);
		Head12.addBox(-1.5F, -3F, -2F, 1, 1, 2);
		Head12.setRotationPoint(2.5F, -1F, 0.5F);
		Head12.setTextureSize(64, 32);
		Head12.mirror = true;
		setRotation(Head12, 0F, 0F, 0F);
		ModelRenderer Head13 = new ModelRenderer(this, 57, 27);
		Head13.addBox(-1.5F, -3F, -2F, 1, 1, 2);
		Head13.setRotationPoint(2.5F, 2F, 0.5F);
		Head13.setTextureSize(64, 32);
		Head13.mirror = true;
		setRotation(Head13, 0F, 0F, 0F);
		ModelRenderer Head14 = new ModelRenderer(this, 48, 27);
		Head14.addBox(0F, 0F, 0F, 3, 4, 1);
		Head14.setRotationPoint(-1.5F, -4F, 1.5F);
		Head14.setTextureSize(64, 32);
		Head14.mirror = true;
		setRotation(Head14, 0F, 0F, 0F);
		ModelRenderer Head15 = new ModelRenderer(this, 45, 27);
		Head15.addBox(0F, 0F, 0F, 3, 1, 4);
		Head15.setRotationPoint(-1.5F, -4F, -2.5F);
		Head15.setTextureSize(64, 32);
		Head15.mirror = true;
		setRotation(Head15, 0F, 0F, 0F);
		ModelRenderer Head16 = new ModelRenderer(this, 47, 29);
		Head16.addBox(0F, 0F, 0F, 3, 2, 1);
		Head16.setRotationPoint(-1.5F, -4F, -2.5F);
		Head16.setTextureSize(64, 32);
		Head16.mirror = true;
		setRotation(Head16, 0F, 0F, 0F);
		ModelRenderer Head17 = new ModelRenderer(this, 0, 8);
		Head17.addBox(0F, 0F, 0F, 2, 1, 4);
		Head17.setRotationPoint(-1F, -0.7F, -4.5F);
		Head17.setTextureSize(64, 32);
		Head17.mirror = true;
		setRotation(Head17, 0F, 0F, 0F);
		ModelRenderer Head18 = new ModelRenderer(this, 2, 8);
		Head18.addBox(0.02F, 0.2F, -2.6F, 0, 1, 2);
		Head18.setRotationPoint(-1.6F, -4F, 0.5F);
		Head18.setTextureSize(64, 32);
		Head18.mirror = true;
		setRotation(Head18, 0.4886922F, 0F, 0F);
		ModelRenderer Shape1 = new ModelRenderer(this, 3, 0);
		Shape1.addBox(1.02F, 12F, 0.6F, 1, 2, 1);
		Shape1.setRotationPoint(-2.6F, -15F, -0.5F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		ModelRenderer Shape2 = new ModelRenderer(this, 2, 0);
		Shape2.addBox(1.02F, 12F, -1.6F, 1, 2, 1);
		Shape2.setRotationPoint(-2.6F, -15F, -0.5F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		ModelRenderer Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(1.02F, 11.4F, -1F, 1, 1, 2);
		Shape3.setRotationPoint(-2.6F, -15F, -0.5F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		ModelRenderer Shape4 = new ModelRenderer(this, 0, 0);
		Shape4.addBox(1.02F, 13.6F, -1F, 1, 1, 2);
		Shape4.setRotationPoint(-2.6F, -15F, -0.5F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		ModelRenderer Head19 = new ModelRenderer(this, 44, 23);
		Head19.addBox(-1F, -2F, 0F, 1, 2, 1);
		Head19.setRotationPoint(1.5F, -4F, 0.5F);
		Head19.setTextureSize(64, 32);
		Head19.mirror = true;
		setRotation(Head19, -0.6283185F, 0.727668F, 0F);
		ModelRenderer Head2 = new ModelRenderer(this, 45, 27);
		Head2.addBox(0F, 0F, 0F, 3, 2, 3);
		Head2.setRotationPoint(-1.5F, -2F, -4.8F);
		Head2.setTextureSize(64, 32);
		Head2.mirror = true;
		setRotation(Head2, 0F, 0F, 0F);
		ModelRenderer renamed4 = new ModelRenderer(this, 0, 0);
		renamed4.addBox(1.02F, 12F, 0.6F, 1, 2, 1);
		renamed4.setRotationPoint(-0.5F, -15F, -0.5F);
		renamed4.setTextureSize(64, 32);
		renamed4.mirror = true;
		setRotation(renamed4, 0F, 0F, 0F);
		ModelRenderer renamed1 = new ModelRenderer(this, 0, 0);
		renamed1.addBox(1.02F, 13.6F, -1F, 1, 1, 2);
		renamed1.setRotationPoint(-0.5F, -15F, -0.5F);
		renamed1.setTextureSize(64, 32);
		renamed1.mirror = true;
		setRotation(renamed1, 0F, 0F, 0F);
		ModelRenderer renamed2 = new ModelRenderer(this, 0, 0);
		renamed2.addBox(1.02F, 12F, -1.6F, 1, 2, 1);
		renamed2.setRotationPoint(-0.5F, -15F, -0.5F);
		renamed2.setTextureSize(64, 32);
		renamed2.mirror = true;
		setRotation(renamed2, 0F, 0F, 0F);
		ModelRenderer Head20 = new ModelRenderer(this, 2, 8);
		Head20.addBox(0.02F, 0.2F, -2.6F, 0, 1, 2);
		Head20.setRotationPoint(1.5F, -4F, 0.5F);
		Head20.setTextureSize(64, 32);
		Head20.mirror = true;
		setRotation(Head20, 0.4886922F, 0F, 0F);
		ModelRenderer Head21 = new ModelRenderer(this, 44, 23);
		Head21.addBox(-3F, -2F, 0F, 2, 1, 2);
		Head21.setRotationPoint(2.52F, 0F, -4.4F);
		Head21.setTextureSize(64, 32);
		Head21.mirror = true;
		setRotation(Head21, 0.1858931F, 0F, 0F);
		ModelRenderer renamed3 = new ModelRenderer(this, 0, 0);
		renamed3.addBox(1.02F, 11.4F, -1F, 1, 1, 2);
		renamed3.setRotationPoint(-0.5F, -15F, -0.5F);
		renamed3.setTextureSize(64, 32);
		renamed3.mirror = true;
		setRotation(renamed3, 0F, 0F, 0F);

		HEADPIECE.addChild(Head1);
		HEADPIECE.addChild(Head2);
		HEADPIECE.addChild(Head3);
		HEADPIECE.addChild(Head4);
		HEADPIECE.addChild(Head5);
		HEADPIECE.addChild(Head6);
		HEADPIECE.addChild(Head7);
		HEADPIECE.addChild(Head8);
		HEADPIECE.addChild(Head9);
		HEADPIECE.addChild(Head10);
		HEADPIECE.addChild(Head11);
		HEADPIECE.addChild(Head12);
		HEADPIECE.addChild(Head13);
		HEADPIECE.addChild(Head14);
		HEADPIECE.addChild(Head15);
		HEADPIECE.addChild(Head16);
		HEADPIECE.addChild(Head17);
		HEADPIECE.addChild(Head18);
		HEADPIECE.addChild(Head19);
		HEADPIECE.addChild(Head20);
		HEADPIECE.addChild(Head21);
		HEADPIECE.addChild(renamed1);
		HEADPIECE.addChild(renamed2);
		HEADPIECE.addChild(renamed3);
		HEADPIECE.addChild(renamed4);
		HEADPIECE.addChild(Shape1);
		HEADPIECE.addChild(Shape2);
		HEADPIECE.addChild(Shape3);
		HEADPIECE.addChild(Shape4);
		HEADPIECE.addChild(Shape5);
		HEADPIECE.addChild(otherpiece);

		RIGHTARM = new ModelRenderer(this, "RIGHTARM");
		RIGHTARM.setRotationPoint(-2F, 16.5F, 0.5F);
		setRotation(RIGHTARM, 0F, 0F, 0F);
		RIGHTARM.mirror = true;
		ModelRenderer Bone2 = new ModelRenderer(this, 5, 23);
		Bone2.addBox(-1F, 2.5F, -4F, 1, 2, 1);
		Bone2.setRotationPoint(0F, -0.5F, 0F);
		Bone2.setTextureSize(64, 32);
		Bone2.mirror = true;
		setRotation(Bone2, 0F, 0F, 0.3490659F);
		ModelRenderer Bone1 = new ModelRenderer(this, 6, 23);
		Bone1.addBox(-1F, 3F, -3F, 1, 1, 4);
		Bone1.setRotationPoint(0F, -0.5F, 0F);
		Bone1.setTextureSize(64, 32);
		Bone1.mirror = true;
		setRotation(Bone1, 0F, 0F, 0.3490659F);
		ModelRenderer RightArm1 = new ModelRenderer(this, 0, 24);
		RightArm1.addBox(-1F, 0F, -0.5F, 1, 1, 1);
		RightArm1.setRotationPoint(0F, -0.8F, 0F);
		RightArm1.setTextureSize(64, 32);
		RightArm1.mirror = true;
		setRotation(RightArm1, 0F, 0F, 0F);
		ModelRenderer RightArm2 = new ModelRenderer(this, 0, 24);
		RightArm2.addBox(-1.1F, 3.1F, -0.5F, 1, 1, 1);
		RightArm2.setRotationPoint(0F, -0.5F, 0F);
		RightArm2.setTextureSize(64, 32);
		RightArm2.mirror = true;
		setRotation(RightArm2, 0F, 0F, 0.3490659F);
		ModelRenderer RightArm3 = new ModelRenderer(this, 54, 11);
		RightArm3.addBox(-1.01F, -0.01F, -0.5F, 1, 4, 1);
		RightArm3.setRotationPoint(0F, -0.5F, 0F);
		RightArm3.setTextureSize(64, 32);
		RightArm3.mirror = true;
		setRotation(RightArm3, 0F, 0F, 0.3490659F);

		RIGHTARM.addChild(Bone1);
		RIGHTARM.addChild(Bone2);
		RIGHTARM.addChild(RightArm1);
		RIGHTARM.addChild(RightArm2);
		RIGHTARM.addChild(RightArm3);

		LEFTARM = new ModelRenderer(this, "LEFTARM");
		LEFTARM.setRotationPoint(3F, 16.5F, 0.5F);
		setRotation(LEFTARM, 0F, 0F, 0F);
		LEFTARM.mirror = true;
		ModelRenderer LeftArm1 = new ModelRenderer(this, 0, 24);
		LeftArm1.addBox(-1F, 0F, -0.5F, 1, 1, 1);
		LeftArm1.setRotationPoint(1F, -0.8F, 0F);
		LeftArm1.setTextureSize(64, 32);
		LeftArm1.mirror = true;
		setRotation(LeftArm1, 0F, 0F, 0F);
		ModelRenderer LeftArm2 = new ModelRenderer(this, 56, 10);
		LeftArm2.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		LeftArm2.setRotationPoint(0.5F, -0.5F, 0F);
		LeftArm2.setTextureSize(64, 32);
		LeftArm2.mirror = true;
		setRotation(LeftArm2, 0F, 0F, -0.3490659F);

		LEFTARM.addChild(LeftArm1);
		LEFTARM.addChild(LeftArm2);

		RIGHTLEG = new ModelRenderer(this, "RIGHTLEG");
		RIGHTLEG.setRotationPoint(-2F, 21F, 0F);
		setRotation(RIGHTLEG, 0F, 0F, 0F);
		RIGHTLEG.mirror = true;
		ModelRenderer RightLeg2 = new ModelRenderer(this, 0, 8);
		RightLeg2.addBox(-1F, 0F, 0F, 2, 2, 2);
		RightLeg2.setRotationPoint(-0.5F, 0.7F, -1.2F);
		RightLeg2.setTextureSize(64, 32);
		RightLeg2.mirror = true;
		setRotation(RightLeg2, 0.296706F, 0F, 0F);
		ModelRenderer RightLeg3 = new ModelRenderer(this, 5, 28);
		RightLeg3.addBox(-1F, 0F, 0F, 2, 1, 3);
		RightLeg3.setRotationPoint(-0.5F, 2F, -1.7F);
		RightLeg3.setTextureSize(64, 32);
		RightLeg3.mirror = true;
		setRotation(RightLeg3, 0F, 0F, 0F);
		ModelRenderer RightLeg1 = new ModelRenderer(this, 0, 8);
		RightLeg1.addBox(-1F, 0F, 0F, 2, 2, 2);
		RightLeg1.setRotationPoint(-0.5F, -1.1F, -0.3F);
		RightLeg1.setTextureSize(64, 32);
		RightLeg1.mirror = true;
		setRotation(RightLeg1, -0.4363323F, 0F, 0F);

		RIGHTLEG.addChild(RightLeg1);
		RIGHTLEG.addChild(RightLeg2);
		RIGHTLEG.addChild(RightLeg3);

		LEFTLEG = new ModelRenderer(this, "LEFTLEG");
		LEFTLEG.setRotationPoint(3F, 21F, 0F);
		setRotation(LEFTLEG, 0F, 0F, 0F);
		LEFTLEG.mirror = true;
		ModelRenderer LeftLeg3 = new ModelRenderer(this, 5, 28);
		LeftLeg3.addBox(0F, 0F, 0F, 2, 1, 3);
		LeftLeg3.setRotationPoint(-0.5F, 2F, -1.7F);
		LeftLeg3.setTextureSize(64, 32);
		LeftLeg3.mirror = true;
		setRotation(LeftLeg3, 0F, 0F, 0F);
		ModelRenderer LeftLeg2 = new ModelRenderer(this, 0, 8);
		LeftLeg2.addBox(0F, 0F, 0F, 2, 2, 2);
		LeftLeg2.setRotationPoint(-0.5F, 0.7F, -1.2F);
		LeftLeg2.setTextureSize(64, 32);
		LeftLeg2.mirror = true;
		setRotation(LeftLeg2, 0.296706F, 0F, 0F);
		ModelRenderer LeftLeg1 = new ModelRenderer(this, 0, 9);
		LeftLeg1.addBox(0F, 0F, 0F, 2, 2, 2);
		LeftLeg1.setRotationPoint(-0.5F, -1.1F, -0.3F);
		LeftLeg1.setTextureSize(64, 32);
		LeftLeg1.mirror = true;
		setRotation(LeftLeg1, -0.4363323F, 0F, 0F);

		LEFTLEG.addChild(LeftLeg1);
		LEFTLEG.addChild(LeftLeg2);
		LEFTLEG.addChild(LeftLeg3);

		TAIL = new ModelRenderer(this, "TAIL");
		TAIL.setRotationPoint(0.5F, 21F, 2F);
		setRotation(TAIL, 0F, 0F, 0F);
		TAIL.mirror = true;
		ModelRenderer Tail3 = new ModelRenderer(this, 0, 6);
		Tail3.addBox(0F, 0F, 0F, 1, 1, 2);
		Tail3.setRotationPoint(-0.5F, 0.3F, 3.5F);
		Tail3.setTextureSize(64, 32);
		Tail3.mirror = true;
		setRotation(Tail3, 0.1570796F, 0F, 0F);
		ModelRenderer Tail2 = new ModelRenderer(this, 0, 6);
		Tail2.addBox(0F, 0F, 0F, 1, 1, 2);
		Tail2.setRotationPoint(-0.5F, 0F, 1.8F);
		Tail2.setTextureSize(64, 32);
		Tail2.mirror = true;
		setRotation(Tail2, -0.1396263F, 0F, 0F);
		ModelRenderer Tail1 = new ModelRenderer(this, 0, 10);
		Tail1.addBox(0F, 0F, 0F, 2, 2, 2);
		Tail1.setRotationPoint(-1F, -1F, 0F);
		Tail1.setTextureSize(64, 32);
		Tail1.mirror = true;
		setRotation(Tail1, -0.1396263F, 0F, 0F);

		TAIL.addChild(Tail1);
		TAIL.addChild(Tail2);
		TAIL.addChild(Tail3);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Belly1.render(f5);
		Belly2.render(f5);
		Belly3.render(f5);
		Back1.render(f5);
		Back2.render(f5);
		HEADPIECE.render(f5);
		RIGHTARM.render(f5);
		LEFTARM.render(f5);
		RIGHTLEG.render(f5);
		LEFTLEG.render(f5);
		TAIL.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		HEADPIECE.rotateAngleY = f3 / (180F / (float) Math.PI);
		HEADPIECE.rotateAngleX = f4 / (180F / (float) Math.PI);
		RIGHTARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI)
				* 1.8F * f1 * 0.5F;
		LEFTARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.8F * f1 * 0.5F;
		RIGHTARM.rotateAngleZ = 0.0F;
		LEFTARM.rotateAngleZ = 0.0F;
		RIGHTLEG.rotateAngleX = MathHelper.cos(f * 1F) * 1.1F * f1;
		LEFTLEG.rotateAngleX = MathHelper.cos(f * 1F + (float) Math.PI) * 1.1F
				* f1;
		RIGHTLEG.rotateAngleY = 0.0F;
		LEFTLEG.rotateAngleY = 0.0F;
		TAIL.rotateAngleY = MathHelper.cos(f * 1F) * .5F * f1;
	}

}