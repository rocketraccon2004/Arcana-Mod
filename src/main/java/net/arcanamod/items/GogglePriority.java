package net.arcanamod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

public enum GogglePriority{
    SHOW_NONE,
    SHOW_NODE,
    SHOW_ASPECTS;

    public static GogglePriority getClientGogglePriority(){
        Player player = Minecraft.getInstance().player;
        return !(player == null) && !player.getInventory().getArmor(0).isEmpty() && player.getInventory().getArmor(0).getItem() instanceof GogglesItem ? ((GogglesItem)player.getInventory().getArmor(0).getItem()).priority : SHOW_NONE;
    }
}
