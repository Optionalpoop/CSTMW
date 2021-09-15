
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

@CoolStuffToMessWithModElements.ModElement.Tag
public class ManmadeInfinititePickaxeItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_pickaxe")
	public static final Item block = null;
	public ManmadeInfinititePickaxeItem(CoolStuffToMessWithModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ManmadeInfinititeItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("manmade_infinitite_pickaxe"));
	}
}
