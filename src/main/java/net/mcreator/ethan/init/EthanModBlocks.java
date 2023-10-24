
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ethan.block.BubbaBlock;
import net.mcreator.ethan.block.BruhBlock;
import net.mcreator.ethan.block.BlokeBlock;
import net.mcreator.ethan.EthanMod;

public class EthanModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EthanMod.MODID);
	public static final RegistryObject<Block> BUBBA = REGISTRY.register("bubba", () -> new BubbaBlock());
	public static final RegistryObject<Block> BLOKE = REGISTRY.register("bloke", () -> new BlokeBlock());
	public static final RegistryObject<Block> BRUH = REGISTRY.register("bruh", () -> new BruhBlock());
}
