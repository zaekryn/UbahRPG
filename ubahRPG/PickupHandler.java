package ubahRPG;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import cpw.mods.fml.common.IPickupNotifier;

public class PickupHandler implements IPickupNotifier
{
@Override
public void notifyPickup(EntityItem item, EntityPlayer player)
{
	
if(item.getEntityItem().itemID == UbahRPG.ingotUltimite.itemID)
{
player.addStat(UbahRPG.URPG_ultimite, 1);
}

if(item.getEntityItem().itemID == UbahRPG.orcSkin.itemID)
{
player.addStat(UbahRPG.URPG_orcskin, 1);
}

}
}
