package net.aiq9;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.datagen.ModItemTags;
import net.aiq9.item.ModItemGroup;
import net.aiq9.item.ModItems;
import net.aiq9.world.dimension.ModDimension;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TotallyNotASkyDimensionMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tnasdm");
	public static final String MOD_ID = "tnasdm";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModDimension.registerDimension();
	}
}