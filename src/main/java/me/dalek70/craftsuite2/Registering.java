package me.dalek70.craftsuite2;

import me.dalek70.craftsuite2.commands.Fly;
import me.dalek70.craftsuite2.commands.Flyspeed;

import static org.mineacademy.fo.remain.Remain.registerCommand;

public class Registering {
	public static void registerCommands() {
		registerCommand(new Fly());
		registerCommand(new Flyspeed());
	}

	public static void registerEvents() {

	}
}
