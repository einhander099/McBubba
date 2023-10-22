
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.ethan.EthanMod;

public class EthanModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, EthanMod.MODID);
	public static final RegistryObject<PaintingVariant> BLAKE_PAINTING = REGISTRY.register("blake_painting", () -> new PaintingVariant(16, 16));
}
