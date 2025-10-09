package me.dalek70.craftsuite2;

import me.dalek70.craftsuite2.commands.CommandBlocker;
import me.dalek70.craftsuite2.commands.Fly;
import me.dalek70.craftsuite2.commands.Flyspeed;
import me.dalek70.craftsuite2.commands.Ping;

import static org.mineacademy.fo.remain.Remain.registerCommand;
import static org.mineacademy.fo.Common.registerEvents;

public class Registering {
	public static void registerCommandsStartup() {
		registerCommand(new Fly());
		registerCommand(new Flyspeed());
		registerCommand(new Ping());
	}

	public static void registerEventsStartup() {
		registerEvents(new CommandBlocker());
	}
}
