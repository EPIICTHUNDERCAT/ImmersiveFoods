package com.github.epiicthundercat.immersivefoods.common;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Properties;

// BowlFoodItem was removed in MC 1.21.1; this re-implements the bowl-return behaviour.
public class BowlFoodItem extends Item {

    public BowlFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        ItemStack result = super.finishUsingItem(stack, level, livingEntity);
        return result.isEmpty() ? new ItemStack(Items.BOWL) : result;
    }
}
