package net.minecraft.src;

import java.util.Random;
import bspkrs.floatingruins.FloatingRuins;
import bspkrs.util.ModVersionChecker;
import net.minecraft.server.MinecraftServer;

public class mod_floatingRuins extends BaseModMp
{
    @MLProp(info=FloatingRuins.allowUpdateCheckDesc)
    public static boolean allowUpdateCheck = FloatingRuins.allowUpdateCheck;
    @MLProp(info=FloatingRuins.allowInSuperFlatDesc)
    public static boolean allowInSuperFlat = FloatingRuins.allowInSuperFlat;
    @MLProp(info=FloatingRuins.rarityDesc)
    public static int rarity = FloatingRuins.rarity;
    @MLProp(info=FloatingRuins.baseHeightDesc)
    public static int baseHeight = FloatingRuins.baseHeight;
    @MLProp(info=FloatingRuins.heightVariationDesc)
    public static int heightVariation = FloatingRuins.heightVariation;
    @MLProp(info=FloatingRuins.baseRadiusDesc)
    public static int baseRadius = FloatingRuins.baseRadius;
    @MLProp(info=FloatingRuins.radiusVariationDesc)
    public static int radiusVariation = FloatingRuins.radiusVariation;
    @MLProp(info=FloatingRuins.baseDepthDesc)
    public static int baseDepth = FloatingRuins.baseDepth;
    @MLProp(info=FloatingRuins.depthVariationDesc)
    public static int depthVariation = FloatingRuins.depthVariation;
    @MLProp(info=FloatingRuins.numberOfItemsDesc)
    public static int numberOfItems = FloatingRuins.numberOfItems;
    @MLProp(info=FloatingRuins.blockIDBlacklistDesc)
    public static String blockIDBlacklist = FloatingRuins.blockIDBlacklist;
    @MLProp(info=FloatingRuins.stringOfIdsDesc)
    public static String stringOfIds = FloatingRuins.stringOfIds;
    @MLProp(info=FloatingRuins.spawnerDefaultDesc)
    public static String spawnerDefault = FloatingRuins.spawnerDefault;
    @MLProp(info=FloatingRuins.spawnerDesertDesc)
    public static String spawnerDesert = FloatingRuins.spawnerDesert;
    @MLProp(info=FloatingRuins.spawnerForestDesc)
    public static String spawnerForest = FloatingRuins.spawnerForest;
    @MLProp(info=FloatingRuins.spawnerPlainsDesc)
    public static String spawnerPlains = FloatingRuins.spawnerPlains;
    @MLProp(info=FloatingRuins.spawnerSwamplandDesc)
    public static String spawnerSwampland = FloatingRuins.spawnerSwampland;
    @MLProp(info=FloatingRuins.spawnerTaigaDesc)
    public static String spawnerTaiga = FloatingRuins.spawnerTaiga;
    @MLProp(info=FloatingRuins.spawnerHillsDesc)
    public static String spawnerHills = FloatingRuins.spawnerHills;
    @MLProp(info=FloatingRuins.spawnerOceanDesc)
    public static String spawnerOcean = FloatingRuins.spawnerOcean;
    @MLProp(info=FloatingRuins.spawnerRiverDesc)
    public static String spawnerRiver = FloatingRuins.spawnerRiver;
    @MLProp(info=FloatingRuins.spawnerJungleDesc)
    public static String spawnerJungle = FloatingRuins.spawnerJungle;
    @MLProp(info=FloatingRuins.spawnerIceBiomesDesc)
    public static String spawnerIceBiomes = FloatingRuins.spawnerIceBiomes;
    @MLProp(info=FloatingRuins.spawnerMushroomDesc + "\n\n**ONLY EDIT WHAT IS BELOW THIS**")
    public static String spawnerMushroom = FloatingRuins.spawnerMushroom;

    private ModVersionChecker versionChecker;
    private String versionURL = "https://dl.dropbox.com/u/20748481/Minecraft/1.3.1/floatingRuinsMLMP.version";
    private String mcfTopic = "http://www.minecraftforum.net/topic/1009577-";

    public mod_floatingRuins()
    {
        versionChecker = new ModVersionChecker(getName(), getVersion(), versionURL, mcfTopic, ModLoader.getLogger());
    }

    @Override
    public String getName()
    {
        return "FloatingRuins";
    }

    @Override
    public String getVersion()
    {
        return "MLMP " + FloatingRuins.versionNumber;
    }

    @Override
    public void generateSurface(World world, Random random, int x, int z)
    {
        FloatingRuins.generateSurface(world, random, x, z);
    }

    @Override
    public void load()
    {
        versionChecker.checkVersionWithLogging();
        FloatingRuins.allowUpdateCheck = allowUpdateCheck;
        FloatingRuins.allowInSuperFlat = allowInSuperFlat;
        FloatingRuins.rarity = rarity;
        FloatingRuins.baseHeight = baseHeight;
        FloatingRuins.heightVariation = heightVariation;
        FloatingRuins.baseRadius = baseRadius;
        FloatingRuins.radiusVariation = radiusVariation;
        FloatingRuins.baseDepth = baseDepth;
        FloatingRuins.depthVariation = depthVariation;
        FloatingRuins.numberOfItems = numberOfItems;
        FloatingRuins.blockIDBlacklist = blockIDBlacklist;
        FloatingRuins.stringOfIds = stringOfIds;
        FloatingRuins.spawnerDefault = spawnerDefault;
        FloatingRuins.spawnerDesert = spawnerDesert;
        FloatingRuins.spawnerForest = spawnerForest;
        FloatingRuins.spawnerHills = spawnerHills;
        FloatingRuins.spawnerIceBiomes = spawnerIceBiomes;
        FloatingRuins.spawnerJungle = spawnerJungle;
        FloatingRuins.spawnerMushroom = spawnerMushroom;
        FloatingRuins.spawnerOcean = spawnerOcean;
        FloatingRuins.spawnerPlains = spawnerPlains;
        FloatingRuins.spawnerRiver = spawnerRiver;
        FloatingRuins.spawnerSwampland = spawnerSwampland;
        FloatingRuins.spawnerTaiga = spawnerTaiga;
    }

    @Override
    public boolean hasClientSide()
    {
        return false;
    }
}
