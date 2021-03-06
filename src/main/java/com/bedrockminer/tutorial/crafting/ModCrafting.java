package com.bedrockminer.tutorial.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.bedrockminer.tutorial.block.ModBlocks;
import com.bedrockminer.tutorial.item.ModItems;
import com.bedrockminer.tutorial.tools.ModTools;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static final void init() {

		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.tutorialItem});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(ModItems.TitaniumIng), new Object[] {"XXX", 'X', ModItems.titaniumDust});
	}

}
