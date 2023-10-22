
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ethan.EthanMod;

public class EthanModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, EthanMod.MODID);
	public static final RegistryObject<Potion> COCAINE = REGISTRY.register("cocaine", () -> new Potion(new MobEffectInstance(EthanModMobEffects.HALLUCINATION.get(), 3600, 0, false, true)));
}
