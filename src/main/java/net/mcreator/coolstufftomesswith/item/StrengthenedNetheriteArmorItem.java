
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

@CoolStuffToMessWithModElements.ModElement.Tag
public class StrengthenedNetheriteArmorItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:strengthened_netherite_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("cool_stuff_to_mess_with:strengthened_netherite_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("cool_stuff_to_mess_with:strengthened_netherite_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("cool_stuff_to_mess_with:strengthened_netherite_armor_boots")
	public static final Item boots = null;
	public StrengthenedNetheriteArmorItem(CoolStuffToMessWithModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{20, 60, 50, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 90;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "strengthened_netherite_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/strengthenednetherite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("strengthened_netherite_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/strengthenednetherite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("strengthened_netherite_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/strengthenednetherite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("strengthened_netherite_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/strengthenednetherite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("strengthened_netherite_armor_boots"));
	}
}
