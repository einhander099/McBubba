package net.mcreator.ethan.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ethan.init.EthanModItems;
import net.mcreator.ethan.init.EthanModEnchantments;

public class AnvilelementProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack itemInHand = ItemStack.EMPTY;
		double EnchantLevel = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EthanModItems.PICK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EthanModEnchantments.FIRE_AFFINITY.get()) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EthanModEnchantments.FIRE_AFFINITY.get())));
		}
	}
}
