package ubahRPG;

import java.util.Random;

import net.minecraft.block.material.Material;

public class BlockCandy extends BlockCore{

	public BlockCandy(int id, Material par2Material)
    {
          super(id, par2Material);
          this.setCreativeTab(UbahRPG.tabGeneral);
    }
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return UbahRPG.candy.itemID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
	
	
}
