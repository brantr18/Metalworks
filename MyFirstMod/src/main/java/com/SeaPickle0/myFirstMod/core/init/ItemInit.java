package com.SeaPickle0.myFirstMod.core.init;

import com.SeaPickle0.myFirstMod.MyFirstMod;
import com.SeaPickle0.myFirstMod.core.enums.Materials;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);
	
	
	// Tools
	public static final RegistryObject<SwordItem> KATANA = ITEMS.register("katana", 
			() -> new SwordItem(Materials.STEEL, 2, 1.5f,
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", 
			() -> new PickaxeItem(Materials.STEEL, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", 
			() -> new ShovelItem(Materials.STEEL, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", 
			() -> new AxeItem(Materials.STEEL, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", 
			() -> new HoeItem(Materials.STEEL, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	
	// Foods
	public static final RegistryObject<Item> PB_J = ITEMS.register("pb_and_j",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(6).saturationMod(1.0f).build())));
	
	
	
	// Items
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("ingot_steel", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
	public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("dust_steel", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
	public static final RegistryObject<Item> IRON_DUST = ITEMS.register("dust_iron", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
	public static final RegistryObject<Item> CARBON_DUST = ITEMS.register("dust_carbon", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
	
	// Blocks
//	public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", 
//			() -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
}
