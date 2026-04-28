package com.github.epiicthundercat.immersivefoods.common;

import net.minecraft.world.food.FoodProperties;

// MC 26.1.2: FoodProperties is now a simple record (nutrition, saturation, canAlwaysEat).
// The Builder.effect() method was removed — mob effects on food now go through
// the Consumable component system set in Registration.java per item.
public class FoodValues {

    public static final FoodProperties RAW_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_HORSE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties CARROT_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties POTATO_SOUP_FOOD = (new FoodProperties.Builder())
            .nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties RAW_BEAR_MEAT = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.8f).build();
    public static final FoodProperties COOKED_BEAR_MEAT = (new FoodProperties.Builder())
            .nutrition(12).saturationModifier(1.8f).build();
    public static final FoodProperties COOKED_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_LLAMA_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_DONKEY_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_MULE_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_BAT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.2f).build();
    public static final FoodProperties COOKED_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_OCELOT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_WOLF_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_BAT_WING_FOOD = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties RAW_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_PARROT_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(10).saturationModifier(3.0f).alwaysEdible().build();
    public static final FoodProperties COOKED_DRAGON_FOOD = (new FoodProperties.Builder())
            .nutrition(20).saturationModifier(15.0f).alwaysEdible().build();
    public static final FoodProperties FILLETED_SQUID_FOOD = (new FoodProperties.Builder())
            .nutrition(4).saturationModifier(0.3f).build();
    public static final FoodProperties RAW_NAUTILUS_FOOD = (new FoodProperties.Builder())
            .nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_NAUTILUS_FOOD = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
}
