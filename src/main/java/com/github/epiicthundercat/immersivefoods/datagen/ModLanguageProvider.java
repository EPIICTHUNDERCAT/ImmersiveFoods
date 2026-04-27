package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.epiicthundercat.immersivefoods.setup.ModSetup.TAB_NAME;

public class ModLanguageProvider extends LanguageProvider {

    private final String locale;

    public ModLanguageProvider(PackOutput packOutput, String locale) {
        super(packOutput, Reference.MODID, locale);

        this.locale = locale;
    }

    @Override
    protected void addTranslations() {

        add("creativetab.immersivefoods_tab", "Immersive Foods");
        if (locale.equals("fr_fr")) {
            //Horse
            add(Registration.RAW_HORSE_MEAT.get(), "Cheval cru");
            add(Registration.COOKED_HORSE_MEAT.get(), "Steak de cheval cuit");
            //Soups
            add(Registration.CARROT_SOUP.get(), "Soupe de carottes");
            add(Registration.POTATO_SOUP.get(), "Soupe de pommes de terre");
            //Llama
            add(Registration.RAW_LLAMA_MEAT.get(), "Lama cru");
            add(Registration.COOKED_LLAMA_MEAT.get(), "Lama cuit");
            //Donkey
            add(Registration.RAW_DONKEY_MEAT.get(), "Viande d'âne crue");
            add(Registration.COOKED_DONKEY_MEAT.get(), "Steak d'âne cuit");
            //Mule
            add(Registration.RAW_MULE_MEAT.get(), "Mulet cru");
            add(Registration.COOKED_MULE_MEAT.get(), "Steak de mulet cuit");
            //Ocelot
            add(Registration.RAW_OCELOT_MEAT.get(), "Ocelot cru");
            add(Registration.COOKED_OCELOT_MEAT.get(), "Ocelot cuit");
            //Wolf
            add(Registration.RAW_WOLF_MEAT.get(), "Loup cru");
            add(Registration.COOKED_WOLF_MEAT.get(), "Loup cuit");
            //Bat
            add(Registration.RAW_BAT_MEAT.get(), "Chauve-souris crue");
            add(Registration.COOKED_BAT_MEAT.get(), "Chauve-souris cuite");
            add(Registration.BAT_WING.get(), "Aile de chauve-souris");
            add(Registration.COOKED_BAT_WING.get(), "Aile de chauve-souris cuite");
            //Squid
            add(Registration.RAW_SQUID_MEAT.get(), "Calmar cru");
            add(Registration.FILLETED_SQUID_MEAT.get(), "Calmar désossé");
            add(Registration.COOKED_SQUID_MEAT.get(), "Calmar désossé cuit");
            //Parrot
            add(Registration.RAW_PARROT_MEAT.get(), "Perroquet cru");
            add(Registration.COOKED_PARROT_MEAT.get(), "Perroquet cuit");
            //Ender Dragon
            add(Registration.RAW_DRAGON_MEAT.get(), "Dragon cru");
            add(Registration.COOKED_DRAGON_MEAT.get(), "Dragon cuit");
            //Fox
            add(Registration.RAW_FOX_MEAT.get(), "Renard cru");
            add(Registration.COOKED_FOX_MEAT.get(), "Renard cuit");
            //Goat
            add(Registration.RAW_GOAT_MEAT.get(), "Chèvre crue");
            add(Registration.COOKED_GOAT_MEAT.get(), "Côtelette de chèvre cuite");
            //Polar Bear
            add(Registration.RAW_POLAR_BEAR_MEAT.get(), "Ours polaire cru");
            add(Registration.COOKED_POLAR_BEAR_MEAT.get(), "Ours polaire cuit");
            //Axolotl
            add(Registration.RAW_AXOLOTL_MEAT.get(), "Axolotl cru");
            add(Registration.COOKED_AXOLOTL_MEAT.get(), "Axolotl cuit");
            //Bee
            add(Registration.DEAD_BEE.get(), "Abeille morte");
            add(Registration.TOASTED_BEE.get(), "Abeille grillée");
            //Cat
            add(Registration.RAW_CAT_MEAT.get(), "Chat cru");
            add(Registration.COOKED_CAT_MEAT.get(), "Chat cuit");
            //Turtle
            add(Registration.RAW_TURTLE_MEAT.get(), "Tortue crue");
            add(Registration.COOKED_TURTLE_MEAT.get(), "Tortue cuite");
            //Panda
            add(Registration.RAW_PANDA_MEAT.get(), "Panda cru");
            add(Registration.COOKED_PANDA_MEAT.get(), "Panda cuit");
            //Dolphin
            add(Registration.RAW_DOLPHIN_MEAT.get(), "Dauphin cru");
            add(Registration.COOKED_DOLPHIN_MEAT.get(), "Dauphin cuit");
            //Frog
            add(Registration.RAW_FROG_LEGS.get(), "Cuisse de grenouille crue");
            add(Registration.COOKED_FROG_LEGS.get(), "Cuisse de grenouille cuite");
            //Camel
            add(Registration.RAW_CAMEL_MEAT.get(), "Chameau cru");
            add(Registration.COOKED_CAMEL_MEAT.get(), "Chameau cuit");
            //Sniffer
            add(Registration.RAW_SNIFFER_MEAT.get(), "Flaireur cru");
            add(Registration.COOKED_SNIFFER_MEAT.get(), "Flaireur cuit");
            //Armadillo
            add(Registration.RAW_ARMADILLO_MEAT.get(), "Tatou cru");
            add(Registration.COOKED_ARMADILLO_MEAT.get(), "Tatou cuit");
        } else {
            //Horse
            add(Registration.RAW_HORSE_MEAT.get(), "Raw Horse");
            add(Registration.COOKED_HORSE_MEAT.get(), "Cooked Horse Steak");
            //Soups
            add(Registration.CARROT_SOUP.get(), "Carrot Soup");
            add(Registration.POTATO_SOUP.get(), "Potato Soup");
            //Llama
            add(Registration.COOKED_LLAMA_MEAT.get(), "Cooked Llama");
            add(Registration.RAW_LLAMA_MEAT.get(), "Raw Llama");
            //Donkey
            add(Registration.RAW_DONKEY_MEAT.get(), "Raw Donkey Meat");
            add(Registration.COOKED_DONKEY_MEAT.get(), "Cooked Donkey Steak");
            //Mule
            add(Registration.RAW_MULE_MEAT.get(), "Raw Mule");
            add(Registration.COOKED_MULE_MEAT.get(), "Cooked Mule Steak");
            //Ocelot
            add(Registration.RAW_OCELOT_MEAT.get(), "Raw Ocelot");
            add(Registration.COOKED_OCELOT_MEAT.get(), "Cooked Ocelot");
            //Wolf
            add(Registration.RAW_WOLF_MEAT.get(), "Raw Wolf");
            add(Registration.COOKED_WOLF_MEAT.get(), "Cooked Wolf");
            //Bat
            add(Registration.RAW_BAT_MEAT.get(), "Raw Bat");
            add(Registration.COOKED_BAT_MEAT.get(), "Cooked Bat");
            add(Registration.BAT_WING.get(), "Bat Wing");
            add(Registration.COOKED_BAT_WING.get(), "Cooked Bat Wing");
            //Squid
            add(Registration.RAW_SQUID_MEAT.get(), "Raw Squid");
            add(Registration.FILLETED_SQUID_MEAT.get(), "Filleted Squid");
            add(Registration.COOKED_SQUID_MEAT.get(), "Cooked Filleted Squid");
            //Parrot
            add(Registration.RAW_PARROT_MEAT.get(), "Raw Parrot");
            add(Registration.COOKED_PARROT_MEAT.get(), "Cooked Parrot");
            //Ender Dragon
            add(Registration.RAW_DRAGON_MEAT.get(), "Raw Dragon");
            add(Registration.COOKED_DRAGON_MEAT.get(), "Cooked Dragon");
            //Fox
            add(Registration.RAW_FOX_MEAT.get(), "Raw Fox");
            add(Registration.COOKED_FOX_MEAT.get(), "Cooked Fox");
            //Goat
            add(Registration.RAW_GOAT_MEAT.get(), "Raw Goat");
            add(Registration.COOKED_GOAT_MEAT.get(), "Cooked Goat Chop");
            //Polar Bear
            add(Registration.RAW_POLAR_BEAR_MEAT.get(), "Raw Polar Bear");
            add(Registration.COOKED_POLAR_BEAR_MEAT.get(), "Cooked Polar Bear");
            //Axolotl
            add(Registration.RAW_AXOLOTL_MEAT.get(), "Raw Axolotl");
            add(Registration.COOKED_AXOLOTL_MEAT.get(), "Cooked Axolotl");
            //Bee
            add(Registration.DEAD_BEE.get(), "Dead Bee");
            add(Registration.TOASTED_BEE.get(), "Toasted Bee");
            //Cat
            add(Registration.RAW_CAT_MEAT.get(), "Raw Cat");
            add(Registration.COOKED_CAT_MEAT.get(), "Cooked Cat");
            //Turtle
            add(Registration.RAW_TURTLE_MEAT.get(), "Raw Turtle");
            add(Registration.COOKED_TURTLE_MEAT.get(), "Cooked Turtle");
            //Panda
            add(Registration.RAW_PANDA_MEAT.get(), "Raw Panda");
            add(Registration.COOKED_PANDA_MEAT.get(), "Cooked Panda");
            //Dolphin
            add(Registration.RAW_DOLPHIN_MEAT.get(), "Raw Dolphin");
            add(Registration.COOKED_DOLPHIN_MEAT.get(), "Cooked Dolphin");
            //Frog
            add(Registration.RAW_FROG_LEGS.get(), "Frog Leg");
            add(Registration.COOKED_FROG_LEGS.get(), "Cooked Frog Leg");

            //Camel
            add(Registration.RAW_CAMEL_MEAT.get(), "Raw Camel");
            add(Registration.COOKED_CAMEL_MEAT.get(), "Cooked Camel");

            //Sniffer
            add(Registration.RAW_SNIFFER_MEAT.get(), "Raw Sniffer");
            add(Registration.COOKED_SNIFFER_MEAT.get(), "Cooked Sniffer");

            //1.21.1
            //Armadillo
            add(Registration.RAW_ARMADILLO_MEAT.get(), "Raw Armadillo");
            add(Registration.COOKED_ARMADILLO_MEAT.get(), "Cooked Armadillo");
        }
    }
}