package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.common.FoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    private static Item.Properties food(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    private static Item.Properties soupFood(FoodProperties food) {
        return new Item.Properties().stacksTo(1).food(food);
    }

    //Food Items

    //Horse
    public static final RegistryObject<Item> RAW_HORSE_MEAT = ITEMS.register("raw_horse_meat", () -> new Item(food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new Item(food(FoodValues.COOKED_HORSE_FOOD)));

    //Soups
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BowlFoodItem(soupFood(FoodValues.CARROT_SOUP_FOOD)));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new BowlFoodItem(soupFood(FoodValues.POTATO_SOUP_FOOD)));

    //Llama
    public static final RegistryObject<Item> COOKED_LLAMA_MEAT = ITEMS.register("cooked_llama_meat", () -> new Item(food(FoodValues.COOKED_LLAMA_FOOD)));
    public static final RegistryObject<Item> RAW_LLAMA_MEAT = ITEMS.register("raw_llama_meat", () -> new Item(food(FoodValues.RAW_LLAMA_FOOD)));

    //Donkey
    public static final RegistryObject<Item> RAW_DONKEY_MEAT = ITEMS.register("raw_donkey_meat", () -> new Item(food(FoodValues.RAW_DONKEY_FOOD)));
    public static final RegistryObject<Item> COOKED_DONKEY_MEAT = ITEMS.register("cooked_donkey_meat", () -> new Item(food(FoodValues.COOKED_DONKEY_FOOD)));

    //Mule
    public static final RegistryObject<Item> RAW_MULE_MEAT = ITEMS.register("raw_mule_meat", () -> new Item(food(FoodValues.RAW_MULE_FOOD)));
    public static final RegistryObject<Item> COOKED_MULE_MEAT = ITEMS.register("cooked_mule_meat", () -> new Item(food(FoodValues.COOKED_MULE_FOOD)));

    //Ocelot
    public static final RegistryObject<Item> RAW_OCELOT_MEAT = ITEMS.register("raw_ocelot_meat", () -> new Item(food(FoodValues.RAW_OCELOT_FOOD)));
    public static final RegistryObject<Item> COOKED_OCELOT_MEAT = ITEMS.register("cooked_ocelot_meat", () -> new Item(food(FoodValues.COOKED_OCELOT_FOOD)));

    //Wolf
    public static final RegistryObject<Item> RAW_WOLF_MEAT = ITEMS.register("raw_wolf_meat", () -> new Item(food(FoodValues.RAW_WOLF_FOOD)));
    public static final RegistryObject<Item> COOKED_WOLF_MEAT = ITEMS.register("cooked_wolf_meat", () -> new Item(food(FoodValues.COOKED_WOLF_FOOD)));

    //Bat
    public static final RegistryObject<Item> BAT_WING = ITEMS.register("bat_wing", () -> new Item(food(FoodValues.RAW_BAT_WING_FOOD)));
    public static final RegistryObject<Item> COOKED_BAT_WING = ITEMS.register("cooked_bat_wing", () -> new Item(food(FoodValues.COOKED_BAT_WING_FOOD)));
    public static final RegistryObject<Item> RAW_BAT_MEAT = ITEMS.register("raw_bat_meat", () -> new Item(food(FoodValues.RAW_BAT_FOOD)));
    public static final RegistryObject<Item> COOKED_BAT_MEAT = ITEMS.register("cooked_bat_meat", () -> new Item(food(FoodValues.COOKED_BAT_FOOD)));

    //Squid
    public static final RegistryObject<Item> FILLETED_SQUID_MEAT = ITEMS.register("filleted_squid_meat", () -> new Item(food(FoodValues.FILLETED_SQUID_FOOD)));
    public static final RegistryObject<Item> RAW_SQUID_MEAT = ITEMS.register("raw_squid_meat", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_SQUID_MEAT = ITEMS.register("cooked_squid_meat", () -> new Item(food(FoodValues.COOKED_SQUID_FOOD)));

    //Parrot
    public static final RegistryObject<Item> RAW_PARROT_MEAT = ITEMS.register("raw_parrot_meat", () -> new Item(food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_PARROT_MEAT = ITEMS.register("cooked_parrot_meat", () -> new Item(food(FoodValues.COOKED_PARROT_FOOD)));

    //Dragon
    public static final RegistryObject<Item> RAW_DRAGON_MEAT = ITEMS.register("raw_dragon_meat", () -> new Item(food(FoodValues.RAW_DRAGON_FOOD)));
    public static final RegistryObject<Item> COOKED_DRAGON_MEAT = ITEMS.register("cooked_dragon_meat", () -> new Item(food(FoodValues.COOKED_DRAGON_FOOD)));

    //Polar Bear
    public static final RegistryObject<Item> RAW_POLAR_BEAR_MEAT = ITEMS.register("raw_polar_bear_meat", () -> new Item(food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_POLAR_BEAR_MEAT = ITEMS.register("cooked_polar_bear_meat", () -> new Item(food(FoodValues.COOKED_PARROT_FOOD)));

    //Axolotl
    public static final RegistryObject<Item> RAW_AXOLOTL_MEAT = ITEMS.register("raw_axolotl_meat", () -> new Item(food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_AXOLOTL_MEAT = ITEMS.register("cooked_axolotl_meat", () -> new Item(food(FoodValues.COOKED_PARROT_FOOD)));

    //Goat
    public static final RegistryObject<Item> RAW_GOAT_MEAT = ITEMS.register("raw_goat_meat", () -> new Item(food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_GOAT_MEAT = ITEMS.register("cooked_goat_meat", () -> new Item(food(FoodValues.COOKED_HORSE_FOOD)));

    //Fox
    public static final RegistryObject<Item> RAW_FOX_MEAT = ITEMS.register("raw_fox_meat", () -> new Item(food(FoodValues.RAW_WOLF_FOOD)));
    public static final RegistryObject<Item> COOKED_FOX_MEAT = ITEMS.register("cooked_fox_meat", () -> new Item(food(FoodValues.COOKED_WOLF_FOOD)));

    //Bee
    public static final RegistryObject<Item> DEAD_BEE = ITEMS.register("dead_bee", () -> new Item(food(FoodValues.RAW_BAT_FOOD)));
    public static final RegistryObject<Item> TOASTED_BEE = ITEMS.register("toasted_bee", () -> new Item(food(FoodValues.COOKED_BAT_FOOD)));

    //Cat
    public static final RegistryObject<Item> RAW_CAT_MEAT = ITEMS.register("raw_cat_meat", () -> new Item(food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_CAT_MEAT = ITEMS.register("cooked_cat_meat", () -> new Item(food(FoodValues.COOKED_PARROT_FOOD)));

    //Panda
    public static final RegistryObject<Item> RAW_PANDA_MEAT = ITEMS.register("raw_panda_meat", () -> new Item(food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_PANDA_MEAT = ITEMS.register("cooked_panda_meat", () -> new Item(food(FoodValues.COOKED_HORSE_FOOD)));

    //Turtle
    public static final RegistryObject<Item> RAW_TURTLE_MEAT = ITEMS.register("raw_turtle_meat", () -> new Item(food(FoodValues.RAW_PARROT_FOOD)));
    public static final RegistryObject<Item> COOKED_TURTLE_MEAT = ITEMS.register("cooked_turtle_meat", () -> new Item(food(FoodValues.COOKED_PARROT_FOOD)));

    //Dolphin
    public static final RegistryObject<Item> RAW_DOLPHIN_MEAT = ITEMS.register("raw_dolphin_meat", () -> new Item(food(FoodValues.RAW_SQUID_FOOD)));
    public static final RegistryObject<Item> COOKED_DOLPHIN_MEAT = ITEMS.register("cooked_dolphin_meat", () -> new Item(food(FoodValues.COOKED_SQUID_FOOD)));

    //Frog
    public static final RegistryObject<Item> RAW_FROG_LEGS = ITEMS.register("raw_frog_leg", () -> new Item(food(FoodValues.RAW_SQUID_FOOD)));
    public static final RegistryObject<Item> COOKED_FROG_LEGS = ITEMS.register("cooked_frog_leg", () -> new Item(food(FoodValues.COOKED_SQUID_FOOD)));

    //Camel
    public static final RegistryObject<Item> RAW_CAMEL_MEAT = ITEMS.register("raw_camel_meat", () -> new Item(food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_CAMEL_MEAT = ITEMS.register("cooked_camel_meat", () -> new Item(food(FoodValues.COOKED_HORSE_FOOD)));

    //Sniffer
    public static final RegistryObject<Item> RAW_SNIFFER_MEAT = ITEMS.register("raw_sniffer_meat", () -> new Item(food(FoodValues.RAW_HORSE_FOOD)));
    public static final RegistryObject<Item> COOKED_SNIFFER_MEAT = ITEMS.register("cooked_sniffer_meat", () -> new Item(food(FoodValues.COOKED_HORSE_FOOD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
