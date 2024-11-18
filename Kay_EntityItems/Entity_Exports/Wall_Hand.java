// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class Wall_Hand extends EntityModel<Entity> {
	private final ModelRenderer Forearm;
	private final ModelRenderer Wrist;
	private final ModelRenderer palmhand;
	private final ModelRenderer thumb;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer index;
	private final ModelRenderer middle;
	private final ModelRenderer pinky;

	public Wall_Hand() {
		textureWidth = 128;
		textureHeight = 128;

		Forearm = new ModelRenderer(this);
		Forearm.setRotationPoint(0.0F, 24.0F, 0.0F);
		Forearm.setTextureOffset(0, 23).addBox(-6.0F, -2.0F, -4.0F, 12.0F, 2.0F, 8.0F, 0.0F, false);
		Forearm.setTextureOffset(0, 33).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		Forearm.setTextureOffset(40, 11).addBox(-3.0F, -15.0F, -2.0F, 6.0F, 9.0F, 4.0F, 0.0F, false);

		Wrist = new ModelRenderer(this);
		Wrist.setRotationPoint(0.0F, 24.0F, 0.0F);
		Wrist.setTextureOffset(28, 33).addBox(-4.0F, -17.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		palmhand = new ModelRenderer(this);
		palmhand.setRotationPoint(0.0F, 24.0F, 0.0F);
		palmhand.setTextureOffset(0, 0).addBox(-7.0F, -21.0F, -3.0F, 16.0F, 4.0F, 7.0F, 0.0F, false);
		palmhand.setTextureOffset(0, 11).addBox(-8.0F, -27.0F, -2.0F, 14.0F, 6.0F, 6.0F, 0.0F, false);

		thumb = new ModelRenderer(this);
		thumb.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(11.0F, -28.0F, 0.0F);
		thumb.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.setTextureOffset(60, 10).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(10.0F, -26.0F, 0.0F);
		thumb.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
		cube_r2.setTextureOffset(40, 24).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(7.0F, -21.0F, 0.0F);
		thumb.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
		cube_r3.setTextureOffset(28, 41).addBox(-1.0F, -6.0F, -2.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		index = new ModelRenderer(this);
		index.setRotationPoint(0.0F, 24.0F, 0.0F);
		index.setTextureOffset(46, 0).addBox(1.0F, -33.0F, -1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		index.setTextureOffset(46, 51).addBox(2.0F, -39.0F, -1.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		index.setTextureOffset(16, 43).addBox(3.0F, -45.0F, -1.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		middle = new ModelRenderer(this);
		middle.setRotationPoint(0.0F, 24.0F, 0.0F);
		middle.setTextureOffset(46, 41).addBox(-4.0F, -33.0F, -1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		middle.setTextureOffset(16, 55).addBox(-4.0F, -39.0F, -1.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		middle.setTextureOffset(0, 56).addBox(-4.0F, -45.0F, -1.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		pinky = new ModelRenderer(this);
		pinky.setRotationPoint(6.0F, 24.0F, 0.0F);
		setRotationAngle(pinky, 0.0F, 0.0F, -0.1309F);
		pinky.setTextureOffset(0, 43).addBox(-11.0F, -33.0F, -1.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		pinky.setTextureOffset(30, 55).addBox(-11.0F, -39.0F, -1.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		pinky.setTextureOffset(56, 24).addBox(-11.0F, -45.0F, -1.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Forearm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Wrist.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		palmhand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		thumb.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		index.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		middle.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		pinky.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}