package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.Color;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.List;

public class Flyspeed extends SimpleCommand {
	public Flyspeed() {
		super("flyspeed", List.of("fls", "fysp", "lysp", "setflyspeed"));
		setPermission("craftsuite.flyspeed");
		setDescription("Changes the flyspeed of the command sender or another player");
		setUsage("<username>");
		setMinArguments(0);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player commandSender = getPlayer();
		if(args.length == 2) {

		} else if(args.length == 1) {

		} else {

		}
	}
}
