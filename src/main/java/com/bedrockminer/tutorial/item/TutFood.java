package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TutFood extends ItemFood{

	public TutFood(int hunger, boolean wolfFood) {
		super(hunger, wolfFood);
		this.setUnlocalizedName("cheeseburger");
		this.setTextureName(Main.MODID+":cheeseburger");
		this.setCreativeTab(Main.tabCustom);
		this.setMaxStackSize(16);
		this.setAlwaysEdible();
	}
}
