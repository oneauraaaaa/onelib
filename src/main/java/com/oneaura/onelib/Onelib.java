package com.oneaura.onelib;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Onelib implements ModInitializer {
	public static final String MOD_ID = "onelib";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("ONELIB -> Onelib loaded successfully!");
        LOGGER.info("ur this deep into the logs huh?");
	}
}