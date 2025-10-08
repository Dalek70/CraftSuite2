package me.dalek70.craftsuite2;

import org.mineacademy.fo.plugin.SimplePlugin;

public final class CraftSuite extends SimplePlugin {
	@Override
	protected void onPluginStart() {
		// try to register the commands and if it fails print a message and catch the error.
		try {
			Registering.registerCommands();
		} catch (Exception e) {
			System.out.println("Oh no! There was a error while registering the commands!");
			e.printStackTrace();
		}

		// try to register the events and if it fails print a message and catch the error.
		try {
			Registering.registerEvents();
		} catch (Exception e) {
			System.out.println("Oh no! There was a error while registering the events!");
			e.printStackTrace();
		}
	}

	/**
	 * Gets the instance of the {@link CraftSuite} plugin.
	 * <p>
	 * This method provides access to the plugin instance, allowing you to
	 * retrieve information like the plugin's data folder, register events,
	 * or perform other plugin-related operations.
	 *
	 * @return The singleton instance of {@link CraftSuite}
	 */
	public static CraftSuite getInstance() {
		return (CraftSuite) SimplePlugin.getInstance();
	}
}
