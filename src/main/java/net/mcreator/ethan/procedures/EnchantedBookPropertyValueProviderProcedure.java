package net.mcreator.ethan.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.ethan.init.EthanModEnchantments;

public class EnchantedBookPropertyValueProviderProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(EthanModEnchantments.FIRE_AFFINITY.get(), Mth.nextInt(RandomSource.create(), 1, 4));
	}
}
