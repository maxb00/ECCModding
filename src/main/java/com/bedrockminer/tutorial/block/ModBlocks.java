package com.bedrockminer.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block tutorialBlock;
    public static Block titaniumOre;

    public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", 
        		Material.glass), "tutorialBlock");
        GameRegistry.registerBlock(titaniumOre = new TitaniumOre("titanium_ore", Material.rock), "titaniumOre");
    }
}
