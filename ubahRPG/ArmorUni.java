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

public class ArmorUni extends ItemArmor{

private Object iconIndex;

public ArmorUni(int par1, EnumArmorMaterial par2EnumArmorMaterial,
int par3, int par4) {
super(par1, par2EnumArmorMaterial, par3, par4);
this.setCreativeTab(UbahRPG.tabArmor);
}

/**
*  To Add Armor Texture to Player when worn.
*/
@SideOnly(Side.CLIENT)
public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
{
if(itemID == UbahRPG.uniHelmet.itemID  || itemID == UbahRPG.uniChestplate.itemID || itemID == UbahRPG.uniBoots.itemID)
{
return "ubgms_rpg:textures/armor/uni/uni_1.png";
}

if(itemID == UbahRPG.uniLeggings.itemID)
{
	return "ubgms_rpg:textures/armor/uni/uni_2.png";
}

else return null;
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":" + "armor/" + (this.getUnlocalizedName().substring(5)));
}

}

