package com.github.epiicthundercat.immersivefoods;

import com.github.epiicthundercat.immersivefoods.loot.IFLootModifiers;
import com.github.epiicthundercat.immersivefoods.setup.IFCreativeTabs;
import com.github.epiicthundercat.immersivefoods.setup.ModConfigSetup;
import com.github.epiicthundercat.immersivefoods.setup.ModSetup;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Food {

    public static final Logger LOGGER = LogManager.getLogger();

    public Food(FMLJavaModLoadingContext context) {

        IEventBus modEventBus = context.getModEventBus();

        IFCreativeTabs.register(modEventBus);

        Registration.register(modEventBus);
        ModSetup.setup();

        IFLootModifiers.register(modEventBus);

        ModConfigSetup.register(context);

        modEventBus.addListener(ModSetup::init);

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

}
