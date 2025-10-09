package me.dalek70.craftsuite2.commands;

import me.dalek70.craftsuite2.CraftSuite;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CommandBlocker implements Listener {
	public static List<String> blockedCommands = new ArrayList<>();

	public static void loadBlockedCommands() {
		File stringsFile = new File(CraftSuite.getInstance().getDataFolder(), "blocked_commands.yml");

		if (!stringsFile.exists()) {
			CraftSuite.getInstance().getLogger().warning("blocked_commands.yml not found!");
			blockedCommands = new ArrayList<>();
			return;
		}

		YamlConfiguration config = YamlConfiguration.loadConfiguration(stringsFile);
		blockedCommands = config.getStringList("blocked-commands");
	}

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		String commandMessage = event.getMessage().toLowerCase();
		Player player = event.getPlayer();
		if(blockedCommands.contains(commandMessage))
			event.setCancelled(true);
	}
}
