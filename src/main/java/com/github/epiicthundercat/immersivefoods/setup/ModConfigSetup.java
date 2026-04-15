package com.github.epiicthundercat.immersivefoods.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigSetup {

    public static void register(ModLoadingContext context) {
        registerServerConfigs(context);
    }

    private static void registerServerConfigs(ModLoadingContext context) {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        IFConfig.registerServerConfig(SERVER_BUILDER);
        context.registerConfig(ModConfig.Type.SERVER, SERVER_BUILDER.build());
    }
}
