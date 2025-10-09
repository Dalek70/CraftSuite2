package me.dalek70.craftsuite2;

import me.dalek70.craftsuite2.commands.Back;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class BackLocationSaver implements Listener {
	@EventHandler
	public void onPlayerTeleport(PlayerTeleportEvent event) {
		Player player = event.getPlayer();
		Back.backLocations.put(player.getUniqueId(), player.getLocation());
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		Back.backLocations.put(player.getUniqueId(), player.getLocation());
	}
}
