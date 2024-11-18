// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class vine_spirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "vine_spirit"), "main");
	private final ModelPart Wig;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart L_Arm;
	private final ModelPart R_Arm;
	private final ModelPart L_Leg;
	private final ModelPart R_Leg;

	public vine_spirit(ModelPart root) {
		this.Wig = root.getChild("Wig");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.L_Arm = root.getChild("L_Arm");
		this.R_Arm = root.getChild("R_Arm");
		this.L_Leg = root.getChild("L_Leg");
		this.R_Leg = root.getChild("R_Leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Wig = partdefinition.addOrReplaceChild("Wig", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -12.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(23, 19).addBox(2.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 31).addBox(1.0F, -11.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 24).addBox(1.0F, -10.0F, -4.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 24).addBox(1.0F, -10.0F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 23).addBox(-5.0F, -7.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(22, 13).addBox(-6.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -10.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(26, 5).addBox(1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, 0.0F));

		PartDefinition L_Arm = partdefinition.addOrReplaceChild("L_Arm", CubeListBuilder.create().texOffs(26, 31).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition R_Arm = partdefinition.addOrReplaceChild("R_Arm", CubeListBuilder.create().texOffs(22, 31).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -3.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition L_Leg = partdefinition.addOrReplaceChild("L_Leg", CubeListBuilder.create().texOffs(30, 11).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition R_Leg = partdefinition.addOrReplaceChild("R_Leg", CubeListBuilder.create().texOffs(30, 11).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Wig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}