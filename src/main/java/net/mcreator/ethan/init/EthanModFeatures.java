
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.ethan.world.features.ores.GildedDiamondFeature;
import net.mcreator.ethan.EthanMod;

@Mod.EventBusSubscriber
public class EthanModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EthanMod.MODID);
	public static final RegistryObject<Feature<?>> GILDED_DIAMOND = REGISTRY.register("gilded_diamond", GildedDiamondFeature::new);
}
