package com.bedrockminer.tutorial.block;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public final class ModBlocks {

    public static Block tutorialBlock;

    public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", 
        		Material.glass), "tutorialBlock");
    }
}
