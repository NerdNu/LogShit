package nu.nerd.logshit;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LogShit extends JavaPlugin implements Listener {
	
	protected static final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onCommandPreprocess(PlayerCommandPreprocessEvent event) {
		log.log(Level.INFO, event.getPlayer().getName() + ":" + event.getMessage());
	}
	
}
