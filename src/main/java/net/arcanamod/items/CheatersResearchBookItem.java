package net.arcanamod.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class CheatersResearchBookItem extends Item {
    public ResourceLocation location;

    public CheatersResearchBookItem(Item.Properties properties, ResourceLocation location) {
        super(properties);
        this.location = location;
    }
}
