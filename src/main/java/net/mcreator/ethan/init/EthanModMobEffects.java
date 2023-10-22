
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ethan.potion.HallucinationMobEffect;
import net.mcreator.ethan.EthanMod;

public class EthanModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EthanMod.MODID);
	public static final RegistryObject<MobEffect> HALLUCINATION = REGISTRY.register("hallucination", () -> new HallucinationMobEffect());
}
