package ubahRPG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemEdible extends ItemFood{

	public ItemEdible(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par4);
        
    }

    public ItemEdible(int par1, int par2, boolean par3)
    {
        this(par1, par2, 0.6F, par3);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
