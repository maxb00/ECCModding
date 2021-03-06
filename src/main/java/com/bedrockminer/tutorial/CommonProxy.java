package com.bedrockminer.tutorial;

import com.bedrockminer.tutorial.armor.SapphireItems;
import com.bedrockminer.tutorial.block.ModBlocks;
import com.bedrockminer.tutorial.crafting.ModCrafting;
import com.bedrockminer.tutorial.item.ModItems;
import com.bedrockminer.tutorial.smelting.ModSmelting;
import com.bedrockminer.tutorial.tools.ModTools;
import com.bedrockminer.tutorial.world.ModGenerators;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModBlocks.init();
        ModItems.init();
        ModCrafting.init();
        ModTools.init();
        ModSmelting.init();
        SapphireItems.init();
        ModGenerators.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
