package net.arcanamod.items;

import net.minecraft.world.item.Item;

public class EnchantedFilterItem extends Item {

    // Alembic efficiency, Pump speck size
    public int efficiencyBoost;
    // Alembic time per distill, Pump speck speed
    public int speedBoost;

    public EnchantedFilterItem(Item.Properties properties, int efficiencyBoost, int speedBoost){
        super(properties);
        this.efficiencyBoost = efficiencyBoost;
        this.speedBoost = speedBoost;
    }
}
