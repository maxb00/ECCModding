package com.bedrockminer.tutorial.block;

import java.util.Random;

import com.bedrockminer.tutorial.Main;
import com.bedrockminer.tutorial.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicBlock extends Block {

    public BasicBlock(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(Main.tabCustom);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
    }
    public Item getItemDropped(int par1, Random rand, int par2){
		return ModItems.tutorialItem;
	}

	public int quantityDropped(Random rand){
		return rand.nextInt(3) + 1;
	}
}
