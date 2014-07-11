package com.bedrockminer.tutorial.world;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGenerators {
	
	public static final void init(){
		GameRegistry.registerWorldGenerator(new WorldGenSapphire(), 0);
	}
}
