package net.arcanamod.items.attachment;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FocusItem extends Item implements Focus{
    public static final int DEFAULT_NUMSTYLES = 36;

    private int numStyles;
    private final List<ResourceLocation> modelLocations;

    public FocusItem(Properties properties, int numStyles, ResourceLocation... locations){
        super(properties);
        this.numStyles = numStyles;
        modelLocations = Arrays.asList(locations);
        Focus.FOCI.add(this);
        // TODO: property overrides are now defined separately
        //addPropertyOverride(new ResourceLocation("style"), (stack, world, entity) -> stack.getOrCreateTag().getInt("style"));
    }

    public ResourceLocation getModelLocation(CompoundTag nbt){
        return modelLocations.get(Math.min(nbt.getInt("style"), modelLocations.size() - 1));
    }

    public List<ResourceLocation> getAllModelLocations(){
        return modelLocations;
    }

    public int numStyles(){
        return numStyles;
    }

    public Optional<Item> getAssociatedItem(){
        return Optional.of(this);
    }

    /*public Spell getSpell(ItemStack stack) {
        // Spell.fromNBT already uses .getCompound("spell"), so it's not needed here
        return Spell.fromNBT(stack.getOrCreateTag().getCompound("focusData")); // .getCompound("spell"));
    }*/

    @Override
    public InteractionResult useOn(UseOnContext Context) {
        Logger logger = LogManager.getLogger();
        logger.debug(Context.getPlayer().getItemInHand(Context.getHand()).getOrCreateTag().toString());
        return super.useOn(Context);
    }


    /*public static int getColourAspect(ItemStack stack) {
        Spell spell = Spell.fromNBT(stack.getOrCreateTag().getCompound("spell"));
        return spell.getSpellColor();
    }*/
}