
package net.mcreator.ethan.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.ethan.init.EthanModItems;
import net.mcreator.ethan.init.EthanModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class HerobrineEntityProjectile extends AbstractArrow implements ItemSupplier {
	public HerobrineEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(EthanModEntities.HEROBRINE_PROJECTILE.get(), world);
	}

	public HerobrineEntityProjectile(EntityType<? extends HerobrineEntityProjectile> type, Level world) {
		super(type, world);
	}

	public HerobrineEntityProjectile(EntityType<? extends HerobrineEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public HerobrineEntityProjectile(EntityType<? extends HerobrineEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(EthanModItems.SUIT_AND_TIE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(EthanModItems.SUIT_AND_TIE.get());
	}
}
