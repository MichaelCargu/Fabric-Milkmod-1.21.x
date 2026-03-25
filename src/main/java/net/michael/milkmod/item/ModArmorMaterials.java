package net.michael.milkmod.item;

import net.michael.milkmod.MilkMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> MILK_ARMOR_MATERIAL =
            registerArmorMaterial(
                    "milk",
                    () -> new ArmorMaterial(
                            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                                map.put(ArmorItem.Type.BOOTS, 4);
                                map.put(ArmorItem.Type.LEGGINGS, 7);
                                map.put(ArmorItem.Type.CHESTPLATE, 9);
                                map.put(ArmorItem.Type.HELMET, 4);
                                map.put(ArmorItem.Type.BODY, 12);
                            }),
                            20, // enchantability
                            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                            () -> Ingredient.ofItems(ModItems.MILK_INGOT),
                            List.of(new ArmorMaterial.Layer(Identifier.of(MilkMod.MOD_ID, "milk"))),
                            3.0F, // toughness
                            0.0F  // knockback resistance
                    ));

    public static final RegistryEntry<ArmorMaterial> CHOCOMILK_ARMOR_MATERIAL =
            registerArmorMaterial(
                    "chocomilk",
                    () -> new ArmorMaterial(
                            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                                map.put(ArmorItem.Type.BOOTS, 5);
                                map.put(ArmorItem.Type.LEGGINGS, 8);
                                map.put(ArmorItem.Type.CHESTPLATE, 10);
                                map.put(ArmorItem.Type.HELMET, 5);
                                map.put(ArmorItem.Type.BODY, 16);
                            }),
                            20, // enchantability
                            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                            () -> Ingredient.ofItems(ModItems.CHOCOMILK_INGOT),
                            List.of(new ArmorMaterial.Layer(Identifier.of(MilkMod.MOD_ID, "chocomilk"))),
                            4.0F, // toughness
                            0.0F  // knockback resistance
                    ));

    public static final RegistryEntry<ArmorMaterial> STRAWBERRY_MILK_ARMOR_MATERIAL =
            registerArmorMaterial(
                    "strawberry_milk",
                    () -> new ArmorMaterial(
                            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                                map.put(ArmorItem.Type.BOOTS, 5);
                                map.put(ArmorItem.Type.LEGGINGS, 8);
                                map.put(ArmorItem.Type.CHESTPLATE, 10);
                                map.put(ArmorItem.Type.HELMET, 5);
                                map.put(ArmorItem.Type.BODY, 16);
                            }),
                            20, // enchantability
                            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                            () -> Ingredient.ofItems(ModItems.STRAWBERRY_MILK_INGOT),
                            List.of(new ArmorMaterial.Layer(Identifier.of(MilkMod.MOD_ID, "strawberry_milk"))),
                            4.0F, // toughness
                            0.0F  // knockback resistance
                    ));

    public static final RegistryEntry<ArmorMaterial> CHEESE_ARMOR_MATERIAL =
            registerArmorMaterial(
                    "cheese",
                    () -> new ArmorMaterial(
                            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                                map.put(ArmorItem.Type.BOOTS, 5);
                                map.put(ArmorItem.Type.LEGGINGS, 8);
                                map.put(ArmorItem.Type.CHESTPLATE, 10);
                                map.put(ArmorItem.Type.HELMET, 5);
                                map.put(ArmorItem.Type.BODY, 16);
                            }),
                            20, // enchantability
                            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                            () -> Ingredient.ofItems(ModItems.CHEESE),
                            List.of(new ArmorMaterial.Layer(Identifier.of(MilkMod.MOD_ID, "cheese"))),
                            4.0F, // toughness
                            0.0F  // knockback resistance
                    ));

    private static RegistryEntry<ArmorMaterial> registerArmorMaterial(
            String name,
            Supplier<ArmorMaterial> material
    ) {
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                Identifier.of(MilkMod.MOD_ID, name),
                material.get()
        );
    }
}
