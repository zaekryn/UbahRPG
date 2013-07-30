package ubahRPG;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCore extends Item
{
       public ItemCore(int id)
       {
             super(id);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
