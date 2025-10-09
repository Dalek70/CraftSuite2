package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.Color;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

public class Flyspeed extends SimpleCommand {
	public Flyspeed() {
		super("flyspeed", List.of("flysp", "flsp", "fsp", "setflyspeed"));
		setPermission("craftsuite.flyspeed");
		setDescription("Changes the flyspeed of the command sender or another player");
		setUsage("<username> <speed>");
		setMinArguments(1);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player commandSender = getPlayer();
		if(args.length == 2) {
			Player playerToSetSpeed = Bukkit.getPlayer(args[0]);
			if(playerToSetSpeed == null) {
				tell(Color.darkRed + "Error: " + Color.red + "That player is not online / does not exist.");
			} else {
				float flyspeed = Float.parseFloat(args[1]);
				if(flyspeed >= 0 && flyspeed <= 10) {
					playerToSetSpeed.setFlySpeed(flyspeed);
					tell(Color.orange + "Set " + Color.aqua + playerToSetSpeed.getName() + Color.orange + "'s flyspeed to " + Color.aqua + args[1]);
				} else if(flyspeed < 0) {
					tell(Color.darkRed + "Error: " + Color.red + "Flyspeed must be 0 or higher.");
				} else if(flyspeed > 10) {
					tell(Color.darkRed + "Error: " + Color.red + "Flyspeed must be lower than 10.");
				}
			}
		} else if(args.length == 1) {
			try {
				float flyspeed = Float.parseFloat(args[0]);
				if(flyspeed >= 0 && flyspeed <= 10) {
					commandSender.setFlySpeed(flyspeed);
					tell(Color.orange + "Your flyspeed has been set to " + Color.aqua + args[0]);
				} else if(flyspeed < 0) {
					tell(Color.darkRed + "Error: " + Color.red + "Flyspeed must be 0 or higher.");
				} else if(flyspeed > 10) {
					tell(Color.darkRed + "Error: " + Color.red + "Flyspeed must be lower than 10.");
				}
			} catch (NumberFormatException e) {
				tell(Color.darkRed + "Error: " + Color.red + "Flyspeed value can only be a number.");
			}
		} else {
			tell("Not enough or too many arguments.");
		}
	}
}
