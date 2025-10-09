package me.dalek70.craftsuite2;

import me.dalek70.craftsuite2.commands.*;

import static org.mineacademy.fo.remain.Remain.registerCommand;
import static org.mineacademy.fo.Common.registerEvents;

public class Registering {
	public static void registerCommandsStartup() {
		registerCommand(new Fly());
		registerCommand(new Flyspeed());
		registerCommand(new Ping());
		registerCommand(new Back());
	}

	public static void registerEventsStartup() {
		registerEvents(new CommandBlocker());
		registerEvents(new BackLocationSaver());
	}
}
