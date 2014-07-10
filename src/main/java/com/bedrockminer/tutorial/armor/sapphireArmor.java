package com.bedrockminer.tutorial.armor;
import com.bedrockminer.tutorial.enchantments.ModEnchants;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class sapphireArmor extends ItemArmor{
	private String [] armourTypes = new String [] {"helmetSapphire", "chestplateSapphire", "legsSapphire", "bootsSapphire"};

	public sapphireArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(SapphireItems.helmetSapphire)|| stack.getItem().equals(SapphireItems.chestplateSapphire)|| stack.getItem().equals(SapphireItems.bootsSapphire)){
			return "tutorial:textures/armor/sapphire_1.png";
		}
		
		if(stack.getItem().equals(SapphireItems.legsSapphire)){
			return "tutorial:textures/armor/sapphire_2.png";
		}
		
		else return null;
	}
	
	@Override
	public void registerIcons(IIconRegister reg){
		if(this == SapphireItems.helmetSapphire)
			this.itemIcon = reg.registerIcon("tutorial:helmetSapphire");
		if(this == SapphireItems.chestplateSapphire)
			this.itemIcon = reg.registerIcon("tutorial:chestplateSapphire");
		if(this == SapphireItems.legsSapphire)
			this.itemIcon = reg.registerIcon("tutorial:legsSapphire");
		if(this == SapphireItems.bootsSapphire)
			this.itemIcon = reg.registerIcon("tutorial:bootsSapphire");
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(stack.getItem() == SapphireItems.bootsSapphire){
			int j = EnchantmentHelper.getEnchantmentLevel(ModEnchants.speedBoost.effectId, stack);
			if(j > 0){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
				player.setInvisible(true);
			}
		}
	}
}
	
	

