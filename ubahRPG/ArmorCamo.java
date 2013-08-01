package ubahRPG;

import net.minecraft.block.BlockDispenser;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArmorCamo extends ItemArmor
{
    

    
    
    
    

    public ArmorCamo(int par1, EnumArmorMaterial par2EnumArmorMaterial,
    		int par3, int par4)
    {
    	super(par1, par2EnumArmorMaterial, par3, par4);
    	this.setCreativeTab(UbahRPG.tabUbahRPG);
        
    }

    

    

    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
    if(itemID == UbahRPG.camoHelmet.itemID  || itemID == UbahRPG.camoChestplate.itemID || itemID == UbahRPG.camoBoots.itemID)
    {
    return "ubgms_rpg:textures/armor/camo/camo_1.png";
    }

    if(itemID == UbahRPG.camoLeggings.itemID)
    {
    	return "ubgms_rpg:textures/armor/camo/camo_2.png";
    }

    else return null;
    }
    

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":"  + "armor/" + (this.getUnlocalizedName().substring(5)));
    }

   
}

