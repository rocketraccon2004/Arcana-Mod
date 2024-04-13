package net.arcanamod.blocks;

import net.minecraft.world.item.CreativeModeTab;

import javax.annotation.Nullable;

public interface GroupedBlock {
    @Nullable
    CreativeModeTab getCreativeTab();
}
