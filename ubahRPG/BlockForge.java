package ubahRPG;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockForge extends BlockCore
{
	
	@SideOnly(Side.CLIENT)
    private Icon forgeIconTop;
	
       public BlockForge(int id)
       {
             super(id, Material.iron);
             this.setCreativeTab(UbahRPG.tabUbahRPG);
       }
      
       @SideOnly(Side.CLIENT)

       /**
        * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
        */
       public Icon getIcon(int par1, int par2)
       {
           return par1 == 1 ? this.forgeIconTop : (par1 == 0 ? this.forgeIconTop : (par1 != 2 && par1 != 4 ? this.blockIcon : this.blockIcon));
       }
       
       public void registerIcons(IconRegister par1IconRegister)
       {
    	   this.blockIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)));
           this.forgeIconTop = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
       }
       
       public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
       {
               if (!player.isSneaking())
               {
                       player.openGui(UbahRPG.instance, 0, var1, var2, var3, var4);
                       return true;
               }
               else
               {
                       return false;
               }
       }
     
}
