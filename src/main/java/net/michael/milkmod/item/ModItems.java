package net.michael.milkmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.michael.milkmod.MilkMod;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;

public class ModItems {

   // MILK ITEMS
    public static final Item MILK_INGOT =
            registerItem("milk_ingot", new Item(new Item.Settings()));

    public static final Item MILK_SWORD = registerItem("milk_sword",
            new SwordItem(MilkToolMaterials.MILK_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MilkToolMaterials.MILK_INGOT, 3, -2.0f))));

    public static final Item MILK_PICKAXE = registerItem("milk_pickaxe",
            new PickaxeItem(MilkToolMaterials.MILK_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(MilkToolMaterials.MILK_INGOT, 1, -2.6f))));

    public static final Item MILK_AXE = registerItem("milk_axe",
            new AxeItem(MilkToolMaterials.MILK_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(MilkToolMaterials.MILK_INGOT, 5, -2.9f))));

    public static final Item MILK_SHOVEL = registerItem("milk_shovel",
            new ShovelItem(MilkToolMaterials.MILK_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(MilkToolMaterials.MILK_INGOT, 1.5f, -3.0f))));

    public static final Item MILK_HOE = registerItem("milk_hoe",
            new HoeItem(MilkToolMaterials.MILK_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(MilkToolMaterials.MILK_INGOT, -4, -3.0f))));

    public static final Item MILK_HELMET = registerItem("milk_helmet",
            new ArmorItem(ModArmorMaterials.MILK_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item MILK_CHESTPLATE = registerItem("milk_chestplate",
            new ArmorItem(ModArmorMaterials.MILK_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item MILK_LEGGINGS = registerItem("milk_leggings",
            new ArmorItem(ModArmorMaterials.MILK_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item MILK_BOOTS = registerItem("milk_boots",
            new ArmorItem(ModArmorMaterials.MILK_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));


    // CHOCOMILK ITEMS
    public static final Item CHOCOMILK_INGOT =
            registerItem("chocomilk_ingot", new Item(new Item.Settings()));

    public static final Item CHOCOMILK_SWORD = registerItem("chocomilk_sword",
            new SwordItem(MilkToolMaterials.CHOCOMILK_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MilkToolMaterials.CHOCOMILK_INGOT, 4, -2.0f))));

    public static final Item CHOCOMILK_PICKAXE = registerItem("chocomilk_pickaxe",
            new PickaxeItem(MilkToolMaterials.CHOCOMILK_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(MilkToolMaterials.CHOCOMILK_INGOT, 2, -2.6f))));

    public static final Item CHOCOMILK_AXE = registerItem("chocomilk_axe",
            new AxeItem(MilkToolMaterials.CHOCOMILK_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(MilkToolMaterials.CHOCOMILK_INGOT, 6, -2.9f))));

    public static final Item CHOCOMILK_SHOVEL = registerItem("chocomilk_shovel",
            new ShovelItem(MilkToolMaterials.CHOCOMILK_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(MilkToolMaterials.CHOCOMILK_INGOT, 2.5f, -3.0f))));

    public static final Item CHOCOMILK_HOE = registerItem("chocomilk_hoe",
            new HoeItem(MilkToolMaterials.CHOCOMILK_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(MilkToolMaterials.CHOCOMILK_INGOT, -3, -3.0f))));

    public static final Item CHOCOMILK_HELMET = registerItem("chocomilk_helmet",
            new ArmorItem(ModArmorMaterials.CHOCOMILK_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item CHOCOMILK_CHESTPLATE = registerItem("chocomilk_chestplate",
            new ArmorItem(ModArmorMaterials.CHOCOMILK_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item CHOCOMILK_LEGGINGS = registerItem("chocomilk_leggings",
            new ArmorItem(ModArmorMaterials.CHOCOMILK_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item CHOCOMILK_BOOTS = registerItem("chocomilk_boots",
            new ArmorItem(ModArmorMaterials.CHOCOMILK_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    // STRAWBERRY ITEMS
    public static final Item STRAWBERRY_MILK_INGOT =
            registerItem("strawberry_milk_ingot", new Item(new Item.Settings()));

    public static final Item STRAWBERRY_MILK_SWORD = registerItem("strawberry_milk_sword",
            new SwordItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MilkToolMaterials.STRAWBERRY_MILK_INGOT, 4, -2.0f))));

    public static final Item STRAWBERRY_MILK_PICKAXE = registerItem("strawberry_milk_pickaxe",
            new PickaxeItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(MilkToolMaterials.STRAWBERRY_MILK_INGOT, 2, -2.6f))));

    public static final Item STRAWBERRY_MILK_AXE = registerItem("strawberry_milk_axe",
            new AxeItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(MilkToolMaterials.STRAWBERRY_MILK_INGOT, 6, -2.9f))));

    public static final Item STRAWBERRY_MILK_SHOVEL = registerItem("strawberry_milk_shovel",
            new ShovelItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(MilkToolMaterials.STRAWBERRY_MILK_INGOT, 2.5f, -3.0f))));

    public static final Item STRAWBERRY_MILK_HOE = registerItem("strawberry_milk_hoe",
            new HoeItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(MilkToolMaterials.STRAWBERRY_MILK_INGOT, -3, -3.0f))));

    public static final Item STRAWBERRY_MILK_HELMET = registerItem("strawberry_milk_helmet",
            new ArmorItem(ModArmorMaterials.STRAWBERRY_MILK_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item STRAWBERRY_MILK_CHESTPLATE = registerItem("strawberry_milk_chestplate",
            new ArmorItem(ModArmorMaterials.STRAWBERRY_MILK_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item STRAWBERRY_MILK_LEGGINGS = registerItem("strawberry_milk_leggings",
            new ArmorItem(ModArmorMaterials.STRAWBERRY_MILK_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item STRAWBERRY_MILK_BOOTS = registerItem("strawberry_milk_boots",
            new ArmorItem(ModArmorMaterials.STRAWBERRY_MILK_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    //CHEESE ITEMS
    public static final Item CHEESE_SWORD = registerItem("cheese_sword",
            new SwordItem(MilkToolMaterials.CHEESE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MilkToolMaterials.CHEESE, 4, -2.0f))));

    public static final Item CHEESE_PICKAXE = registerItem("cheese_pickaxe",
            new PickaxeItem(MilkToolMaterials.STRAWBERRY_MILK_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(MilkToolMaterials.CHEESE, 2, -2.6f))));

    public static final Item CHEESE_AXE = registerItem("cheese_axe",
            new AxeItem(MilkToolMaterials.CHEESE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(MilkToolMaterials.CHEESE, 6, -2.9f))));

    public static final Item CHEESE_SHOVEL = registerItem("cheese_shovel",
            new ShovelItem(MilkToolMaterials.CHEESE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(MilkToolMaterials.CHEESE, 2.5f, -3.0f))));

    public static final Item CHEESE_HOE = registerItem("cheese_hoe",
            new HoeItem(MilkToolMaterials.CHEESE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(MilkToolMaterials.CHEESE, -3, -3.0f))));

    public static final Item CHEESE_HELMET = registerItem("cheese_helmet",
            new ArmorItem(ModArmorMaterials.CHEESE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item CHEESE_CHESTPLATE = registerItem("cheese_chestplate",
            new ArmorItem(ModArmorMaterials.CHEESE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item CHEESE_LEGGINGS = registerItem("cheese_leggings",
            new ArmorItem(ModArmorMaterials.CHEESE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item CHEESE_BOOTS = registerItem("cheese_boots",
            new ArmorItem(ModArmorMaterials.CHEESE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    // FOODS
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(MilkMod.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        MilkMod.LOGGER.info("Registering Mod Items for " + MilkMod.MOD_ID);

        // Ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MILK_INGOT);
            entries.add(CHOCOMILK_INGOT);
            entries.add(STRAWBERRY_MILK_INGOT);
        });

        // Combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(MILK_SWORD);
            entries.add(MILK_AXE);
            entries.add(MILK_HELMET);
            entries.add(MILK_CHESTPLATE);
            entries.add(MILK_LEGGINGS);
            entries.add(MILK_BOOTS);

            entries.add(CHOCOMILK_SWORD);
            entries.add(CHOCOMILK_AXE);
            entries.add(CHOCOMILK_HELMET);
            entries.add(CHOCOMILK_CHESTPLATE);
            entries.add(CHOCOMILK_LEGGINGS);
            entries.add(CHOCOMILK_BOOTS);

            entries.add(STRAWBERRY_MILK_SWORD);
            entries.add(STRAWBERRY_MILK_AXE);
            entries.add(STRAWBERRY_MILK_HELMET);
            entries.add(STRAWBERRY_MILK_CHESTPLATE);
            entries.add(STRAWBERRY_MILK_LEGGINGS);
            entries.add(STRAWBERRY_MILK_BOOTS);

            entries.add(CHEESE_SWORD);
            entries.add(CHEESE_AXE);
            entries.add(CHEESE_HELMET);
            entries.add(CHEESE_CHESTPLATE);
            entries.add(CHEESE_LEGGINGS);
            entries.add(CHEESE_BOOTS);
        });

        // Tools tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(MILK_PICKAXE);
            entries.add(MILK_AXE);
            entries.add(MILK_SHOVEL);
            entries.add(MILK_HOE);

            entries.add(CHOCOMILK_PICKAXE);
            entries.add(CHOCOMILK_AXE);
            entries.add(CHOCOMILK_SHOVEL);
            entries.add(CHOCOMILK_HOE);

            entries.add(STRAWBERRY_MILK_PICKAXE);
            entries.add(STRAWBERRY_MILK_AXE);
            entries.add(STRAWBERRY_MILK_SHOVEL);
            entries.add(STRAWBERRY_MILK_HOE);

            entries.add(CHEESE_PICKAXE);
            entries.add(CHEESE_AXE);
            entries.add(CHEESE_SHOVEL);
            entries.add(CHEESE_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(STRAWBERRY);
        });

    }
}

