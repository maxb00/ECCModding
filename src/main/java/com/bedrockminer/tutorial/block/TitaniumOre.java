package com.bedrockminer.tutorial.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.bedrockminer.tutorial.Main;
import com.bedrockminer.tutorial.item.ModItems;

public class TitaniumOre extends Block {

    public TitaniumOre(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(Main.tabCustom);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeStone);
    }
    public Item getItemDropped(int par1, Random rand, int par2){
		return ModItems.titaniumDust;
	}

	public int quantityDropped(Random rand){
		return rand.nextInt(3) + 1;
	}
}
