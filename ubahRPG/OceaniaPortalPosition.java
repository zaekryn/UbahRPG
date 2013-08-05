package ubahRPG;
import net.minecraft.util.ChunkCoordinates;
public class OceaniaPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final OceaniaTeleporter field_85088_e;
public OceaniaPortalPosition(OceaniaTeleporter oceaniaTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = oceaniaTeleporter;
this.field_85087_d = par5;
}
}
