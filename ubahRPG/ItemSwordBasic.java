package ubahRPG;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class ItemSwordBasic extends ItemSword{

	 public ItemSwordBasic(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	  this.setCreativeTab(UbahRPG.tabUbahRPG);
	 }
	 
	 public void registerIcons(IconRegister par1IconRegister)
	    {
	    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)));
	    }

}
