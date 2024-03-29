package com.github.epiicthundercat.immersivefoods;

import com.github.epiicthundercat.immersivefoods.setup.ModConfigSetup;
import com.github.epiicthundercat.immersivefoods.setup.ModSetup;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Food {

    public static final Logger LOGGER = LogManager.getLogger();

    public Food() {

        Registration.init();
        ModSetup.setup();
        ModConfigSetup.register();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);


    }


}
