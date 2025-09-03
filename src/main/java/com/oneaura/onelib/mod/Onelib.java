package com.oneaura.onelib.mod;

import com.oneaura.onelib.config.ExampleConfig;
import com.oneaura.onelib.configlib.ConfigManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Onelib implements ModInitializer {

    public static final String MOD_ID = "onelib";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Config referansı burada
    public static ExampleConfig config;

    @Override
    public void onInitialize() {
        LOGGER.info("OneLib is initializing!");

        // Artık bu kod, güncellenmiş ConfigManager ile sorunsuz çalışacak!
        config = ConfigManager.register(MOD_ID, ExampleConfig.class)
                .orElseThrow(() -> new IllegalStateException("Could not load configuration for " + MOD_ID));

        // Ayarlara erişim testleri
        LOGGER.info("Message of the day: {}", Onelib.config.motd);
        if (Onelib.config.enableRainbows) {
            LOGGER.info("Rainbows are enabled!");
        }
    }
}
