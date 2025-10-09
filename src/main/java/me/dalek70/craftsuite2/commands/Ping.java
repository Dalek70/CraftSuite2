package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.Color;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class Ping extends SimpleCommand {
	public Ping() {
		super("ping");
		setPermission("craftsuite.ping");
		setDescription("Checks the ping of a player.");
		setUsage("<username>");
		setMinArguments(0);
	}

	@Override
	protected void onCommand() {
		if(args.length == 0) {
			checkConsole();
			tell(Color.orange + "Your ping is " + Color.aqua + getPlayer().getPing() + Color.orange + ".");
		} else if(args.length == 1) {
			Player playerToCheckPing = Bukkit.getPlayer(args[0]);
			if(playerToCheckPing != null) {
				tell(Color.aqua + playerToCheckPing.getName() + Color.orange + "'s ping is " + Color.aqua + playerToCheckPing.getPing() + Color.orange + ".");
			} else {
				tell(Color.darkRed + "Error: " + Color.red + "That player does not exist / is not online.");
			}
		}
	}
}
