
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ethan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ethan.world.inventory.ElementalAnvilGUiMenu;
import net.mcreator.ethan.EthanMod;

public class EthanModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EthanMod.MODID);
	public static final RegistryObject<MenuType<ElementalAnvilGUiMenu>> ELEMENTAL_ANVIL_G_UI = REGISTRY.register("elemental_anvil_g_ui", () -> IForgeMenuType.create(ElementalAnvilGUiMenu::new));
}
