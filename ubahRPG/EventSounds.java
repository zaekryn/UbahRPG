package ubahRPG;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventSounds {
	@ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try 
        {
        	
        	event.manager.addSound("ubgms_rpg:mob/elf/say.ogg");
        	event.manager.addSound("ubgms_rpg:mob/elf/death.ogg");
        	event.manager.addSound("ubgms_rpg:mob/elf/hurt.ogg");
        	//
        	event.manager.addSound("ubgms_rpg:mob/orc/say.ogg");
        	event.manager.addSound("ubgms_rpg:mob/orc/death.ogg");
        	event.manager.addSound("ubgms_rpg:mob/orc/hurt.ogg");
        	//
        	event.manager.addSound("ubgms_rpg:random/drawSword.wav");
            
        }
        catch (Exception e)
        {
            System.err.println("Sound Failure");
        }
    }
}
