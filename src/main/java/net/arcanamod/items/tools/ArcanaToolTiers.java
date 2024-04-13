package net.arcanamod.items.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.arcanamod.items.ArcanaItems;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class ArcanaToolTiers {
    public static final Tier ARCANIUM = new SimpleTier(3, 1125, 7.0f, 2.0f, 17, BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ArcanaItems.ARCANIUM_INGOT.get()));
    public static final Tier SILVER = new SimpleTier(1, 125, 10.0f, 1.0f, 5, Tags.Blocks.NEEDS_WOOD_TOOL,() -> Ingredient.of(ArcanaItems.SILVER_INGOT.get()));
    public static final Tier VOID_METAL = new SimpleTier(3, 300, 8.0f, 3.5f, 10, BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ArcanaItems.VOID_METAL_INGOT.get()));
}