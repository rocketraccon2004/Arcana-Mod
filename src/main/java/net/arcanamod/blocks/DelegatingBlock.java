package net.arcanamod.blocks;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.fml.util.ObfuscationReflectionHelper;
import net.neoforged.neoforge.common.IPlantable;

@SuppressWarnings("deprecation")
public class DelegatingBlock extends Block{
    protected final Block parentBlock;
    private static final Method fillStateContainer = ObfuscationReflectionHelper.findMethod(Block.class, "createBlockStateDefinition", StateDefinition.Builder.class);
	private static final Field blockColorsField = ObfuscationReflectionHelper.findField(BlockBehaviour.Properties.class, "mapColor");
	

    public DelegatingBlock(Block blockIn, @Nullable SoundType type) {
        super(propertiesWithSound(Properties.ofFullCopy(blockIn), type));
        this.parentBlock = blockIn;

        Builder<Block, BlockState> builder = new Builder<Block, BlockState>(this);
        createBlockStateDefinition(builder);
    }

    public DelegatingBlock(Block blockIn){
        this(blockIn, null);
    }

    protected void createBlockStateDefinition(Builder<Block, BlockState> builder){
        if(parentBlock != null){
            try {
                fillStateContainer.setAccessible(true);
                fillStateContainer.invoke(parentBlock, builder);
                fillStateContainer.setAccessible(false);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                System.err.println("Unable to delegate blockstate");
            }
        }
    }

    public FluidState getFluidState(BlockState state){
        return parentBlock.getFluidState(state);
    }
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static BlockState switchBlock(BlockState state, Block block){
        BlockState base = block.getStateDefinition().any();
        for( Property property : state.getProperties())
			if(base.hasProperty(property))
				base = base.setValue(property, state.getValue(property));
		return base;
	}
	
	public BlockState getStateForPlacement(BlockPlaceContext context){
		BlockState placement = parentBlock.getStateForPlacement(context);
		return placement != null
				? switchBlock(placement, this)
				: null;
	}
	
	public BlockState rotate(BlockState state, Level world, BlockPos pos, Rotation direction){
		return switchBlock(parentBlock.rotate(state, world, pos, direction), this);
	}
	
	public BlockState rotate(BlockState state, Rotation rot){
		return switchBlock(parentBlock.rotate(state, rot), this);
	}
	
	public BlockState mirror(BlockState state, Mirror mirror){
		return switchBlock(parentBlock.mirror(state, mirror), this);
	}
	
	public BlockState getStateAtViewpoint(BlockState state, BlockGetter world, BlockPos pos, Vec3 viewpoint){
		return switchBlock(parentBlock.getStateAtViewpoint(state, world, pos, viewpoint), this);
	}
	
	public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random){
		parentBlock.randomTick(state, world, pos, random);
	}
	
	public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource rand){
		parentBlock.tick(state, world, pos, rand);
	}
	
	public boolean isTransparent(BlockState state){
		return parentBlock != null && parentBlock.useShapeForLightOcclusion(state);
	}
	
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face){
		return parentBlock.getFireSpreadSpeed(state, world, pos, face);
	}
	
	public float getExplosionResistance(){
		return parentBlock.getExplosionResistance();
	}
	
	public void onBlockExploded(BlockState state, Level world, BlockPos pos, Explosion explosion){
		parentBlock.onBlockExploded(state, world, pos, explosion);
	}
	
	public float getExplosionResistance(BlockState state, BlockGetter world, BlockPos pos, Explosion explosion){
		return parentBlock.getExplosionResistance(state, world, pos, explosion);
	}
	
	public boolean addRunningEffects(BlockState state, Level world, BlockPos pos, Entity entity){
		return parentBlock.addRunningEffects(state, world, pos, entity);
	}
	
	public boolean addLandingEffects(BlockState state1, ServerLevel worldserver, BlockPos pos, BlockState state2, LivingEntity entity, int numberOfParticles){
		return parentBlock.addLandingEffects(state1, worldserver, pos, state2, entity, numberOfParticles);
	}
	
	public float getFriction(){
		return parentBlock.getFriction();
	}
	
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player){
		return parentBlock.canHarvestBlock(state, world, pos, player);
	}
	
	@Override
	public boolean isRandomlyTicking(BlockState state){
		return parentBlock.isRandomlyTicking(state);
	}
	
	@Override
	public void animateTick(BlockState state, Level world, BlockPos position, RandomSource rand){
		parentBlock.animateTick(state, world, position, rand);
	}
	
	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos){
		return parentBlock.propagatesSkylightDown(state, world, pos);
	}
	
	@Override
	public void popExperience(ServerLevel world, BlockPos pos, int amount){
		parentBlock.popExperience(world, pos, amount);
	}
	
	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion explosion){
		parentBlock.wasExploded(world, pos, explosion);
	}
	
	@Override
	public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity){
		parentBlock.stepOn(world, pos, state, entity);
	}
	
	@Override
	public boolean isPossibleToRespawnInThis(BlockState state){
		return parentBlock.isPossibleToRespawnInThis(state);
	}
	
	@Override
	public void fallOn(Level world, BlockState state,BlockPos pos, Entity entity, float num){
		parentBlock.fallOn(world, state, pos, entity, num);
	}
	
	@Override
	public void updateEntityAfterFallOn(BlockGetter world, Entity entity){
		parentBlock.updateEntityAfterFallOn(world, entity);
	}
	
	@Override
	public float getSpeedFactor(){
		return parentBlock.getSpeedFactor();
	}
	
	@Override
	public float getJumpFactor(){
		return parentBlock.getJumpFactor();
	}
	
	@Override
	public boolean hasDynamicShape(){
        return parentBlock.hasDynamicShape();
	}
	
	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable){
		return parentBlock.canSustainPlant(state, world, pos, facing, plantable);
	}
	
	@Override
	public RenderShape getRenderShape(BlockState state){
		return parentBlock.getRenderShape(state);
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context){
		return parentBlock.getCollisionShape(state, worldIn, pos, context);
	}
	
	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter worldIn, BlockPos pos){
		return parentBlock.getOcclusionShape(state, worldIn, pos);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context){
		return parentBlock.getShape(state, worldIn, pos, context);
	}
	
	@Override
	public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos){
		return parentBlock.canSurvive(state, worldIn, pos);
	}
	
	@Override
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos){
		return parentBlock.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}
	
	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext){
		return parentBlock.canBeReplaced(state, useContext);
	}
	
	@Override
	public boolean canBeReplaced(BlockState state, Fluid fluid){
		return parentBlock.canBeReplaced(state, fluid);
	}
	
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result){
		return parentBlock.use(state, world, pos, player, hand, result);
	}
	 
	public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos){
		return parentBlock.getLightEmission(state, world, pos);
	}
	
	private static Properties propertiesWithSound(Properties properties, @Nullable SoundType soundType){
		properties.lightLevel(__ -> 0);
		blockColorsField.setAccessible(true);
		try{
			blockColorsField.set(properties, (Function<BlockState, MapColor>)__ -> MapColor.COLOR_PURPLE);
		}catch(IllegalAccessException e){
			e.printStackTrace();
			System.err.println("[Arcana, hackfix] Unable to clear block properties!");
		}
		if(soundType == null)
			return properties;
		else
			return properties.sound(soundType);
	}
	
	public Component getTranslatedName(){
		return parentBlock.getName();
	}
}
