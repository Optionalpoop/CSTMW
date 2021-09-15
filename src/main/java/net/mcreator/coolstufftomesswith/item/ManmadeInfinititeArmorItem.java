
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.coolstufftomesswith.procedures.StrengthProcedure;
import net.mcreator.coolstufftomesswith.procedures.Speed_BoostProcedure;
import net.mcreator.coolstufftomesswith.procedures.Night_VisionProcedure;
import net.mcreator.coolstufftomesswith.procedures.Jump_BoostProcedure;
import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

import java.util.Map;
import java.util.HashMap;

@CoolStuffToMessWithModElements.ModElement.Tag
public class ManmadeInfinititeArmorItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("cool_stuff_to_mess_with:manmade_infinitite_armor_boots")
	public static final Item boots = null;
	public ManmadeInfinititeArmorItem(CoolStuffToMessWithModElements instance) {
		super(instance, 21);
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
				return new int[]{20, 10, 10, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 100;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ManmadeInfinititeItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "manmade_infinitite_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/manmadeinfinitite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Night_VisionProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("manmade_infinitite_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/manmadeinfinitite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					StrengthProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("manmade_infinitite_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/manmadeinfinitite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Speed_BoostProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("manmade_infinitite_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/manmadeinfinitite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Jump_BoostProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("manmade_infinitite_armor_boots"));
	}
}
