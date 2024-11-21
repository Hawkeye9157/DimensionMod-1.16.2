// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class vinespirit extends EntityModel<Entity> {
	private final ModelRenderer Hair;
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer L_Arm;
	private final ModelRenderer R_Arm;
	private final ModelRenderer L_Leg;
	private final ModelRenderer R_Leg;

	public vinespirit() {
		texWidth = 64;
		texHeight = 64;

		Hair = new ModelRenderer(this);
		Hair.setPos(0.0F, 24.0F, 0.0F);
		Hair.texOffs(30, 29).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Hair.texOffs(8, 32).addBox(-1.0F, -13.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Hair.texOffs(18, 23).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Hair.texOffs(0, 0).addBox(-4.0F, -11.0F, -2.0F, 8.0F, 6.0F, 6.0F, 0.0F, false);
		Hair.texOffs(24, 18).addBox(-2.0F, -12.0F, 4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		Hair.texOffs(24, 12).addBox(-3.0F, -12.0F, -1.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Hair.texOffs(28, 0).addBox(1.0F, -12.0F, -1.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Hair.texOffs(30, 34).addBox(-3.0F, -10.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(16, 35).addBox(1.0F, -10.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(0, 32).addBox(-4.0F, -9.0F, -3.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Hair.texOffs(4, 32).addBox(3.0F, -9.0F, -3.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Hair.texOffs(32, 26).addBox(1.0F, -10.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.texOffs(36, 20).addBox(2.0F, -8.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.texOffs(28, 36).addBox(3.0F, -7.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.texOffs(22, 35).addBox(1.0F, -11.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(36, 18).addBox(-1.0F, -12.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(8, 36).addBox(-3.0F, -11.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(14, 37).addBox(-2.0F, -11.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.texOffs(0, 23).addBox(-3.0F, -9.0F, 4.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		Hair.texOffs(18, 29).addBox(-2.0F, -8.0F, 6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 24.0F, 0.0F);
		Head.texOffs(0, 12).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		Head.texOffs(32, 23).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 24.0F, 0.0F);
		Body.texOffs(28, 6).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		L_Arm = new ModelRenderer(this);
		L_Arm.setPos(0.0F, 24.0F, 0.0F);
		L_Arm.texOffs(32, 36).addBox(-3.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		R_Arm = new ModelRenderer(this);
		R_Arm.setPos(0.0F, 24.0F, 0.0F);
		R_Arm.texOffs(36, 34).addBox(2.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		L_Leg = new ModelRenderer(this);
		L_Leg.setPos(0.0F, 24.0F, 0.0F);
		L_Leg.texOffs(18, 37).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		R_Leg = new ModelRenderer(this);
		R_Leg.setPos(0.0F, 24.0F, 0.0F);
		R_Leg.texOffs(22, 37).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Hair.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}