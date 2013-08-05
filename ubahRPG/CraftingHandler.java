package ubahRPG;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler
{

@Override
public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
{
	
if (item.itemID == UbahRPG.swordCandycane.itemID)
{
player.addStat(UbahRPG.URPG_elfsForge, 1);
}

if (item.itemID == UbahRPG.swordMagmaBlaze.itemID)
{
player.addStat(UbahRPG.URPG_bladeOfHeat, 1);
}

if (item.itemID == UbahRPG.swordBasiliskFear.itemID)
{
player.addStat(UbahRPG.URPG_aSnakesEqual, 1);
}

if (item.itemID == UbahRPG.swordVampirialVanquish.itemID)
{
player.addStat(UbahRPG.URPG_vampirialWeaponry, 1);
}

if (item.itemID == UbahRPG.weaponsForge.blockID)
{
player.addStat(UbahRPG.URPG_advancedCrafting, 1);
}

if (item.itemID == UbahRPG.pickUltimite.itemID)
{
player.addStat(UbahRPG.URPG_toolery, 1);
}

if (item.itemID == UbahRPG.swordUltimite.itemID)
{
player.addStat(UbahRPG.URPG_ultiblade, 1);
}

if (item.itemID == UbahRPG.orcskinHelmet.itemID)
{
player.addStat(UbahRPG.URPG_armorOrcskin, 1);
}

if (item.itemID == UbahRPG.orcskinChestplate.itemID)
{
player.addStat(UbahRPG.URPG_armorOrcskin, 1);
}

if (item.itemID == UbahRPG.orcskinLeggings.itemID)
{
player.addStat(UbahRPG.URPG_armorOrcskin, 1);
}

if (item.itemID == UbahRPG.orcskinBoots.itemID)
{
player.addStat(UbahRPG.URPG_armorOrcskin, 1);
}

if (item.itemID == UbahRPG.swordKraken.itemID)
{
player.addStat(UbahRPG.URPG_swordOfTheSea, 1);
}

if (item.itemID == UbahRPG.swordUnicorn.itemID)
{
player.addStat(UbahRPG.URPG_pinkSword, 1);
}

if (item.itemID == UbahRPG.uniHelmet.itemID)
{
player.addStat(UbahRPG.URPG_armorUnicornite, 1);
}

if (item.itemID == UbahRPG.uniChestplate.itemID)
{
player.addStat(UbahRPG.URPG_armorUnicornite, 1);
}

if (item.itemID == UbahRPG.uniLeggings.itemID)
{
player.addStat(UbahRPG.URPG_armorUnicornite, 1);
}

if (item.itemID == UbahRPG.uniBoots.itemID)
{
player.addStat(UbahRPG.URPG_armorUnicornite, 1);
}

if (item.itemID == UbahRPG.swordUbah.itemID)
{
player.addStat(UbahRPG.URPG_customization, 1);
}
}

@Override
public void onSmelting(EntityPlayer player, ItemStack item)
{

}

}