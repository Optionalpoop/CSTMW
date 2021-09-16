package net.mcreator.coolstufftomesswith.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.coolstufftomesswith.CoolStuffToMessWithMod;

import java.util.Map;

public class FloatyProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CoolStuffToMessWithMod.LOGGER.warn("Failed to load dependency entity for procedure Floaty!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 10, (int) 1));
	}
}
