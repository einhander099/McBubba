
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ethan.client.renderer.HerobrineRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EthanModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EthanModEntities.HEROBRINE.get(), HerobrineRenderer::new);
		event.registerEntityRenderer(EthanModEntities.HEROBRINE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
