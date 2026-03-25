package net.michael.milkmod.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum MilkToolMaterials implements ToolMaterial {

    MILK_INGOT(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1500,   // durability
            10.0F,  // mining speed
            4.0F,  // attack damage
            20,    // enchantability
            () -> Ingredient.ofItems(ModItems.MILK_INGOT)
    ),

    CHOCOMILK_INGOT(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2500,   // durability
            13.0F,  // mining speed
            4.5F,  // attack damage
            20,    // enchantability
            () -> Ingredient.ofItems(ModItems.CHOCOMILK_INGOT)

    ),

    STRAWBERRY_MILK_INGOT(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2500,   // durability
            13.0F,  // mining speed
            4.5F,  // attack damage
            20,    // enchantability
            () -> Ingredient.ofItems(ModItems.STRAWBERRY_MILK_INGOT)

    ),

    CHEESE(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            3500,   // durability
            13.0F,  // mining speed
            4.5F,  // attack damage
            20,    // enchantability
            () -> Ingredient.ofItems(ModItems.CHEESE)

    );

    private final TagKey<Block> inverseTag;
    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    MilkToolMaterials(
            TagKey<Block> inverseTag,
            int durability,
            float miningSpeed,
            float attackDamage,
            int enchantability,
            Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() { return this.enchantability; }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}