package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.Color;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

public class Fly extends SimpleCommand {
	public Fly() {
		super("fly", List.of("fl", "fy", "ly", "togglefly"));
		setPermission("craftsuite.fly");
		setDescription("Changes if the player or other player can fly or not.");
		setUsage("<username>");
		setMinArguments(0);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player commandSender = getPlayer();
		if(args.length == 1) {
			Player playerToSetFly = Bukkit.getPlayer(args[0]);
			if(playerToSetFly != null) {
				playerToSetFly.setFlying(!playerToSetFly.isFlying());
				tell((Color.orange + (!playerToSetFly.isFlying() ? "Enabled flying for " : "Disabled flying for ") + Color.aqua + playerToSetFly.getName() + Color.orange + "."));
			} else {
				tell("That player does not exist.");
			}
		} else if(args.length == 0) {
			commandSender.setFlying(!commandSender.isFlying());
			tell(Color.orange + "Flying set to " + Color.aqua + commandSender.isFlying());
		} else {
			tell("Too many arguments.");
		}
	}
}
