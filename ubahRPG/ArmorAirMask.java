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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArmorAirMask extends ItemArmor
{
    

    
    
    
    

    public ArmorAirMask(int par1, EnumArmorMaterial par2EnumArmorMaterial,
    		int par3, int par4)
    {
    	super(par1, par2EnumArmorMaterial, par3, par4);
    	this.setCreativeTab(UbahRPG.tabArmor);
        
    }

    

    

    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
    if(itemID == UbahRPG.airMask.itemID)
    {
    return "ubgms_rpg:textures/armor/other/airMask.png";
    }
    else return null;
    }
    

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	   this.itemIcon = par1IconRegister.registerIcon(UbahRPG.modid + ":"  + "armor/" + (this.getUnlocalizedName().substring(5)));
    }

    public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
    
    {
    	player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 0));
    	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 20, 0));
    }
   
}


