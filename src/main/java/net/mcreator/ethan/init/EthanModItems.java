
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ethan.item.SuitAndTieItem;
import net.mcreator.ethan.item.PickItem;
import net.mcreator.ethan.item.EnchantedBookItem;
import net.mcreator.ethan.EthanMod;

public class EthanModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EthanMod.MODID);
	public static final RegistryObject<Item> BUBBA = block(EthanModBlocks.BUBBA);
	public static final RegistryObject<Item> BLOKE = block(EthanModBlocks.BLOKE);
	public static final RegistryObject<Item> SUIT_AND_TIE = REGISTRY.register("suit_and_tie", () -> new SuitAndTieItem());
	public static final RegistryObject<Item> HEROBRINE_SPAWN_EGG = REGISTRY.register("herobrine_spawn_egg", () -> new ForgeSpawnEggItem(EthanModEntities.HEROBRINE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BRUH = block(EthanModBlocks.BRUH);
	public static final RegistryObject<Item> ENCHANTED_BOOK = REGISTRY.register("enchanted_book", () -> new EnchantedBookItem());
	public static final RegistryObject<Item> ELEMENTAL_ANVIL = block(EthanModBlocks.ELEMENTAL_ANVIL);
	public static final RegistryObject<Item> PICK = REGISTRY.register("pick", () -> new PickItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
