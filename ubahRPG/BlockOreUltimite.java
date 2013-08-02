package ubahRPG;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockOreUltimite extends BlockCore
{
       public BlockOreUltimite(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(UbahRPG.tabGeneral);
       }
       
       public int idDropped(int par1, Random par2Random, int par3)
       {
           return UbahRPG.ingotUltimite.itemID;
       }

       /**
        * Returns the quantity of items to drop on block destruction.
        */
       public int quantityDropped(Random par1Random)
       {
           return 1;
       }
       
}
