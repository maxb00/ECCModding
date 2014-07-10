package com.bedrockminer.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
		
        public static final String MODID = "tutorial";
        public static final String MODNAME = "Tutorial Mod";
        public static final String VERSION = "1.0.0";
        
        
        @Instance
        public static Main instance = new Main();
        
        public static CreativeTabs tabCustom = new CreativeTabs("tabExample")
        {
        public Item getTabIconItem()
        {
        return Items.bed;
        }
        };
        
        @SidedProxy(clientSide="com.bedrockminer.tutorial.ClientProxy", serverSide="com.bedrockminer.tutorial.ServerProxy")
        public static CommonProxy proxy;

        /**
         * Run before anything else. Read your config, create blocks, items, etc, and
         * register them with the GameRegistry.
         */
        @EventHandler
        public void preInit(FMLPreInitializationEvent e) {
            this.proxy.preInit(e);
        }
        /**
         * Do your mod setup. Build whatever data structures you care about. Register recipes.
         */
        @EventHandler
        public void init(FMLInitializationEvent e) {
            this.proxy.init(e);
        }

        /**
         * Handle interaction with other mods, complete your setup based on this.
         */
        @EventHandler
        public void postInit(FMLPostInitializationEvent e) {
            this.proxy.postInit(e);
        }
    }
