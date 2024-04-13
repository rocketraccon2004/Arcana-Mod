package net.arcanamod.items;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class GogglesItem extends Item {
    public GogglePriority priority;

    public GogglesItem(ArmorMaterial material, Item.Properties properties, GogglePriority priority) {
        super(properties);
    }
}
