package com.bedrockminer.tutorial.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ECCHoe extends ItemHoe {

	public ECCHoe(ToolMaterial e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		
		player.addExperience(10);
		double flyX=1;
		double flyY=1;
		double flyZ=1;
		if(player.getLookVec().xCoord<0){
			flyX=flyX*-1;
		}
		if(player.getLookVec().yCoord<0){
			flyY=flyY*-1;
		}
		if(player.getLookVec().zCoord<0){
			flyZ=flyZ*-1;
		}
		player.addVelocity(flyX, flyY, flyZ);
		return item;
	}
	

}
