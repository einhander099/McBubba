package net.mcreator.ethan.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ethan.world.inventory.ElementalAnvilGUiMenu;
import net.mcreator.ethan.network.ElementalAnvilGUiButtonMessage;
import net.mcreator.ethan.EthanMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ElementalAnvilGUiScreen extends AbstractContainerScreen<ElementalAnvilGUiMenu> {
	private final static HashMap<String, Object> guistate = ElementalAnvilGUiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_combine;

	public ElementalAnvilGUiScreen(ElementalAnvilGUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ethan:textures/screens/elemental_anvil_g_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ethan.elemental_anvil_g_ui.label_elemental_anvil"), 6, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_combine = Button.builder(Component.translatable("gui.ethan.elemental_anvil_g_ui.button_combine"), e -> {
			if (true) {
				EthanMod.PACKET_HANDLER.sendToServer(new ElementalAnvilGUiButtonMessage(0, x, y, z));
				ElementalAnvilGUiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 43, 61, 20).build();
		guistate.put("button:button_combine", button_combine);
		this.addRenderableWidget(button_combine);
	}
}
