package ubahRPG;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxyUbah extends CommonProxyUbah
{
	public void registerSound() {
		MinecraftForge.EVENT_BUS.register(new EventSounds());
	}
	
	@Override
	public void renderEntity()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityElf.class, new RenderElf(new ModelElf(), 0.3F));
	}
}
