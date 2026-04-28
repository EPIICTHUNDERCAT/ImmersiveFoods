package com.github.epiicthundercat.immersivefoods.loot;

import com.github.epiicthundercat.immersivefoods.setup.IFConfig;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class IFChanceItemModifier extends LootModifier {
    public static final Supplier<MapCodec<IFChanceItemModifier>> CODEC = () ->
            RecordCodecBuilder.mapCodec(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec()
            .fieldOf("addition").forGetter(m -> m.item)).apply(inst, IFChanceItemModifier::new));
    private final Item item;

    protected IFChanceItemModifier(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(LootTable lootTable, ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        int looting = context.hasParameter(LootContextParams.ENCHANTMENT_LEVEL) ? context.getParameter(LootContextParams.ENCHANTMENT_LEVEL) : 0;
        if (context.getRandom().nextDouble() / (double) Math.min(looting + 1, 2) < IFConfig.CHANCE_MOB_DROP.get())
            generatedLoot.add(new ItemStack(item, context.getRandom().nextInt(Math.min(looting + 1, 2)) + IFConfig.CHANCE_MOB_FOOD_DROP.get()));
        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
