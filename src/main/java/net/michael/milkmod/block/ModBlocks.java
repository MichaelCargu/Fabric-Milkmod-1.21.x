package net.michael.milkmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.michael.milkmod.MilkMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MILK_BLOCK = registerBlock(
            "milk_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHOCOMILK_BLOCK = registerBlock(
            "chocomilk_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRAWBERRY_MILK_BLOCK = registerBlock(
            "strawberry_milk_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHEESE_BLOCK = registerBlock(
            "cheese_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(MilkMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(MilkMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MilkMod.LOGGER.info("Registering Mod Blocks for " + MilkMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MILK_BLOCK);
            entries.add(CHOCOMILK_BLOCK);
        });
    }
}


