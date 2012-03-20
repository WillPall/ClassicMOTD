package classicmotd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ClassicMOTDPlayerListener implements Listener
{
	ClassicMOTD plugin;
	
	public ClassicMOTDPlayerListener( ClassicMOTD plugin )
	{
		this.plugin = plugin;
	}

	@EventHandler( priority = EventPriority.NORMAL )
	public void onPlayerJoin( PlayerJoinEvent event )
	{
		event.getPlayer().sendRawMessage( plugin.config.getMessage() );
	}
}
