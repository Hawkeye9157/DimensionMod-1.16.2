// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class k.mod.vinespirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "k.mod.vinespirit"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Arms;
	private final ModelPart Legs;
	private final ModelPart Wig;

	public k.mod.vinespirit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Arms = root.getChild("Arms");
		this.Legs = root.getChild("Legs");
		this.Wig = root.getChild("Wig");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -10.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(26, 5).addBox(1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, 0.0F));

		PartDefinition Arms = partdefinition.addOrReplaceChild("Arms", CubeListBuilder.create().texOffs(22, 31).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 31).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(26, 11).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 11).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Wig = partdefinition.addOrReplaceChild("Wig", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -12.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 8).addBox(2.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 31).addBox(1.0F, -11.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 24).addBox(1.0F, -10.0F, -4.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 24).addBox(1.0F, -10.0F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 23).addBox(-5.0F, -7.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(22, 13).addBox(-6.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}