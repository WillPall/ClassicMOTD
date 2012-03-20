package classicmotd;

import java.io.File;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;

public class ClassicMOTD extends JavaPlugin
{
	protected ClassicMOTDConfiguration config;
	
	public void onEnable()
	{
		// Config must be loaded first
		config = new ClassicMOTDConfiguration( this );
		
		ClassicMOTDPlayerListener playerListener = new ClassicMOTDPlayerListener( this );
		getServer().getPluginManager().registerEvents( playerListener, this );
		
		PluginDescriptionFile description = getDescription();
		getServer().getLogger().info( description.getName() + " (v" + description.getVersion() + ") is enabled!" );
	}
	
	public void onDisable()
	{
		config.save();
	}
}
