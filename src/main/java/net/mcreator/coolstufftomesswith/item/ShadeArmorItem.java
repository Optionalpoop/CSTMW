
package net.mcreator.coolstufftomesswith.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
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
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import net.mcreator.coolstufftomesswith.procedures.Night_VisionProcedure;
import net.mcreator.coolstufftomesswith.CoolStuffToMessWithModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@CoolStuffToMessWithModElements.ModElement.Tag
public class ShadeArmorItem extends CoolStuffToMessWithModElements.ModElement {
	@ObjectHolder("cool_stuff_to_mess_with:shade_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("cool_stuff_to_mess_with:shade_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("cool_stuff_to_mess_with:shade_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("cool_stuff_to_mess_with:shade_armor_boots")
	public static final Item boots = null;
	public ShadeArmorItem(CoolStuffToMessWithModElements instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 14;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 8;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COAL_BLOCK));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "shade_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Good for the dark..."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "cool_stuff_to_mess_with:textures/models/armor/shade_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
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
		}.setRegistryName("shade_armor_helmet"));
	}
}
