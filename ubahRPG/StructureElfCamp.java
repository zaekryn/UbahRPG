/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package ubahRPG;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureElfCamp extends WorldGenerator
{
	
	 protected int[] GetValidSpawnBlocks() {
		  return new int[] {
		   Block.grass.blockID,
		   
		 
		  };
		 }

		  
	
	public StructureElfCamp() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		
		world.setBlock(i + 3, j + 1, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 1, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 1, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 1, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 2, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 2, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 2, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 2, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 3, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 3, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 3, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 3, j + 3, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 4, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 4, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 4, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 4, j + 1, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 1, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 2, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 2, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 3, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 3, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 4, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 4, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 4, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 4, j + 4, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 0, k + 3, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 0, k + 8, Block.blockSnow.blockID);
		world.setBlock(i + 5, j + 1, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 1, k + 5, Block.mobSpawner.blockID);
		world.setBlock(i + 5, j + 1, k + 6, Block.mobSpawner.blockID);
        
        TileEntityMobSpawner TEMS = (TileEntityMobSpawner)world.getBlockTileEntity(i + 5, j + 1, k + 5);
		TileEntityMobSpawner TEMS2 = (TileEntityMobSpawner)world.getBlockTileEntity(i + 5, j + 1, k + 6);
		
		if(TEMS !=null)
		{
			TEMS.getSpawnerLogic().setMobID("ubgms_rpg.Elf");
		}
		
		if(TEMS2 !=null)
		{
			TEMS2.getSpawnerLogic().setMobID("ubgms_rpg.Elf");
		}
        
		world.setBlock(i + 5, j + 1, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 2, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 2, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 3, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 3, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 4, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 4, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 5, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 5, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 5, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 5, j + 5, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 0, k + 3, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 0, k + 8, Block.blockSnow.blockID);
		world.setBlock(i + 6, j + 1, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 1, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 2, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 2, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 3, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 3, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 4, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 4, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 5, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 5, k + 5, Block.glowStone.blockID);
		world.setBlock(i + 6, j + 5, k + 6, Block.glowStone.blockID);
		world.setBlock(i + 6, j + 5, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 6, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 6, j + 6, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 0, k + 3, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 0, k + 8, Block.blockSnow.blockID);
		world.setBlock(i + 7, j + 1, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 1, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 2, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 2, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 3, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 3, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 4, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 4, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 5, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 5, k + 5, Block.glowStone.blockID);
		world.setBlock(i + 7, j + 5, k + 6, Block.glowStone.blockID);
		world.setBlock(i + 7, j + 5, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 6, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 7, j + 6, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 0, k + 3, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 0, k + 8, Block.blockSnow.blockID);
		world.setBlock(i + 8, j + 1, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 1, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 2, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 2, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 3, k + 2, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 3, k + 9, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 4, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 4, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 5, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 5, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 5, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 8, j + 5, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 0, k + 4, Block.blockSnow.blockID);
		world.setBlock(i + 9, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 9, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 9, j + 0, k + 7, Block.blockSnow.blockID);
		world.setBlock(i + 9, j + 1, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 1, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 2, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 2, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 3, k + 3, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 3, k + 8, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 4, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 4, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 4, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 9, j + 4, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 0, k + 5, Block.blockSnow.blockID);
		world.setBlock(i + 10, j + 0, k + 6, Block.blockSnow.blockID);
		world.setBlock(i + 10, j + 1, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 1, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 2, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 2, k + 7, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 3, k + 4, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 3, k + 5, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 3, k + 6, UbahRPG.candyCane.blockID);
		world.setBlock(i + 10, j + 3, k + 7, UbahRPG.candyCane.blockID);
		

		return true;
	}
}