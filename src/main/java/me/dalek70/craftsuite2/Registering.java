package me.dalek70.craftsuite2;

import me.dalek70.craftsuite2.commands.Fly;

import static org.mineacademy.fo.remain.Remain.registerCommand;

public class Registering {
	public static void registerCommands() {
		registerCommand(new Fly());
	}

	public static void registerEvents() {

	}
}
