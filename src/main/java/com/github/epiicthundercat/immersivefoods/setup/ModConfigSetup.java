package com.github.epiicthundercat.immersivefoods.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigSetup {

    // ModLoadingContext.registerConfig() deprecated/removed in Forge 52; use ModContainer.addConfig()
    public static void register(ModContainer container) {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        IFConfig.registerServerConfig(SERVER_BUILDER);
        container.addConfig(new ModConfig(ModConfig.Type.SERVER, SERVER_BUILDER.build(), container));
    }
}
