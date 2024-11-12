// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class vine_spirit extends EntityModel<Entity> {
	private final ModelRenderer Wig;
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer L_Arm;
	private final ModelRenderer R_Arm;
	private final ModelRenderer L_Leg;
	private final ModelRenderer R_Leg;

	public vine_spirit() {
		textureWidth = 64;
		textureHeight = 64;

		Wig = new ModelRenderer(this);
		Wig.setRotationPoint(0.0F, 24.0F, 0.0F);
		Wig.setTextureOffset(26, 0).addBox(-1.0F, -12.0F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		Wig.setTextureOffset(23, 19).addBox(2.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Wig.setTextureOffset(24, 20).addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Wig.setTextureOffset(0, 31).addBox(1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Wig.setTextureOffset(6, 31).addBox(1.0F, -11.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Wig.setTextureOffset(14, 24).addBox(1.0F, -10.0F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		Wig.setTextureOffset(18, 24).addBox(1.0F, -10.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		Wig.setTextureOffset(22, 23).addBox(-5.0F, -7.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		Wig.setTextureOffset(22, 13).addBox(-6.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		Wig.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -4.0F, 5.0F, 5.0F, 8.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.setTextureOffset(0, 13).addBox(-3.0F, -10.0F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(26, 5).addBox(1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(2.0F, 21.0F, 0.0F);
		Body.setTextureOffset(0, 24).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		L_Arm = new ModelRenderer(this);
		L_Arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		L_Arm.setTextureOffset(22, 31).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		R_Arm = new ModelRenderer(this);
		R_Arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		R_Arm.setTextureOffset(26, 31).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		R_Arm.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		L_Leg = new ModelRenderer(this);
		L_Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		L_Leg.setTextureOffset(30, 11).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		R_Leg = new ModelRenderer(this);
		R_Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		R_Leg.setTextureOffset(26, 32).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Wig.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}