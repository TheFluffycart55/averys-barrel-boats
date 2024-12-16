package net.thefluffycart.barrel_boats;

import net.fabricmc.api.ModInitializer;

import net.thefluffycart.barrel_boats.block.ModBlocks;
import net.thefluffycart.barrel_boats.item.ModItemGroups;
import net.thefluffycart.barrel_boats.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AverysBarrelBoats implements ModInitializer {
	public static final String MOD_ID = "barrel_boats";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}