package com.bedrockminer.tutorial.smelting;

import com.bedrockminer.tutorial.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModSmelting {
	
	public static final void init(){
		GameRegistry.addSmelting(Items.redstone, new ItemStack(Items.cake, 3), 5f);
		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0F);
	}
}
