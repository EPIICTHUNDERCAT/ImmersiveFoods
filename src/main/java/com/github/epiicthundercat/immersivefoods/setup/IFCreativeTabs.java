package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IFCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("immersivefoods_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Registration.TOASTED_BEE.get())).title(Component.translatable("creativetab.immersivefoods_tab"))
            .displayItems((pParams, pOutput) -> {

                //Polar Bear
                pOutput.accept(Registration.COOKED_AXOLOTL_MEAT.get());
                pOutput.accept(Registration.RAW_AXOLOTL_MEAT.get());

                //Polar Bear
                pOutput.accept(Registration.COOKED_BAT_MEAT.get());
                pOutput.accept(Registration.RAW_BAT_MEAT.get());
                pOutput.accept(Registration.COOKED_BAT_WING.get());

                //Polar Bear
                pOutput.accept(Registration.COOKED_DOLPHIN_MEAT.get());
                pOutput.accept(Registration.RAW_DOLPHIN_MEAT.get());

                //Polar Bear
                pOutput.accept(Registration.COOKED_DRAGON_MEAT.get());
                pOutput.accept(Registration.RAW_DRAGON_MEAT.get());

                //Polar Bear
                pOutput.accept(Registration.DEAD_BEE.get());
                pOutput.accept(Registration.TOASTED_BEE.get());

                //Soups
                pOutput.accept(Registration.CARROT_SOUP.get());
                pOutput.accept(Registration.POTATO_SOUP.get());

                //Squid
                pOutput.accept(Registration.COOKED_SQUID_MEAT.get());
                pOutput.accept(Registration.FILLETED_SQUID_MEAT.get());
                pOutput.accept(Registration.RAW_SQUID_MEAT.get());

                //Cat
                pOutput.accept(Registration.COOKED_CAT_MEAT.get());
                pOutput.accept(Registration.RAW_CAT_MEAT.get());

                //Donkey
                pOutput.accept(Registration.COOKED_DONKEY_MEAT.get());
                pOutput.accept(Registration.RAW_DONKEY_MEAT.get());

                //Fox
                pOutput.accept(Registration.COOKED_FOX_MEAT.get());
                pOutput.accept(Registration.RAW_FOX_MEAT.get());

                //Horse
                pOutput.accept(Registration.COOKED_HORSE_MEAT.get());
                pOutput.accept(Registration.RAW_HORSE_MEAT.get());

                //Llama
                pOutput.accept(Registration.COOKED_LLAMA_MEAT.get());
                pOutput.accept(Registration.RAW_LLAMA_MEAT.get());

                //Goat
                pOutput.accept(Registration.COOKED_GOAT_MEAT.get());
                pOutput.accept(Registration.RAW_GOAT_MEAT.get());

                //Mule
                pOutput.accept(Registration.COOKED_MULE_MEAT.get());
                pOutput.accept(Registration.RAW_MULE_MEAT.get());

                //Ocelot
                pOutput.accept(Registration.COOKED_OCELOT_MEAT.get());
                pOutput.accept(Registration.RAW_OCELOT_MEAT.get());

                //Parrot
                pOutput.accept(Registration.COOKED_PARROT_MEAT.get());
                pOutput.accept(Registration.RAW_PARROT_MEAT.get());

                //Panda
                pOutput.accept(Registration.COOKED_PANDA_MEAT.get());
                pOutput.accept(Registration.RAW_PANDA_MEAT.get());

                //Polar Bear
                pOutput.accept(Registration.COOKED_POLAR_BEAR_MEAT.get());
                pOutput.accept(Registration.RAW_POLAR_BEAR_MEAT.get());

                //Turtle
                pOutput.accept(Registration.RAW_TURTLE_MEAT.get());
                pOutput.accept(Registration.COOKED_TURTLE_MEAT.get());

                //Wolf
                pOutput.accept(Registration.COOKED_WOLF_MEAT.get());
                pOutput.accept(Registration.RAW_WOLF_MEAT.get());

                //Frog
                pOutput.accept(Registration.COOKED_FROG_LEGS.get());
                pOutput.accept(Registration.RAW_FROG_LEGS.get());

                //Sniffer
                pOutput.accept(Registration.COOKED_SNIFFER_MEAT.get());
                pOutput.accept(Registration.RAW_SNIFFER_MEAT.get());

                //Camel
                pOutput.accept(Registration.COOKED_CAMEL_MEAT.get());
                pOutput.accept(Registration.RAW_CAMEL_MEAT.get());

                // 1.21.1
                //Armadillo
                pOutput.accept(Registration.COOKED_ARMADILLO_MEAT.get());
                pOutput.accept(Registration.RAW_ARMADILLO_MEAT.get());

            }).build()

    );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
