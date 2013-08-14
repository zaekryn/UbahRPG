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
		ID.oreLegend_actual = config.getBlock("oreLegend", ID.oreLegend_default).getInt();
		ID.oreNatura_actual = config.getBlock("oreNatura", ID.oreNatura_default).getInt();
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
		ID.swordAxeGhostly_actual = config.getItem("swordAxeGhostly", ID.swordAxeGhostly_default).getInt() - 256;
		ID.swordAxeUnicorn_actual = config.getItem("swordAxeUnicorn", ID.swordAxeUnicorn_default).getInt() - 256;
		//
		ID.swordSpearMultisoul_actual = config.getItem("swordSpearMultisoul", ID.swordSpearMultisoul_default).getInt() - 256;
		ID.swordScytheCandycane_actual = config.getItem("swordScytheCandycane", ID.swordScytheCandycane_default).getInt() - 256;
		ID.swordScytheSatyr_actual = config.getItem("swordScytheSatyr", ID.swordScytheSatyr_default).getInt() - 256;
		ID.swordScytheNether_actual = config.getItem("swordScytheNether", ID.swordScytheNether_default).getInt() - 256;
		ID.swordSickeningSickle_actual = config.getItem("swordSickeningSickle", ID.swordSickeningSickle_default).getInt() - 256;
		ID.swordDaggerUnicorn_actual = config.getItem("swordDaggerUnicorn", ID.swordDaggerUnicorn_default).getInt() - 256;
		ID.swordExcalibur_actual = config.getItem("swordExcalibur", ID.swordExcalibur_default).getInt() - 256;
		ID.swordGhost_actual = config.getItem("swordGhost", ID.swordGhost_default).getInt() - 256;
		ID.swordOranian_actual = config.getItem("swordOranian", ID.swordOranian_default).getInt() - 256;
		ID.swordUnicornPitchfork_actual = config.getItem("swordUnicornPitchfork", ID.swordUnicornPitchfork_default).getInt() - 256;
		ID.swordDaggerUltimite_actual = config.getItem("swordDaggerUltimite", ID.swordDaggerUltimite_default).getInt() - 256;
		ID.swordDaggerBasilisk_actual = config.getItem("swordDaggerBasilisk", ID.swordDaggerBasilisk_default).getInt() - 256;
		ID.swordGlownFury_actual = config.getItem("swordGlownFury", ID.swordGlownFury_default).getInt() - 256;
		ID.swordFlailDiamond_actual = config.getItem("swordFlailDiamond", ID.swordFlailDiamond_default).getInt() - 256;
		ID.swordFlailIron_actual = config.getItem("swordFlailIron", ID.swordFlailIron_default).getInt() - 256;
		ID.swordPhoenixone_actual = config.getItem("swordPhoenixone", ID.swordPhoenixone_default).getInt() - 256;
		ID.swordKrakenone_actual = config.getItem("swordKrakenone", ID.swordKrakenone_default).getInt() - 256;
		ID.swordImpone_actual = config.getItem("swordImpone", ID.swordImpone_default).getInt() - 256;
		ID.swordLightning_actual = config.getItem("swordLightning", ID.swordLightning_default).getInt() - 256;
		ID.swordLegend_actual = config.getItem("swordLegend", ID.swordLegend_default).getInt() - 256;
		ID.swordShining_actual = config.getItem("swordShining", ID.swordShining_default).getInt() - 256;
		ID.swordZombie_actual = config.getItem("swordZombie", ID.swordZombie_default).getInt() - 256;
		ID.swordDirt_actual = config.getItem("swordDirt", ID.swordDirt_default).getInt() - 256;
		ID.swordIce_actual = config.getItem("swordIce", ID.swordIce_default).getInt() - 256;
		ID.swordWeird_actual = config.getItem("swordWeird", ID.swordWeird_default).getInt() - 256;
		ID.swordNatura_actual = config.getItem("swordNatura", ID.swordNatura_default).getInt() - 256;
		ID.swordDim_actual = config.getItem("swordDim", ID.swordDim_default).getInt() - 256;
		ID.swordEnder_actual = config.getItem("swordEnder", ID.swordEnder_default).getInt() - 256;
		ID.swordGlass_actual = config.getItem("swordGlass", ID.swordGlass_default).getInt() - 256;
		ID.swordCH_actual = config.getItem("swordCH", ID.swordCH_default).getInt() - 256;
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
		ID.rodGlowing_actual = config.getItem("rodGlowing", ID.rodGlowing_default).getInt() - 256;
		ID.crystalGhost_actual = config.getItem("crystalGhost", ID.crystalGhost_default).getInt() - 256;
		ID.digiron_actual = config.getItem("digiron", ID.digiron_default).getInt() - 256;
		ID.phoenixone_actual = config.getItem("phoenixone", ID.phoenixone_default).getInt() - 256;
		ID.krakenone_actual = config.getItem("krakenone", ID.krakenone_default).getInt() - 256;
		ID.impone_actual = config.getItem("impone", ID.impone_default).getInt() - 256;
		ID.electricite_actual = config.getItem("electricite", ID.electricite_default).getInt() - 256;
		ID.ingotLegend_actual = config.getItem("ingotLegend", ID.ingotLegend_default).getInt() - 256;
		ID.crystalElectric_actual = config.getItem("crystalElectric", ID.crystalElectric_default).getInt() - 256;
		ID.crystalRotten_actual = config.getItem("crystalRotten", ID.crystalRotten_default).getInt() - 256;
		ID.shardWeird_actual = config.getItem("shardWeird", ID.shardWeird_default).getInt() - 256;
		ID.ingotNatura_actual = config.getItem("ingotNatura", ID.ingotNatura_default).getInt() - 256;
		ID.crystalDim_actual = config.getItem("crystalDim", ID.crystalDim_default).getInt() - 256;
		ID.soulmite_actual = config.getItem("soulmite", ID.soulmite_default).getInt() - 256;
		//
		ID.candy_actual = config.getItem("candy", ID.candy_default).getInt() - 256;
		
		config.save();
		
		UbahRPG.oceaniaBiome = new BiomeGenOceania(64).setBiomeName("Oceania");
	}
}
