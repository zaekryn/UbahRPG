package ubahRPG;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BowGhost extends BowBasic{

	
	
	public BowGhost(int par1)
	{
	super(par1);
	this.setMaxDamage(-1);
    this.setCreativeTab(UbahRPG.tabUbahRPG);
	}
	
	
	
	
@SideOnly(Side.CLIENT)
    
    private Icon[] Texture = new Icon[4];
    public void registerIcons(IconRegister iconRegister)
    
    {
    	
             itemIcon = iconRegister.registerIcon(UbahRPG.modid + ":" + "bow/" + (this.getUnlocalizedName().substring(5)) + "_0");
             for (int N = 0; N < 4; N++)
             {
                     this.Texture[N] = iconRegister.registerIcon(UbahRPG.modid + ":" + "bow/" + (this.getUnlocalizedName().substring(5)) + "_" + N);
                     
             }
    }
    public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
             if(player.getItemInUse() == null) return this.itemIcon;
             int time = stack.getMaxItemUseDuration() - useRemaining;
             if (time >= 18)
             {
                     return Texture[3];
             }
             else if (time > 13)
             {
                     return Texture[2];
             }
             else if (time > 0)
             {
                     return Texture[1];
             }             
             return Texture[0];
             }
    }
	
	

