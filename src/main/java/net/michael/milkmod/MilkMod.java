package net.michael.milkmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.michael.milkmod.block.ModBlocks;
import net.michael.milkmod.item.ModItemGroups;
import net.michael.milkmod.item.ModItems;
import net.michael.milkmod.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MilkMod implements ModInitializer {
	public static final String MOD_ID = "milkmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();

			TradeOfferHelper.registerVillagerOffers(ModVillagers.MILKMAN, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_INGOT, 1),
					new ItemStack(ModItems.MILK_INGOT, 1), 99, 2, 0f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.MILK_BUCKET, 1),
					new ItemStack(Items.EMERALD, 1), 99, 2, 0f));

		});

			TradeOfferHelper.registerVillagerOffers(ModVillagers.MILKMAN, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MILK_INGOT, 2),
					new ItemStack(Items.NETHERITE_SWORD, 1), 99, 5, 0f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.DIAMOND, 10),
					new ItemStack(ModItems.MILK_INGOT, 1), 99, 5, 0f));

		});

			TradeOfferHelper.registerVillagerOffers(ModVillagers.MILKMAN, 3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_BOOTS, 1),
					new ItemStack(ModItems.MILK_INGOT, 2), 99, 10, 0f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_LEGGINGS, 1),
					new ItemStack(ModItems.MILK_INGOT, 3), 99, 10, 0f));

		});

			TradeOfferHelper.registerVillagerOffers(ModVillagers.MILKMAN, 4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_CHESTPLATE, 1),
					new ItemStack(ModItems.MILK_INGOT, 4), 99, 2, 0f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_HELMET, 1),
					new ItemStack(ModItems.MILK_INGOT, 2), 99, 2, 0f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MILK_INGOT, 25),
					new ItemStack(Items.MACE, 1), 99, 2, 0f));

		});

			TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 1),
					new ItemStack(ModItems.STRAWBERRY, 1), 99, 2, 0f));

		});

	}
}