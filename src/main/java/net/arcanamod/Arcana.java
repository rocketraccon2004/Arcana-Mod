package net.arcanamod;

import com.mojang.logging.LogUtils;
import net.arcanamod.items.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.util.function.Supplier;

@Mod(Arcana.modId)
public class Arcana {
    public static final String modId = "arcana";
    public static final Logger logger = LogUtils.getLogger();
    private static int pNextAspectId = 0;

    public static final DeferredRegister<CreativeModeTab> creativeTabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, modId);

    public static final Supplier<CreativeModeTab> Arcana_Tab = creativeTabs.register("arcana", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup.arcana"))
            //Set the icon of the tab.
            .icon(() -> new ItemStack(ArcanaItems.ARCANUM.get()))
            //Add your items to the tab.
            .displayItems((enabledFlags, populator) -> {
                populator.accept(ArcanaItems.ARCANIUM_SWORD.get());
                populator.accept(ArcanaItems.ARCANIUM_SHOVEL.get());
                populator.accept(ArcanaItems.ARCANIUM_PICKAXE.get());
                populator.accept(ArcanaItems.ARCANIUM_AXE.get());
                populator.accept(ArcanaItems.ARCANIUM_HOE.get());
                populator.accept(ArcanaItems.ARCANIUM_HELMET.get());
                populator.accept(ArcanaItems.ARCANIUM_CHESTPLATE.get());
                populator.accept(ArcanaItems.ARCANIUM_LEGGINGS.get());
                populator.accept(ArcanaItems.ARCANIUM_BOOTS.get());
                populator.accept(ArcanaItems.SILVER_SWORD.get());
                populator.accept(ArcanaItems.SILVER_SHOVEL.get());
                populator.accept(ArcanaItems.SILVER_PICKAXE.get());
                populator.accept(ArcanaItems.SILVER_AXE.get());
                populator.accept(ArcanaItems.SILVER_HOE.get());
                populator.accept(ArcanaItems.VOID_METAL_SWORD.get());
                populator.accept(ArcanaItems.VOID_METAL_SHOVEL.get());
                populator.accept(ArcanaItems.VOID_METAL_PICKAXE.get());
                populator.accept(ArcanaItems.VOID_METAL_AXE.get());
                populator.accept(ArcanaItems.VOID_METAL_HOE.get());
                populator.accept(ArcanaItems.VOID_METAL_HELMET.get());
                populator.accept(ArcanaItems.VOID_METAL_CHESTPLATE.get());
                populator.accept(ArcanaItems.VOID_METAL_LEGGINGS.get());
                populator.accept(ArcanaItems.VOID_METAL_BOOTS.get());
                populator.accept(ArcanaItems.RESEARCH_NOTE_COMPLETE.get());
                populator.accept(ArcanaItems.RESEARCH_NOTE.get());
                populator.accept(ArcanaItems.SCRIBING_TOOLS.get());
                populator.accept(ArcanaItems.VIS_MANIPULATION_TOOLS.get());
                populator.accept(ArcanaItems.PHIAL.get());
                populator.accept(ArcanaItems.SCRIBBLED_NOTES_COMPLETE.get());
                populator.accept(ArcanaItems.SCRIBBLED_NOTES.get());
                populator.accept(ArcanaItems.TAINT_IN_A_BOTTLE.get());
                populator.accept(ArcanaItems.FLUX_METER.get());
                populator.accept(ArcanaItems.ARCANUM.get());
                populator.accept(ArcanaItems.GRIMOIRE.get());
                populator.accept(ArcanaItems.CODEX.get());
                populator.accept(ArcanaItems.RITES.get());
                populator.accept(ArcanaItems.LABEL.get());
                populator.accept(ArcanaItems.THAUMIUM_INGOT.get());
                populator.accept(ArcanaItems.ARCANIUM_INGOT.get());
                populator.accept(ArcanaItems.VOID_METAL_INGOT.get());
                populator.accept(ArcanaItems.VOID_METAL_NUGGET.get());
                populator.accept(ArcanaItems.SILVER_INGOT.get());
                populator.accept(ArcanaItems.NETHERITE_NUGGET.get());
                populator.accept(ArcanaItems.SILVER_NUGGET.get());
                populator.accept(ArcanaItems.THAUMIUM_NUGGET.get());
                populator.accept(ArcanaItems.SILVERWOOD_STICK.get());
                populator.accept(ArcanaItems.AMBER.get());
                populator.accept(ArcanaItems.ELDRITCH_CLOTH.get());
                populator.accept(ArcanaItems.PURIFIED_IRON.get());
                populator.accept(ArcanaItems.PURIFIED_GOLD.get());
                populator.accept(ArcanaItems.PURIFIED_SILVER.get());
                populator.accept(ArcanaItems.ALTERED_IRON.get());
                populator.accept(ArcanaItems.GOGGLES_OF_REVEALING.get());
                //populator.accept(ArcanaItems.AIR_CRYSTAL_SEED.get());
                // populator.accept(ArcanaItems.EARTH_CRYSTAL_SEED.get());
                // populator.accept(ArcanaItems.FIRE_CRYSTAL_SEED.get());
                // populator.accept(ArcanaItems.WATER_CRYSTAL_SEED.get());
                // populator.accept(ArcanaItems.ORDER_CRYSTAL_SEED.get());
                // populator.accept(ArcanaItems.CHAOS_CRYSTAL_SEED.get());
                populator.accept(ArcanaItems.IRON_CAP.get());
                populator.accept(ArcanaItems.GOLD_CAP.get());
                populator.accept(ArcanaItems.COPPER_CAP.get());
                populator.accept(ArcanaItems.SILVER_CAP.get());
                populator.accept(ArcanaItems.THAUMIUM_CAP.get());
                populator.accept(ArcanaItems.VOID_CAP.get());
                populator.accept(ArcanaItems.NETHERITE_CAP.get());
                populator.accept(ArcanaItems.PRISMARINE_CAP.get());
                populator.accept(ArcanaItems.BAMBOO_CAP.get());
                populator.accept(ArcanaItems.AMBER_CAP.get());
                populator.accept(ArcanaItems.QUARTZ_CAP.get());
                populator.accept(ArcanaItems.LEATHER_CAP.get());
                populator.accept(ArcanaItems.HONEY_CAP.get());
                populator.accept(ArcanaItems.SHULKER_CAP.get());
                populator.accept(ArcanaItems.MECHANICAL_CAP.get());
                populator.accept(ArcanaItems.ELDRITCH_CLOTH_CAP.get());
                populator.accept(ArcanaItems.CLAY_CAP.get());
                populator.accept(ArcanaItems.DEFAULT_FOCUS.get());
                populator.accept(ArcanaItems.FOCUS_PARTS.get());
                populator.accept(ArcanaItems.GREATWOOD_WAND_CORE.get());
                populator.accept(ArcanaItems.TAINTED_WAND_CORE.get());
                populator.accept(ArcanaItems.DAIR_WAND_CORE.get());
                populator.accept(ArcanaItems.HAWTHORN_WAND_CORE.get());
                populator.accept(ArcanaItems.SILVERWOOD_WAND_CORE.get());
                populator.accept(ArcanaItems.ARCANIUM_WAND_CORE.get());
                populator.accept(ArcanaItems.BLAZE_WAND_CORE.get());
                populator.accept(ArcanaItems.ENDROD_WAND_CORE.get());
                populator.accept(ArcanaItems.BONE_WAND_CORE.get());
                populator.accept(ArcanaItems.ICE_WAND_CORE.get());
                populator.accept(ArcanaItems.ARCANE_STONE_WAND_CORE.get());
                populator.accept(ArcanaItems.OBSIDIAN_WAND_CORE.get());
                populator.accept(ArcanaItems.SUGAR_CANE_WAND_CORE.get());
                populator.accept(ArcanaItems.MECHANICAL_WAND_CORE.get());
                populator.accept(ArcanaItems.ELDRITCH_WAND_CORE.get());
                populator.accept(ArcanaItems.CLAY_WAND_CORE.get());
                populator.accept(ArcanaItems.WAND.get());
                populator.accept(ArcanaItems.SCEPTER.get());
                populator.accept(ArcanaItems.STAFF.get());
                populator.accept(ArcanaItems.GAUNTLET.get());
                populator.accept(ArcanaItems.TAINTED_MELON_SLICE.get());
                populator.accept(ArcanaItems.TAINTED_POTATO.get());
                populator.accept(ArcanaItems.BAKED_TAINTED_POTATO.get());
                populator.accept(ArcanaItems.TAINTED_BEETROOT.get());
                populator.accept(ArcanaItems.TAINTED_CARROT.get());
                populator.accept(ArcanaItems.TAINTED_BERRIES.get());
                populator.accept(ArcanaItems.RAW_TAINTED_COD.get());
                populator.accept(ArcanaItems.COOKED_TAINTED_COD.get());
                populator.accept(ArcanaItems.RAW_TAINTED_SALMON.get());
                populator.accept(ArcanaItems.COOKED_TAINTED_SALMON.get());
                populator.accept(ArcanaItems.TAINTED_TROPICAL_FISH.get());
                populator.accept(ArcanaItems.TAINTED_PUFFERFISH.get());
                populator.accept(ArcanaItems.TAINTED_SUGAR_CANE.get());
                // populator.accept(ArcanaItems.RESEARCH_TABLE_ITEM.get());
                // populator.accept(ArcanaItems.FOCI_FORGE_ITEM.get());
                populator.accept(ArcanaItems.RAW_DOG_MEAT.get());
                populator.accept(ArcanaItems.RAW_CAT_MEAT.get());
                populator.accept(ArcanaItems.COOKED_DOG_MEAT.get());
                populator.accept(ArcanaItems.COOKED_CAT_MEAT.get());
                populator.accept(ArcanaItems.ARCANIUM_FILTER.get());
                populator.accept(ArcanaItems.SILVERWOOD_FILTER.get());
                populator.accept(ArcanaItems.GREATWOOD_FILTER.get());
                populator.accept(ArcanaItems.HAWTHORN_FILTER.get());
                populator.accept(ArcanaItems.DAIR_FILTER.get());
                populator.accept(ArcanaItems.WILLOW_FILTER.get());
                populator.accept(ArcanaItems.EUCALYPTUS_FILTER.get());
                populator.accept(ArcanaItems.CHEATERS_ARCANUM.get());
            })
            .build()
    );

    public Arcana(IEventBus bus) {
        ArcanaItems.register(bus);
        creativeTabs.register(bus);
    }

    public static ResourceLocation arcLoc(String path){
        return new ResourceLocation(modId, path);
    }

    public static int nextAspectId() {
        return pNextAspectId++;
    }
}

