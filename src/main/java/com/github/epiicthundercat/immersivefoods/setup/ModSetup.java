package com.github.epiicthundercat.immersivefoods.setup;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// Forge 64 (26.1.2): @Mod.EventBusSubscriber + @SubscribeEvent removed.
// init() is registered via FMLCommonSetupEvent.getBus(modBusGroup).addListener() in Food constructor.
public class ModSetup {
    public static final String TAB_NAME = "immersivefoods";

    public static void setup() {
    }

    public static void init(FMLCommonSetupEvent event) {
    }
}
