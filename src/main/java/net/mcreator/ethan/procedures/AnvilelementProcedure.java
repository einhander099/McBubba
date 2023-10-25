package net.mcreator.ethan.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ethan.init.EthanModItems;
import net.mcreator.ethan.init.EthanModEnchantments;

public class AnvilelementProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack itemInHand = ItemStack.EMPTY;
		double EnchantLevel = 0;
		itemInHand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		EnchantLevel = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EthanModEnchantments.FIRE_AFFINITY.get());
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EthanModItems.PICK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EthanModEnchantments.FIRE_AFFINITY.get()) > 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Message"), false);
		}
	}
}
