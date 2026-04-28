package com.github.epiicthundercat.immersivefoods.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;

// Forge 64 (26.1.2): @Mod.EventBusSubscriber + @SubscribeEvent removed.
// Registered via GatherDataEvent.getBus(modBusGroup).addListener() in Food constructor.
//
// net.minecraftforge.client.model.generators removed and net.minecraft.advancements.critereon
// restructured in 26.1.2. Recipe and item model JSONs are pre-generated in src/generated/resources.
public class DataGenerators {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(event.includeClient(), new ModLanguageProvider(packOutput, "en_us"));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(packOutput, "fr_fr"));
    }
}
