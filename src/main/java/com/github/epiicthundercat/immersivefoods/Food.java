package com.github.epiicthundercat.immersivefoods;

import com.github.epiicthundercat.immersivefoods.datagen.DataGenerators;
import com.github.epiicthundercat.immersivefoods.loot.IFLootModifiers;
import com.github.epiicthundercat.immersivefoods.setup.IFCreativeTabs;
import com.github.epiicthundercat.immersivefoods.setup.ModConfigSetup;
import com.github.epiicthundercat.immersivefoods.setup.ModSetup;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Food {

    public static final Logger LOGGER = LogManager.getLogger();

    // Forge 64 (26.1.2): IEventBus removed — use BusGroup from context.getModBusGroup().
    // @Mod.EventBusSubscriber + @SubscribeEvent replaced by direct listener registration.
    public Food(FMLJavaModLoadingContext context) {
        BusGroup modBusGroup = context.getModBusGroup();
        ModContainer container = context.getContainer();

        IFCreativeTabs.register(modBusGroup);
        Registration.register(modBusGroup);
        ModSetup.setup();
        IFLootModifiers.register(modBusGroup);
        ModConfigSetup.register(container);

        FMLCommonSetupEvent.getBus(modBusGroup).addListener(ModSetup::init);
        GatherDataEvent.getBus(modBusGroup).addListener(DataGenerators::gatherData);
    }
}
