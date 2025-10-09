package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Back extends SimpleCommand {
	public Back() {
		super("back");
		setDescription("Teleports you to your previous location.");
		setUsage("back");
		setMinArguments(0);
		setPermission("craftsuite.back");
	}

	public static final Map<UUID, Location> backLocations = new HashMap<>();

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		Location location = backLocations.get(player.getUniqueId());

		if(location != null){
			player.setFallDistance(0);
			player.teleport(location);
			tell(Color.orange + "You have been teleported to your previous location.");
		} else {
			tell(Color.darkRed + "Error: " + Color.red + "You have no previous location.");
		}
	}
}