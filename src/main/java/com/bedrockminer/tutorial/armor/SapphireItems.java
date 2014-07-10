package com.bedrockminer.tutorial.armor;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class SapphireItems {
	
    public static ArmorMaterial enumArmorMaterialSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 50, new int[] {5, 10, 8, 3}, 30);
	

    public static Item helmetSapphire;
    public static Item chestplateSapphire;
    public static Item legsSapphire;    
    public static Item bootsSapphire; 
	
	public static void init(){
		
		RenderingRegistry.addNewArmourRendererPrefix("5");
		
		
    	helmetSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 0).setUnlocalizedName("helmetSapphire").setCreativeTab(Main.tabCustom);
    	chestplateSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 1).setUnlocalizedName("chestplateSapphire").setCreativeTab(Main.tabCustom);
    	legsSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 2).setUnlocalizedName("legsSapphire").setCreativeTab(Main.tabCustom);
    	bootsSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 3).setUnlocalizedName("bootsSapphire").setCreativeTab(Main.tabCustom);
    	GameRegistry.registerItem(helmetSapphire, "helmetSapphire");
    	GameRegistry.registerItem(chestplateSapphire, "chestplateSapphire");
    	GameRegistry.registerItem(legsSapphire, "legsSapphire");
    	GameRegistry.registerItem(bootsSapphire, "bootsSapphire");
	}
	

}

