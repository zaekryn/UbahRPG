package ubahRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSwordEnder extends ItemSwordBasic
{
    private float weaponDamage;
    private final EnumToolMaterial toolMaterial;

    public ItemSwordEnder(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
    }

    public boolean hitEntity(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase entityliving1, World world)
    {
      itemstack.damageItem(1, entityliving1);
      return true;
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        
        if (par3EntityPlayer.isSneaking())
        {
        	par2World.playSoundAtEntity(par3EntityPlayer, "mob.endermen.portal", 1.0F, 1.0F);
            par2World.spawnEntityInWorld(new EntityEnderPearl(par2World, par3EntityPlayer));
            par1ItemStack.damageItem(20, par3EntityPlayer);
        }
        else
        {
        	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
            par2World.playSoundAtEntity(par3EntityPlayer, "ubgms_rpg:random.drawSword", 1.0F, 1.0F);
        }
        return par1ItemStack;
    }
    
}



