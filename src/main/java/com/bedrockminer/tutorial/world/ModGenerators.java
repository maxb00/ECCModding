package com.bedrockminer.tutorial.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModGenerators {

	public static final void init(){
		GameRegistry.registerWorldGenerator(new WorldGenSapphire(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenTitanium(), 0);
	}
}
