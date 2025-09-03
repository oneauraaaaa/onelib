package com.oneaura.onelib.mod;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.oneaura.onelib.configlib.gui.ClothConfigScreenBuilder;

/**
 * This class implements the ModMenuApi to provide a configuration screen factory.
 * Mod Menu will detect this class and add a config button for our mod.
 */
public class ModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        // 2. Refer to the MOD_ID using the correct class name (OneLib.MOD_ID)
        return parent -> ClothConfigScreenBuilder.create(parent, Onelib.MOD_ID);
    }
}
