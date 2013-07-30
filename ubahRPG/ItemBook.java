package ubahRPG;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBook extends ItemBasic
{
	public ItemBook(int id)
    {
          super(id);       
    }
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		
		player.openGui(UbahRPG.instance, 1, world, 0, 0, 0);
			return itemstack;
	}
	
}
