package com.bedrockminer.tutorial.tools;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {
	
	public static Item ECCAxe;
	public static Item ECCPickAxe;
	public static Item ECCSword;
	public static Item ECCShovel;
	public static Item ECCHoe;
	public static ToolMaterial ECC = EnumHelper.addToolMaterial
			("ECC", 3, 2000, 10.0f, 5.0f, 15);
	
	public static final void init(){
		ECCAxe = new ECCAxe(ECC).setUnlocalizedName("jasperaxe").
        		setCreativeTab(Main.tabCustom).setTextureName
        		(Main.MODID + ":jasperaxe");
		ECCShovel = new ECCShovel(ECC).setUnlocalizedName("jaspershovel").
        		setCreativeTab(Main.tabCustom).setTextureName
        		(Main.MODID + ":jaspershovel");
		ECCPickAxe = new ECCPickAxe(ECC).setUnlocalizedName("jasperpick").
        		setCreativeTab(Main.tabCustom).setTextureName
        		(Main.MODID + ":jasperpick");
		ECCHoe = new ECCHoe(ECC).setUnlocalizedName("jasperpick").
        		setCreativeTab(Main.tabCustom).setTextureName
        		(Main.MODID + ":jasperpick");
		ECCSword = new ECCSword(ECC).setUnlocalizedName("jaspersword").
        		setCreativeTab(Main.tabCustom).setTextureName
        		(Main.MODID + ":jaspersword");
		
		GameRegistry.registerItem(ECCAxe, "ECC Axe");
		GameRegistry.registerItem(ECCHoe, "ECC Hoe");
		GameRegistry.registerItem(ECCPickAxe, "ECC PickAxe");
		GameRegistry.registerItem(ECCShovel, "ECC Shovel");
		GameRegistry.registerItem(ECCSword, "ECC Sword");
		
	}
}
