package ubahRPG;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeBasic extends ItemPickaxe{

	 public ItemPickaxeBasic(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	  this.setCreativeTab(UbahRPG.tabGeneral);
	 }
	 
	 public void registerIcons(IconRegister par1IconRegister)
	    {
	    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + "tools/" + (this.getUnlocalizedName().substring(5)));
	    }

}
