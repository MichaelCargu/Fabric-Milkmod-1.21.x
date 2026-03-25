package net.michael.milkmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.michael.milkmod.MilkMod;
import net.michael.milkmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MILK_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(MilkMod.MOD_ID, "milk_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.milkmod.milk_items"))
                    .icon(() -> new ItemStack(ModItems.MILK_INGOT))
                    .entries((context, entries) -> {
                        entries.add(ModItems.MILK_INGOT);
                        entries.add(ModItems.MILK_SWORD);
                        entries.add(ModItems.MILK_PICKAXE);
                        entries.add(ModItems.MILK_AXE);
                        entries.add(ModItems.MILK_SHOVEL);
                        entries.add(ModItems.MILK_HOE);
                        entries.add(ModItems.MILK_HELMET);
                        entries.add(ModItems.MILK_CHESTPLATE);
                        entries.add(ModItems.MILK_LEGGINGS);
                        entries.add(ModItems.MILK_BOOTS);
                        entries.add(ModBlocks.MILK_BLOCK);

                        entries.add(ModItems.CHOCOMILK_INGOT);
                        entries.add(ModItems.CHOCOMILK_SWORD);
                        entries.add(ModItems.CHOCOMILK_PICKAXE);
                        entries.add(ModItems.CHOCOMILK_AXE);
                        entries.add(ModItems.CHOCOMILK_SHOVEL);
                        entries.add(ModItems.CHOCOMILK_HOE);
                        entries.add(ModItems.CHOCOMILK_HELMET);
                        entries.add(ModItems.CHOCOMILK_CHESTPLATE);
                        entries.add(ModItems.CHOCOMILK_LEGGINGS);
                        entries.add(ModItems.CHOCOMILK_BOOTS);
                        entries.add(ModBlocks.CHOCOMILK_BLOCK);

                        entries.add(ModItems.STRAWBERRY_MILK_INGOT);
                        entries.add(ModItems.STRAWBERRY_MILK_SWORD);
                        entries.add(ModItems.STRAWBERRY_MILK_PICKAXE);
                        entries.add(ModItems.STRAWBERRY_MILK_AXE);
                        entries.add(ModItems.STRAWBERRY_MILK_SHOVEL);
                        entries.add(ModItems.STRAWBERRY_MILK_HOE);
                        entries.add(ModItems.STRAWBERRY_MILK_HELMET);
                        entries.add(ModItems.STRAWBERRY_MILK_CHESTPLATE);
                        entries.add(ModItems.STRAWBERRY_MILK_LEGGINGS);
                        entries.add(ModItems.STRAWBERRY_MILK_BOOTS);
                        entries.add(ModBlocks.STRAWBERRY_MILK_BLOCK);
                        entries.add(ModItems.STRAWBERRY);

                        entries.add(ModItems.CHEESE_SWORD);
                        entries.add(ModItems.CHEESE_PICKAXE);
                        entries.add(ModItems.CHEESE_AXE);
                        entries.add(ModItems.CHEESE_SHOVEL);
                        entries.add(ModItems.CHEESE_HOE);
                        entries.add(ModItems.CHEESE_HELMET);
                        entries.add(ModItems.CHEESE_CHESTPLATE);
                        entries.add(ModItems.CHEESE_LEGGINGS);
                        entries.add(ModItems.CHEESE_BOOTS);
                        entries.add(ModBlocks.CHEESE_BLOCK);
                        entries.add(ModItems.CHEESE);




                    }).build());



    public static void registerItemGroups() {
        MilkMod.LOGGER.info("Registering Item Groups for " + MilkMod.MOD_ID);
    }
}

