package ubahRPG;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;


public class EntityUnicorn extends EntityMobHostile
{


public EntityUnicorn(World par1World)
{
super(par1World);
setSize(1.2F, 2.2F);
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
this.tasks.addTask(4, new EntityAILookIdle(this));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
}

protected void func_110147_ax()
{
	
	
super.func_110147_ax();
// Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(40.0D);
//Follow Range - default 32.0D - min 0.0D - max 2048.0D
this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(8.0D);
// Knockback Resistance - default 0.0D - min 0.0D - max 1.0D
this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(0.0D);
// Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5000D);
// Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(6.0D);


}




/**
* Returns the sound this mob makes while it's alive.
*/
protected String getLivingSound()
{
return "mob.horse.say";
}

/**
* Returns the sound this mob makes when it is hurt.
*/
protected String getHurtSound()
{
return "mob.horse.hit";
}

/**
* Returns the sound this mob makes on death.
*/
protected String getDeathSound()
{
return "mob.horse.death";
}

protected float getSoundVolume()
{
return 0.6F;
}

protected void playStepSound(int par1, int par2, int par3, int par4)
{
    this.playSound("mob.horse.gallop", 0.15F, 1.0F);
}

public EnumCreatureAttribute getCreatureAttribute()
{
return EnumCreatureAttribute.UNDEFINED;
}


public boolean getCanSpawnHere()
{
return this.worldObj.difficultySetting > 0 && super.getCanSpawnHere();
}

protected int getDropItemId()
{
return UbahRPG.unicornHorn.itemID;
}

protected boolean isAIEnabled()
{
return true;
}





}










