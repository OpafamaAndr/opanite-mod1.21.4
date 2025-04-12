package net.opafama.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.opafama.tutorialmod.blocks.ModBlocks;
import net.opafama.tutorialmod.item.ModItemGroups;
import net.opafama.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpaniteMod implements ModInitializer {
	public static final String MOD_ID = "opanitemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}