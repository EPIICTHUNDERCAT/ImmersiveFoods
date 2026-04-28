package com.github.epiicthundercat.immersivefoods.loot;

import com.github.epiicthundercat.immersivefoods.Reference;
import com.mojang.serialization.MapCodec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IFLootModifiers {

    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Reference.MODID);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> GENERIC_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("generic_add", IFGenericItemModifier.CODEC);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> BOSS_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("boss_add", IFBossItemModifier.CODEC);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> CHANCE_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("chance_add", IFChanceItemModifier.CODEC);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> COOKED_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("cooked_add", IFCookedItemModifier.CODEC);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> COOKED_BOSS_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("cooked_boss_add", IFCookedBossItemModifier.CODEC);

    public static final RegistryObject<MapCodec<? extends IGlobalLootModifier>> COOKED_CHANCE_ADD =
            LOOT_MODIFIER_SERIALIZERS.register("cooked_chance_add", IFCookedChanceItemModifier.CODEC);


    public static void register(BusGroup bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
