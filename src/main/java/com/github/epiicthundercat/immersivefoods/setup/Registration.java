package com.github.epiicthundercat.immersivefoods.setup;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.github.epiicthundercat.immersivefoods.common.BowlFoodItem;
import com.github.epiicthundercat.immersivefoods.common.FoodValues;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    // MC 26.1.2: Item.Properties requires .setId() before constructor runs.
    private static Item.Properties food(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    private static Item.Properties food(FoodProperties food, Consumable consumable) {
        return new Item.Properties().food(food, consumable);
    }

    private static Item.Properties soupFood(FoodProperties food) {
        return new Item.Properties().stacksTo(1).food(food);
    }

    //Food Items

    //Horse
    public static final RegistryObject<Item> RAW_HORSE_MEAT = ITEMS.register("raw_horse_meat",
            () -> new Item(food(FoodValues.RAW_HORSE_FOOD).setId(ITEMS.key("raw_horse_meat"))));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat",
            () -> new Item(food(FoodValues.COOKED_HORSE_FOOD).setId(ITEMS.key("cooked_horse_meat"))));

    //Soups — BowlFoodItem was removed in MC 1.21.1; using local replacement class
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            () -> new BowlFoodItem(soupFood(FoodValues.CARROT_SOUP_FOOD).setId(ITEMS.key("carrot_soup"))));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup",
            () -> new BowlFoodItem(soupFood(FoodValues.POTATO_SOUP_FOOD).setId(ITEMS.key("potato_soup"))));

    //Llama
    public static final RegistryObject<Item> COOKED_LLAMA_MEAT = ITEMS.register("cooked_llama_meat",
            () -> new Item(food(FoodValues.COOKED_LLAMA_FOOD).setId(ITEMS.key("cooked_llama_meat"))));
    public static final RegistryObject<Item> RAW_LLAMA_MEAT = ITEMS.register("raw_llama_meat",
            () -> new Item(food(FoodValues.RAW_LLAMA_FOOD).setId(ITEMS.key("raw_llama_meat"))));

    //Donkey
    public static final RegistryObject<Item> RAW_DONKEY_MEAT = ITEMS.register("raw_donkey_meat",
            () -> new Item(food(FoodValues.RAW_DONKEY_FOOD).setId(ITEMS.key("raw_donkey_meat"))));
    public static final RegistryObject<Item> COOKED_DONKEY_MEAT = ITEMS.register("cooked_donkey_meat",
            () -> new Item(food(FoodValues.COOKED_DONKEY_FOOD).setId(ITEMS.key("cooked_donkey_meat"))));

    //Mule
    public static final RegistryObject<Item> RAW_MULE_MEAT = ITEMS.register("raw_mule_meat",
            () -> new Item(food(FoodValues.RAW_MULE_FOOD).setId(ITEMS.key("raw_mule_meat"))));
    public static final RegistryObject<Item> COOKED_MULE_MEAT = ITEMS.register("cooked_mule_meat",
            () -> new Item(food(FoodValues.COOKED_MULE_FOOD).setId(ITEMS.key("cooked_mule_meat"))));

    //Ocelot
    public static final RegistryObject<Item> RAW_OCELOT_MEAT = ITEMS.register("raw_ocelot_meat",
            () -> new Item(food(FoodValues.RAW_OCELOT_FOOD).setId(ITEMS.key("raw_ocelot_meat"))));
    public static final RegistryObject<Item> COOKED_OCELOT_MEAT = ITEMS.register("cooked_ocelot_meat",
            () -> new Item(food(FoodValues.COOKED_OCELOT_FOOD).setId(ITEMS.key("cooked_ocelot_meat"))));

    //Wolf
    public static final RegistryObject<Item> RAW_WOLF_MEAT = ITEMS.register("raw_wolf_meat",
            () -> new Item(food(FoodValues.RAW_WOLF_FOOD).setId(ITEMS.key("raw_wolf_meat"))));
    public static final RegistryObject<Item> COOKED_WOLF_MEAT = ITEMS.register("cooked_wolf_meat",
            () -> new Item(food(FoodValues.COOKED_WOLF_FOOD).setId(ITEMS.key("cooked_wolf_meat"))));

    //Bat
    public static final RegistryObject<Item> BAT_WING = ITEMS.register("bat_wing",
            () -> new Item(food(FoodValues.RAW_BAT_WING_FOOD).setId(ITEMS.key("bat_wing"))));
    public static final RegistryObject<Item> COOKED_BAT_WING = ITEMS.register("cooked_bat_wing",
            () -> new Item(food(FoodValues.COOKED_BAT_WING_FOOD).setId(ITEMS.key("cooked_bat_wing"))));
    public static final RegistryObject<Item> RAW_BAT_MEAT = ITEMS.register("raw_bat_meat",
            () -> new Item(food(FoodValues.RAW_BAT_FOOD).setId(ITEMS.key("raw_bat_meat"))));
    public static final RegistryObject<Item> COOKED_BAT_MEAT = ITEMS.register("cooked_bat_meat",
            () -> new Item(food(FoodValues.COOKED_BAT_FOOD).setId(ITEMS.key("cooked_bat_meat"))));

    //Squid
    public static final RegistryObject<Item> FILLETED_SQUID_MEAT = ITEMS.register("filleted_squid_meat",
            () -> new Item(food(FoodValues.FILLETED_SQUID_FOOD).setId(ITEMS.key("filleted_squid_meat"))));
    public static final RegistryObject<Item> RAW_SQUID_MEAT = ITEMS.register("raw_squid_meat",
            () -> new Item(food(FoodValues.RAW_SQUID_FOOD, Consumable.builder()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 400, 0), 0.3f))
                    .build()).setId(ITEMS.key("raw_squid_meat"))));
    public static final RegistryObject<Item> COOKED_SQUID_MEAT = ITEMS.register("cooked_squid_meat",
            () -> new Item(food(FoodValues.COOKED_SQUID_FOOD).setId(ITEMS.key("cooked_squid_meat"))));

    //Parrot
    public static final RegistryObject<Item> RAW_PARROT_MEAT = ITEMS.register("raw_parrot_meat",
            () -> new Item(food(FoodValues.RAW_PARROT_FOOD).setId(ITEMS.key("raw_parrot_meat"))));
    public static final RegistryObject<Item> COOKED_PARROT_MEAT = ITEMS.register("cooked_parrot_meat",
            () -> new Item(food(FoodValues.COOKED_PARROT_FOOD).setId(ITEMS.key("cooked_parrot_meat"))));

    //Dragon
    public static final RegistryObject<Item> RAW_DRAGON_MEAT = ITEMS.register("raw_dragon_meat",
            () -> new Item(food(FoodValues.RAW_DRAGON_FOOD, Consumable.builder()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WITHER, 200, 0), 0.3f))
                    .build()).setId(ITEMS.key("raw_dragon_meat"))));
    public static final RegistryObject<Item> COOKED_DRAGON_MEAT = ITEMS.register("cooked_dragon_meat",
            () -> new Item(food(FoodValues.COOKED_DRAGON_FOOD, Consumable.builder()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 4), 1.0f))
                    .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1800, 0), 0.05f))
                    .build()).setId(ITEMS.key("cooked_dragon_meat"))));

    //Polar Bear
    public static final RegistryObject<Item> RAW_POLAR_BEAR_MEAT = ITEMS.register("raw_polar_bear_meat",
            () -> new Item(food(FoodValues.RAW_BEAR_MEAT).setId(ITEMS.key("raw_polar_bear_meat"))));
    public static final RegistryObject<Item> COOKED_POLAR_BEAR_MEAT = ITEMS.register("cooked_polar_bear_meat",
            () -> new Item(food(FoodValues.COOKED_BEAR_MEAT).setId(ITEMS.key("cooked_polar_bear_meat"))));

    //Axolotl
    public static final RegistryObject<Item> RAW_AXOLOTL_MEAT = ITEMS.register("raw_axolotl_meat",
            () -> new Item(food(FoodValues.RAW_PARROT_FOOD).setId(ITEMS.key("raw_axolotl_meat"))));
    public static final RegistryObject<Item> COOKED_AXOLOTL_MEAT = ITEMS.register("cooked_axolotl_meat",
            () -> new Item(food(FoodValues.COOKED_PARROT_FOOD).setId(ITEMS.key("cooked_axolotl_meat"))));

    //Goat
    public static final RegistryObject<Item> RAW_GOAT_MEAT = ITEMS.register("raw_goat_meat",
            () -> new Item(food(FoodValues.RAW_HORSE_FOOD).setId(ITEMS.key("raw_goat_meat"))));
    public static final RegistryObject<Item> COOKED_GOAT_MEAT = ITEMS.register("cooked_goat_meat",
            () -> new Item(food(FoodValues.COOKED_HORSE_FOOD).setId(ITEMS.key("cooked_goat_meat"))));

    //Fox
    public static final RegistryObject<Item> RAW_FOX_MEAT = ITEMS.register("raw_fox_meat",
            () -> new Item(food(FoodValues.RAW_WOLF_FOOD).setId(ITEMS.key("raw_fox_meat"))));
    public static final RegistryObject<Item> COOKED_FOX_MEAT = ITEMS.register("cooked_fox_meat",
            () -> new Item(food(FoodValues.COOKED_WOLF_FOOD).setId(ITEMS.key("cooked_fox_meat"))));

    //Bee
    public static final RegistryObject<Item> DEAD_BEE = ITEMS.register("dead_bee",
            () -> new Item(food(FoodValues.RAW_BAT_FOOD).setId(ITEMS.key("dead_bee"))));
    public static final RegistryObject<Item> TOASTED_BEE = ITEMS.register("toasted_bee",
            () -> new Item(food(FoodValues.COOKED_BAT_FOOD).setId(ITEMS.key("toasted_bee"))));

    //Cat
    public static final RegistryObject<Item> RAW_CAT_MEAT = ITEMS.register("raw_cat_meat",
            () -> new Item(food(FoodValues.RAW_OCELOT_FOOD).setId(ITEMS.key("raw_cat_meat"))));
    public static final RegistryObject<Item> COOKED_CAT_MEAT = ITEMS.register("cooked_cat_meat",
            () -> new Item(food(FoodValues.COOKED_OCELOT_FOOD).setId(ITEMS.key("cooked_cat_meat"))));

    //Panda
    public static final RegistryObject<Item> RAW_PANDA_MEAT = ITEMS.register("raw_panda_meat",
            () -> new Item(food(FoodValues.RAW_BEAR_MEAT).setId(ITEMS.key("raw_panda_meat"))));
    public static final RegistryObject<Item> COOKED_PANDA_MEAT = ITEMS.register("cooked_panda_meat",
            () -> new Item(food(FoodValues.COOKED_BEAR_MEAT).setId(ITEMS.key("cooked_panda_meat"))));

    //Turtle
    public static final RegistryObject<Item> RAW_TURTLE_MEAT = ITEMS.register("raw_turtle_meat",
            () -> new Item(food(FoodValues.RAW_SQUID_FOOD).setId(ITEMS.key("raw_turtle_meat"))));
    public static final RegistryObject<Item> COOKED_TURTLE_MEAT = ITEMS.register("cooked_turtle_meat",
            () -> new Item(food(FoodValues.COOKED_SQUID_FOOD).setId(ITEMS.key("cooked_turtle_meat"))));

    //Dolphin
    public static final RegistryObject<Item> RAW_DOLPHIN_MEAT = ITEMS.register("raw_dolphin_meat",
            () -> new Item(food(FoodValues.RAW_SQUID_FOOD).setId(ITEMS.key("raw_dolphin_meat"))));
    public static final RegistryObject<Item> COOKED_DOLPHIN_MEAT = ITEMS.register("cooked_dolphin_meat",
            () -> new Item(food(FoodValues.COOKED_SQUID_FOOD).setId(ITEMS.key("cooked_dolphin_meat"))));

    //Frog
    public static final RegistryObject<Item> RAW_FROG_LEGS = ITEMS.register("raw_frog_leg",
            () -> new Item(food(FoodValues.RAW_BAT_FOOD).setId(ITEMS.key("raw_frog_leg"))));
    public static final RegistryObject<Item> COOKED_FROG_LEGS = ITEMS.register("cooked_frog_leg",
            () -> new Item(food(FoodValues.COOKED_BAT_FOOD).setId(ITEMS.key("cooked_frog_leg"))));

    //Camel
    public static final RegistryObject<Item> RAW_CAMEL_MEAT = ITEMS.register("raw_camel_meat",
            () -> new Item(food(FoodValues.RAW_HORSE_FOOD).setId(ITEMS.key("raw_camel_meat"))));
    public static final RegistryObject<Item> COOKED_CAMEL_MEAT = ITEMS.register("cooked_camel_meat",
            () -> new Item(food(FoodValues.COOKED_HORSE_FOOD).setId(ITEMS.key("cooked_camel_meat"))));

    //Sniffer
    public static final RegistryObject<Item> RAW_SNIFFER_MEAT = ITEMS.register("raw_sniffer_meat",
            () -> new Item(food(FoodValues.RAW_HORSE_FOOD).setId(ITEMS.key("raw_sniffer_meat"))));
    public static final RegistryObject<Item> COOKED_SNIFFER_MEAT = ITEMS.register("cooked_sniffer_meat",
            () -> new Item(food(FoodValues.COOKED_HORSE_FOOD).setId(ITEMS.key("cooked_sniffer_meat"))));

    // 26.1.2
    //Armadillo
    public static final RegistryObject<Item> RAW_ARMADILLO_MEAT = ITEMS.register("raw_armadillo_meat",
            () -> new Item(food(FoodValues.RAW_PARROT_FOOD).setId(ITEMS.key("raw_armadillo_meat"))));
    public static final RegistryObject<Item> COOKED_ARMADILLO_MEAT = ITEMS.register("cooked_armadillo_meat",
            () -> new Item(food(FoodValues.COOKED_PARROT_FOOD).setId(ITEMS.key("cooked_armadillo_meat"))));

    //Nautilus
    public static final RegistryObject<Item> RAW_NAUTILUS = ITEMS.register("raw_nautilus",
            () -> new Item(food(FoodValues.RAW_NAUTILUS_FOOD).setId(ITEMS.key("raw_nautilus"))));
    public static final RegistryObject<Item> COOKED_NAUTILUS = ITEMS.register("cooked_nautilus",
            () -> new Item(food(FoodValues.COOKED_NAUTILUS_FOOD).setId(ITEMS.key("cooked_nautilus"))));

    // Forge 64 (26.1.2): DeferredRegister.register() now takes BusGroup instead of IEventBus.
    public static void register(BusGroup bus) {
        ITEMS.register(bus);
    }
}
