
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

@CoolStuffToMessWithModElements.ModElement.Tag
public class ManmadeInfinititeHoeItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_hoe")
	public static final Item block = null;
	public ManmadeInfinititeHoeItem(CoolStuffToMessWithModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 9997f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 99999;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ManmadeInfinititeItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("manmade_infinitite_hoe"));
	}
}
