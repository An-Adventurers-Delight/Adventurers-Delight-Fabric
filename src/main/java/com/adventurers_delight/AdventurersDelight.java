package com.adventurers_delight; //Zaess

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adventurers_delight.item.ModItemGroups;
import com.adventurers_delight.item.ModItems;

import net.fabricmc.api.ModInitializer;
public class AdventurersDelight implements ModInitializer {
	public static final String MOD_ID = "adventurers_delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}