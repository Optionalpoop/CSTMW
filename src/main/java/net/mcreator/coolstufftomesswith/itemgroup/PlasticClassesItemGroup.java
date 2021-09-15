
package net.mcreator.coolstufftomesswith.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.coolstufftomesswith.item.PlasticWandItem;
import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

@CoolStuffToMessWithModElements.ModElement.Tag
public class PlasticClassesItemGroup extends CoolStuffToMessWithModElements.ModElement {
	public PlasticClassesItemGroup(CoolStuffToMessWithModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabplastic_classes") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlasticWandItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
