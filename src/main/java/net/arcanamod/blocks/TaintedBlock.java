package net.arcanamod.blocks;

import net.arcanamod.systems.taint.Taint;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public class TaintedBlock extends Block implements GroupedBlock{

    public static final BooleanProperty UNTAINTED = Taint.UNTAINTED;
    public TaintedBlock(Properties properties) {
        super(properties);
    }

    public Component getTranslatedName() {
        return Component.translatable("arcana.status.tainted", super.getName());
    }

    @Nullable
    @Override
    public CreativeModeTab getCreativeTab() {
        return null;
    }

    public boolean ticksRandomly(BlockState state){
        return true;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState placement = super.getStateForPlacement(pContext);
        return placement != null ? placement.setValue(UNTAINTED, true) : null;
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> Builder) {
        super.createBlockStateDefinition(Builder);
        Builder.add(UNTAINTED);
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        // TODO Auto-generated method stub
        super.tick(pState, pLevel, pPos, pRandom);
    }
}
