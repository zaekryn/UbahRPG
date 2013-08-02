package ubahRPG;

import java.awt.Color;

import net.minecraft.block.Block;
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
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
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
       
       
       
       @Instance(UbahRPG.modid)//<<<Must be the same as your modid
       public static UbahRPG instance;
       
       private GuiHandler guiHandler = new GuiHandler();
       
       static EnumToolMaterial magmablaze = EnumHelper.addToolMaterial("magmablaze", 1, 250, 2F, 2, 30);
       static EnumToolMaterial candycane = EnumHelper.addToolMaterial("candycane", 1, 200, 2F, 0, 30);
       static EnumToolMaterial basilisk = EnumHelper.addToolMaterial("basilisk", 1, 250, 2F, 1, 30);
       static EnumToolMaterial vanquish = EnumHelper.addToolMaterial("vanquish", 1, 500, 2F, 4, 30);
       static EnumToolMaterial kraken = EnumHelper.addToolMaterial("kraken", 1, 500, 2F, 3, 30);
       //
       static EnumToolMaterial ultimite = EnumHelper.addToolMaterial("ultimite", 3, 300, 7F, 0, 30);
       static EnumToolMaterial ultimiteWeapon = EnumHelper.addToolMaterial("ultimiteWeapon", 1, 300, 2F, 46, 30);
       //
       static EnumArmorMaterial orcskin = EnumHelper.addArmorMaterial("orcskin", 200, new int[] {2, 2, 2, 2}, 15);
       static EnumArmorMaterial camo = EnumHelper.addArmorMaterial("camo", -1, new int[] {1, 1, 1, 1}, 0);
       
       
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
    		   return new ItemStack(swordKraken);
    	   }
       };
       //
       public static CreativeTabs tabTools = new CreativeTabs("ubgms_rpg_tabTools")
       {
    	   public ItemStack getIconItemStack()
    	   {
    		   return new ItemStack(pickUltimite);
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
       //
       public static Item book0;
       //Blocks
       public static Block weaponsForge;
       //
       public static Block oreUltimite;
       public static Block oreUnicornite;
       //
       public static Block candyCane;
       
     //Achievements
       
       public static Achievement URPG_elfsForge;
       public static Achievement URPG_bladeOfHeat;
       public static Achievement URPG_aSnakesEqual;
       public static Achievement URPG_vampirialWeaponry;
       public static Achievement URPG_ultiblade;
       //
       public static Achievement URPG_ultimite;
       public static Achievement URPG_advancedCrafting;
       public static Achievement URPG_toolery;
       public static Achievement URPG_orcskin;
       //
       public static Achievement URPG_armorOrcskin;
       
        
       
    	   
       
    	   
       @EventHandler
       public void preInit(FMLPreInitializationEvent event)
       {
    	   
    	   
    	   
       }
       
       
       @EventHandler
       public void init(FMLInitializationEvent event)
       {
        
    	   
    	   
    	   EntityRegistry.registerModEntity(EntityElf.class, "Elf", 1, this, 80, 1, true);
    	   EntityRegistry.registerModEntity(EntityOrc.class, "Orc", 2, this, 80, 1, true);
    	   //
    	   EntityEgg(EntityElf.class, 0x00ff00, 0xdc143c);
    	   EntityEgg(EntityOrc.class, 0xC7F22C, 0x778A32);
    	   //
    	   GameRegistry.registerWorldGenerator(new UbahWorldGeneration());
    	   //
    	   EntityRegistry.addSpawn(EntityElf.class, 10, 2, 5, EnumCreatureType.monster, BiomeGenBase.frozenRiver, BiomeGenBase.frozenOcean, BiomeGenBase.iceMountains, BiomeGenBase.icePlains);
    	   //
    	   LanguageRegistry.instance().addStringLocalization("entity.ubgms_rpg.Elf.name", "Elf");
    	   LanguageRegistry.instance().addStringLocalization("entity.ubgms_rpg.Orc.name", "Orc");
    	   
    	   orcskinHelmet = new ArmorOrcSkin(6410, orcskin, 3, 0).setUnlocalizedName("orcskinHelmet");
    	   orcskinChestplate = new ArmorOrcSkin(6411, orcskin, 3, 1).setUnlocalizedName("orcskinChestplate");
    	   orcskinLeggings = new ArmorOrcSkin(6412, orcskin, 3, 2).setUnlocalizedName("orcskinLeggings");
    	   orcskinBoots = new ArmorOrcSkin(6413, orcskin, 3, 3).setUnlocalizedName("orcskinBoots");
    	   //
    	   camoHelmet = new ArmorCamo(6444, camo, 3, 0).setUnlocalizedName("camoHelmet");
    	   camoChestplate = new ArmorCamo(6445, camo, 3, 1).setUnlocalizedName("camoChestplate");
    	   camoLeggings = new ArmorCamo(6446, camo, 3, 2).setUnlocalizedName("camoLeggings");
    	   camoBoots = new ArmorCamo(6447, camo, 3, 3).setUnlocalizedName("camoBoots");
    	   //
    	   uniHelmet = new ArmorUni(6459, EnumArmorMaterial.CHAIN, 3, 0).setUnlocalizedName("uniHelmet");
    	   uniChestplate = new ArmorUni(6460, EnumArmorMaterial.CHAIN, 3, 1).setUnlocalizedName("uniChestplate");
    	   uniLeggings = new ArmorUni(6461, EnumArmorMaterial.CHAIN, 3, 2).setUnlocalizedName("uniLeggings");
    	   uniBoots = new ArmorUni(6462, EnumArmorMaterial.CHAIN, 3, 3).setUnlocalizedName("uniBoots");
    	   
    	   //
    	   
    	   pickUltimite = new ItemPickaxeBasic(6441, ultimite).setUnlocalizedName("pickUltimite");
    	   
    	   //
    	   
    	   swordMagmaBlaze = new ItemSwordMagmaBlaze(6423, magmablaze).setUnlocalizedName("swordMagmaBlaze");
    	   swordCandycane = new ItemSwordBasic(6437, candycane).setUnlocalizedName("swordCandycane");
    	   swordBasiliskFear = new ItemSwordBasilisk(6438, basilisk).setUnlocalizedName("swordBasiliskFear");
    	   swordVampirialVanquish = new ItemSwordVanquish(6439, vanquish).setUnlocalizedName("swordVampirialVanquish");
    	   swordUltimite = new ItemSwordBasic(6442, ultimiteWeapon).setUnlocalizedName("swordUltimite");
    	   swordKraken = new ItemSwordKraken(6450, kraken).setUnlocalizedName("swordKraken");
    	   swordUbah = new ItemSwordBasic(6455, EnumToolMaterial.IRON).setUnlocalizedName("swordUbah");
    	   swordUnicorn = new ItemSwordUnicorn(6456, EnumToolMaterial.STONE).setUnlocalizedName("swordUnicorn");
    	   
    	   //
    	   
    	   bowGhost = new BowGhost(6449).setUnlocalizedName("bowGhost");
    	   bowPhoenix = new BowPhoenix(6451).setUnlocalizedName("bowPhoenix");
    	   
    	   //
    	   
    	   basiliskFang = new ItemDrop(6424).setUnlocalizedName("basiliskFang");
    	   shardPeppermint = new ItemDrop(6425).setUnlocalizedName("shardPeppermint");
    	   crystalCandycane = new ItemDrop(6426).setUnlocalizedName("crystalCandycane");
    	   orcSkin = new ItemDrop(6427).setUnlocalizedName("orcSkin");
    	   shardDarkness = new ItemDrop(6428).setUnlocalizedName("shardDarkness");
    	   impSoul = new ItemDrop(6429).setUnlocalizedName("impSoul");
    	   yetiFur = new ItemDrop(6430).setUnlocalizedName("yetiFur");
    	   shardGhost = new ItemDrop(6431).setUnlocalizedName("shardGhost");
    	   centaurRing = new ItemDrop(6432).setUnlocalizedName("centaurRing");
    	   gryphonFeather = new ItemDrop(6433).setUnlocalizedName("gryphonFeather");
    	   crystalSatyr = new ItemDrop(6434).setUnlocalizedName("crystalSatyr");
    	   krakenScale = new ItemDrop(6435).setUnlocalizedName("krakenScale");
    	   crystalNether = new ItemDrop(6436).setUnlocalizedName("crystalNether");
    	   ingotUltimite = new ItemBasic(6440).setUnlocalizedName("ingotUltimite");
    	   krakenSoul  = new ItemDrop(6452).setUnlocalizedName("krakenSoul");
    	   phoenixSoul  = new ItemDrop(6453).setUnlocalizedName("phoenixSoul");
    	   ash = new ItemDrop(6454).setUnlocalizedName("ash");
    	   unicornHorn = new ItemShiny(6457).setUnlocalizedName("unicornHorn");
    	   ingotUnicornite = new ItemBasic(6458).setUnlocalizedName("ingotUnicornite");
    	   
    	   //
    	   
    	   candy = new ItemEdible(6443, 1, false).setUnlocalizedName("candy");
    	   
    	   //
    	   
    	   weaponsForge = new BlockForge(3056).setLightValue(1F).setHardness(5.0F).setUnlocalizedName("weaponsForge");
    	   //
    	   oreUltimite = new BlockOreUltimite(3057, Material.rock).setHardness(5F).setUnlocalizedName("oreUltimite");
    	   oreUnicornite = new BlockOreUnicornite(3059, Material.rock).setHardness(5F).setUnlocalizedName("oreUnicornite");
    	   //
    	   candyCane = new BlockCandy(3058, Material.ice).setHardness(2F).setUnlocalizedName("candyCane");
    	   
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
    	   
    	   LanguageRegistry.addName(pickUltimite, "Ultimite Pickaxe");
    	   
    	   //
    	   
    	   LanguageRegistry.addName(swordMagmaBlaze, "\u00A76\u00A7lMagma Blaze Sword");
    	   LanguageRegistry.addName(swordCandycane, "\u00A7c\u00A7lCandy Cane Dagger");
    	   LanguageRegistry.addName(swordBasiliskFear, "\u00A72\u00A7lThe Basilisk's Fear");
    	   LanguageRegistry.addName(swordVampirialVanquish, "\u00A75\u00A7lThe Vampirial Vanquish");
    	   LanguageRegistry.addName(swordUltimite, "\u00A7b\u00A7lThe UltiBlade");
    	   LanguageRegistry.addName(swordKraken, "\u00A71\u00A7lKraken Sword");
    	   LanguageRegistry.addName(swordUbah, "\u00A76Ubah\u00A7aSword");
    	   LanguageRegistry.addName(swordUnicorn, "\u00A7lUnicorn Sword");
    	   
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
    	   
    	   //
    	   
    	   LanguageRegistry.addName(weaponsForge, "\u00A7lWeapons Forge");
    	   LanguageRegistry.addName(oreUltimite, "Ultimite Ore");
    	   LanguageRegistry.addName(oreUnicornite, "Unicornite Ore");
    	   LanguageRegistry.addName(candyCane, "Candy Cane Block");
    	   
    	   //
    	   
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabGeneral", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- General");
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabWeaponry", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- Weapons");
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.ubgms_rpg_tabTools", "\u00A76\u00A7lUbah\u00A7a\u00A7lRPG \u00A7r- Tools");
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
    	   
    	   GameRegistry.registerCraftingHandler(new CraftingHandler());
    	   GameRegistry.registerPickupHandler(new PickupHandler());
    	   
    	   //
    	   
    	   MinecraftForge.setBlockHarvestLevel(oreUltimite, "pickaxe", 3);
    	   MinecraftForge.setBlockHarvestLevel(oreUnicornite, "pickaxe", 3);
    	   
    	   //
    	   
    	   GameRegistry.registerBlock(weaponsForge, "weaponsForge");
    	   GameRegistry.registerBlock(oreUltimite, "oreUltimite");
    	   GameRegistry.registerBlock(oreUnicornite, "oreUnicornite");
    	   GameRegistry.registerBlock(candyCane, "candyCane");
    	   
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
    	   GameRegistry.addRecipe(new ItemStack(crystalCandycane), new Object[]{
               "PPP",
               "PSP",
               "PPP",
               'P', shardPeppermint, 'S', Item.sugar
               
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
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordUltimite), new Object[]{
               "UUU",
               "UUU",
               "SSS",
               'S', Item.stick, 'U', ingotUltimite
        });
    	   //
    	   ForgeCraftingManager.getInstance().addRecipe(new ItemStack(swordCandycane), new Object[]{
               " C ",
               " C ",
               " R ",
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
               'O', krakenSoul, 'I', Item.ingotIron, 'G', Item.swordDiamond, 'S', Item.stick
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
    	   URPG_advancedCrafting = new Achievement(346, "AdvancedCrafting", 0, 0, weaponsForge, URPG_ultimite).registerAchievement();
    	   URPG_elfsForge = new Achievement(341, "ElfsForge", 0, 2, swordCandycane, URPG_advancedCrafting).registerAchievement();
           URPG_bladeOfHeat = new Achievement(342, "BladeOfHeat", 2, 0, swordMagmaBlaze, URPG_advancedCrafting).registerAchievement();
           URPG_aSnakesEqual = new Achievement(343, "ASnakesEqual", 0, 4, swordBasiliskFear, URPG_advancedCrafting).registerAchievement();
           URPG_vampirialWeaponry = new Achievement(344, "VampirialWeaponry", 4, 0, swordVampirialVanquish, URPG_advancedCrafting).registerAchievement();
           URPG_ultiblade = new Achievement(347, "Ultiblade", 2, 2, swordUltimite, URPG_advancedCrafting).registerAchievement();
           URPG_toolery = new Achievement(348, "Toolery", -2, 4, pickUltimite, URPG_ultimite).registerAchievement();
           URPG_orcskin = new Achievement(350, "Orcskin", -2, -3, orcSkin, null).registerAchievement();
           URPG_armorOrcskin = new Achievement(349, "ArmorOrcskin", -4, 2, orcskinHelmet, URPG_orcskin).registerAchievement();
           
           AchievementUbahRPG = new AchievementPage("\u00A76\u00A7lUbah\u00A7a\u00A7lRPG", URPG_ultimite, URPG_advancedCrafting, URPG_elfsForge, URPG_bladeOfHeat, URPG_aSnakesEqual, URPG_vampirialWeaponry, URPG_toolery, URPG_ultiblade, URPG_armorOrcskin, URPG_orcskin);
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
