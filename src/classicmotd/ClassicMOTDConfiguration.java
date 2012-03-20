package classicmotd;

import org.bukkit.configuration.file.FileConfiguration;

public class ClassicMOTDConfiguration
{
	private ClassicMOTD plugin;
	private FileConfiguration config;
	private static String messageDefault = "Welcome to the server!";
	
	public ClassicMOTDConfiguration( ClassicMOTD plugin )
	{
		this.plugin = plugin;
		this.config = this.plugin.getConfig();
		// Load any default values that aren't set from the default config.yml
		this.config.options().copyDefaults( true );
		// Save the defaults back to the plugins/ClassicMOTD/config.yml file
		this.plugin.saveConfig();
		
		// TODO: figure out why this is necessary
		this.plugin.reloadConfig();
		this.config = this.plugin.getConfig();
	}
	
	public void save()
	{
		plugin.saveConfig();
	}
	
	public String getMessage()
	{
		return config.getString( "message", messageDefault );
	}
}
