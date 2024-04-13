package net.arcanamod.items;

import net.arcanamod.aspects.AspectStack;
import net.arcanamod.aspects.Aspects;
import net.arcanamod.items.Armor.ArcanaArmourMaterials;
import net.arcanamod.items.attachment.CapItem;
import net.arcanamod.items.attachment.Core;
import net.arcanamod.items.attachment.CoreItem;
import net.arcanamod.items.attachment.FocusItem;
import net.arcanamod.items.tools.ArcanaToolTiers;
import net.arcanamod.items.tools.ScribbledNotesCompleteItem;
import net.arcanamod.systems.spell.MDModifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static net.arcanamod.Arcana.modId;
import static net.arcanamod.Arcana.arcLoc;

@SuppressWarnings({"unused", "RedundantSuppression"})
public class ArcanaItems{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, modId);

    public static final Supplier<Item> ARCANIUM_SWORD = ITEMS.register("arcanium_sword", () -> new SwordItem(ArcanaToolTiers.ARCANIUM, 3, -2.4f, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_SHOVEL = ITEMS.register("arcanium_shovel", () -> new ShovelItem(ArcanaToolTiers.ARCANIUM, 1.5f, -3, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_PICKAXE = ITEMS.register("arcanium_pickaxe", () -> new PickaxeItem(ArcanaToolTiers.ARCANIUM, 1, -2.8f, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_AXE = ITEMS.register("arcanium_axe", () -> new AxeItem(ArcanaToolTiers.ARCANIUM, 5.5f, -3, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_HOE = ITEMS.register("arcanium_hoe", () -> new HoeItem(ArcanaToolTiers.ARCANIUM, 1, -.5f, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_HELMET = ITEMS.register("arcanium_helmet", () -> new ArmorItem(ArcanaArmourMaterials.ARCANIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_CHESTPLATE = ITEMS.register("arcanium_chestplate", () -> new ArmorItem(ArcanaArmourMaterials.ARCANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_LEGGINGS = ITEMS.register("arcanium_leggings", () -> new ArmorItem(ArcanaArmourMaterials.ARCANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_BOOTS = ITEMS.register("arcanium_boots", () -> new ArmorItem(ArcanaArmourMaterials.ARCANIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Supplier<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ArcanaToolTiers.SILVER, 3, -2.4f, new Item.Properties()));
    public static final Supplier<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ArcanaToolTiers.SILVER, 1.5f, -3, new Item.Properties()));
    public static final Supplier<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ArcanaToolTiers.SILVER, 1, -2.8f, new Item.Properties()));
    public static final Supplier<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ArcanaToolTiers.SILVER, 5.5f, -3, new Item.Properties()));
    public static final Supplier<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ArcanaToolTiers.SILVER, 1,-.5f, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_SWORD = ITEMS.register("void_metal_sword", () -> new SwordItem(ArcanaToolTiers.VOID_METAL, 3, -2.4f, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_SHOVEL = ITEMS.register("void_metal_shovel", () -> new ShovelItem(ArcanaToolTiers.VOID_METAL, 1.5f, -3, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_PICKAXE = ITEMS.register("void_metal_pickaxe", () -> new PickaxeItem(ArcanaToolTiers.VOID_METAL, 1, -2.8f, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_AXE = ITEMS.register("void_metal_axe", () -> new AxeItem(ArcanaToolTiers.VOID_METAL, 5.5f, -3, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_HOE = ITEMS.register("void_metal_hoe", () -> new HoeItem(ArcanaToolTiers.VOID_METAL, 1,-.5f, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_HELMET = ITEMS.register("void_metal_helmet", () -> new ArmorItem(ArcanaArmourMaterials.VOID_METAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_CHESTPLATE = ITEMS.register("void_metal_chestplate", () -> new ArmorItem(ArcanaArmourMaterials.VOID_METAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_LEGGINGS = ITEMS.register("void_metal_leggings", () -> new ArmorItem(ArcanaArmourMaterials.VOID_METAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_BOOTS = ITEMS.register("void_metal_boots", () -> new ArmorItem(ArcanaArmourMaterials.VOID_METAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Supplier<Item> RESEARCH_NOTE_COMPLETE = ITEMS.register("research_note_complete", () -> new ResearchNoteItem(new Item.Properties(), true));
    public static final Supplier<Item> RESEARCH_NOTE = ITEMS.register("research_note", () -> new ResearchNoteItem(new Item.Properties(), false));
    public static final Supplier<Item> SCRIBING_TOOLS = ITEMS.register("scribing_tools", () -> new Item(new Item.Properties().stacksTo(1).durability(100).setNoRepair()));
    public static final Supplier<Item> VIS_MANIPULATION_TOOLS = ITEMS.register("vis_manipulation_tools", () -> new VisManipulatorsItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> PHIAL = ITEMS.register("phial", () -> new PhialItem(new Item.Properties()));
    public static final Supplier<Item> SCRIBBLED_NOTES_COMPLETE = ITEMS.register("scribbled_notes_complete", () -> new ScribbledNotesCompleteItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> SCRIBBLED_NOTES = ITEMS.register("scribbled_notes", () -> new ScribbledNoteItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> TAINT_IN_A_BOTTLE = ITEMS.register("taint_in_a_bottle", () -> new TaintBottleItem(new Item.Properties()));
    public static final Supplier<Item> FLUX_METER = ITEMS.register("flux_meter", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ARCANUM = ITEMS.register("arcanum", () -> new ResearchBookItem(new Item.Properties().stacksTo(1), new ResourceLocation(modId, "arcanum")));
    public static final Supplier<Item> GRIMOIRE = ITEMS.register("illustrious_grimoire", () -> new ResearchBookItem(new Item.Properties().stacksTo(1), new ResourceLocation(modId, "illustrious_grimoire")));
    public static final Supplier<Item> CODEX = ITEMS.register("tainted_codex", () -> new ResearchBookItem(new Item.Properties().stacksTo(1), new ResourceLocation(modId, "tainted_codex")));
    public static final Supplier<Item> RITES = ITEMS.register("crimson_rites", () -> new ResearchBookItem(new Item.Properties().stacksTo(1), new ResourceLocation(modId, "crimson_rites")));
    public static final Supplier<Item> LABEL = ITEMS.register("label", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> THAUMIUM_INGOT = ITEMS.register("thaumium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ARCANIUM_INGOT = ITEMS.register("arcanium_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_INGOT = ITEMS.register("void_metal_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> VOID_METAL_NUGGET = ITEMS.register("void_metal_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> THAUMIUM_NUGGET = ITEMS.register("thaumium_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SILVERWOOD_STICK = ITEMS.register("silverwood_stick", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ELDRITCH_CLOTH = ITEMS.register("eldritch_cloth", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PURIFIED_IRON = ITEMS.register("purified_iron", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PURIFIED_GOLD = ITEMS.register("purified_gold", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PURIFIED_SILVER = ITEMS.register("purified_silver", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ALTERED_IRON = ITEMS.register("altered_iron", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> GOGGLES_OF_REVEALING = ITEMS.register("goggles_of_revealing", () -> new GogglesItem(ArcanaArmourMaterials.GOGGLES, new Item.Properties(), GogglePriority.SHOW_ASPECTS));
    //public static final Supplier<Item> AIR_CRYSTAL_SEED = ITEMS.register("air_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.AIR_CLUSTER.get(), new Item.Properties(), 0));
   // public static final Supplier<Item> EARTH_CRYSTAL_SEED = ITEMS.register("earth_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.EARTH_CLUSTER.get(), new Item.Properties(), 0));
   // public static final Supplier<Item> FIRE_CRYSTAL_SEED = ITEMS.register("fire_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.FIRE_CLUSTER.get(), new Item.Properties(), 0));
   // public static final Supplier<Item> WATER_CRYSTAL_SEED = ITEMS.register("water_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.WATER_CLUSTER.get(), new Item.Properties(), 0));
   // public static final Supplier<Item> ORDER_CRYSTAL_SEED = ITEMS.register("order_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.ORDER_CLUSTER.get(), new Item.Properties(), 0));
   // public static final Supplier<Item> CHAOS_CRYSTAL_SEED = ITEMS.register("chaos_cluster_seed", () -> new CrystalClusterItem(ArcanaBlocks.CHAOS_CLUSTER.get(), new Item.Properties(), 0));
    public static final Supplier<CapItem> IRON_CAP = ITEMS.register("iron_cap", () -> new CapItem(new Item.Properties(), 10, 3, 1, arcLoc("iron_cap")));
    public static final Supplier<CapItem> GOLD_CAP = ITEMS.register("gold_cap", () -> new CapItem(new Item.Properties(), 25, 15, 2, arcLoc("gold_cap")));
    public static final Supplier<CapItem> COPPER_CAP = ITEMS.register("copper_cap", () -> new CapItem(new Item.Properties(), 15, 5, 2, arcLoc("copper_cap")));
    public static final Supplier<CapItem> SILVER_CAP = ITEMS.register("silver_cap", () -> new CapItem(new Item.Properties(), 0, 75, 2, arcLoc("silver_cap")));
    public static final Supplier<CapItem> THAUMIUM_CAP = ITEMS.register("thaumium_cap", () -> new CapItem(new Item.Properties(), 50, 25, 3, arcLoc("thaumium_cap")));
    public static final Supplier<CapItem> VOID_CAP = ITEMS.register("void_cap", () -> new CapItem(new Item.Properties(), 75, 45, 3, arcLoc("void_cap")));
    public static final Supplier<CapItem> NETHERITE_CAP = ITEMS.register("netherite_cap", () -> new CapItem(new Item.Properties(), 65, 40, 3, arcLoc("netherite_cap")));
    public static final Supplier<CapItem> PRISMARINE_CAP = ITEMS.register("prismarine_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("prismarine_cap")));
    public static final Supplier<CapItem> BAMBOO_CAP = ITEMS.register("bamboo_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("bamboo_cap")));
    public static final Supplier<CapItem> AMBER_CAP = ITEMS.register("amber_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("amber_cap")));
    public static final Supplier<CapItem> QUARTZ_CAP = ITEMS.register("quartz_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("quartz_cap")));
    public static final Supplier<CapItem> LEATHER_CAP = ITEMS.register("leather_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("leather_cap")));
    public static final Supplier<CapItem> HONEY_CAP = ITEMS.register("honey_cap", () -> new CapItem(new Item.Properties(), 50, 30, 2, arcLoc("honey_cap")));
    public static final Supplier<CapItem> SHULKER_CAP = ITEMS.register("shulker_cap", () -> new CapItem(new Item.Properties(), 0, 35, 2, arcLoc("shulker_cap")));
    public static final Supplier<CapItem> MECHANICAL_CAP = ITEMS.register("mechanical_cap", () -> new CapItem(new Item.Properties(), 60, 40, 2, arcLoc("mechanical_cap")));
    public static final Supplier<CapItem> ELDRITCH_CLOTH_CAP = ITEMS.register("eldritch_cloth_cap", () -> new CapItem(new Item.Properties(), 70, 50, 2, arcLoc("eldritch_cloth_cap")));
    public static final Supplier<CapItem> CLAY_CAP = ITEMS.register("clay_cap", () -> new CapItem(new Item.Properties(), Short.MAX_VALUE, Short.MAX_VALUE, -1, arcLoc("clay_cap")));
    public static Supplier<FocusItem> DEFAULT_FOCUS = ITEMS.register("focus", () -> new FocusItem(new Item.Properties().stacksTo(1), FocusItem.DEFAULT_NUMSTYLES, arcLoc("wand_focus")));
    public static final Supplier<Item> FOCUS_PARTS = ITEMS.register("focus_parts", () -> new Item(new Item.Properties()));
    public static final Core.Impl WOOD_WAND_CORE = new Core.Impl(5,1, 1, new MDModifier.Empty(), arcLoc("wood_wand"));
    public static final Supplier<CoreItem> GREATWOOD_WAND_CORE = ITEMS.register("greatwood_wand_core", () -> new CoreItem(new Item.Properties(), 25,3, 2, arcLoc("greatwood_wand"), new MDModifier.ReducedVis(Arrays.asList(Aspects.primalAspects).stream().map(aspect -> new AspectStack(aspect,5)).collect(Collectors.toList()))));
    public static final Supplier<CoreItem> TAINTED_WAND_CORE = ITEMS.register("tainted_wand_core", () -> new CoreItem(new Item.Properties(), 200,30, 2, arcLoc("tainted_wand"), new MDModifier.Warping()));
    public static final Supplier<CoreItem> DAIR_WAND_CORE = ITEMS.register("dair_wand_core", () -> new CoreItem(new Item.Properties(), 10,1, 3, arcLoc("dair_wand"), new MDModifier.Empty()));
    public static final Supplier<CoreItem> HAWTHORN_WAND_CORE = ITEMS.register("hawthorn_wand_core", () -> new CoreItem(new Item.Properties(), 15,1, 3, arcLoc("hawthorn_wand"), new MDModifier.Empty()));
    public static final Supplier<CoreItem> SILVERWOOD_WAND_CORE = ITEMS.register("silverwood_wand_core", () -> new CoreItem(new Item.Properties(), 100,5, 4, arcLoc("silverwood_wand"), new MDModifier.ReducedVis(Arrays.asList(Aspects.primalAspects).stream().map(aspect -> new AspectStack(aspect,10)).collect(Collectors.toList()))));
    public static final Supplier<CoreItem> ARCANIUM_WAND_CORE = ITEMS.register("arcanium_wand_core", () -> new CoreItem(new Item.Properties(), 150,10, 4, arcLoc("arcanium_wand"), new MDModifier.Empty()));
    public static final Supplier<CoreItem> BLAZE_WAND_CORE = ITEMS.register("blaze_wand_core", () -> new CoreItem(new Item.Properties(), 199,10, 2, arcLoc("blaze_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.FIRE,20)))));
    public static final Supplier<CoreItem> ENDROD_WAND_CORE = ITEMS.register("endrod_wand_core", () -> new CoreItem(new Item.Properties(), 225,15, 4, arcLoc("end_rod_wand"), new MDModifier.Empty()));
    public static final Supplier<CoreItem> BONE_WAND_CORE = ITEMS.register("bone_wand_core", () -> new CoreItem(new Item.Properties(), 100,5, 2, arcLoc("bone_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.CHAOS,20)))));
    public static final Supplier<CoreItem> ICE_WAND_CORE = ITEMS.register("ice_wand_core", () -> new CoreItem(new Item.Properties(), 100,10, 2, arcLoc("ice_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.WATER,20)))));
    public static final Supplier<CoreItem> ARCANE_STONE_WAND_CORE = ITEMS.register("arcane_stone_wand_core", () -> new CoreItem(new Item.Properties(), 100,10, 2, arcLoc("stone_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.ORDER,20)))));
    public static final Supplier<CoreItem> OBSIDIAN_WAND_CORE = ITEMS.register("obsidian_wand_core", () -> new CoreItem(new Item.Properties(), 100,5, 2, arcLoc("obsidian_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.EARTH,20)))));
    public static final Supplier<CoreItem> SUGAR_CANE_WAND_CORE = ITEMS.register("sugar_cane_wand_core", () -> new CoreItem(new Item.Properties(), 100,10, 2, arcLoc("cane_wand"), new MDModifier.ReducedVis(Collections.singletonList(new AspectStack(Aspects.AIR,20)))));
    public static final Supplier<CoreItem> MECHANICAL_WAND_CORE = ITEMS.register("mechanical_wand_core", () -> new CoreItem(new Item.Properties(), 125,15, 2, arcLoc("mechanical_wand"), new MDModifier.Mechanical()));
    public static final Supplier<CoreItem> ELDRITCH_WAND_CORE = ITEMS.register("eldritch_wand_core", () -> new CoreItem(new Item.Properties(), 250,30, 2, arcLoc("eldritch_wand"), new MDModifier.Warping()));
    public static final Supplier<CoreItem> CLAY_WAND_CORE = ITEMS.register("clay_wand_core", () -> new CoreItem(new Item.Properties(), Short.MAX_VALUE,Short.MAX_VALUE, -1, arcLoc("creative_wand"), new MDModifier.Creative()));
    public static final Supplier<Item> WAND = ITEMS.register("wand", () -> new WandItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> SCEPTER = ITEMS.register("scepter", () -> new ScepterItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> STAFF = ITEMS.register("staff", () -> new StaffItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> GAUNTLET = ITEMS.register("gauntlet", () -> new GauntletItem(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> TAINTED_MELON_SLICE = ITEMS.register("tainted_melon_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_POTATO = ITEMS.register("tainted_potato", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> BAKED_TAINTED_POTATO = ITEMS.register("baked_tainted_potato", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(3.0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_BEETROOT = ITEMS.register("tainted_beetroot", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_CARROT = ITEMS.register("tainted_carrot", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_BERRIES = ITEMS.register("tainted_berries", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> RAW_TAINTED_COD = ITEMS.register("raw_tainted_cod", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> COOKED_TAINTED_COD = ITEMS.register("cooked_tainted_cod", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(3.0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> RAW_TAINTED_SALMON = ITEMS.register("raw_tainted_salmon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> COOKED_TAINTED_SALMON = ITEMS.register("cooked_tainted_salmon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(4.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_TROPICAL_FISH = ITEMS.register("tainted_tropical_fish", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).build())));
    public static final Supplier<Item> TAINTED_PUFFERFISH = ITEMS.register("tainted_pufferfish", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 3), 1f).build())));
    public static final Supplier<Item> TAINTED_SUGAR_CANE = ITEMS.register("tainted_sugar_cane", () -> new Item(new Item.Properties()));
   // public static final Supplier<Item> RESEARCH_TABLE_ITEM = ITEMS.register("research_table_item", () -> new BlockItem(ArcanaBlocks.RESEARCH_TABLE.get(), new Item.Properties().stacksTo(1)));
   // public static final Supplier<Item> FOCI_FORGE_ITEM = ITEMS.register("foci_forge_item", () -> new BlockItem(ArcanaBlocks.FOCI_FORGE.get(), new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> RAW_DOG_MEAT = ITEMS.register("raw_dog_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).build())));
    public static final Supplier<Item> RAW_CAT_MEAT = ITEMS.register("raw_cat_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4f).build())));
    public static final Supplier<Item> COOKED_DOG_MEAT = ITEMS.register("cooked_dog_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final Supplier<Item> COOKED_CAT_MEAT = ITEMS.register("cooked_cat_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final Supplier<Item> ARCANIUM_FILTER = ITEMS.register("arcanium_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), 1, 1));
    public static final Supplier<Item> SILVERWOOD_FILTER = ITEMS.register("silverwood_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), 2, 0));
    public static final Supplier<Item> GREATWOOD_FILTER = ITEMS.register("greatwood_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), 0, 2));
    public static final Supplier<Item> HAWTHORN_FILTER = ITEMS.register("hawthorn_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), 3, -1));
    public static final Supplier<Item> DAIR_FILTER = ITEMS.register("dair_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), 3, -1));
    public static final Supplier<Item> WILLOW_FILTER = ITEMS.register("willow_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), -1, 3));
    public static final Supplier<Item> EUCALYPTUS_FILTER = ITEMS.register("eucalyptus_filter", () -> new EnchantedFilterItem(new Item.Properties().stacksTo(1), -1, 3));
    public static final Supplier<Item> CHEATERS_ARCANUM = ITEMS.register("cheaters_arcanum", () -> new CheatersResearchBookItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), new ResourceLocation(modId, "arcanum")));

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}