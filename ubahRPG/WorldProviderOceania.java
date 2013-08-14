package ubahRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3Pool;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
public class WorldProviderOceania extends WorldProvider
{
private float[] colorsSunriseSunset = new float[4];
public void registerWorldChunkManager()
{
this.worldChunkMgr = new WorldChunkManagerHell(UbahRPG.oceaniaBiome, this.dimensionId, this.dimensionId);
this.dimensionId = UbahRPG.OceaniaID;
this.hasNoSky = false;
}

public IChunkProvider createChunkGenerator()
{
return new ChunkProviderOceania(this.worldObj, this.worldObj.getSeed(), false);
}

public int getAverageGroundLevel()
{
return 0;
}

public String getSaveFolder()
{
    return "UbahRPG_Oceania";
}

@SideOnly(Side.CLIENT)
public boolean doesXZShowFog(int par1, int par2)
{
return false;
}

public boolean renderStars()
{
return false;
}

public boolean renderClouds()
{
return false;
}
public boolean renderVoidFog()
{
return false;
}
public boolean renderEndSky()
{
return false;
}

@SideOnly(Side.CLIENT)
public boolean isSkyColored()
{
return true;
}

public boolean canRespawnHere()
{
return false;
}

public boolean isSurfaceWorld()
{
return false;
}


@Override
public String getWelcomeMessage()
{
    return "Entering Oceania";
}

@Override
public String getDepartMessage()
{
    return "Leaving Oceania";
}

public float[] calcSunriseSunsetColors(float par1, float par2)
{
    return null;
}

@SideOnly(Side.CLIENT)
public Vec3 getFogColor(float par1, float par2)
{
int i = 10518688;
float f2 = MathHelper.cos(par1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
if (f2 < 0.0F)
{
f2 = 0.0F;
}
if (f2 > 1.0F)
{
f2 = 1.0F;
}
float f3 = (i >> 16 & 0xFF) / 255.0F;
float f4 = (i >> 8 & 0xFF) / 255.0F;
float f5 = (i & 0xFF) / 255.0F;
f3 *= (f2 * 0.0F + 0.15F);
f4 *= (f2 * 0.0F + 0.15F);
f5 *= (f2 * 0.0F + 0.15F);
return this.worldObj.getWorldVec3Pool().getVecFromPool(f3, f4, f5);
}

@Override
public String getDimensionName() {
	
	return "Oceania";
}
}
