package ubahRPG;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.java.games.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorOrcSkin extends ItemArmor{

private Object iconIndex;

public ArmorOrcSkin(int par1, EnumArmorMaterial par2EnumArmorMaterial,
int par3, int par4) {
super(par1, par2EnumArmorMaterial, par3, par4);
this.setCreativeTab(UbahRPG.tabUbahRPG);
}

/**
*  To Add Armor Texture to Player when worn.
*/
public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
{
if(itemID == UbahRPG.orcskinHelmet.itemID  || itemID == UbahRPG.orcskinChestplate.itemID || itemID == UbahRPG.orcskinBoots.itemID)
{
return "ubgms_rpg:textures/armor/orcskin/orcskin_1.png";
}

if(itemID == UbahRPG.orcskinLeggings.itemID)
{
	return "ubgms_rpg:textures/armor/orcskin/orcskin_2.png";
}

else return null;
}


public void registerIcons(IconRegister par1IconRegister)
{
	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + (this.getUnlocalizedName().substring(5)));
}

}
