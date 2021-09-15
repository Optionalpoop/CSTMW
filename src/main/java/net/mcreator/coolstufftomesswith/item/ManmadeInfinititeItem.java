
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

@CoolStuffToMessWithModElements.ModElement.Tag
public class ManmadeInfinititeItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite")
	public static final Item block = null;
	public ManmadeInfinititeItem(CoolStuffToMessWithModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("manmade_infinitite");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
