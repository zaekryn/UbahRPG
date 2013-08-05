package ubahRPG;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static void init(File configFile) 
	{
		Configuration config = new Configuration(configFile);

		config.load();
		
		UbahRPG.biomeOceaniaGen = config.get("Biome To Generate", "oceaniaBiome", true).getBoolean(false);
		UbahRPG.addToDefault = config.get("Biome Settings", "Add Biomes To Default World", false).getBoolean(false);
		
		
		ID.weaponsForge_actual = config.getBlock("weaponsForge", ID.weaponsForge_default).getInt();
		ID.activatorFire_actual = config.getBlock("activatorFire", ID.activatorFire_default).getInt();
		//
		ID.oreUltimite_actual = config.getBlock("oreUltimite", ID.oreUltimite_default).getInt();
		ID.oreUnicornite_actual = config.getBlock("oreUnicornite", ID.oreUnicornite_default).getInt();
		//
		ID.candyCane_actual = config.getBlock("candyCane", ID.candyCane_default).getInt();
		//
		ID.portalOceania_actual = config.getBlock("portalOceania", ID.portalOceania_default).getInt();

		ID.orcskinHelmet_actual = config.getItem("orcskinHelmet", ID.orcskinHelmet_default).getInt() - 256;
		ID.orcskinChestplate_actual = config.getItem("orcskinChestplate", ID.orcskinChestplate_default).getInt() - 256;
		ID.orcskinLeggings_actual = config.getItem("orcskinLeggings", ID.orcskinLeggings_default).getInt() - 256;
		ID.orcskinBoots_actual = config.getItem("orcskinBoots", ID.orcskinBoots_default).getInt() - 256;
		//
		ID.camoHelmet_actual = config.getItem("camoHelmet", ID.camoHelmet_default).getInt() - 256;
		ID.camoChestplate_actual = config.getItem("camoChestplate", ID.camoChestplate_default).getInt() - 256;
		ID.camoLeggings_actual = config.getItem("camoLeggings", ID.camoLeggings_default).getInt() - 256;
		ID.camoBoots_actual = config.getItem("camoBoots", ID.camoBoots_default).getInt() - 256;
		//
		ID.uniHelmet_actual = config.getItem("uniHelmet", ID.uniHelmet_default).getInt() - 256;
		ID.uniChestplate_actual = config.getItem("uniChestplate", ID.uniChestplate_default).getInt() - 256;
		ID.uniLeggings_actual = config.getItem("uniLeggings", ID.uniLeggings_default).getInt() - 256;
		ID.uniBoots_actual = config.getItem("uniBoots", ID.uniBoots_default).getInt() - 256;
		//
		ID.airMask_actual = config.getItem("airMask", ID.airMask_default).getInt() - 256;
		//
		ID.pickUltimite_actual = config.getItem("pickUltimite", ID.pickUltimite_default).getInt() - 256;
		//
		ID.swordMagmaBlaze_actual = config.getItem("swordMagmaBlaze", ID.swordMagmaBlaze_default).getInt() - 256;
		ID.swordCandycane_actual = config.getItem("swordCandycane", ID.swordCandycane_default).getInt() - 256;
		ID.swordBasiliskFear_actual = config.getItem("swordBasiliskFear", ID.swordBasiliskFear_default).getInt() - 256;
		ID.swordVampirialVanquish_actual = config.getItem("swordVampirialVanquish", ID.swordVampirialVanquish_default).getInt() - 256;
		ID.swordUltimite_actual = config.getItem("swordUltimite", ID.swordUltimite_default).getInt() - 256;
		ID.swordKraken_actual = config.getItem("swordKraken", ID.swordKraken_default).getInt() - 256;
		ID.swordUbah_actual = config.getItem("swordUbah", ID.swordUbah_default).getInt() - 256;
		ID.swordUnicorn_actual = config.getItem("swordUnicorn", ID.swordUnicorn_default).getInt() - 256;
		//
		ID.bowGhost_actual = config.getItem("bowGhost", ID.bowGhost_default).getInt() - 256;
		ID.bowPhoenix_actual = config.getItem("bowPhoenix", ID.bowPhoenix_default).getInt() - 256;
		//
		ID.basiliskFang_actual = config.getItem("basiliskFang", ID.basiliskFang_default).getInt() - 256;
		ID.shardPeppermint_actual = config.getItem("shardPeppermint", ID.shardPeppermint_default).getInt() - 256;
		ID.crystalCandycane_actual = config.getItem("crystalCandycane", ID.crystalCandycane_default).getInt() - 256;
		ID.orcSkin_actual = config.getItem("orcSkin", ID.orcSkin_default).getInt() - 256;
		ID.shardDarkness_actual = config.getItem("shardDarkness", ID.shardDarkness_default).getInt() - 256;
		ID.impSoul_actual = config.getItem("impSoul", ID.impSoul_default).getInt() - 256;
		ID.yetiFur_actual = config.getItem("yetiFur", ID.yetiFur_default).getInt() - 256;
		ID.shardGhost_actual = config.getItem("shardGhost", ID.shardGhost_default).getInt() - 256;
		ID.centaurRing_actual = config.getItem("centaurRing", ID.centaurRing_default).getInt() - 256;
		ID.gryphonFeather_actual = config.getItem("gryphonFeather", ID.gryphonFeather_default).getInt() - 256;
		ID.crystalSatyr_actual = config.getItem("crystalSatyr", ID.crystalSatyr_default).getInt() - 256;
		ID.krakenScale_actual = config.getItem("krakenScale", ID.krakenScale_default).getInt() - 256;
		ID.crystalNether_actual = config.getItem("crystalNether", ID.crystalNether_default).getInt() - 256;
		ID.ingotUltimite_actual = config.getItem("ingotUltimite", ID.ingotUltimite_default).getInt() - 256;
		ID.krakenSoul_actual = config.getItem("krakenSoul", ID.krakenSoul_default).getInt() - 256;
		ID.phoenixSoul_actual = config.getItem("phoenixSoul", ID.phoenixSoul_default).getInt() - 256;
		ID.ash_actual = config.getItem("ash", ID.ash_default).getInt() - 256;
		ID.unicornHorn_actual = config.getItem("unicornHorn", ID.unicornHorn_default).getInt() - 256;
		ID.ingotUnicornite_actual = config.getItem("ingotUnicornite", ID.ingotUnicornite_default).getInt() - 256;
		ID.activator_actual = config.getItem("activator", ID.activator_default).getInt() - 256;
		//
		ID.candy_actual = config.getItem("candy", ID.candy_default).getInt() - 256;
		
		config.save();
		
		UbahRPG.oceaniaBiome = new BiomeGenOceania(64).setBiomeName("Oceania");
	}
}
