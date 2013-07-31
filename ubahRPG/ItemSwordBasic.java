package ubahRPG;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

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
	 
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        par2World.playSoundAtEntity(par3EntityPlayer, "ubgms_rpg:random.drawSword", 1.0F, 1.0F);
	        return par1ItemStack;
	    }

}
