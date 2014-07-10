package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

    public static Item tutorialItem;
    public static Item tutFood;
    public static Item TitaniumIng;
    public static Item titaniumDust;
    public static Item titaniumRod;

    public static final void init() {
        tutorialItem = new Item().setUnlocalizedName("tutorialItem").
        		setCreativeTab(Main.tabCustom).setTextureName(Main.MODID + ":tutorialItem");
        GameRegistry.registerItem(tutorialItem, "tutorialItem");
        tutFood = new TutFood(2, true);
        GameRegistry.registerItem(tutFood, "Cheeseburger");
        TitaniumIng = new Item().setUnlocalizedName("titaniumIngot").
        		setCreativeTab(Main.tabCustom).setTextureName(Main.MODID + ":titaniumIngot");
        titaniumDust = new Item().setUnlocalizedName("titaniumDust").
        		setCreativeTab(Main.tabCustom).setTextureName(Main.MODID + ":titaniumDust");
        titaniumRod=new Item().setUnlocalizedName("titaniumRod")
        		.setCreativeTab(Main.tabCustom).setTextureName(Main.MODID + ":titaniumRod");
        GameRegistry.registerItem(TitaniumIng, "TitaniumIngot");
        GameRegistry.registerItem(titaniumDust, "TitaniumDust");
        GameRegistry.registerItem(titaniumRod, "TitaniumRod");
    }

}
