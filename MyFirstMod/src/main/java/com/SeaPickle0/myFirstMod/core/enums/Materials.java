package com.SeaPickle0.myFirstMod.core.enums;

import java.util.function.Supplier;

import com.SeaPickle0.myFirstMod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum Materials implements IItemTier {
	   
	STEEL(2, 500, 7.0F, 2.5F, 14, () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
	
	
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;

	private Materials(int levelIn, int usesIn, float speedIn, float damageIn, int enchantValueIn, Supplier<Ingredient> repairIngredientIn ) {
		this.level = levelIn;
		this.uses = usesIn;
		this.speed = speedIn;
		this.damage = damageIn;
		this.enchantmentValue = enchantValueIn;
		this.repairIngredient = new LazyValue<>(repairIngredientIn);
	}

	
	@Override
	public int getUses() {
	   return this.uses;
	}
	
	@Override
    public float getSpeed() {
	   return this.speed;
	}
	
	@Override
	public float getAttackDamageBonus() {
	   return this.damage;
	}
	
	@Override
	public int getLevel() {
		return this.level;
	}
	
	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}
	
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}
