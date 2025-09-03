package com.oneaura.onelib.config;

import com.oneaura.onelib.configlib.Comment;
import com.oneaura.onelib.configlib.ConfigHolder;

public class ExampleConfig extends ConfigHolder {
    @Comment("The message of the day displayed on startup.")
    public String motd = "Welcome to our server!";

    @Comment("Whether to enable the special rainbow feature.")
    public boolean enableRainbows = true;

    @Comment("The number of lucky blocks to spawn per chunk.\nSet to 0 to disable.")
    public int luckyBlockCount = 3;
}
