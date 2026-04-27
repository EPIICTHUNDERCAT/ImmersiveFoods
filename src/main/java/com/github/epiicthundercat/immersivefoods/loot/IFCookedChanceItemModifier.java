package com.github.epiicthundercat.immersivefoods.loot;

import com.github.epiicthundercat.immersivefoods.setup.IFConfig;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class IFCookedChanceItemModifier extends LootModifier {
    public static final Supplier<MapCodec<IFCookedChanceItemModifier>> CODEC = () ->
            RecordCodecBuilder.mapCodec(inst -> codecStart(inst)
                    .and(ForgeRegistries.ITEMS.getCodec().fieldOf("raw").forGetter(m -> m.rawItem))
                    .and(ForgeRegistries.ITEMS.getCodec().fieldOf("cooked").forGetter(m -> m.cookedItem))
                    .apply(inst, IFCookedChanceItemModifier::new));

    private final Item rawItem;
    private final Item cookedItem;

    protected IFCookedChanceItemModifier(LootItemCondition[] conditionsIn, Item rawItem, Item cookedItem) {
        super(conditionsIn);
        this.rawItem = rawItem;
        this.cookedItem = cookedItem;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (context.getRandom().nextDouble() / (double) Math.min(context.getLootingModifier() + 1, 2) < IFConfig.CHANCE_MOB_DROP.get()) {
            Entity entity = context.getParamOrNull(LootContextParams.THIS_ENTITY);
            Item drop = (entity != null && entity.isOnFire()) ? cookedItem : rawItem;
            generatedLoot.add(new ItemStack(drop, context.getRandom().nextInt(Math.min(context.getLootingModifier() + 1, 2)) + IFConfig.CHANCE_MOB_FOOD_DROP.get()));
        }
        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
