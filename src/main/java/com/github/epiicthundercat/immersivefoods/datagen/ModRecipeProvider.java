package com.github.epiicthundercat.immersivefoods.datagen;

import com.github.epiicthundercat.immersivefoods.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Registration.CARROT_SOUP.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern(" b ")
                .define('x', Items.CARROT)
                .define('b', Items.BOWL)
                .group("immersivefoods")
                .unlockedBy("carrot_soup", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
                .save(recipeOutput);

        //Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Registration.POTATO_SOUP.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern(" b ")
                .define('x', Items.POTATO)
                .define('b', Items.BOWL)
                .group("immersivefoods")
                .unlockedBy("potato_soup", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POTATO))
                .save(recipeOutput);

        //Shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.FILLETED_SQUID_MEAT.get(), 1)
                .requires(Registration.RAW_SQUID_MEAT.get())
                .requires(Items.FLINT)
                .group("immersivefoods")
                .unlockedBy("has_raw_squid", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_SQUID_MEAT.get()))
                .save(recipeOutput);


        //Horse
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_HORSE_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_horse", has(Registration.RAW_HORSE_MEAT.get()))
                .save(recipeOutput, "horse_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_HORSE_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_horse", has(Registration.RAW_HORSE_MEAT.get()))
                .save(recipeOutput, "horse_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_HORSE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_HORSE_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_horse", has(Registration.RAW_HORSE_MEAT.get()))
                .save(recipeOutput, "horse_meat_smoke");

        // 1.21.1
        //Armadillo
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_ARMADILLO_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_ARMADILLO_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_armadillo", has(Registration.RAW_ARMADILLO_MEAT.get()))
                .save(recipeOutput, "armadillo_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_ARMADILLO_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_ARMADILLO_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_armadillo", has(Registration.RAW_ARMADILLO_MEAT.get()))
                .save(recipeOutput, "armadillo_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_ARMADILLO_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_ARMADILLO_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_armadillo", has(Registration.RAW_ARMADILLO_MEAT.get()))
                .save(recipeOutput, "armadillo_meat_smoke");




        //Llama
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_llama", has(Registration.RAW_LLAMA_MEAT.get()))
                .save(recipeOutput, "llama_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_llama", has(Registration.RAW_LLAMA_MEAT.get()))
                .save(recipeOutput, "llama_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_LLAMA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_LLAMA_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_llama", has(Registration.RAW_LLAMA_MEAT.get()))
                .save(recipeOutput, "llama_meat_smoke");

        //Bat
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_BAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_bat", has(Registration.RAW_BAT_MEAT.get()))
                .save(recipeOutput, "bat_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_BAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_bat", has(Registration.RAW_BAT_MEAT.get()))
                .save(recipeOutput, "bat_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_BAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_bat", has(Registration.RAW_BAT_MEAT.get()))
                .save(recipeOutput, "bat_meat_smoke");

        //Donkey
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_donkey", has(Registration.RAW_DONKEY_MEAT.get()))
                .save(recipeOutput, "donkey_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_donkey", has(Registration.RAW_DONKEY_MEAT.get()))
                .save(recipeOutput, "donkey_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_DONKEY_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DONKEY_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_donkey", has(Registration.RAW_DONKEY_MEAT.get()))
                .save(recipeOutput, "donkey_meat_smoke");

        //Mule
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_MULE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_MULE_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_mule", has(Registration.RAW_MULE_MEAT.get()))
                .save(recipeOutput, "mule_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_MULE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_MULE_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_mule", has(Registration.RAW_MULE_MEAT.get()))
                .save(recipeOutput, "mule_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_MULE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_MULE_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_mule", has(Registration.RAW_MULE_MEAT.get()))
                .save(recipeOutput, "mule_meat_smoke");
        //Squid
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SQUID_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_squid", has(Registration.FILLETED_SQUID_MEAT.get()))
                .save(recipeOutput, "squid_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SQUID_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_squid", has(Registration.FILLETED_SQUID_MEAT.get()))
                .save(recipeOutput, "squid_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.FILLETED_SQUID_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SQUID_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_squid", has(Registration.FILLETED_SQUID_MEAT.get()))
                .save(recipeOutput, "squid_meat_smoke");

        //Ocelot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_ocelot", has(Registration.RAW_OCELOT_MEAT.get()))
                .save(recipeOutput, "ocelot_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_ocelot", has(Registration.RAW_OCELOT_MEAT.get()))
                .save(recipeOutput, "ocelot_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_OCELOT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_OCELOT_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_ocelot", has(Registration.RAW_OCELOT_MEAT.get()))
                .save(recipeOutput, "ocelot_meat_smoke");

        //Wolf
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_WOLF_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_wolf", has(Registration.RAW_WOLF_MEAT.get()))
                .save(recipeOutput, "wolf_meat_smelt");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_WOLF_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_wolf", has(Registration.RAW_WOLF_MEAT.get()))
                .save(recipeOutput, "wolf_meat_campfire");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_WOLF_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_WOLF_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_wolf", has(Registration.RAW_WOLF_MEAT.get()))
                .save(recipeOutput, "wolf_meat_smoke");

        //Dragon
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DRAGON_MEAT.get(), 50.0f, 400)
                .group("immersivefoods")
                .unlockedBy("has_raw_dragon", has(Registration.RAW_DRAGON_MEAT.get()))
                .save(recipeOutput, "dragon_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DRAGON_MEAT.get(), 25.0f, 800)
                .group("immersivefoods")
                .unlockedBy("has_raw_dragon", has(Registration.RAW_DRAGON_MEAT.get()))
                .save(recipeOutput, "dragon_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_DRAGON_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DRAGON_MEAT.get(), 100.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_dragon", has(Registration.RAW_DRAGON_MEAT.get()))
                .save(recipeOutput, "dragon_meat_smoke");

        //Parrot
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PARROT_MEAT.get(), 1.0f, 400)
                .group("immersivefoods")
                .unlockedBy("has_raw_parrot", has(Registration.RAW_PARROT_MEAT.get()))
                .save(recipeOutput, "parrot_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PARROT_MEAT.get(), 1.0f, 800)
                .group("immersivefoods")
                .unlockedBy("has_raw_parrot", has(Registration.RAW_PARROT_MEAT.get()))
                .save(recipeOutput, "parrot_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_PARROT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PARROT_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_parrot", has(Registration.RAW_PARROT_MEAT.get()))
                .save(recipeOutput, "parrot_meat_smoke");

        //BatWing
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.BAT_WING.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_WING.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get()))
                .save(recipeOutput, "bat_wing_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.BAT_WING.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_WING.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get()))
                .save(recipeOutput, "bat_wing_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.BAT_WING.get()), RecipeCategory.FOOD, Registration.COOKED_BAT_WING.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_bat_wing", has(Registration.BAT_WING.get()))
                .save(recipeOutput, "bat_wing_smoke");

        //Fox
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_FOX_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_FOX_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_fox", has(Registration.RAW_FOX_MEAT.get()))
                .save(recipeOutput, "fox_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_FOX_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_FOX_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_fox", has(Registration.RAW_FOX_MEAT.get()))
                .save(recipeOutput, "fox_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_FOX_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_FOX_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_fox", has(Registration.RAW_FOX_MEAT.get()))
                .save(recipeOutput, "fox_meat_smoke");

        //Bee
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.DEAD_BEE.get()), RecipeCategory.FOOD, Registration.TOASTED_BEE.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_dead_bee", has(Registration.DEAD_BEE.get()))
                .save(recipeOutput, "bee_toast_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.DEAD_BEE.get()), RecipeCategory.FOOD, Registration.TOASTED_BEE.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_dead_bee", has(Registration.DEAD_BEE.get()))
                .save(recipeOutput, "bee_toast_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.DEAD_BEE.get()), RecipeCategory.FOOD, Registration.TOASTED_BEE.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_dead_bee", has(Registration.DEAD_BEE.get()))
                .save(recipeOutput, "bee_toast_smoke");

        //Goat
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_GOAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_GOAT_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_goat", has(Registration.RAW_GOAT_MEAT.get()))
                .save(recipeOutput, "goat_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_GOAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_GOAT_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_goat", has(Registration.RAW_GOAT_MEAT.get()))
                .save(recipeOutput, "goat_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_GOAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_GOAT_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_goat", has(Registration.RAW_GOAT_MEAT.get()))
                .save(recipeOutput, "goat_meat_smoke");

        //Axolotl
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_AXOLOTL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_AXOLOTL_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_axolotl", has(Registration.RAW_AXOLOTL_MEAT.get()))
                .save(recipeOutput, "axolotl_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_AXOLOTL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_AXOLOTL_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_axolotl", has(Registration.RAW_AXOLOTL_MEAT.get()))
                .save(recipeOutput, "axolotl_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_AXOLOTL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_AXOLOTL_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_axolotl", has(Registration.RAW_AXOLOTL_MEAT.get()))
                .save(recipeOutput, "axolotl_meat_smoke");

        //Polar Bear
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_POLAR_BEAR_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_POLAR_BEAR_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_polar_bear", has(Registration.RAW_POLAR_BEAR_MEAT.get()))
                .save(recipeOutput, "polar_bear_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_POLAR_BEAR_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_POLAR_BEAR_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_polar_bear", has(Registration.RAW_POLAR_BEAR_MEAT.get()))
                .save(recipeOutput, "polar_bear_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_POLAR_BEAR_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_POLAR_BEAR_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_polar_bear", has(Registration.RAW_POLAR_BEAR_MEAT.get()))
                .save(recipeOutput, "polar_bear_meat_smoke");
        //Cat
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_CAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAT_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_cat", has(Registration.RAW_CAT_MEAT.get()))
                .save(recipeOutput, "cat_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_CAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAT_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_cat", has(Registration.RAW_CAT_MEAT.get()))
                .save(recipeOutput, "cat_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_CAT_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAT_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_cat", has(Registration.RAW_CAT_MEAT.get()))
                .save(recipeOutput, "cat_meat_smoke");

        //Panda
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PANDA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PANDA_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_panda", has(Registration.RAW_PANDA_MEAT.get()))
                .save(recipeOutput, "panda_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_PANDA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PANDA_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_panda", has(Registration.RAW_PANDA_MEAT.get()))
                .save(recipeOutput, "panda_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_PANDA_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_PANDA_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_panda", has(Registration.RAW_PANDA_MEAT.get()))
                .save(recipeOutput, "panda_meat_smoke");

        //Turtle
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_TURTLE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_TURTLE_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_turtle", has(Registration.RAW_TURTLE_MEAT.get()))
                .save(recipeOutput, "turtle_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_TURTLE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_TURTLE_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_turtle", has(Registration.RAW_TURTLE_MEAT.get()))
                .save(recipeOutput, "turtle_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_TURTLE_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_TURTLE_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_turtle", has(Registration.RAW_TURTLE_MEAT.get()))
                .save(recipeOutput, "turtle_meat_smoke");

        //Dolphin
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_DOLPHIN_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DOLPHIN_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_dolphin", has(Registration.RAW_DOLPHIN_MEAT.get()))
                .save(recipeOutput, "dolphin_meat_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_DOLPHIN_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DOLPHIN_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_dolphin", has(Registration.RAW_DOLPHIN_MEAT.get()))
                .save(recipeOutput, "dolphin_meat_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_DOLPHIN_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_DOLPHIN_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_dolphin", has(Registration.RAW_DOLPHIN_MEAT.get()))
                .save(recipeOutput, "dolphin_meat_smoke");

        //Frog
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_FROG_LEGS.get()), RecipeCategory.FOOD, Registration.COOKED_FROG_LEGS.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_frog_legs", has(Registration.RAW_FROG_LEGS.get()))
                .save(recipeOutput, "frog_leg_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_FROG_LEGS.get()), RecipeCategory.FOOD, Registration.COOKED_FROG_LEGS.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_frog_legs", has(Registration.RAW_FROG_LEGS.get()))
                .save(recipeOutput, "frog_leg_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_FROG_LEGS.get()), RecipeCategory.FOOD, Registration.COOKED_FROG_LEGS.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_frog_legs", has(Registration.RAW_FROG_LEGS.get()))
                .save(recipeOutput, "frog_leg_smoke");

        //Camel
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_CAMEL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAMEL_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_camel", has(Registration.RAW_CAMEL_MEAT.get()))
                .save(recipeOutput, "camel_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_CAMEL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAMEL_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_camel", has(Registration.RAW_CAMEL_MEAT.get()))
                .save(recipeOutput, "camel_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_CAMEL_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_CAMEL_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_camel", has(Registration.RAW_CAMEL_MEAT.get()))
                .save(recipeOutput, "camel_smoke");

        //Sniffer
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_SNIFFER_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SNIFFER_MEAT.get(), 1.0f, 200)
                .group("immersivefoods")
                .unlockedBy("has_raw_sniffer", has(Registration.RAW_SNIFFER_MEAT.get()))
                .save(recipeOutput, "sniffer_smelt");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Registration.RAW_SNIFFER_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SNIFFER_MEAT.get(), 1.0f, 600)
                .group("immersivefoods")
                .unlockedBy("has_raw_sniffer", has(Registration.RAW_SNIFFER_MEAT.get()))
                .save(recipeOutput, "sniffer_campfire");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Registration.RAW_SNIFFER_MEAT.get()), RecipeCategory.FOOD, Registration.COOKED_SNIFFER_MEAT.get(), 1.0f, 100)
                .group("immersivefoods")
                .unlockedBy("has_raw_sniffer", has(Registration.RAW_SNIFFER_MEAT.get()))
                .save(recipeOutput, "sniffer_smoke");

    }


}

