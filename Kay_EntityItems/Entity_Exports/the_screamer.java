// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class the_screamer extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Torso;
	private final ModelRenderer shoulders_ribs;
	private final ModelRenderer LowerBody;
	private final ModelRenderer Tentacles;
	private final ModelRenderer Front;
	private final ModelRenderer front_base;
	private final ModelRenderer front_middle1;
	private final ModelRenderer front_middle2;
	private final ModelRenderer front_tip;
	private final ModelRenderer Back;
	private final ModelRenderer back_base;
	private final ModelRenderer back_middle1;
	private final ModelRenderer back_middle2;
	private final ModelRenderer back_tip;
	private final ModelRenderer Left;
	private final ModelRenderer left_base;
	private final ModelRenderer left_middle1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_middle2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer left_tip;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Right;
	private final ModelRenderer right_base;
	private final ModelRenderer right_middle1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer right_middle2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer right_tip;
	private final ModelRenderer cube_r6;

	public the_screamer() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(-6.0F, 24.0F, -1.0F);
		Head.texOffs(24, 21).addBox(4.0F, -29.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Head.texOffs(14, 35).addBox(5.0F, -25.0F, -1.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		Head.texOffs(16, 26).addBox(4.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(20, 46).addBox(7.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(46, 17).addBox(5.0F, -25.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Torso = new ModelRenderer(this);
		Torso.setPos(-6.0F, 24.0F, -1.0F);
		Torso.texOffs(46, 30).addBox(7.0F, -17.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Torso.texOffs(46, 12).addBox(5.0F, -17.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		shoulders_ribs = new ModelRenderer(this);
		shoulders_ribs.setPos(0.0F, 0.0F, 0.0F);
		Torso.addChild(shoulders_ribs);
		shoulders_ribs.texOffs(24, 16).addBox(2.0F, -23.0F, 0.0F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		shoulders_ribs.texOffs(0, 26).addBox(3.0F, -21.0F, 0.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		shoulders_ribs.texOffs(46, 27).addBox(4.0F, -17.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		LowerBody = new ModelRenderer(this);
		LowerBody.setPos(0.0F, 9.0F, 0.0F);
		LowerBody.texOffs(16, 29).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LowerBody.texOffs(0, 16).addBox(-3.0F, 3.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		LowerBody.texOffs(0, 0).addBox(-4.0F, 7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Tentacles = new ModelRenderer(this);
		Tentacles.setPos(0.0F, 9.0F, 0.0F);
		

		Front = new ModelRenderer(this);
		Front.setPos(0.0F, 0.0F, 0.0F);
		Tentacles.addChild(Front);
		

		front_base = new ModelRenderer(this);
		front_base.setPos(0.0F, 0.0F, 0.0F);
		Front.addChild(front_base);
		front_base.texOffs(32, 29).addBox(-2.0F, 11.0F, -7.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		front_middle1 = new ModelRenderer(this);
		front_middle1.setPos(0.0F, 0.0F, 0.0F);
		Front.addChild(front_middle1);
		front_middle1.texOffs(20, 35).addBox(-1.0F, 12.0F, -10.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		front_middle2 = new ModelRenderer(this);
		front_middle2.setPos(0.0F, 0.0F, 0.0F);
		Front.addChild(front_middle2);
		front_middle2.texOffs(40, 36).addBox(-1.0F, 13.0F, -13.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		front_tip = new ModelRenderer(this);
		front_tip.setPos(0.0F, 0.0F, 0.0F);
		Front.addChild(front_tip);
		front_tip.texOffs(0, 46).addBox(-1.0F, 14.0F, -16.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		Back = new ModelRenderer(this);
		Back.setPos(0.0F, 0.0F, 0.0F);
		Tentacles.addChild(Back);
		

		back_base = new ModelRenderer(this);
		back_base.setPos(0.0F, 0.0F, 0.0F);
		Back.addChild(back_base);
		back_base.texOffs(32, 8).addBox(-2.0F, 11.0F, 4.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		back_middle1 = new ModelRenderer(this);
		back_middle1.setPos(0.0F, 0.0F, 0.0F);
		Back.addChild(back_middle1);
		back_middle1.texOffs(30, 36).addBox(-1.0F, 12.0F, 7.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		back_middle2 = new ModelRenderer(this);
		back_middle2.setPos(0.0F, 0.0F, 0.0F);
		Back.addChild(back_middle2);
		back_middle2.texOffs(20, 41).addBox(-1.0F, 13.0F, 10.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		back_tip = new ModelRenderer(this);
		back_tip.setPos(0.0F, 0.0F, 0.0F);
		Back.addChild(back_tip);
		back_tip.texOffs(46, 0).addBox(-1.0F, 14.0F, 13.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		Left = new ModelRenderer(this);
		Left.setPos(0.0F, 0.0F, 0.0F);
		Tentacles.addChild(Left);
		

		left_base = new ModelRenderer(this);
		left_base.setPos(0.0F, 0.0F, 0.0F);
		Left.addChild(left_base);
		left_base.texOffs(32, 0).addBox(4.0F, 11.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		left_middle1 = new ModelRenderer(this);
		left_middle1.setPos(0.0F, 0.0F, 0.0F);
		Left.addChild(left_middle1);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(8.0F, 15.0F, 0.0F);
		left_middle1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.texOffs(40, 21).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		left_middle2 = new ModelRenderer(this);
		left_middle2.setPos(0.0F, 0.0F, 0.0F);
		Left.addChild(left_middle2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(11.0F, 15.0F, 0.0F);
		left_middle2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.texOffs(30, 42).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		left_tip = new ModelRenderer(this);
		left_tip.setPos(0.0F, 0.0F, 0.0F);
		Left.addChild(left_tip);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(14.0F, 15.0F, 0.0F);
		left_tip.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.texOffs(46, 4).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		Right = new ModelRenderer(this);
		Right.setPos(0.0F, 0.0F, 0.0F);
		Tentacles.addChild(Right);
		

		right_base = new ModelRenderer(this);
		right_base.setPos(0.0F, 0.0F, 0.0F);
		Right.addChild(right_base);
		right_base.texOffs(0, 32).addBox(-7.0F, 11.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		right_middle1 = new ModelRenderer(this);
		right_middle1.setPos(0.0F, 0.0F, 0.0F);
		Right.addChild(right_middle1);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-9.0F, 15.0F, 0.0F);
		right_middle1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.texOffs(0, 40).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		right_middle2 = new ModelRenderer(this);
		right_middle2.setPos(0.0F, 0.0F, 0.0F);
		Right.addChild(right_middle2);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-12.0F, 15.0F, 0.0F);
		right_middle2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.texOffs(40, 41).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		right_tip = new ModelRenderer(this);
		right_tip.setPos(0.0F, 0.0F, 0.0F);
		Right.addChild(right_tip);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-15.0F, 15.0F, 0.0F);
		right_tip.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
		cube_r6.texOffs(46, 8).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Tentacles.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}