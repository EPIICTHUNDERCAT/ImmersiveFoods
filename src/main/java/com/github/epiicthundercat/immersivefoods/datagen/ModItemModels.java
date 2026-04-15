package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModels extends ItemModelProvider {

    public ModItemModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Reference.MODID, existingFileHelper);
    }


    @Override
    protected void registerModels() {

        //Horse
        simpleItem(Registration.RAW_HORSE_MEAT);
        simpleItem(Registration.COOKED_HORSE_MEAT);

        //Soups
        simpleItem(Registration.POTATO_SOUP);
        simpleItem(Registration.CARROT_SOUP);

        //Llama
        simpleItem(Registration.RAW_LLAMA_MEAT);
        simpleItem(Registration.COOKED_LLAMA_MEAT);

        //Donkey
        simpleItem(Registration.RAW_DONKEY_MEAT);
        simpleItem(Registration.COOKED_DONKEY_MEAT);

        //Mule
        simpleItem(Registration.RAW_MULE_MEAT);
        simpleItem(Registration.COOKED_MULE_MEAT);

//Bat
        simpleItem(Registration.RAW_BAT_MEAT);
        simpleItem(Registration.COOKED_BAT_MEAT);

//Ocelot
        simpleItem(Registration.RAW_OCELOT_MEAT);
        simpleItem(Registration.COOKED_OCELOT_MEAT);

//Wolf
        simpleItem(Registration.RAW_WOLF_MEAT);
        simpleItem(Registration.COOKED_WOLF_MEAT);

//Bat Wings
        simpleItem(Registration.BAT_WING);
        simpleItem(Registration.COOKED_BAT_WING);

//Squid
        simpleItem(Registration.RAW_SQUID_MEAT);
        simpleItem(Registration.COOKED_SQUID_MEAT);


//Parrot
        simpleItem(Registration.RAW_PARROT_MEAT);
        simpleItem(Registration.COOKED_PARROT_MEAT);

//Dragon
        simpleItem(Registration.RAW_DRAGON_MEAT);
        simpleItem(Registration.COOKED_DRAGON_MEAT);

//Filleted Squid
        simpleItem(Registration.FILLETED_SQUID_MEAT);
//Fox
        simpleItem(Registration.RAW_FOX_MEAT);
        simpleItem(Registration.COOKED_FOX_MEAT);

//Polar Bear
        simpleItem(Registration.RAW_POLAR_BEAR_MEAT);
        simpleItem(Registration.COOKED_POLAR_BEAR_MEAT);

//Bee
        simpleItem(Registration.DEAD_BEE);
        simpleItem(Registration.TOASTED_BEE);

//Goat
        simpleItem(Registration.RAW_GOAT_MEAT);
        simpleItem(Registration.COOKED_GOAT_MEAT);

//Axolotl
        simpleItem(Registration.RAW_AXOLOTL_MEAT);
        simpleItem(Registration.COOKED_AXOLOTL_MEAT);

        //Cat
        simpleItem(Registration.RAW_CAT_MEAT);
        simpleItem(Registration.COOKED_CAT_MEAT);

        //Turtle
        simpleItem(Registration.RAW_TURTLE_MEAT);
        simpleItem(Registration.COOKED_TURTLE_MEAT);

        //Panda
        simpleItem(Registration.RAW_PANDA_MEAT);
        simpleItem(Registration.COOKED_PANDA_MEAT);

        //Dolphin
        simpleItem(Registration.RAW_DOLPHIN_MEAT);
        simpleItem(Registration.COOKED_DOLPHIN_MEAT);

        //Frog
        simpleItem(Registration.RAW_FROG_LEGS);
        simpleItem(Registration.COOKED_FROG_LEGS);

        //Sniffer
        simpleItem(Registration.RAW_SNIFFER_MEAT);
        simpleItem(Registration.COOKED_SNIFFER_MEAT);

        //Camel
        simpleItem(Registration.RAW_CAMEL_MEAT);
        simpleItem(Registration.COOKED_CAMEL_MEAT);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("minecraft:item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("minecraft:item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + item.getId().getPath()));
    }

}
