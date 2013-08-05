package ubahRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenMushroomIsland;
import net.minecraft.world.biome.BiomeGenOcean;

public class BiomeGenOceania extends BiomeGenMushroomIsland {

	
	
	public BiomeGenOceania(int par1)
	{
		super(par1);
		this.topBlock = (byte)Block.grass.blockID;
	}
}
