package ubahRPG;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUIBook extends GuiScreen
{
	protected ResourceLocation textureBook =  new ResourceLocation("ubgms_rpg", "textures/gui/book.png");
	
	public GUIBook(EntityPlayer player)
	{
		
	}

	
	
	
	protected int xSize = 512;
	protected int ySize = 336;
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        
    }
	
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.func_110434_K().func_110577_a(textureBook);
        int posX = (this.width - xSize) / 2;
        int posY = (this.height - ySize) / 2;
        drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);
    }
	
	public boolean doesGuiPauseGame()
    {
        return false;
    }
	
}
