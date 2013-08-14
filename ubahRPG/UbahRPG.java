package ubahRPG;

import java.awt.Color;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = UbahRPG.modid, name = "UbahRPG", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class UbahRPG
{
       public static final String modid = "ubgms_rpg";
       
       @SidedProxy(clientSide = "ubahRPG.ClientProxyUbah", serverSide = "ubahRPG.CommonProxyUbah")
       public static CommonProxyUbah proxy;
       
       public static boolean addToDefault;
       public static boolean biomeOceaniaGen;
       
       @Instance(UbahRPG.modid)//<<<Must be the same as your modid
       public static UbahRPG instance;
       
       private GuiHandler guiHandler = new GuiHandler();
       
       public static int scythe = 250;
       public static int durfault = 300;
       
       static EnumToolMaterial magmablaze = EnumHelper.addToolMaterial("magmablaze", 1, 250, 2F, 26, 30);
       static EnumToolMaterial candycane = EnumHelper.addToolMaterial("candycane", 1, 200, 2F, 0, 30);
       static EnumToolMaterial basilisk = EnumHelper.addToolMaterial("basilisk", 1, 250, 2F, 26, 30);
       static EnumToolMaterial vanquish = EnumHelper.addToolMaterial("vanquish", 1, 500, 2F, 26, 30);
       static EnumToolMaterial kraken = EnumHelper.addToolMaterial("kraken", 1, 500, 2F, 8, 30);
       static EnumToolMaterial axeGhostly = EnumHelper.addToolMaterial("axeGhostly", 1, 200, 2F, 6, 30);
       static EnumToolMaterial axeUnicorn = EnumHelper.addToolMaterial("axeUnicorn", 1, 200, 2F, 7, 30);
       //
       static EnumToolMaterial multisoul = EnumHelper.addToolMaterial("multisoul", 1, 300, 2F, 36, 30);
       static EnumToolMaterial scytheCandy = EnumHelper.addToolMaterial("scytheCandy", 1, scythe, 2F, 4, 30);
       static EnumToolMaterial scytheSatyr = EnumHelper.addToolMaterial("scytheSatyr", 1, scythe, 2F, 6, 30);
       static EnumToolMaterial scytheNether = EnumHelper.addToolMaterial("scytheNether", 1, scythe, 2F, 8, 30);
       static EnumToolMaterial sick = EnumHelper.addToolMaterial("sick", 1, durfault, 2F, 2, 30);
       static EnumToolMaterial daggerUnicorn = EnumHelper.addToolMaterial("daggerUnicorn", 1, durfault, 2F, 1, 30);
       static EnumToolMaterial excal = EnumHelper.addToolMaterial("excal", 1, 800, 2F, 56, 30);
       static EnumToolMaterial ghost = EnumHelper.addToolMaterial("ghost", 1, durfault, 2F, 9, 30);
       static EnumToolMaterial oranian = EnumHelper.addToolMaterial("oranian", 1, durfault, 2F, 5, 30);
       static EnumToolMaterial pitchUnicorn = EnumHelper.addToolMaterial("pitchUnicorn", 1, durfault, 2F, 6, 30);
       static EnumToolMaterial daggerUltimite = EnumHelper.addToolMaterial("daggerUltimite", 1, durfault, 2F, 4, 30);
       static EnumToolMaterial daggerBasilisk = EnumHelper.addToolMaterial("daggerBasilisk", 1, durfault, 2F, 0, 30);
       static EnumToolMaterial fury = EnumHelper.addToolMaterial("fury", 1, durfault, 2F, 26, 30);
       static EnumToolMaterial flailDiamond = EnumHelper.addToolMaterial("flailDiamond", 1, durfault, 2F, 2, 30);
       static EnumToolMaterial flailIron = EnumHelper.addToolMaterial("flailIron", 1, durfault, 2F, 1, 30);
       static EnumToolMaterial phoenixo = EnumHelper.addToolMaterial("phoenixo", 1, 500, 2F, 51, 30);
       static EnumToolMaterial krakeno = EnumHelper.addToolMaterial("krakeno", 1, 500, 2F, 46, 30);
       static EnumToolMaterial impo = EnumHelper.addToolMaterial("impo", 1, 500, 2F, 41, 30);
       static EnumToolMaterial lightning = EnumHelper.addToolMaterial("lightning", 1, durfault, 2F, 26, 30);
       static EnumToolMaterial legend = EnumHelper.addToolMaterial("legend", 1, durfault, 2F, 21, 30);
       static EnumToolMaterial shining = EnumHelper.addToolMaterial("shining", 1, durfault, 2F, 24, 30);
       static EnumToolMaterial zombie = EnumHelper.addToolMaterial("zombie", 1, durfault, 2F, 5, 30);
       static EnumToolMaterial dirt = EnumHelper.addToolMaterial("dirt", 1, 10, 2F, 0 - 104, 0);
       static EnumToolMaterial ice = EnumHelper.addToolMaterial("ice", 1, 50, 2F, 2, 30);
       static EnumToolMaterial weird = EnumHelper.addToolMaterial("weird", 1, durfault, 2F, 3, 30);
       static EnumToolMaterial natura = EnumHelper.addToolMaterial("natura", 1, durfault, 2F, 6, 30);
       static EnumToolMaterial dim = EnumHelper.addToolMaterial("dim", 1, durfault, 2F, 16, 30);
       static EnumToolMaterial ender = EnumHelper.addToolMaterial("ender", 1, 200, 2F, 2, 30);
       static EnumToolMaterial glass = EnumHelper.addToolMaterial("glass", 1, 25, 2F, 2, 30);
       //
       static EnumToolMaterial ultimite = EnumHelper.addToolMaterial("ultimite", 3, 300, 7F, 0, 30);
       static EnumToolMaterial ultimiteWeapon = EnumHelper.addToolMaterial("ultimiteWeapon", 1, 300, 2F, 46, 30);
       //
       static EnumArmorMaterial orcskin = EnumHelper.addArmorMaterial("orcskin", 200, new int[] {2, 2, 2, 2}, 15);
       static EnumArmorMaterial camo = EnumHelper.addArmorMaterial("camo", -1, new int[] {1, 1, 1, 1}, 0);
       static EnumArmorMaterial plain = EnumHelper.addArmorMaterial("plain", -1, new int[] {0, 0, 0, 0}, 0);
       
       
       public static CreativeTabs tabGeneral = new CreativeTabs("ubgms_rpg_tabGeneral")
       {
    	   public ItemStack getIconItemStack()
    	   {
    		   return new ItemStack(ingotUltimite);
    	   }
       };
       //
       public static CreativeTabs tabWeaponry = new CreativeTabs("ubgms_rpg_tabWeaponry")
       {
    	   public ItemStack getIconItemStack()
    	   {
    		   return new ItemStack(swordUltimite);
    	   }
       };
       //
       public static CreativeTabs tabArmor = new CreativeTabs("ubgms_rpg_tabArmor")
       {
    	   public ItemStack getIconItemStack()
    	   {
    		   return new ItemStack(camoHelmet);
    	   }
       };

       
       public static AchievementPage AchievementUbahRPG;
       
       public static int OceaniaID = 64;
       public static int FantasmaID = 65;
       public static int UnknownID = 66;
       
       
       public static BiomeGenBase oceaniaBiome;
       
       //Armor
       public static Item orcskinHelmet;
       public static Item orcskinChestplate;
       public static Item orcskinLeggings;
       public static Item orcskinBoots;
       //
       public static Item camoHelmet;
       public static Item camoChestplate;
       public static Item camoLeggings;
       public static Item camoBoots;
       //
       public static Item uniHelmet;
       public static Item uniChestplate;
       public static Item uniLeggings;
       public static Item uniBoots;
       //
       public static Item airMask;
       //Tools
       public static Item pickUltimite;
       //Swords
       public static Item swordMagmaBlaze;
       public static Item swordCandycane;
       public static Item swordBasiliskFear;
       public static Item swordVampirialVanquish;
       public static Item swordUltimite;
       public static Item swordKraken;
       public static Item swordUbah;
       public static Item swordUnicorn;
       public static Item swordAxeGhostly;
       public static Item swordAxeUnicorn;
       //
       public static Item swordSpearMultisoul;
       public static Item swordScytheCandycane;
       public static Item swordScytheSatyr;
       public static Item swordScytheNether;
       public static Item swordSickeningSickle;
       public static Item swordDaggerUnicorn;
       public static Item swordExcalibur;
       public static Item swordGhost;
       public static Item swordOranian;
       public static Item swordUnicornPitchfork;
       public static Item swordDaggerUltimite;
       public static Item swordDaggerBasilisk;
       public static Item swordGlownFury;
       public static Item swordFlailDiamond;
       public static Item swordFlailIron;
       public static Item swordPhoenixone;
       public static Item swordKrakenone;
       public static Item swordImpone;
       public static Item swordLightning;
       public static Item swordLegend;
       public static Item swordShining;
       public static Item swordZombie;
       public static Item swordDirt;
       public static Item swordSkeleton;
       public static Item swordIce;
       public static Item swordWeird;
       public static Item swordNatura;
       public static Item swordDim;
       public static Item swordEnder;
       public static Item swordGlass;
       //Colin Harrison's Sword
       public static Item swordCH;
       
       //Bows
       public static Item bowGhost;
       public static Item bowPhoenix;
       //Items
       public static Item basiliskFang;
       public static Item shardPeppermint;
       public static Item crystalCandycane;
       public static Item orcSkin;
       public static Item shardDarkness;
       public static Item impSoul;
       public static Item yetiFur;
       public static Item shardGhost;
       public static Item centaurRing;
       public static Item gryphonFeather;
       public static Item crystalSatyr;
       public static Item krakenScale;
       public static Item crystalNether;
       public static Item ingotUltimite;
       public static Item ingotUnicornite;
       public static Item candy;
       public static Item krakenSoul;
       public static Item phoenixSoul;
       public static Item ash;
       public static Item unicornHorn;
       public static Item rodGlowing;
       public static Item crystalGhost;
       public static Item digiron;
       public static Item phoenixone;
       public static Item krakenone;
       public static Item impone;
       public static Item electricite;
       public static Item ingotLegend;
       public static Item crystalElectric;
       public static Item crystalRotten;
       public static Item shardWeird;
       public static Item ingotNatura;
       public static Item crystalDim;
       public static Item soulmite;
       
       //
       public static Item book0;
       public static Item activator;
       //Blocks
       public static Block weaponsForge;
       public static BlockActivatorFire activatorFire;
       //
       public static Block oreUltimite;
       public static Block oreUnicornite;
       public static Block oreLegend;
       public static Block oreNatura;
       //
       public static Block candyCane;
       public static Block bedSand;
       //
       public static BlockPortalOceania portalOceania;
       
     //Achievements
       
       public static Achievement URPG_elfsForge;
       public static Achievement URPG_bladeOfHeat;
       public static Achievement URPG_aSnakesEqual;
       public static Achievement URPG_vampirialWeaponry;
       public static Achievement URPG_ultiblade;
       public static Achievement URPG_pinkSword;
       public static Achievement URPG_customization;
       public static Achievement URPG_swordOfTheSea;
       //
       public static Achievement URPG_ultimite;
       public static Achievement URPG_unicornite;
       public static Achievement URPG_advancedCrafting;
       public static Achievement URPG_toolery;
       public static Achievement URPG_orcskin;
       //
       public static Achievement URPG_armorOrcskin;
       public static Achievement URPG_armorUnicornite;
       
        
       
    	   
       
    	   
       @EventHandler
       public void preInit(FMLPreInitializationEvent event)
       {
    	   
    	   ConfigHandler.init(event.getSuggestedConfigurationFile());
    	   
       }
       
       
       @EventHandler
       public void init(FMLInitializationEvent event)
       {
    	   
    	   
    	   DimensionManager.registerProviderType(OceaniaID, WorldProviderOceania.class, true);
    	   DimensionManager.registerDimension(OceaniaID, OceaniaID);
    	   
    	   
    	   
    	   EntityRegistry.registerModEntity(EntityElf.class, "Elf", 1, this, 80, 1, true);
    	   EntityRegistry.registerModEntity(EntityOrc.class, "Orc", 2, this, 80, 1, true);
    	   EntityRegistry.registerModEntity(EntityUnicorn.class, "Unicorn", 3, this, 80, 1, true);
    	   //
    	   EntityEgg(EntityElf.class, 0x00ff00, 0xdc143c);
    	   EntityEgg(EntityOrc.class, 0xC7F22C, 0x778A32);
    	   EntityEgg(EntityUnicorn.class, 0xFCADFF, 0xFFFFFF);
    	   //
    	   GameRegistry.registerWorldGenerator(new UbahWorldGeneration());
    	   //
    	   EntityRegistry.addSpawn(EntityElf.class, 10, 2, 5, EnumCreatureType.monster, BiomeGenBase.frozenRiver, BiomeGenBase.frozenOcean, BiomeGenBase.iceMountains, BiomeGenBase.icePlains);
    	   //
    	   LanguageRegistry.instance().addStringLocalization("entity.ubgms_rpg.Elf.name", "Elf");
    	   LanguageRegistry.instance().addStringLocalization("entity.ubgms_rpg.Orc.name", "Orc");
    	   LanguageRegistry.instance().addStringLocalization("entity.ubgms_rpg.Unicorn.name", "Unicorn");
    	   
    	   orcskinHelmet = new ArmorOrcSkin(ID.orcskinHelmet_actual, orcskin, 3, 0).setUnlocalizedName("orcskinHelmet");
    	   orcskinChestplate = new ArmorOrcSkin(ID.orcskinChestplate_actual, orcskin, 3, 1).setUnlocalizedName("orcskinChestplate");
    	   orcskinLeggings = new ArmorOrcSkin(ID.orcskinLeggings_actual, orcskin, 3, 2).setUnlocalizedName("orcskinLeggings");
    	   orcskinBoots = new ArmorOrcSkin(ID.orcskinBoots_actual, orcskin, 3, 3).setUnlocalizedName("orcskinBoots");
    	   //
    	   camoHelmet = new ArmorCamo(ID.camoHelmet_actual, camo, 3, 0).setUnlocalizedName("camoHelmet");
    	   camoChestplate = new ArmorCamo(ID.camoChestplate_actual, camo, 3, 1).setUnlocalizedName("camoChestplate");
    	   camoLeggings = new ArmorCamo(ID.camoLeggings_actual, camo, 3, 2).setUnlocalizedName("camoLeggings");
    	   camoBoots = new ArmorCamo(ID.camoBoots_actual, camo, 3, 3).setUnlocalizedName("camoBoots");
    	   //
    	   uniHelmet = new ArmorUni(ID.uniHelmet_actual, EnumArmorMaterial.CHAIN, 3, 0).setUnlocalizedName("uniHelmet");
    	   uniChestplate = new ArmorUni(ID.uniChestplate_actual, EnumArmorMaterial.CHAIN, 3, 1).setUnlocalizedName("uniChestplate");
    	   uniLeggings = new ArmorUni(ID.uniLeggings_actual, EnumArmorMaterial.CHAIN, 3, 2).setUnlocalizedName("uniLeggings");
    	   uniBoots = new ArmorUni(ID.uniBoots_actual, EnumArmorMaterial.CHAIN, 3, 3).setUnlocalizedName("uniBoots");
    	   //
    	   airMask = new ArmorAirMask(ID.airMask_actual, plain, 3, 0).setUnlocalizedName("airMask");
    	   
    	   //
    	   
    	   pickUltimite = new ItemPickaxeBasic(ID.pickUltimite_actual, ultimite).setUnlocalizedName("pickUltimite");
    	   
    	   //
    	   
    	   swordMagmaBlaze = new ItemSwordMagmaBlaze(ID.swordMagmaBlaze_actual, magmablaze).setUnlocalizedName("swordMagmaBlaze");
    	   swordCandycane = new ItemSwordBasic(ID.swordCandycane_actual, candycane).setUnlocalizedName("swordCandycane");
    	   swordBasiliskFear = new ItemSwordBasilisk(ID.swordBasiliskFear_actual, basilisk).setUnlocalizedName("swordBasiliskFear");
    	   swordVampirialVanquish = new ItemSwordVanquish(ID.swordVampirialVanquish_actual, vanquish).setUnlocalizedName("swordVampirialVanquish");
    	   swordUltimite = new ItemSwordBasic(ID.swordUltimite_actual, ultimiteWeapon).setUnlocalizedName("swordUltimite");
    	   swordKraken = new ItemSwordKraken(ID.swordKraken_actual, kraken).setUnlocalizedName("swordKraken");
    	   swordUbah = new ItemSwordBasic(ID.swordUbah_actual, EnumToolMaterial.IRON).setUnlocalizedName("swordUbah");
    	   swordUnicorn = new ItemSwordUnicorn(ID.swordUnicorn_actual, EnumToolMaterial.STONE).setUnlocalizedName("swordUnicorn");
    	   swordAxeGhostly = new ItemAxeGhostly(ID.swordAxeGhostly_actual, axeGhostly).setUnlocalizedName("swordAxeGhostly");
    	   swordAxeUnicorn = new ItemAxeUnicorn(ID.swordAxeUnicorn_actual, axeUnicorn).setUnlocalizedName("swordAxeUnicorn");
    	   //
    	   swordSpearMultisoul = new ItemSwordBasic(ID.swordSpearMultisoul_actual, multisoul).setUnlocalizedName("swordSpearMultisoul");
    	   swordScytheCandycane = new ItemSwordBasic(ID.swordScytheCandycane_actual, scytheCandy).setUnlocalizedName("swordScytheCandycane");
    	   swordScytheSatyr = new ItemSwordSick(ID.swordScytheSatyr_actual, scytheSatyr).setUnlocalizedName("swordScytheSatyr");
    	   swordScytheNether = new ItemSwordBasic(ID.swordScytheNether_actual, scytheNether).setUnlocalizedName("swordScytheNether");
    	   swordSickeningSickle = new ItemSick(ID.swordSickeningSickle_actual, sick).setUnlocalizedName("swordSickeningSickle");
    	   swordDaggerUnicorn = new ItemSwordBasic(ID.swordDaggerUnicorn_actual, daggerUnicorn).setUnlocalizedName("swordDaggerUnicorn");
    	   swordExcalibur = new ItemSwordExcal(ID.swordExcalibur_actual, excal).setUnlocalizedName("swordExcalibur");
    	   swordGhost = new ItemSwordGhost(ID.swordGhost_actual, ghost).setUnlocalizedName("swordGhost");
    	   swordOranian = new ItemSwordBasic(ID.swordOranian_actual, oranian).setUnlocalizedName("swordOranian");
    	   swordUnicornPitchfork = new ItemSwordBasic(ID.swordUnicornPitchfork_actual, pitchUnicorn).setUnlocalizedName("swordUnicornPitchfork");
    	   swordDaggerUltimite = new ItemSwordBasic(ID.swordDaggerUltimite_actual, daggerUltimite).setUnlocalizedName("swordDaggerUltimite");
    	   swordDaggerBasilisk = new ItemSwordBasic(ID.swordDaggerBasilisk_actual, daggerBasilisk).setUnlocalizedName("swordDaggerBasilisk");
    	   swordGlownFury = new ItemSwordBasic(ID.swordGlownFury_actual, fury).setUnlocalizedName("swordGlownFury");
    	   swordFlailDiamond = new ItemSwordFlail(ID.swordFlailDiamond_actual, flailDiamond).setUnlocalizedName("swordFlailDiamond");
    	   swordFlailIron = new ItemSwordFlail(ID.swordFlailIron_actual, flailIron).setUnlocalizedName("swordFlailIron");
    	   swordPhoenixone = new ItemSwordPhoenixone(ID.swordPhoenixone_actual, phoenixo).setUnlocalizedName("swordPhoenixone");
    	   swordKrakenone = new ItemSwordKrakenone(ID.swordKrakenone_actual, krakeno).setUnlocalizedName("swordKrakenone");
    	   swordImpone = new ItemSwordImpone(ID.swordImpone_actual, impo).setUnlocalizedName("swordImpone");
    	   swordLightning = new ItemSwordLightning(ID.swordLightning_actual, lightning).setUnlocalizedName("swordLightning");
    	   swordLegend = new ItemSwordBasic(ID.swordLegend_actual, legend).setUnlocalizedName("swordLegend");
    	   swordShining = new ItemSwordBasic(ID.swordShining_actual, shining).setUnlocalizedName("swordShining");
    	   swordZombie = new ItemSwordZombie(ID.swordZombie_actual, zombie).setUnlocalizedName("swordZombie");
    	   swordDirt = new ItemSwordDirt(ID.swordDirt_actual, dirt).setUnlocalizedName("swordDirt");
    	   swordIce = new ItemSwordBasic(ID.swordIce_actual, ice).setUnlocalizedName("swordIce");
    	   swordWeird = new ItemSwordBasic(ID.swordWeird_actual, weird).setUnlocalizedName("swordWeird");
    	   swordNatura = new ItemSwordBasic(ID.swordNatura_actual, natura).setUnlocalizedName("swordNatura");
    	   swordDim = new ItemSwordBasic(ID.swordDim_actual, dim).setUnlocalizedName("swordDim");
    	   swordEnder = new ItemSwordEnder(ID.swordEnder_actual, ender).setUnlocalizedName("swordEnder");
    	   swordGlass = new ItemSwordBasic(ID.swordGlass_actual, glass).setUnlocalizedName("swordGlass");
    	   swordCH = new ItemSwordShiny(ID.swordCH_actual, EnumToolMaterial.EMERALD).setUnlocalizedName("swordCH");
    	   
    	   //
    	   
    	   bowGhost = new BowGhost(ID.bowGhost_actual).setUnlocalizedName("bowGhost");
    	   bowPhoenix = new BowPhoenix(ID.bowPhoenix_actual).setUnlocalizedName("bowPhoenix");
    	   
    	   //
    	   
    	   basiliskFang = new ItemDrop(ID.basiliskFang_actual).setUnlocalizedName("basiliskFang");
    	   shardPeppermint = new ItemEdible(ID.shardPeppermint_actual, 1, false).setUnlocalizedName("shardPeppermint");
    	   crystalCandycane = new ItemDrop(ID.crystalCandycane_actual).setUnlocalizedName("crystalCandycane");
    	   orcSkin = new ItemDrop(ID.orcSkin_actual).setUnlocalizedName("orcSkin");
    	   shardDarkness = new ItemDrop(ID.shardDarkness_actual).setUnlocalizedName("shardDarkness");
    	   impSoul = new ItemDrop(ID.impSoul_actual).setUnlocalizedName("impSoul");
    	   yetiFur = new ItemDrop(ID.yetiFur_actual).setUnlocalizedName("yetiFur");
    	   shardGhost = new ItemDrop(ID.shardGhost_actual).setUnlocalizedName("shardGhost");
    	   centaurRing = new ItemDrop(ID.centaurRing_actual).setUnlocalizedName("centaurRing");
    	   gryphonFeather = new ItemDrop(ID.gryphonFeather_actual).setUnlocalizedName("gryphonFeather");
    	   crystalSatyr = new ItemDrop(ID.crystalSatyr_actual).setUnlocalizedName("crystalSatyr");
    	   krakenScale = new ItemDrop(ID.krakenScale_actual).setUnlocalizedName("krakenScale");
    	   crystalNether = new ItemDrop(ID.crystalNether_actual).setUnlocalizedName("crystalNether");
    	   ingotUltimite = new ItemBasic(ID.ingotUltimite_actual).setUnlocalizedName("ingotUltimite");
    	   krakenSoul  = new ItemDrop(ID.krakenSoul_actual).setUnlocalizedName("krakenSoul");
    	   phoenixSoul  = new ItemDrop(ID.phoenixSoul_actual).setUnlocalizedName("phoenixSoul");
    	   ash = new ItemDrop(ID.ash_actual).setUnlocalizedName("ash");
    	   unicornHorn = new ItemShiny(ID.unicornHorn_actual).setUnlocalizedName("unicornHorn");
    	   ingotUnicornite = new ItemBasic(ID.ingotUnicornite_actual).setUnlocalizedName("ingotUnicornite");
    	   activator = new ItemActivator(ID.activator_actual).setUnlocalizedName("activator");
    	   rodGlowing = new ItemBasic(ID.rodGlowing_actual).setUnlocalizedName("rodGlowing");
    	   crystalGhost = new ItemDrop(ID.crystalGhost_actual).setUnlocalizedName("crystalGhost");
    	   digiron = new ItemDrop(ID.digiron_actual).setUnlocalizedName("digiron");
    	   phoenixone = new ItemDrop(ID.phoenixone_actual).setUnlocalizedName("phoenixone");
    	   krakenone = new ItemDrop(ID.krakenone_actual).setUnlocalizedName("krakenone");
    	   impone = new ItemDrop(ID.impone_actual).setUnlocalizedName("impone");
    	   electricite = new ItemDrop(ID.electricite_actual).setUnlocalizedName("electricite");
    	   ingotLegend = new ItemDrop(ID.ingotLegend_actual).setUnlocalizedName("ingotLegend");
    	   crystalElectric = new ItemDrop(ID.crystalElectric_actual).setUnlocalizedName("crystalElectric");
    	   crystalRotten = new ItemDrop(ID.crystalRotten_actual).setUnlocalizedName("crystalRotten");
    	   shardWeird = new ItemDrop(ID.shardWeird_actual).setUnlocalizedName("shardWeird");
    	   ingotNatura = new ItemDrop(ID.ingotNatura_actual).setUnlocalizedName("ingotNatura");
    	   crystalDim = new ItemDrop(ID.crystalDim_actual).setUnlocalizedName("crystalDim");
    	   soulmite = new ItemShiny(ID.soulmite_actual).setUnlocalizedName("soulmite");
    	   
    	   //
    	   
    	   candy = new ItemEdible(ID.candy_actual, 1, false).setUnlocalizedName("candy");
    	   
    	   //
    	   
    	   weaponsForge = new BlockForge(ID.weaponsForge_actual).setLightValue(1F).setHardness(5.0F).setUnlocalizedName("weaponsForge");
    	   activatorFire = new BlockActivatorFire(ID.activatorFire_actual);
    	   //
    	   oreUltimite = new BlockOreUltimite(ID.oreUltimite_actual, Material.rock).setHardness(5F).setUnlocalizedName("oreUltimite");
    	   oreUnicornite = new BlockOreUnicornite(ID.oreUnicornite_actual, Material.rock).setHardness(5F).setUnlocalizedName("oreUnicornite");
    	   oreLegend = new BlockBasic(ID.oreLegend_actual, Material.rock).setHardness(5F).setUnlocalizedName("oreLegend");
    	   oreNatura = new BlockBasic(ID.oreNatura_actual, Material.rock).setHardness(5F).setUnlocalizedName("oreNatura");
    	   //
    	   candyCane = new BlockCandy(ID.candyCane_actual, Material.ice).setHardness(2F).setUnlocalizedName("candyCane");
    	   //
    	   portalOceania = new BlockPortalOceania(ID.portalOceania_actual);
    	   
    	   //
    	   
    	   LanguageRegistry.addName(orcskinHelmet, "Orcskin Helmet");
    	   LanguageRegistry.addName(orcskinChestplate, "Orcskin Tunic");
    	   LanguageRegistry.addName(orcskinLeggings, "Orcskin Pants");
    	   LanguageRegistry.addName(orcskinBoots, "Orcskin Boots");
    	   //
    	   LanguageRegistry.addName(camoHelmet, "Camouflage");
    	   LanguageRegistry.addName(camoChestplate, "Camouflage");
    	   LanguageRegistry.addName(camoLeggings, "Camouflage");
    	   LanguageRegistry.addName(camoBoots, "Camouflage");
    	   //
    	   LanguageRegistry.addName(uniHelmet, "Unicorn Helmet");
    	   LanguageRegistry.addName(uniChestplate, "Unicorn Chestplate");
    	   LanguageRegistry.addName(uniLeggings, "Unicorn Pants");
    	   LanguageRegistry.addName(uniBoots, "Unicorn Boots");
    	   //
    	   LanguageRegistry.addName(airMask, "Air Mask");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(pickUltimite, "Ultimite Pickaxe");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(swordMagmaBlaze, "\u00A76\u00A7lMagma Blaze Sword");
    	   LanguageRegistry.addName(swordCandycane, "\u00A7c\u00A7lCandy Cane Dagger");
    	   LanguageRegistry.addName(swordBasiliskFear, "\u00A72\u00A7lThe Basilisk's Fear");
    	   LanguageRegistry.addName(swordVampirialVanquish, "\u00A75\u00A7lThe Vampirial Vanquish");
    	   LanguageRegistry.addName(swordUltimite, "\u00A7b\u00A7lThe UltiBlade");
    	   LanguageRegistry.addName(swordKraken, "\u00A71\u00A7lKraken Sword");
    	   LanguageRegistry.addName(swordUbah, "\u00A7l\u00A76Ubah\u00A7aSword");
    	   LanguageRegistry.addName(swordUnicorn, "\u00A7d\u00A7lUnicorn Sword");
    	   LanguageRegistry.addName(swordAxeGhostly, "\u00A7lGhostly Battleaxe");
    	   LanguageRegistry.addName(swordAxeUnicorn, "\u00A7lUnicorn Battleaxe");
    	   //
    	   LanguageRegistry.addName(swordSpearMultisoul, "\u00A7lMultisoul Spear");
    	   LanguageRegistry.addName(swordScytheCandycane, "\u00A7lCandy Cane Scythe");
    	   LanguageRegistry.addName(swordScytheSatyr, "\u00A7lSatyr Scythe");
    	   LanguageRegistry.addName(swordScytheNether, "\u00A7lNether Scythe");
    	   LanguageRegistry.addName(swordSickeningSickle, "\u00A7lSickening Sickle");
    	   LanguageRegistry.addName(swordDaggerUnicorn, "\u00A7lUnicorn Dagger");
    	   LanguageRegistry.addName(swordExcalibur, "\u00A7e\u00A7lExcalibur");
    	   LanguageRegistry.addName(swordGhost, "\u00A7lGhost Sword");
    	   LanguageRegistry.addName(swordOranian, "\u00A7lDiagiron Sword");
    	   LanguageRegistry.addName(swordUnicornPitchfork, "\u00A7lUnicorn Pitchfork");
    	   LanguageRegistry.addName(swordDaggerUltimite, "\u00A7lUltimite Dagger");
    	   LanguageRegistry.addName(swordDaggerBasilisk, "\u00A7lBasilisk Dagger");
    	   LanguageRegistry.addName(swordGlownFury, "\u00A7lGlowing Fury");
    	   LanguageRegistry.addName(swordFlailDiamond, "\u00A7lDiamond Flail");
    	   LanguageRegistry.addName(swordFlailIron, "\u00A7lIron Flail");
    	   LanguageRegistry.addName(swordPhoenixone, "\u00A76\u00A7lPhoenixone Sword");
    	   LanguageRegistry.addName(swordKrakenone, "\u00A71\u00A7lKrakenone Sword");
    	   LanguageRegistry.addName(swordImpone, "\u00A7a\u00A7lImpone Sword");
    	   LanguageRegistry.addName(swordLightning, "\u00A7lLightning Sword");
    	   LanguageRegistry.addName(swordLegend, "\u00A7lLegend Sword");
    	   LanguageRegistry.addName(swordShining, "\u00A7lThe \u00A7e\u00A7lShining \u00A75\u00A7lShadow");
    	   LanguageRegistry.addName(swordZombie, "\u00A7lZombie Sword");
    	   LanguageRegistry.addName(swordDirt, "\u00A7lDERT SWARD");
    	   LanguageRegistry.addName(swordIce, "\u00A7lIce Sword");
    	   LanguageRegistry.addName(swordWeird, "\u00A7k\u00A7lWeird Sword");
    	   LanguageRegistry.addName(swordNatura, "\u00A7lNatura Sword");
    	   LanguageRegistry.addName(swordDim, "\u00A7lDimensional Blade");
    	   LanguageRegistry.addName(swordEnder, "\u00A7lEnder Sword");
    	   LanguageRegistry.addName(swordGlass, "\u00A7lGlass Sword");
    	   LanguageRegistry.addName(swordCH, "\u00A79\u00A7lColin Harrison's Sword");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(bowGhost, "Ghost Bow");
    	   LanguageRegistry.addName(bowPhoenix, "Phoenix Bow");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(basiliskFang, "Basilisk Fang");
    	   LanguageRegistry.addName(shardPeppermint, "Peppermint Fragment");
    	   LanguageRegistry.addName(crystalCandycane, "Candy Cane Crystal"); 
    	   LanguageRegistry.addName(orcSkin, "Orc Skin");
    	   LanguageRegistry.addName(shardDarkness, "Darkness Fragment");
    	   LanguageRegistry.addName(impSoul, "Imp Soul");
    	   LanguageRegistry.addName(yetiFur, "Yeti Fur");
    	   LanguageRegistry.addName(shardGhost, "Ghost Fragment");
    	   LanguageRegistry.addName(centaurRing, "Centaur Ring");
    	   LanguageRegistry.addName(gryphonFeather, "Gryphon Feather");
    	   LanguageRegistry.addName(crystalSatyr, "Satyr Crystal");
    	   LanguageRegistry.addName(krakenScale, "Kraken Scale");
    	   LanguageRegistry.addName(crystalNether, "Nether Crystal");
    	   LanguageRegistry.addName(ingotUltimite, "Ultimite Ingot");
    	   LanguageRegistry.addName(krakenSoul, "Kraken Soul");
    	   LanguageRegistry.addName(phoenixSoul, "Phoenix Soul");
    	   LanguageRegistry.addName(ash, "Phoenix Ashes");
    	   LanguageRegistry.addName(unicornHorn, "Unicorn Horn");
    	   LanguageRegistry.addName(ingotUnicornite, "Unicornite Ingot");
    	   LanguageRegistry.addName(candy, "Piece of Candy");
    	   LanguageRegistry.addName(activator, "Portal Activator");
    	   //
    	   LanguageRegistry.addName(rodGlowing, "Enhanced Blaze Rod");
    	   LanguageRegistry.addName(crystalGhost, "Ghost Crystal");
    	   LanguageRegistry.addName(digiron, "Diagiron");
    	   LanguageRegistry.addName(phoenixone, "Phoenixone");
    	   LanguageRegistry.addName(krakenone, "Krakenone");
    	   LanguageRegistry.addName(impone, "Impone");
    	   LanguageRegistry.addName(electricite, "Electricite");
    	   LanguageRegistry.addName(ingotLegend, "Legend Ingot");
    	   LanguageRegistry.addName(crystalElectric, "Electric Crystal");
    	   LanguageRegistry.addName(crystalRotten, "Rotten Crystal");
    	   LanguageRegistry.addName(shardWeird, "Weird Fragment");
    	   LanguageRegistry.addName(ingotNatura, "Natura Ingot");
    	   LanguageRegistry.addName(crystalDim, "Dimensia Crystal");
    	   LanguageRegistry.addName(soulmite, "Soul-Infused Ultimite Ingot");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(weaponsForge, "\u00A7lWeapons Forge");
    	   LanguageRegistry.addName(oreUltimite, "Ultimite Ore");
    	   LanguageRegistry.addName(oreUnicornite, "Unicornite Ore");
    	   LanguageRegistry.addName(candyCane, "Candy Cane Block");
    	   LanguageRegistry.addName(oreLegend, "Legend Ore");
    	   LanguageRegistry.addName(oreNatura, "Natura Ore");
    	   
    	   //
    	   
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabGeneral", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- General");
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabWeaponry", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- Weapons");
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabArmor", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- Armor");
    	   
    	   //
    	   
    	   this.addAchievementName("ElfsForge", "An Elf's Forge");
    	   this.addAchievementDesc("ElfsForge", "The \u00A7c\u00A7lCandy Cane Dagger!");
    	   //
    	   this.addAchievementName("BladeOfHeat", "Blade of Heat");
    	   this.addAchievementDesc("BladeOfHeat", "The \u00A76\u00A7lMagma Blaze Sword!");
    	   //
    	   this.addAchievementName("ASnakesEqual", "The Snakes Equal");
    	   this.addAchievementDesc("ASnakesEqual", "The \u00A72\u00A7lBasilisk's Fear!");
    	   //
    	   this.addAchievementName("VampirialWeaponry", "Vampirial Weaponry");
    	   this.addAchievementDesc("VampirialWeaponry", "The \u00A75\u00A7lVampirial Vanquish!");
    	   //
    	   this.addAchievementName("Ultimite", "Ultimite!");
    	   this.addAchievementDesc("Ultimite", "The Ultimate Ore...");
    	   //
    	   this.addAchievementName("AdvancedCrafting", "Advanced Crafting");
    	   this.addAchievementDesc("AdvancedCrafting", "Make weapons even more awesome!");
    	   //
    	   this.addAchievementName("Toolery", "Toolery");
    	   this.addAchievementDesc("Toolery", "Not just swords!");
    	   //
    	   this.addAchievementName("Ultiblade", "Rainbow Sword!?");
    	   this.addAchievementDesc("Ultiblade", "The \u00A7b\u00A7lUltiblade!");
    	   //
    	   this.addAchievementName("ArmorOrcskin", "Orcskin Armor");
    	   this.addAchievementDesc("ArmorOrcskin", "Armor made of Orcskin");
    	   //
    	   this.addAchievementName("Orcskin", "ORCSKIN!?");
    	   this.addAchievementDesc("Orcskin", "Best alternative to leather ever!");
    	   //
    	   this.addAchievementName("Unicornite", "Unicornite!");
    	   this.addAchievementDesc("Unicornite", "IT'S PINK METAL!");
    	   //
    	   this.addAchievementName("ArmorUnicornite", "Unicornite Armor");
    	   this.addAchievementDesc("ArmorUnicornite", "OMG PINK ARMOR!");
    	   //
    	   this.addAchievementName("PinkSword", "PINK. WEAPONRY.");
    	   this.addAchievementDesc("PinkSword", "The \u00A7f\u00A7lUnicorn Sword!");
    	   //
    	   this.addAchievementName("Customization", "Customization");
    	   this.addAchievementDesc("Customization", "Just some color.");
    	   //
    	   this.addAchievementName("SwordOfTheSea", "Sword of the Sea");
    	   this.addAchievementDesc("SwordOfTheSea", "The \u00A71\u00A7lKraken Sword!");
    	   
    	   //
    	   
    	   GameRegistry.registerCraftingHandler(new CraftingHandler());
    	   GameRegistry.registerPickupHandler(new PickupHandler());
    	   
    	   //
    	   
    	   MinecraftForge.setBlockHarvestLevel(oreUltimite, "pickaxe", 3);
    	   MinecraftForge.setBlockHarvestLevel(oreUnicornite, "pickaxe", 3);
    	   MinecraftForge.setBlockHarvestLevel(oreLegend, "pickaxe", 3);
    	   MinecraftForge.setBlockHarvestLevel(oreNatura, "pickaxe", 3);
    	   
    	   //
    	   
    	   GameRegistry.registerBlock(weaponsForge, "weaponsForge");
    	   GameRegistry.registerBlock(oreUltimite, "oreUltimite");
    	   GameRegistry.registerBlock(oreUnicornite, "oreUnicornite");
    	   GameRegistry.registerBlock(candyCane, "candyCane");
    	   GameRegistry.registerBlock(activatorFire, "activatorFire");
    	   GameRegistry.registerBlock(portalOceania, "portalOceania");
    	   GameRegistry.registerBlock(oreLegend, "oreLegend");
    	   GameRegistry.registerBlock(oreNatura, "oreNatura");
    	   
    	   //
    	   
    	   if(addToDefault)
    	   {
    		   if(biomeOceaniaGen)
    		   {
    			   GameRegistry.addBiome(oceaniaBiome);
    		   }
    	   }
    	   
    	   //
    	   
    	   FurnaceRecipes.smelting().addSmelting(ingotLegend.itemID, 0, new ItemStack(electricite, 3), 0.1F);
    	   FurnaceRecipes.smelting().addSmelting(oreLegend.blockID, 0, new ItemStack(ingotLegend), 0.1F);
    	   FurnaceRecipes.smelting().addSmelting(oreNatura.blockID, 0, new ItemStack(ingotNatura), 0.1F);
    	   FurnaceRecipes.smelting().addSmelting(swordExcalibur.itemID, 0, new ItemStack(swordDirt), 0.1F);
    	   
    	   //
    	   
    	   GameRegistry.addRecipe(new ItemStack(weaponsForge), new Object[]{
               "III",
               "IUI",
               "III",
               'I', Item.ingotIron, 'U', ingotUltimite
        });
    	   //
    	   
    	   GameRegistry.addShapelessRecipe(new ItemStack(krakenSoul, 2), new Object[]{
               new ItemStack(krakenScale)
        });
    	   //
    	   GameRegistry.addShapelessRecipe(new ItemStack(phoenixSoul, 2), new Object[]{
               new ItemStack(ash)
        });
    	   //
    	   GameRegistry.addShapelessRecipe(new ItemStack(digiron), new Object[]{
               new ItemStack(Item.diamond), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotGold)
        });
    	   //
    	   GameRegistry.addShapelessRecipe(new ItemStack(shardWeird, 3), new Object[]{
               new ItemStack(shardPeppermint), new ItemStack(shardGhost), new ItemStack(shardDarkness)
        });
    	   GameRegistry.addShapelessRecipe(new ItemStack(soulmite), new Object[]{
               new ItemStack(ingotUltimite), new ItemStack(phoenixSoul), new ItemStack(krakenSoul), new ItemStack(impSoul)
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(crystalCandycane), new Object[]{
               "PPP",
               "PSP",
               "PPP",
               'P', shardPeppermint, 'S', Item.sugar
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(rodGlowing), new Object[]{
               "GGG",
               "GBG",
               "GGG",
               'G', Item.glowstone, 'B', Item.blazeRod
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(crystalGhost), new Object[]{
               "GGG",
               "GGG",
               "GGG",
               'G', shardGhost
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(phoenixone), new Object[]{
               "DDD",
               "GPG",
               "DDD",
               'D', Item.diamond, 'G', Item.ingotGold, 'P', phoenixSoul 
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(krakenone), new Object[]{
               "DDD",
               "GPG",
               "DDD",
               'D', Item.diamond, 'G', Item.ingotGold, 'P', krakenSoul 
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(impone), new Object[]{
               "DDD",
               "GPG",
               "DDD",
               'D', Item.diamond, 'G', Item.ingotGold, 'P', impSoul 
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(crystalElectric), new Object[]{
               "EEE",
               "EEE",
               "EEE",
               'E', electricite
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(crystalRotten), new Object[]{
               "RRR",
               "RDR",
               "RRR",
               'R', Item.rottenFlesh, 'D', Item.diamond
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(crystalDim), new Object[]{
               "UNU",
               "LUL",
               "UPU",
               'U', ingotUltimite, 'N', ingotNatura, 'L', ingotLegend, 'P', ingotUnicornite
               
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(orcskinHelmet), new Object[]{
               "OOO",
               "O O",
               'O', orcSkin
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(orcskinChestplate), new Object[]{
               "O O",
               "OOO",
               "OOO",
               'O', orcSkin
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(orcskinLeggings), new Object[]{
               "OOO",
               "O O",
               "O O",
               'O', orcSkin
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(orcskinBoots), new Object[]{
               "O O",
               "O O",
               'O', orcSkin
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(activator), new Object[]{
               "BIF",
               "ILI",
               "IUI",
               'I', Item.ingotIron, 'B', Block.stoneButton, 'F', Item.flintAndSteel, 'U', ingotUltimite, 'L', new ItemStack(Item.dyePowder, 1, 4)
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(camoHelmet), new Object[]{
               "OOO",
               "O O",
               'O', Block.leaves
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(camoChestplate), new Object[]{
               "O O",
               "OOO",
               "OOO",
               'O', Block.leaves
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(camoLeggings), new Object[]{
               "OOO",
               "O O",
               "O O",
               'O', Block.leaves
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(camoBoots), new Object[]{
               "O O",
               "O O",
               'O', Block.leaves
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(uniHelmet), new Object[]{
               "OOO",
               "O O",
               'O', ingotUnicornite
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(uniChestplate), new Object[]{
               "O O",
               "OOO",
               "OOO",
               'O', ingotUnicornite
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(uniLeggings), new Object[]{
               "OOO",
               "O O",
               "O O",
               'O', ingotUnicornite
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(uniBoots), new Object[]{
               "O O",
               "O O",
               'O', ingotUnicornite
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(airMask), new Object[]{
               "III",
               "IDI",
               "IGI",
               'I', Item.ingotIron, 'D', new ItemStack(Item.dyePowder, 1, 14), 'G', Block.thinGlass
        });
    	   //
    	   GameRegistry.addRecipe(new ItemStack(pickUltimite), new Object[]{
               "UUU",
               " S ",
               " S ",
               'U', ingotUltimite, 'S', Item.stick
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordMagmaBlaze), new Object[]{
               "CPC",
               "CPC",
               " R ",
               'R', Item.blazeRod, 'C', Item.magmaCream, 'P', Item.blazePowder
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordAxeUnicorn), new Object[]{
               "UUU",
               "UUS",
               "  S",
               'U', ingotUnicornite, 'S', Item.stick
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordAxeGhostly), new Object[]{
               "UUU",
               "UUS",
               "  S",
               'U', shardGhost, 'S', Item.stick
        });
    	   //NEW SWORDS RECIPES
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordSpearMultisoul), new Object[]{
               " IK",
               " SP",
               "S  ",
               'S', Item.stick, 'P', phoenixSoul, 'K', krakenSoul, 'I', impSoul
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordScytheCandycane), new Object[]{
               "CC ",
               "S C",
               "S  ",
               'S', Item.stick, 'C', crystalCandycane
        });
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordScytheSatyr), new Object[]{
               "CC ",
               "S C",
               "S  ",
               'S', Item.stick, 'C', crystalSatyr
        });
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordScytheNether), new Object[]{
               "CC ",
               "S C",
               "S  ",
               'S', Item.stick, 'C', crystalNether
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordSickeningSickle), new Object[]{
               " DB",
               " S ",
               " S ",
               'S', Item.stick, 'D', Item.diamond, 'B', basiliskFang
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordDaggerUnicorn), new Object[]{
               "H",
               "R",
               "S",
               'H', unicornHorn, 'R', centaurRing, 'S', Item.stick
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordExcalibur), new Object[]{
               "DPD",
               "DKD",
               "SIS",
               'S', Item.stick, 'D', Block.blockDiamond, 'P', swordPhoenixone, 'K', swordKrakenone, 'I', swordImpone
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordCH), new Object[]{
               "U",
               "U",
               "S",
               'S', Item.stick, 'U', ingotUltimite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordGhost), new Object[]{
               "C",
               "C",
               "S",
               'S', Item.stick, 'C', crystalGhost
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordOranian), new Object[]{
               "C",
               "C",
               "S",
               'S', Item.stick, 'C', digiron
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordUnicornPitchfork), new Object[]{
               "H H",
               "DUD",
               " S ",
               'S', Item.stick, 'H', unicornHorn, 'D', Item.diamond, 'U', ingotUnicornite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordDaggerUltimite), new Object[]{
               "C",
               "S",
               'S', Item.blazeRod, 'C', ingotUltimite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordDaggerBasilisk), new Object[]{
               "C",
               "S",
               'S', Item.stick, 'C', basiliskFang
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordGlownFury), new Object[]{
               "GUG",
               "GUG",
               " B ",
               'B', Item.blazeRod, 'U', ingotUltimite, 'G', rodGlowing
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordFlailDiamond), new Object[]{
               "D  ",
               " I ",
               "  S",
               'S', Item.stick, 'I', Item.ingotIron, 'D', Item.diamond
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordFlailIron), new Object[]{
               "I  ",
               " I ",
               "  S",
               'S', Item.stick, 'I', Item.ingotIron
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordPhoenixone), new Object[]{
               "O",
               "U",
               "G",
               'O', phoenixone, 'U', soulmite, 'G', rodGlowing
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordKrakenone), new Object[]{
               "O",
               "U",
               "G",
               'O', krakenone, 'U', soulmite, 'G', rodGlowing
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordImpone), new Object[]{
               "O",
               "U",
               "G",
               'O', impone, 'U', soulmite, 'G', rodGlowing
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordLightning), new Object[]{
               "E",
               "E",
               "G",
               'E', crystalElectric, 'G', rodGlowing
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordLegend), new Object[]{
               "LLL",
               "LLL",
               " S ",
               'S', Item.stick, 'L', ingotLegend
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordShining), new Object[]{
               "DCD",
               "ESE",
               " S ",
               'S', Item.stick, 'D', shardDarkness, 'C', crystalElectric, 'E', electricite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordZombie), new Object[]{
               "R",
               "R",
               "S",
               'S', Item.stick, 'R', crystalRotten
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordDirt), new Object[]{
               "R",
               "R",
               "S",
               'S', Item.stick, 'R', Block.dirt
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordIce), new Object[]{
               "R",
               "R",
               "S",
               'S', Item.stick, 'R', Block.ice
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordWeird), new Object[]{
               "WWW",
               "WWW",
               " S ",
               'S', Item.stick, 'W', shardWeird
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordNatura), new Object[]{
               "NDN",
               "NDN",
               " S ",
               'S', Item.stick, 'N', ingotNatura, 'D', Item.diamond
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordDim), new Object[]{
               "R",
               "R",
               "S",
               'S', Item.stick, 'R', crystalDim
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordEnder), new Object[]{
               "PRP",
               "PRP",
               "DSD",
               'S', Item.stick, 'R', Item.eyeOfEnder, 'P', Item.enderPearl, 'D', Item.diamond
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordGlass), new Object[]{
               "R",
               "R",
               "S",
               'S', Item.stick, 'R', Block.thinGlass
        });
    	   //END OF NEW SWORDS RECIPES
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordUltimite), new Object[]{
               "UUU",
               "UUU",
               "SSS",
               'S', Item.stick, 'U', soulmite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordCandycane), new Object[]{
               "C",
               "C",
               "R",
               'R', Item.reed, 'C', crystalCandycane
               
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordBasiliskFear), new Object[]{
               "FFF",
               "FOF",
               " O ",
               'F', basiliskFang, 'O', Block.obsidian
               
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordVampirialVanquish), new Object[]{
               "DDD",
               "DDD",
               "GWG",
               'D', shardDarkness, 'G', shardGhost, 'W',  new ItemStack(Item.skull, 1, 1)
               
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordKraken), new Object[]{
               "ISI",
               "ISI",
               " D ",
               'S', krakenSoul, 'I', Item.ingotIron, 'D', Item.swordDiamond
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordUbah), new Object[]{
               "OIG",
               "OIG",
               " S ",
               'O', new ItemStack(Item.dyePowder, 1, 14), 'I', Item.ingotIron, 'G', new ItemStack(Item.dyePowder, 1, 10), 'S', Item.stick
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordUnicorn), new Object[]{
               " H ",
               "UUU",
               " S ",
               'H', unicornHorn, 'U', ingotUnicornite, 'S', Item.stick
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(bowGhost), new Object[]{
               " GS",
               "G S",
               " GS",
               'G', shardGhost, 'S', Item.silk
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(bowPhoenix), new Object[]{
               " GS",
               "GUS",
               " GS",
               'G', phoenixSoul, 'S', Item.silk, 'U', ingotUltimite
        });
    	   //
    	   URPG_ultimite = new Achievement(345, "Ultimite", -2, 0, ingotUltimite, null).registerAchievement();
    	   //
    	   URPG_advancedCrafting = new Achievement(346, "AdvancedCrafting", 0, 0, weaponsForge, URPG_ultimite).registerAchievement();
    	   //
    	   URPG_elfsForge = new Achievement(341, "ElfsForge", 2, 0, swordCandycane, URPG_advancedCrafting).registerAchievement();
           URPG_bladeOfHeat = new Achievement(342, "BladeOfHeat", 3, 0, swordMagmaBlaze, URPG_advancedCrafting).registerAchievement();
           URPG_aSnakesEqual = new Achievement(343, "ASnakesEqual", 4, 0, swordBasiliskFear, URPG_advancedCrafting).registerAchievement();
           URPG_vampirialWeaponry = new Achievement(344, "VampirialWeaponry", 5, 0, swordVampirialVanquish, URPG_advancedCrafting).registerAchievement();
           URPG_swordOfTheSea = new Achievement(353, "SwordOfTheSea", 6, 0, swordKraken, URPG_advancedCrafting).registerAchievement();
           URPG_pinkSword = new Achievement(354, "PinkSword", 7, 0, swordUnicorn, URPG_advancedCrafting).registerAchievement();
           URPG_customization = new Achievement(355, "Customization", 8, 0, swordUbah, URPG_advancedCrafting).registerAchievement();
           //
           URPG_ultiblade = new Achievement(347, "Ultiblade", -4, 0, swordUltimite, URPG_advancedCrafting).setSpecial().registerAchievement();
           //
           URPG_toolery = new Achievement(348, "Toolery", -2, 2, pickUltimite, null).registerAchievement();
           //
           URPG_orcskin = new Achievement(350, "Orcskin", -2, -2, orcSkin, null).registerAchievement();
           URPG_armorOrcskin = new Achievement(349, "ArmorOrcskin", -1, -2, orcskinHelmet, URPG_orcskin).registerAchievement();
           //
           URPG_unicornite = new Achievement(351, "Unicornite", -2, -3, ingotUnicornite, null).registerAchievement();
           URPG_armorUnicornite = new Achievement(352, "ArmorUnicornite", -1, -3, uniHelmet, URPG_unicornite).registerAchievement();
           
           AchievementUbahRPG = new AchievementPage("\u00A76\u00A7lUbah\u00A7a\u00A7lRPG", URPG_ultimite, URPG_advancedCrafting, URPG_elfsForge, URPG_bladeOfHeat, URPG_aSnakesEqual, URPG_vampirialWeaponry, URPG_toolery, URPG_ultiblade, URPG_armorOrcskin, URPG_orcskin, URPG_unicornite, URPG_pinkSword, URPG_armorUnicornite, URPG_swordOfTheSea, URPG_customization);
    	   AchievementPage.registerAchievementPage(AchievementUbahRPG);
    	   
    	   NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
    	   
    	   proxy.renderEntity();
    	   proxy.registerSound();
    	   proxy.registerRenderThings();
    	   
       }
       
       
       public static int getUniqueID()
       {
    	   int EntityId = 200;
    	   do
    	   {
    		   EntityId++;
    	   } while(EntityList.getStringFromID(EntityId) != null);
    	   return EntityId;
       }
     
       public static void EntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
       {
    	   int id = getUniqueID();
    	   EntityList.IDtoClassMapping.put(id, entity);
    	   EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
       }
       
       private void addAchievementName(String ach, String name)
       {
       LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
       }

       private void addAchievementDesc(String ach, String desc)
       {
       LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
       }
}
