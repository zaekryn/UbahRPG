package ubahRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenMushroomIsland;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenOceania extends BiomeGenBase {

	
	
	public BiomeGenOceania(int par1)
	{
		super(par1);
		this.theBiomeDecorator.mushroomsPerChunk = 1;
        this.theBiomeDecorator.bigMushroomsPerChunk = 1;
		this.topBlock = (byte)Block.waterStill.blockID;
		this.fillerBlock = (byte)Block.waterStill.blockID;
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableWaterCreatureList.add(new SpawnListEntry(EntitySquid.class, 10, 4, 4));
	}
}
