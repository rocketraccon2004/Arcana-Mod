package net.arcanamod.blocks;

import net.arcanamod.util.annotations.GIM;
import net.arcanamod.util.annotations.GLT;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Properties;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static net.arcanamod.Arcana.modId;
import static net.arcanamod.util.annotations.GIM.Type.BLOCK_REF;

public class ArcanaBlocks {
    private static ToIntFunction<BlockState> light(int level) {
        return (state) -> level;
    }
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, modId);

    @GLT public static final Supplier<Block> ARCANE_STONE = BLOCKS.register("arcane_stone", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<SlabBlock> ARCANE_STONE_SLAB = BLOCKS.register("arcane_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<StairBlock> ARCANE_STONE_STAIRS = BLOCKS.register("arcane_stone_stairs", () -> new StairBlock(() -> ARCANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<PressurePlateBlock> ARCANE_STONE_PRESSURE_PLATE = BLOCKS.register("arcane_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().destroyTime(0.5F).noCollission()));
    @GLT public static final Supplier<WallBlock> ARCANE_STONE_WALL = BLOCKS.register("arcane_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ARCANE_STONE.get())));

    // Arcane Stone Bricks
    @GLT public static final Supplier<Block> ARCANE_STONE_BRICKS = BLOCKS.register("arcane_stone_bricks", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<SlabBlock> ARCANE_STONE_BRICKS_SLAB = BLOCKS.register("arcane_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<StairBlock> ARCANE_STONE_BRICKS_STAIRS = BLOCKS.register("arcane_stone_bricks_stairs", () -> new StairBlock(() -> ARCANE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<PressurePlateBlock> ARCANE_STONE_BRICKS_PRESSURE_PLATE = BLOCKS.register("arcane_stone_bricks_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().destroyTime(0.5F).noCollission()));
    @GLT public static final Supplier<WallBlock> ARCANE_STONE_BRICKS_WALL = BLOCKS.register("arcane_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ARCANE_STONE_BRICKS.get())));

    // Dungeon Bricks
    @GLT public static final Supplier<Block> DUNGEON_BRICKS = BLOCKS.register("dungeon_bricks", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<SlabBlock> DUNGEON_BRICKS_SLAB = BLOCKS.register("dungeon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<StairBlock> DUNGEON_BRICKS_STAIRS = BLOCKS.register("dungeon_bricks_stairs", () -> new StairBlock(() -> DUNGEON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<PressurePlateBlock> DUNGEON_BRICKS_PRESSURE_PLATE = BLOCKS.register("dungeon_bricks_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().destroyTime(0.5F).noCollission()));
    @GLT public static final Supplier<WallBlock> DUNGEON_BRICKS_WALL = BLOCKS.register("dungeon_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DUNGEON_BRICKS.get())));

    // Cracked Dungeon Bricks
    @GLT public static final Supplier<Block> CRACKED_DUNGEON_BRICKS = BLOCKS.register("cracked_dungeon_bricks", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<SlabBlock> CRACKED_DUNGEON_BRICKS_SLAB = BLOCKS.register("cracked_dungeon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<StairBlock> CRACKED_DUNGEON_BRICKS_STAIRS = BLOCKS.register("cracked_dungeon_bricks_stairs", () -> new StairBlock(() -> CRACKED_DUNGEON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<PressurePlateBlock> CRACKED_DUNGEON_BRICKS_PRESSURE_PLATE = BLOCKS.register("cracked_dungeon_bricks_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().destroyTime(0.5F).noCollission()));
    @GLT public static final Supplier<WallBlock> CRACKED_DUNGEON_BRICKS_WALL = BLOCKS.register("cracked_dungeon_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_DUNGEON_BRICKS.get())));

    // Mossy Dungeon Bricks
    @GLT public static final Supplier<Block> MOSSY_DUNGEON_BRICKS = BLOCKS.register("mossy_dungeon_bricks", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<SlabBlock> MOSSY_DUNGEON_BRICKS_SLAB = BLOCKS.register("mossy_dungeon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<StairBlock> MOSSY_DUNGEON_BRICKS_STAIRS = BLOCKS.register("mossy_dungeon_bricks_stairs", () -> new StairBlock(() -> MOSSY_DUNGEON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<PressurePlateBlock> MOSSY_DUNGEON_BRICKS_PRESSURE_PLATE = BLOCKS.register("mossy_dungeon_bricks_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().destroyTime(0.5F).noCollission()));
    @GLT public static final Supplier<WallBlock> MOSSY_DUNGEON_BRICKS_WALL = BLOCKS.register("mossy_dungeon_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MOSSY_DUNGEON_BRICKS.get())));

    // Alchemical Glass
    public static final Supplier<Block> HARDENED_GLASS = BLOCKS.register("hardened_glass", () -> new Block(BlockBehaviour.Properties.of().strength(5, 1200).sound(SoundType.GLASS).noOcclusion()));
    public static final Supplier<Block> SMOKEY_GLASS = BLOCKS.register("smokey_glass", () -> new Block(BlockBehaviour.Properties.of().destroyTime(.3F).sound(SoundType.GLASS)));
    public static final Supplier<Block> LUMINIFEROUS_GLASS = BLOCKS.register("luminiferous_glass", () -> new Block(BlockBehaviour.Properties.of().destroyTime(.3F).sound(SoundType.GLASS).noOcclusion().lightLevel(light(15))));

    // Functional
    public static final Supplier<Block> AMBER_ORE = BLOCKS.register("amber_ore", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    @GLT @GIM(BLOCK_REF) public static final Supplier<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(BlockBehaviour.Properties.of().strength(3.0F, 3.0F)));
    @GLT public static final Supplier<Block> INFUSION_ARCANE_STONE = BLOCKS.register("infusion_arcane_stone", () -> new Block(BlockBehaviour.Properties.of().destroyTime(2.0F).explosionResistance(6.0f)));
    @GLT public static final Supplier<Block> TABLE = BLOCKS.register("table", () -> new TableBlock(BlockBehaviour.Properties.of().strength(2).noOcclusion()));
    @GLT public static final Supplier<Block> FOCI_FORGE = BLOCKS.register("foci_forge", () -> new FociForgeCoreBlock(BlockBehaviour.Properties.of().strength(2).noOcclusion()));
    @GLT public static final Supplier<Block> FOCI_FORGE_COMPONENT = BLOCKS.register("foci_forge_component", () -> new FociForgeComponentBlock(BlockBehaviour.Properties.of().strength(2).noOcclusion()));
    @GLT public static final Supplier<Block> NITOR = BLOCKS.register("nitor", () -> new NitorBlock(BlockBehaviour.Properties.of().strength(0).noCollission().noOcclusion().lightLevel(light(15))));

    public static final Supplier<Block> TAINTED_AMBER_ORE = BLOCKS.register("tainted_amber_ore", () -> taintedOf(AMBER_ORE.get()));
    public static final Supplier<Block> TAINTED_SILVER_ORE = BLOCKS.register("tainted_silver_ore", () -> taintedOf(SILVER_ORE.get()));

    // Functional Blocks
    public static final Supplier<Block> JAR = BLOCKS.register("jar", () -> new JarBlock(BlockBehaviour.Properties.of().sound(ArcanaSounds.JAR).strength(0.25f), JarBlock.Type.BASIC));
    public static final Supplier<Block> SECURE_JAR = BLOCKS.register("secure_jar", () -> new JarBlock(BlockBehaviour.Properties.of().sound(ArcanaSounds.JAR).strength(0.3f), JarBlock.Type.SECURED));
    public static final Supplier<Block> VOID_JAR = BLOCKS.register("void_jar", () -> new JarBlock(BlockBehaviour.Properties.of().sound(ArcanaSounds.JAR).strength(0.3f), JarBlock.Type.VOID));
    public static final Supplier<Block> VACUUM_JAR = BLOCKS.register("vacuum_jar", () -> new JarBlock(BlockBehaviour.Properties.of().sound(ArcanaSounds.JAR).strength(0.3f), JarBlock.Type.VACUUM));
    public static final Supplier<Block> PRESSURE_JAR = BLOCKS.register("pressure_jar", () -> new JarBlock(BlockBehaviour.Properties.of().sound(ArcanaSounds.JAR).strength(0.3f), JarBlock.Type.PRESSURE));

    public static final Supplier<Block> ASPECT_BOOKSHELF = BLOCKS.register("aspect_bookshelf", () -> new AspectBookshelfBlock(false, create(WOOD).strength(6).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> ASPECT_BOOKSHELF_BLOCK = BLOCKS.register("aspect_bookshelf_block", () -> new AspectBookshelfBlock(true, create(WOOD).strength(6).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> RESEARCH_TABLE = BLOCKS.register("research_table", () -> new ResearchTableCoreBlock(create(WOOD).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> RESEARCH_TABLE_COMPONENT = BLOCKS.register("research_table_component", () -> new ResearchTableComponentBlock(create(WOOD).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ARCANE_CRAFTING_TABLE = BLOCKS.register("arcane_crafting_table", () -> new ArcaneCraftingTableBlock(create(WOOD).strength(2).noOcclusion()));
    @GLT public static final Supplier<Block> CRUCIBLE = BLOCKS.register("crucible", () -> new CrucibleBlock(create(IRON, MaterialColor.STONE).strength(2).noOcclusion()));
    public static final Supplier<Block> ALEMBIC = BLOCKS.register("alembic", () -> new AlembicBlock(create(IRON, MaterialColor.STONE).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> PEDESTAL = BLOCKS.register("infusion_pedestal", () -> new PedestalBlock(BlockBehaviour.Properties.of().strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ASPECT_TESTER = BLOCKS.register("aspect_tester", () -> new AspectTesterBlock(BlockBehaviour.Properties.of().strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ASPECT_TUBE = BLOCKS.register("essentia_tube", () -> new TubeBlock(create(IRON).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ASPECT_VALVE = BLOCKS.register("essentia_valve", () -> new ValveBlock(create(IRON).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ASPECT_WINDOW = BLOCKS.register("essentia_window", () -> new PipeWindowBlock(create(IRON).sound(SoundType.GLASS).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> ASPECT_PUMP = BLOCKS.register("essentia_pump", () -> new PumpBlock(create(IRON).sound(SoundType.GLASS).strength(3).noOcclusion()));
    @GLT @GIM(BLOCK_REF) public static final Supplier<Block> ASPECT_CRYSTALLIZER = BLOCKS.register("aspect_crystallizer", () -> new AspectCrystallizerBlock(create(IRON).strength(3)));

    // Taint Scrubber parts
    @GLT public static final Supplier<Block> TAINT_SCRUBBER_MK1 = BLOCKS.register("taint_scrubber_mk1", () -> new TaintScrubberBlock(create(IRON).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> TAINT_SCRUBBER_MK2 = BLOCKS.register("taint_scrubber_mk2", () -> new TaintScrubberExtensionBlock(create(IRON).strength(3).noOcclusion(), TaintScrubberExtensionBlock.Type.SCRUBBER_MK2));
    @GLT public static final Supplier<Block> TAINT_BOOSTER = BLOCKS.register("taint_booster", () -> new BoosterTaintScrubberExtensionBlock(create(IRON).strength(3).noOcclusion()));
    @GLT public static final Supplier<Block> TAINT_SUCKER = BLOCKS.register("taint_sucker", () -> new TaintScrubberExtensionBlock(create(IRON).strength(3).noOcclusion(), TaintScrubberExtensionBlock.Type.SUCKER));
    @GLT public static final Supplier<Block> TAINT_BORE = BLOCKS.register("taint_bore", () -> new TaintScrubberExtensionBlock(create(IRON).strength(3).noOcclusion(), TaintScrubberExtensionBlock.Type.BORE));

    @GLT public static final Supplier<Block> SEE_NO_EVIL_STATUE = BLOCKS.register("see_no_evil_statue", () -> new StatueBlock(create(WOOD).strength(4).noOcclusion()));
    @GLT public static final Supplier<Block> HEAR_NO_EVIL_STATUE = BLOCKS.register("hear_no_evil_statue", () -> new StatueBlock(create(WOOD).strength(4).noOcclusion()));
    @GLT public static final Supplier<Block> SPEAK_NO_EVIL_STATUE = BLOCKS.register("speak_no_evil_statue", () -> new StatueBlock(create(WOOD).strength(4).noOcclusion()));

    // Plants
    public static final Supplier<Block> MAGIC_MUSHROOM = BLOCKS.register("magic_mushroom", () -> new MagicMushroomBlock(create(PLANTS).noCollission().tickRandomly().sound(SoundType.PLANT).noOcclusion().setLightLevel(light(3))));

    // Woods
    // Dair Wood
    public static final Supplier<Block> DAIR_LEAVES = BLOCKS.register("dair_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> DAIR_LOG = BLOCKS.register("dair_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_DAIR_LOG = BLOCKS.register("stripped_dair_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_DAIR_WOOD = BLOCKS.register("stripped_dair_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DAIR_WOOD = BLOCKS.register("dair_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DAIR_PLANKS = BLOCKS.register("dair_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DAIR_DOOR = BLOCKS.register("dair_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> DAIR_TRAPDOOR = BLOCKS.register("dair_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> DAIR_PRESSURE_PLATE = BLOCKS.register("dair_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    //@GLT public static final Supplier<Block> DAIR_SAPLING = BLOCKS.register("dair_sapling", () -> new ASaplingBlock(new DummyTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> DAIR_SLAB = BLOCKS.register("dair_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DAIR_STAIRS = BLOCKS.register("dair_stairs", () -> new StairBlock(() -> DAIR_PLANKS.get().defaultBlockState(), create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DAIR_BUTTON = BLOCKS.register("dair_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> DAIR_FENCE = BLOCKS.register("dair_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> DAIR_FENCE_GATE = BLOCKS.register("dair_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));


    public static final Supplier<Block> TAINTED_DAIR_LEAVES = BLOCKS.register("tainted_dair_leaves", () -> taintedOf(ArcanaBlocks.DAIR_LEAVES.get()));
    @GLT public static final Supplier<Block> TAINTED_DAIR_LOG = BLOCKS.register("tainted_dair_log", () -> taintedOf(ArcanaBlocks.DAIR_LOG.get()));
    public static final Supplier<Block> TAINTED_STRIPPED_DAIR_LOG = BLOCKS.register("tainted_stripped_dair_log", () -> taintedOf(ArcanaBlocks.STRIPPED_DAIR_LOG.get()));
    @GLT public static final Supplier<Block> TAINTED_STRIPPED_DAIR_WOOD = BLOCKS.register("tainted_stripped_dair_wood", () -> taintedOf(ArcanaBlocks.STRIPPED_DAIR_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_DAIR_WOOD = BLOCKS.register("tainted_dair_wood", () -> taintedOf(ArcanaBlocks.DAIR_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_DAIR_PLANKS = BLOCKS.register("tainted_dair_planks", () -> taintedOf(ArcanaBlocks.DAIR_PLANKS.get()));
    //@GLT public static final Supplier<Block> TAINTED_DAIR_SAPLING = BLOCKS.register("tainted_dair_sapling", () -> taintedOf(ArcanaBlocks.DAIR_SAPLING.get()));
    @GLT public static final Supplier<Block> TAINTED_DAIR_SLAB = BLOCKS.register("tainted_dair_slab", () -> taintedOf(ArcanaBlocks.DAIR_SLAB.get()));
    @GLT public static final Supplier<Block> TAINTED_DAIR_STAIRS = BLOCKS.register("tainted_dair_stairs", () -> taintedOf(ArcanaBlocks.DAIR_STAIRS.get()));

    // Eucalyptus Wood
    public static final Supplier<Block> EUCALYPTUS_LEAVES = BLOCKS.register("eucalyptus_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> EUCALYPTUS_LOG = BLOCKS.register("eucalyptus_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_EUCALYPTUS_LOG = BLOCKS.register("stripped_eucalyptus_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_EUCALYPTUS_WOOD = BLOCKS.register("stripped_eucalyptus_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> EUCALYPTUS_WOOD = BLOCKS.register("eucalyptus_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> EUCALYPTUS_PLANKS = BLOCKS.register("eucalyptus_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> EUCALYPTUS_DOOR = BLOCKS.register("eucalyptus_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> EUCALYPTUS_TRAPDOOR = BLOCKS.register("eucalyptus_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> EUCALYPTUS_PRESSURE_PLATE = BLOCKS.register("eucalyptus_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    //@GLT public static final Supplier<Block> EUCALYPTUS_SAPLING = BLOCKS.register("eucalyptus_sapling", () -> new ASaplingBlock(new DummyTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> EUCALYPTUS_SLAB = BLOCKS.register("eucalyptus_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> EUCALYPTUS_STAIRS = BLOCKS.register("eucalyptus_stairs", () -> new StairBlock(() -> EUCALYPTUS_PLANKS.get().defaultBlockState(), create(WOOD, MaterialColor.PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> EUCALYPTUS_BUTTON = BLOCKS.register("eucalyptus_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> EUCALYPTUS_FENCE = BLOCKS.register("eucalyptus_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> EUCALYPTUS_FENCE_GATE = BLOCKS.register("eucalyptus_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> TAINTED_EUCALYPTUS_LEAVES = BLOCKS.register("tainted_eucalyptus_leaves", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_LEAVES.get()));
    @GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_LOG = BLOCKS.register("tainted_eucalyptus_log", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_LOG.get()));
    public static final Supplier<Block> TAINTED_STRIPPED_EUCALYPTUS_LOG = BLOCKS.register("tainted_stripped_eucalyptus_log", () -> taintedOf(ArcanaBlocks.STRIPPED_EUCALYPTUS_LOG.get()));
    @GLT public static final Supplier<Block> TAINTED_STRIPPED_EUCALYPTUS_WOOD = BLOCKS.register("tainted_stripped_eucalyptus_wood", () -> taintedOf(ArcanaBlocks.STRIPPED_EUCALYPTUS_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_WOOD = BLOCKS.register("tainted_eucalyptus_wood", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_PLANKS = BLOCKS.register("tainted_eucalyptus_planks", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_PLANKS.get()));
    //@GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_SAPLING = BLOCKS.register("tainted_eucalyptus_sapling", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_SAPLING.get()));
    @GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_SLAB = BLOCKS.register("tainted_eucalyptus_slab", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_SLAB.get()));
    @GLT public static final Supplier<Block> TAINTED_EUCALYPTUS_STAIRS = BLOCKS.register("tainted_eucalyptus_stairs", () -> taintedOf(ArcanaBlocks.EUCALYPTUS_STAIRS.get()));

    // Greatwood
    public static final Supplier<Block> GREATWOOD_LEAVES = BLOCKS.register("greatwood_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> GREATWOOD_LOG = BLOCKS.register("greatwood_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_GREATWOOD_LOG = BLOCKS.register("stripped_greatwood_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_GREATWOOD_WOOD = BLOCKS.register("stripped_greatwood_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> GREATWOOD_WOOD = BLOCKS.register("greatwood_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> GREATWOOD_PLANKS = BLOCKS.register("greatwood_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> GREATWOOD_DOOR = BLOCKS.register("greatwood_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> GREATWOOD_TRAPDOOR = BLOCKS.register("greatwood_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> GREATWOOD_PRESSURE_PLATE = BLOCKS.register("greatwood_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    @GLT public static final Supplier<ASaplingBlock> GREATWOOD_SAPLING = BLOCKS.register("greatwood_sapling", () -> new ASaplingBlock(new GreatwoodTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> GREATWOOD_SLAB = BLOCKS.register("greatwood_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> GREATWOOD_STAIRS = BLOCKS.register("greatwood_stairs", () -> new StairBlock(() -> GREATWOOD_PLANKS.get().defaultBlockState(), create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> GREATWOOD_BUTTON = BLOCKS.register("greatwood_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> GREATWOOD_FENCE = BLOCKS.register("greatwood_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> GREATWOOD_FENCE_GATE = BLOCKS.register("greatwood_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> TAINTED_GREATWOOD_LEAVES = BLOCKS.register("tainted_greatwood_leaves", () -> taintedOf(ArcanaBlocks.GREATWOOD_LEAVES.get()));
    @GLT public static final Supplier<Block> TAINTED_GREATWOOD_LOG = BLOCKS.register("tainted_greatwood_log", () -> taintedOf(ArcanaBlocks.GREATWOOD_LOG.get()));
    public static final Supplier<Block> TAINTED_STRIPPED_GREATWOOD_LOG = BLOCKS.register("tainted_stripped_greatwood_log", () -> taintedOf(ArcanaBlocks.STRIPPED_GREATWOOD_LOG.get()));
    @GLT public static final Supplier<Block> TAINTED_STRIPPED_GREATWOOD_WOOD = BLOCKS.register("tainted_stripped_greatwood_wood", () -> taintedOf(ArcanaBlocks.STRIPPED_GREATWOOD_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_GREATWOOD_WOOD = BLOCKS.register("tainted_greatwood_wood", () -> taintedOf(ArcanaBlocks.GREATWOOD_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_GREATWOOD_PLANKS = BLOCKS.register("tainted_greatwood_planks", () -> taintedOf(ArcanaBlocks.GREATWOOD_PLANKS.get()));
    @GLT public static final Supplier<SaplingBlock> TAINTED_GREATWOOD_SAPLING = BLOCKS.register("tainted_greatwood_sapling", () -> new TaintedSaplingBlock(GREATWOOD_SAPLING.get(), new TaintedGreatwoodTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> TAINTED_GREATWOOD_SLAB = BLOCKS.register("tainted_greatwood_slab", () -> taintedOf(ArcanaBlocks.GREATWOOD_SLAB.get()));
    @GLT public static final Supplier<Block> TAINTED_GREATWOOD_STAIRS = BLOCKS.register("tainted_greatwood_stairs", () -> taintedOf(ArcanaBlocks.GREATWOOD_STAIRS.get()));

    // Hawthorn Wood
    public static final Supplier<Block> HAWTHORN_LEAVES = BLOCKS.register("hawthorn_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> HAWTHORN_LOG = BLOCKS.register("hawthorn_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_HAWTHORN_LOG = BLOCKS.register("stripped_hawthorn_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_HAWTHORN_WOOD = BLOCKS.register("stripped_hawthorn_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> HAWTHORN_WOOD = BLOCKS.register("hawthorn_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> HAWTHORN_PLANKS = BLOCKS.register("hawthorn_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> HAWTHORN_DOOR = BLOCKS.register("hawthorn_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> HAWTHORN_TRAPDOOR = BLOCKS.register("hawthorn_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> HAWTHORN_PRESSURE_PLATE = BLOCKS.register("hawthorn_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    //@GLT public static final Supplier<Block> HAWTHORN_SAPLING = BLOCKS.register("hawthorn_sapling", () -> new ASaplingBlock(new DummyTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> HAWTHORN_SLAB = BLOCKS.register("hawthorn_slab", () -> new SlabBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> HAWTHORN_STAIRS = BLOCKS.register("hawthorn_stairs", () -> new StairBlock(() -> HAWTHORN_PLANKS.get().defaultBlockState(), create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> HAWTHORN_BUTTON = BLOCKS.register("hawthorn_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> HAWTHORN_FENCE = BLOCKS.register("hawthorn_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> HAWTHORN_FENCE_GATE = BLOCKS.register("hawthorn_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> TAINTED_HAWTHORN_LEAVES = BLOCKS.register("tainted_hawthorn_leaves", () -> taintedOf(ArcanaBlocks.HAWTHORN_LEAVES.get()));
    @GLT public static final Supplier<Block> TAINTED_HAWTHORN_LOG = BLOCKS.register("tainted_hawthorn_log", () -> taintedOf(ArcanaBlocks.HAWTHORN_LOG.get()));
    public static final Supplier<Block> TAINTED_STRIPPED_HAWTHORN_LOG = BLOCKS.register("tainted_stripped_hawthorn_log", () -> taintedOf(ArcanaBlocks.STRIPPED_HAWTHORN_LOG.get()));
    @GLT public static final Supplier<Block> TAINTED_STRIPPED_HAWTHORN_WOOD = BLOCKS.register("tainted_stripped_hawthorn_wood", () -> taintedOf(ArcanaBlocks.STRIPPED_HAWTHORN_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_HAWTHORN_WOOD = BLOCKS.register("tainted_hawthorn_wood", () -> taintedOf(ArcanaBlocks.HAWTHORN_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_HAWTHORN_PLANKS = BLOCKS.register("tainted_hawthorn_planks", () -> taintedOf(ArcanaBlocks.HAWTHORN_PLANKS.get()));
    //@GLT public static final Supplier<Block> TAINTED_HAWTHORN_SAPLING = BLOCKS.register("tainted_hawthorn_sapling", () -> taintedOf(ArcanaBlocks.HAWTHORN_SAPLING.get()));
    @GLT public static final Supplier<Block> TAINTED_HAWTHORN_SLAB = BLOCKS.register("tainted_hawthorn_slab", () -> taintedOf(ArcanaBlocks.HAWTHORN_SLAB.get()));
    @GLT public static final Supplier<Block> TAINTED_HAWTHORN_STAIRS = BLOCKS.register("tainted_hawthorn_stairs", () -> taintedOf(ArcanaBlocks.HAWTHORN_STAIRS.get()));

    // Silverwood
    public static final Supplier<Block> SILVERWOOD_LEAVES = BLOCKS.register("silverwood_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> SILVERWOOD_LOG = BLOCKS.register("silverwood_log", () -> new RotatedPillarBlock(create(WOOD, SAND).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_SILVERWOOD_LOG = BLOCKS.register("stripped_silverwood_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_SILVERWOOD_WOOD = BLOCKS.register("stripped_silverwood_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> SILVERWOOD_WOOD = BLOCKS.register("silverwood_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> SILVERWOOD_PLANKS = BLOCKS.register("silverwood_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> SILVERWOOD_DOOR = BLOCKS.register("silverwood_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> SILVERWOOD_TRAPDOOR = BLOCKS.register("silverwood_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> SILVERWOOD_PRESSURE_PLATE = BLOCKS.register("silverwood_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    @GLT public static final Supplier<ASaplingBlock> SILVERWOOD_SAPLING = BLOCKS.register("silverwood_sapling", () -> new ASaplingBlock(new SilverwoodTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> SILVERWOOD_SLAB = BLOCKS.register("silverwood_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> SILVERWOOD_STAIRS = BLOCKS.register("silverwood_stairs", () -> new StairBlock(() -> SILVERWOOD_PLANKS.get().defaultBlockState(), create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> SILVERWOOD_BUTTON = BLOCKS.register("silverwood_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> SILVERWOOD_FENCE = BLOCKS.register("silverwood_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> SILVERWOOD_FENCE_GATE = BLOCKS.register("silverwood_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Willow Wood
    public static final Supplier<Block> WILLOW_LEAVES = BLOCKS.register("willow_leaves", () -> new LeavesBlock(create(Material.LEAVES).strength(0.2F).tickRandomly().sound(SoundType.PLANT).noOcclusion()));
    @GLT public static final Supplier<Block> WILLOW_LOG = BLOCKS.register("willow_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    public static final Supplier<Block> STRIPPED_WILLOW_LOG = BLOCKS.register("stripped_willow_log", () -> new RotatedPillarBlock(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> STRIPPED_WILLOW_WOOD = BLOCKS.register("stripped_willow_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> WILLOW_WOOD = BLOCKS.register("willow_wood", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> WILLOW_PLANKS = BLOCKS.register("willow_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> WILLOW_DOOR = BLOCKS.register("willow_door", () -> new ADoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> WILLOW_TRAPDOOR = BLOCKS.register("willow_trapdoor", () -> new ATrapDoorBlock(create(WOOD).strength(3).sound(SoundType.WOOD).noOcclusion()));
    @GLT public static final Supplier<Block> WILLOW_PRESSURE_PLATE = BLOCKS.register("willow_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    //@GLT public static final Supplier<Block> WILLOW_SAPLING = BLOCKS.register("willow_sapling", () -> new ASaplingBlock(new DummyTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> WILLOW_SLAB = BLOCKS.register("willow_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> WILLOW_STAIRS = BLOCKS.register("willow_stairs", () -> new StairBlock(() -> WILLOW_PLANKS.get().defaultBlockState(), create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> WILLOW_BUTTON = BLOCKS.register("willow_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> WILLOW_FENCE = BLOCKS.register("willow_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> WILLOW_FENCE_GATE = BLOCKS.register("willow_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> TAINTED_WILLOW_LEAVES = BLOCKS.register("tainted_willow_leaves", () -> taintedOf(ArcanaBlocks.WILLOW_LEAVES.get()));
    @GLT public static final Supplier<Block> TAINTED_WILLOW_LOG = BLOCKS.register("tainted_willow_log", () -> taintedOf(ArcanaBlocks.WILLOW_LOG.get()));
    public static final Supplier<Block> TAINTED_STRIPPED_WILLOW_LOG = BLOCKS.register("tainted_stripped_willow_log", () -> taintedOf(ArcanaBlocks.STRIPPED_WILLOW_LOG.get()));
    @GLT public static final Supplier<Block> TAINTED_STRIPPED_WILLOW_WOOD = BLOCKS.register("tainted_stripped_willow_wood", () -> taintedOf(ArcanaBlocks.STRIPPED_WILLOW_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_WILLOW_WOOD = BLOCKS.register("tainted_willow_wood", () -> taintedOf(ArcanaBlocks.WILLOW_WOOD.get()));
    @GLT public static final Supplier<Block> TAINTED_WILLOW_PLANKS = BLOCKS.register("tainted_willow_planks", () -> taintedOf(ArcanaBlocks.WILLOW_PLANKS.get()));
    //@GLT public static final Supplier<Block> TAINTED_WILLOW_SAPLING = BLOCKS.register("tainted_willow_sapling", () -> taintedOf(ArcanaBlocks.WILLOW_SAPLING.get()));
    @GLT public static final Supplier<Block> TAINTED_WILLOW_SLAB = BLOCKS.register("tainted_willow_slab", () -> taintedOf(ArcanaBlocks.WILLOW_SLAB.get()));
    @GLT public static final Supplier<Block> TAINTED_WILLOW_STAIRS = BLOCKS.register("tainted_willow_stairs", () -> taintedOf(ArcanaBlocks.WILLOW_STAIRS.get()));

    // Compressed Resources
    @GLT public static final Supplier<Block> ARCANIUM_BLOCK = BLOCKS.register("arcanium_block", () -> new Block(create(IRON).strength(6).sound(SoundType.METAL)));
    @GLT public static final Supplier<Block> THAUMIUM_BLOCK = BLOCKS.register("thaumium_block", () -> new Block(create(IRON).strength(6).sound(SoundType.METAL)));
    @GLT public static final Supplier<Block> VOID_METAL_BLOCK = BLOCKS.register("void_metal_block", () -> new Block(create(IRON).strength(6).sound(SoundType.METAL)));
    @GLT public static final Supplier<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(create(IRON).strength(6).sound(SoundType.METAL)));

    // Crystal Clusters
    public static final Supplier<Block> AIR_CLUSTER = BLOCKS.register("air_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.AIR));
    public static final Supplier<Block> EARTH_CLUSTER = BLOCKS.register("earth_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.EARTH));
    public static final Supplier<Block> FIRE_CLUSTER = BLOCKS.register("fire_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.FIRE));
    public static final Supplier<Block> WATER_CLUSTER = BLOCKS.register("water_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.WATER));
    public static final Supplier<Block> ORDER_CLUSTER = BLOCKS.register("order_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.ORDER));
    public static final Supplier<Block> CHAOS_CLUSTER = BLOCKS.register("chaos_cluster", () -> new CrystalClusterBlock(BlockBehaviour.Properties.of().strength(1).noOcclusion().noCollission().setLightLevel(light(3)).sound(ArcanaSounds.CRYSTAL).tickRandomly(), Aspects.CHAOS));

    //Misc Tainted Blocks
    //public static final Supplier<Block> TAINTED_DESTROYED_ORE = BLOCKS.register("tainted_destroyed_ore", () -> Taint.taintedOf(Blocks.STONE_BRICKS));
    @GLT public static final Supplier<Block> TAINTED_ARCANIUM_BLOCK = BLOCKS.register("tainted_arcanium_block", () -> taintedOf(ArcanaBlocks.ARCANIUM_BLOCK.get()));
    @GLT public static final Supplier<Block> TAINTED_THAUMIUM_BLOCK = BLOCKS.register("tainted_thaumium_block", () -> taintedOf(ArcanaBlocks.THAUMIUM_BLOCK.get()));

    // Tainted Blocks
    @GLT public static final Supplier<Block> TAINTED_CRUST = BLOCKS.register("tainted_crust", () -> taintedOf(Blocks.COBBLESTONE));
    @GLT public static final Supplier<Block> TAINTED_CRUST_SLAB = BLOCKS.register("tainted_crust_slab", () -> taintedOf(Blocks.COBBLESTONE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_GRAVEL = BLOCKS.register("tainted_gravel", () -> taintedOf(Blocks.GRAVEL));
    @GLT public static final Supplier<Block> TAINTED_SAND = BLOCKS.register("tainted_sand", () -> taintedOf(Blocks.SAND));

    @GLT public static final Supplier<Block> TAINTED_ANDESITE = BLOCKS.register("tainted_andesite", () -> taintedOf(Blocks.ANDESITE));
    @GLT public static final Supplier<Block> TAINTED_DIORITE = BLOCKS.register("tainted_diorite", () -> taintedOf(Blocks.DIORITE));
    @GLT public static final Supplier<Block> TAINTED_GRANITE = BLOCKS.register("tainted_granite", () -> taintedOf(Blocks.GRANITE));
    @GLT public static final Supplier<Block> TAINTED_ROCK = BLOCKS.register("tainted_rock", () -> taintedOf(Blocks.STONE));
    @GLT public static final Supplier<Block> TAINTED_ROCK_SLAB = BLOCKS.register("tainted_rock_slab", () -> taintedOf(Blocks.STONE_SLAB));

    @GLT public static final Supplier<Block> TAINTED_SOIL = BLOCKS.register("tainted_soil", () -> taintedOf(Blocks.DIRT));
    public static final Supplier<Block> TAINTED_GRASS_BLOCK = BLOCKS.register("tainted_grass_block", () -> taintedOf(Blocks.GRASS_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_PODZOL = BLOCKS.register("tainted_podzol", () -> taintedOf(Blocks.PODZOL));
    @GLT public static final Supplier<Block> TAINTED_FARMLAND = BLOCKS.register("tainted_farmland", () -> taintedOf(Blocks.FARMLAND));
    @GLT public static final Supplier<Block> TAINTED_PATH = BLOCKS.register("tainted_path", () -> taintedOf(Blocks.GRASS_PATH));

    @GLT public static final Supplier<Block> TAINTED_COAL_BLOCK = BLOCKS.register("tainted_coal_block", () -> taintedOf(Blocks.COAL_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_EMERALD_BLOCK = BLOCKS.register("tainted_emerald_block", () -> taintedOf(Blocks.EMERALD_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_DIAMOND_BLOCK = BLOCKS.register("tainted_diamond_block", () -> taintedOf(Blocks.DIAMOND_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_GOLD_BLOCK = BLOCKS.register("tainted_gold_block", () -> taintedOf(Blocks.GOLD_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_IRON_BLOCK = BLOCKS.register("tainted_iron_block", () -> taintedOf(Blocks.IRON_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_LAPIS_BLOCK = BLOCKS.register("tainted_lapis_block", () -> taintedOf(Blocks.LAPIS_BLOCK));
    @GLT public static final Supplier<Block> TAINTED_REDSTONE_BLOCK = BLOCKS.register("tainted_redstone_block", () -> taintedOf(Blocks.REDSTONE_BLOCK));

    public static final Supplier<Block> TAINTED_VINE = BLOCKS.register("tainted_vine", () -> taintedOf(Blocks.VINE));
    public static final Supplier<Block> TAINTED_GRASS = BLOCKS.register("tainted_grass", () -> taintedOf(Blocks.GRASS));
    @GLT public static final Supplier<Block> TAINTED_FLOWER = BLOCKS.register("tainted_flower", () -> taintedOf(
            Blocks.CORNFLOWER,Blocks.DANDELION,Blocks.POPPY,Blocks.BLUE_ORCHID,Blocks.ALLIUM,Blocks.AZURE_BLUET,Blocks.RED_TULIP,Blocks.ORANGE_TULIP,Blocks.WHITE_TULIP,Blocks.PINK_TULIP,Blocks.OXEYE_DAISY,Blocks.LILY_OF_THE_VALLEY
    ));
    @GLT public static final Supplier<Block> TAINTED_CARVED_PUMPKIN = BLOCKS.register("tainted_carved_pumpkin", () -> taintedOf(Blocks.CARVED_PUMPKIN));
    @GLT public static final Supplier<Block> TAINTED_JACK_OLANTERN = BLOCKS.register("tainted_jack_olantern", () -> taintedOf(Blocks.JACK_O_LANTERN));
    public static final Supplier<Block> TAINTED_MELON = BLOCKS.register("tainted_melon", () -> taintedOf(Blocks.MELON));
    @GLT public static final Supplier<Block> TAINTED_MUSHROOM = BLOCKS.register("tainted_mushroom", () -> taintedOf(Blocks.BROWN_MUSHROOM));
    @GLT public static final Supplier<Block> TAINTED_PUMPKIN = BLOCKS.register("tainted_pumpkin", () -> taintedOf(Blocks.PUMPKIN));

    public static final Supplier<Block> TAINTED_COAL_ORE = BLOCKS.register("tainted_coal_ore", () -> taintedOf(Blocks.COAL_ORE));
    public static final Supplier<Block> TAINTED_IRON_ORE = BLOCKS.register("tainted_iron_ore", () -> taintedOf(Blocks.IRON_ORE));
    public static final Supplier<Block> TAINTED_GOLD_ORE = BLOCKS.register("tainted_gold_ore", () -> taintedOf(Blocks.GOLD_ORE));
    public static final Supplier<Block> TAINTED_DIAMOND_ORE = BLOCKS.register("tainted_diamond_ore", () -> taintedOf(Blocks.DIAMOND_ORE));
    public static final Supplier<Block> TAINTED_LAPIS_ORE = BLOCKS.register("tainted_lapis_ore", () -> taintedOf(Blocks.LAPIS_ORE));
    public static final Supplier<Block> TAINTED_EMERALD_ORE = BLOCKS.register("tainted_emerald_ore", () -> taintedOf(Blocks.EMERALD_ORE));
    public static final Supplier<Block> TAINTED_REDSTONE_ORE = BLOCKS.register("tainted_redstone_ore", () -> taintedOf(Blocks.REDSTONE_ORE));

    public static final Supplier<Block> TAINTED_ACACIA_LEAVES = BLOCKS.register("tainted_acacia_leaves", () -> taintedOf(Blocks.ACACIA_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_ACACIA_LOG = BLOCKS.register("tainted_acacia_log", () -> taintedOf(Blocks.ACACIA_LOG));
    @GLT public static final Supplier<Block> TAINTED_ACACIA_PLANKS = BLOCKS.register("tainted_acacia_planks", () -> taintedOf(Blocks.ACACIA_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_ACACIA_SAPLING = BLOCKS.register("tainted_acacia_sapling", () -> taintedOf(Blocks.ACACIA_SAPLING));
    @GLT public static final Supplier<Block> TAINTED_ACACIA_SLAB = BLOCKS.register("tainted_acacia_slab", () -> taintedOf(Blocks.ACACIA_SLAB));
    @GLT public static final Supplier<Block> TAINTED_ACACIA_STAIRS = BLOCKS.register("tainted_acacia_stairs", () -> taintedOf(Blocks.ACACIA_STAIRS));

    public static final Supplier<Block> TAINTED_BIRCH_LEAVES = BLOCKS.register("tainted_birch_leaves", () -> taintedOf(Blocks.BIRCH_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_BIRCH_LOG = BLOCKS.register("tainted_birch_log", () -> taintedOf(Blocks.BIRCH_LOG));
    @GLT public static final Supplier<Block> TAINTED_BIRCH_PLANKS = BLOCKS.register("tainted_birch_planks", () -> taintedOf(Blocks.BIRCH_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_BIRCH_SAPLING = BLOCKS.register("tainted_birch_sapling", () -> taintedOf(Blocks.BIRCH_SAPLING));
    @GLT public static final Supplier<Block> TAINTED_BIRCH_SLAB = BLOCKS.register("tainted_birch_slab", () -> taintedOf(Blocks.BIRCH_SLAB));
    @GLT public static final Supplier<Block> TAINTED_BIRCH_STAIRS = BLOCKS.register("tainted_birch_stairs", () -> taintedOf(Blocks.BIRCH_STAIRS));

    public static final Supplier<Block> TAINTED_DARKOAK_LEAVES = BLOCKS.register("tainted_darkoak_leaves", () -> taintedOf(Blocks.DARK_OAK_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_DARKOAK_LOG = BLOCKS.register("tainted_darkoak_log", () -> taintedOf(Blocks.DARK_OAK_LOG));
    @GLT public static final Supplier<Block> TAINTED_DARKOAK_PLANKS = BLOCKS.register("tainted_darkoak_planks", () -> taintedOf(Blocks.DARK_OAK_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_DARKOAK_SAPLING = BLOCKS.register("tainted_darkoak_sapling", () -> taintedOf(Blocks.DARK_OAK_SAPLING));
    @GLT
    public static final Supplier<Block> TAINTED_DARKOAK_SLAB = BLOCKS.register("tainted_darkoak_slab", () -> taintedOf(Blocks.DARK_OAK_SLAB));
    @GLT public static final Supplier<Block> TAINTED_DARKOAK_STAIRS = BLOCKS.register("tainted_darkoak_stairs", () -> taintedOf(Blocks.DARK_OAK_STAIRS));

    public static final Supplier<Block> TAINTED_JUNGLE_LEAVES = BLOCKS.register("tainted_jungle_leaves", () -> taintedOf(Blocks.JUNGLE_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_JUNGLE_LOG = BLOCKS.register("tainted_jungle_log", () -> taintedOf(Blocks.JUNGLE_LOG));
    @GLT public static final Supplier<Block> TAINTED_JUNGLE_PLANKS = BLOCKS.register("tainted_jungle_planks", () -> taintedOf(Blocks.JUNGLE_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_JUNGLE_SAPLING = BLOCKS.register("tainted_jungle_sapling", () -> taintedOf(Blocks.JUNGLE_SAPLING));
    @GLT public static final Supplier<Block> TAINTED_JUNGLE_SLAB = BLOCKS.register("tainted_jungle_slab", () -> taintedOf(Blocks.JUNGLE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_JUNGLE_STAIRS = BLOCKS.register("tainted_jungle_stairs", () -> taintedOf(Blocks.JUNGLE_STAIRS));

    public static final Supplier<Block> TAINTED_OAK_LEAVES = BLOCKS.register("tainted_oak_leaves", () -> taintedOf(Blocks.OAK_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_OAK_LOG = BLOCKS.register("tainted_oak_log", () -> taintedOf(Blocks.OAK_LOG));
    @GLT public static final Supplier<Block> TAINTED_OAK_PLANKS = BLOCKS.register("tainted_oak_planks", () -> taintedOf(Blocks.OAK_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_OAK_SAPLING = BLOCKS.register("tainted_oak_sapling", () -> new TaintedSaplingBlock(Blocks.OAK_SAPLING, new TaintedOakTree(), create(Material.PLANTS).noCollission().tickRandomly().strength(0).sound(SoundType.PLANT)));
    @GLT public static final Supplier<Block> TAINTED_OAK_SLAB = BLOCKS.register("tainted_oak_slab", () -> taintedOf(Blocks.OAK_SLAB));
    @GLT public static final Supplier<Block> TAINTED_OAK_STAIRS = BLOCKS.register("tainted_oak_stairs", () -> taintedOf(Blocks.OAK_STAIRS));

    public static final Supplier<Block> TAINTED_SPRUCE_LEAVES = BLOCKS.register("tainted_spruce_leaves", () -> taintedOf(Blocks.SPRUCE_LEAVES));
    @GLT public static final Supplier<Block> TAINTED_SPRUCE_LOG = BLOCKS.register("tainted_spruce_log", () -> taintedOf(Blocks.SPRUCE_LOG));
    @GLT public static final Supplier<Block> TAINTED_SPRUCE_PLANKS = BLOCKS.register("tainted_spruce_planks", () -> taintedOf(Blocks.SPRUCE_PLANKS));
    @GLT public static final Supplier<Block> TAINTED_SPRUCE_SAPLING = BLOCKS.register("tainted_spruce_sapling", () -> taintedOf(Blocks.SPRUCE_SAPLING));
    @GLT public static final Supplier<Block> TAINTED_SPRUCE_SLAB = BLOCKS.register("tainted_spruce_slab", () -> taintedOf(Blocks.SPRUCE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_SPRUCE_STAIRS = BLOCKS.register("tainted_spruce_stairs", () -> taintedOf(Blocks.SPRUCE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_POLISHED_GRANITE = BLOCKS.register("tainted_polished_granite", () -> taintedOf(Blocks.POLISHED_GRANITE));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_GRANITE_SLAB = BLOCKS.register("tainted_polished_granite_slab", () -> taintedOf(Blocks.POLISHED_GRANITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_GRANITE_STAIRS = BLOCKS.register("tainted_polished_granite_stairs", () -> taintedOf(Blocks.POLISHED_GRANITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_POLISHED_DIORITE = BLOCKS.register("tainted_polished_diorite", () -> taintedOf(Blocks.POLISHED_DIORITE));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_DIORITE_SLAB = BLOCKS.register("tainted_polished_diorite_slab", () -> taintedOf(Blocks.POLISHED_DIORITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_DIORITE_STAIRS = BLOCKS.register("tainted_polished_diorite_stairs", () -> taintedOf(Blocks.POLISHED_DIORITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_POLISHED_ANDESITE = BLOCKS.register("tainted_polished_andesite", () -> taintedOf(Blocks.POLISHED_ANDESITE));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_ANDESITE_SLAB = BLOCKS.register("tainted_polished_andesite_slab", () -> taintedOf(Blocks.POLISHED_ANDESITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_POLISHED_ANDESITE_STAIRS = BLOCKS.register("tainted_polished_andesite_stairs", () -> taintedOf(Blocks.POLISHED_ANDESITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_ANDESITE_SLAB = BLOCKS.register("tainted_andesite_slab", () -> taintedOf(Blocks.POLISHED_ANDESITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_ANDESITE_STAIRS = BLOCKS.register("tainted_andesite_stairs", () -> taintedOf(Blocks.POLISHED_ANDESITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_DIORITE_SLAB = BLOCKS.register("tainted_diorite_slab", () -> taintedOf(Blocks.POLISHED_DIORITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_DIORITE_STAIRS = BLOCKS.register("tainted_diorite_stairs", () -> taintedOf(Blocks.POLISHED_DIORITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_GRANITE_SLAB = BLOCKS.register("tainted_granite_slab", () -> taintedOf(Blocks.POLISHED_GRANITE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_GRANITE_STAIRS = BLOCKS.register("tainted_granite_stairs", () -> taintedOf(Blocks.POLISHED_GRANITE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_BRICKS = BLOCKS.register("tainted_bricks", () -> taintedOf(Blocks.BRICKS));
    @GLT public static final Supplier<Block> TAINTED_BRICKS_SLAB = BLOCKS.register("tainted_bricks_slab", () -> taintedOf(Blocks.BRICK_SLAB));
    @GLT public static final Supplier<Block> TAINTED_BRICKS_STAIRS = BLOCKS.register("tainted_bricks_stairs", () -> taintedOf(Blocks.BRICK_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_STONE_BRICKS = BLOCKS.register("tainted_stone_bricks", () -> taintedOf(Blocks.STONE_BRICKS));
    @GLT public static final Supplier<Block> TAINTED_STONE_BRICKS_SLAB = BLOCKS.register("tainted_stone_bricks_slab", () -> taintedOf(Blocks.STONE_BRICK_SLAB));
    @GLT public static final Supplier<Block> TAINTED_STONE_BRICKS_STAIRS = BLOCKS.register("tainted_stone_bricks_stairs", () -> taintedOf(Blocks.STONE_BRICK_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_PRISMARINE = BLOCKS.register("tainted_prismarine", () -> taintedOf(Blocks.PRISMARINE));
    @GLT public static final Supplier<Block> TAINTED_PRISMARINE_SLAB = BLOCKS.register("tainted_prismarine_slab", () -> taintedOf(Blocks.PRISMARINE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_PRISMARINE_STAIRS = BLOCKS.register("tainted_prismarine_stairs", () -> taintedOf(Blocks.PRISMARINE_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_PRISMARINE_BRICKS = BLOCKS.register("tainted_prismarine_bricks", () -> taintedOf(Blocks.PRISMARINE_BRICKS));
    @GLT public static final Supplier<Block> TAINTED_PRISMARINE_BRICKS_SLAB = BLOCKS.register("tainted_prismarine_bricks_slab", () -> taintedOf(Blocks.PRISMARINE_BRICK_SLAB));
    @GLT public static final Supplier<Block> TAINTED_PRISMARINE_BRICKS_STAIRS = BLOCKS.register("tainted_prismarine_bricks_stairs", () -> taintedOf(Blocks.PRISMARINE_BRICK_STAIRS));

    @GLT public static final Supplier<Block> TAINTED_DARK_PRISMARINE = BLOCKS.register("tainted_dark_prismarine", () -> taintedOf(Blocks.DARK_PRISMARINE));
    @GLT public static final Supplier<Block> TAINTED_DARK_PRISMARINE_SLAB = BLOCKS.register("tainted_dark_prismarine_slab", () -> taintedOf(Blocks.DARK_PRISMARINE_SLAB));
    @GLT public static final Supplier<Block> TAINTED_DARK_PRISMARINE_STAIRS = BLOCKS.register("tainted_dark_prismarine_stairs", () -> taintedOf(Blocks.DARK_PRISMARINE_STAIRS));

    public static final Supplier<Block> TAINTED_SNOW_BLOCK = BLOCKS.register("tainted_snow_block", () -> taintedOf(Blocks.SNOW_BLOCK));
    public static final Supplier<Block> TAINTED_SNOW = BLOCKS.register("tainted_snow", () -> taintedOf(Blocks.SNOW));

    // Dead Blocks
    public static final Supplier<Block> DEAD_GRASS_BLOCK = BLOCKS.register("dead_grass_block", () -> deadOf(Blocks.GRASS_BLOCK));
    public static final Supplier<Block> DEAD_GRASS = BLOCKS.register("dead_grass", () -> deadOf(Blocks.GRASS));
    @GLT public static final Supplier<Block> DEAD_FLOWER = BLOCKS.register("dead_flower", () -> deadOf(
            Blocks.CORNFLOWER,Blocks.DANDELION,Blocks.POPPY,Blocks.BLUE_ORCHID,Blocks.ALLIUM,Blocks.AZURE_BLUET,Blocks.RED_TULIP,Blocks.ORANGE_TULIP,Blocks.WHITE_TULIP,Blocks.PINK_TULIP,Blocks.OXEYE_DAISY,Blocks.LILY_OF_THE_VALLEY
    ));

    // Dead wood
    // Dead wood
    @GLT public static final Supplier<Block> DEAD_LOG = BLOCKS.register("dead_log", () -> deadOf(
            Blocks.OAK_LOG,Blocks.BIRCH_LOG,Blocks.SPRUCE_LOG,Blocks.JUNGLE_LOG,Blocks.DARK_OAK_LOG,Blocks.ACACIA_LOG
    ));
    @GLT public static final Supplier<Block> DEAD_PLANKS = BLOCKS.register("dead_planks", () -> new Block(create(WOOD).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DEAD_PRESSURE_PLATE = BLOCKS.register("dead_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    @GLT public static final Supplier<Block> DEAD_SLAB = BLOCKS.register("dead_slab", () -> new SlabBlock(create(WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DEAD_STAIRS = BLOCKS.register("dead_stairs", () -> new StairBlock(() -> DEAD_PLANKS.get().defaultBlockState(), create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> DEAD_BUTTON = BLOCKS.register("dead_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> DEAD_FENCE = BLOCKS.register("dead_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> DEAD_FENCE_GATE = BLOCKS.register("dead_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Trypophobius Wood
    @GLT
    public static final Supplier<Block> TRYPOPHOBIUS_LOG = BLOCKS.register("trypophobius_log", () -> deadOf(
            ArcanaBlocks.DAIR_LOG.get(), ArcanaBlocks.EUCALYPTUS_LOG.get(), ArcanaBlocks.GREATWOOD_LOG.get(), ArcanaBlocks.HAWTHORN_LOG.get(), ArcanaBlocks.SILVERWOOD_LOG.get()
    ));
    @GLT public static final Supplier<Block> TRYPOPHOBIUS_PLANKS = BLOCKS.register("trypophobius_planks", () -> new Block(create(WOOD, BLACK).strength(2).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> TRYPOPHOBIUS_PRESSURE_PLATE = BLOCKS.register("trypophobius_pressure_plate", () -> new PressurePlateBlock(Sensitivity.EVERYTHING, create(WOOD).destroyTime(0.5F).sound(SoundType.WOOD).noCollission()));
    @GLT public static final Supplier<Block> TRYPOPHOBIUS_SLAB = BLOCKS.register("trypophobius_slab", () -> new SlabBlock(create(WOOD, BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> TRYPOPHOBIUS_STAIRS = BLOCKS.register("trypophobius_stairs", () -> new StairBlock(() -> TRYPOPHOBIUS_PLANKS.get().defaultBlockState(), create(WOOD, BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<Block> TRYPOPHOBIUS_BUTTON = BLOCKS.register("trypophobius_button", () -> new AWoodButtonBlock(create(MISCELLANEOUS).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceBlock> TRYPOPHOBIUS_FENCE = BLOCKS.register("trypophobius_fence", () -> new FenceBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    @GLT public static final Supplier<FenceGateBlock> TRYPOPHOBIUS_FENCE_GATE = BLOCKS.register("trypophobius_fence_gate", () -> new FenceGateBlock(create(WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Spell made blocks
    public static final Supplier<Block> VACUUM_BLOCK = BLOCKS.register("vacuum_block", () -> new VacuumBlock(create(MISCELLANEOUS).strength(0).noCollission().noOcclusion().setLightLevel(light(15))));
    public static final Supplier<Block> WARDENED_BLOCK = BLOCKS.register("wardened_block", () -> new WardenedBlock(create(MISCELLANEOUS).strength(-1).setLightLevel(light(3))));
    public static final Supplier<Block> LIGHT_BLOCK = BLOCKS.register("light_block", () -> new Block(create(AIR).strength(0).noCollission().noOcclusion().setLightLevel(light(3))));
}