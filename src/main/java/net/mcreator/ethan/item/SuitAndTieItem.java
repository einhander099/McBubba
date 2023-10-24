
package net.mcreator.ethan.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SuitAndTieItem extends RecordItem {
	public SuitAndTieItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ethan:suitandtietrim")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 500);
	}
}
