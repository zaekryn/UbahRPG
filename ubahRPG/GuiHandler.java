package ubahRPG;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

@Override
public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{

TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

switch(id)
{

case 0: return id == 0 && world.getBlockId(x, y, z) == UbahRPG.weaponsForge.blockID ? new ContainerForge(player.inventory, world, x, y, z) : null;

}
return null;
}

@Override
public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{

TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

switch(id)
{

case 0: return id == 0 && world.getBlockId(x, y, z) == UbahRPG.weaponsForge.blockID ? new GUIForge(player.inventory, world, x, y, z) : null;
case 1: return id == 1 ? new GUIBook(player) : null;
    
}


return null;

}
}
