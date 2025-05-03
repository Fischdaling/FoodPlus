package at.fischling.foodplus;

import at.fischling.foodplus.block.ModBlocks;
import at.fischling.foodplus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodPlus implements ModInitializer {

	public static final String MOD_ID = "foodplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		// ModBlocks.registerModBlocks();
	}
}