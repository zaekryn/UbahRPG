package ubahRPG;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSwordExcal extends ItemSwordBasic
{
    private float weaponDamage;
    private final EnumToolMaterial toolMaterial;
    private Icon Updating;
    
    
    public ItemSwordExcal(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
    }

    
    
    public boolean hitEntity(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase entityliving1)
    {
      itemstack.damageItem(100, entityliving1);
      return true;
    }
    
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        
        if(par1ItemStack.getItemDamage() > 0)
        {
            par1ItemStack.damageItem(-5, par3EntityPlayer);
        }
        else
        {
        	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        	par2World.playSoundAtEntity(par3EntityPlayer, "ubgms_rpg:random.drawSword", 1.0F, 1.0F);
        }
        return par1ItemStack;
    }
    
    
}




