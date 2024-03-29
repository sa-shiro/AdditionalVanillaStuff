package net.sashiro.additionalvanillastuff.world.level.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;

import static net.sashiro.additionalvanillastuff.event.ModRegistryEvent.BLOCK_REGISTRY;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = AdditionalVanillaStuff.MOD_ID)
public class ModBlocks {

    // DIRT STAIRS
    public static final RegistryObject<Block> DIRT_STAIRS = BLOCK_REGISTRY.register("dirt_stairs", () -> new StairBlock(Blocks.DIRT::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.DIRT)));
    // TERRACOTTA STAIRS
    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("white_terracotta_stairs", () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("orange_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("magenta_terracotta_stairs", () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("light_blue_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("yellow_terracotta_stairs", () -> new StairBlock(Blocks.YELLOW_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("lime_terracotta_stairs", () -> new StairBlock(Blocks.LIME_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("pink_terracotta_stairs", () -> new StairBlock(Blocks.PINK_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("gray_terracotta_stairs", () -> new StairBlock(Blocks.GRAY_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("light_gray_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("cyan_terracotta_stairs", () -> new StairBlock(Blocks.CYAN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("purple_terracotta_stairs", () -> new StairBlock(Blocks.PURPLE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("blue_terracotta_stairs", () -> new StairBlock(Blocks.BLUE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("brown_terracotta_stairs", () -> new StairBlock(Blocks.BROWN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("green_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("red_terracotta_stairs", () -> new StairBlock(Blocks.RED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("black_terracotta_stairs", () -> new StairBlock(Blocks.BLACK_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("white_glazed_terracotta_stairs", () -> new StairBlock(Blocks.WHITE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("orange_glazed_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("magenta_glazed_terracotta_stairs", () -> new StairBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("light_blue_glazed_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("yellow_glazed_terracotta_stairs", () -> new StairBlock(Blocks.YELLOW_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("lime_glazed_terracotta_stairs", () -> new StairBlock(Blocks.LIME_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("pink_glazed_terracotta_stairs", () -> new StairBlock(Blocks.PINK_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("gray_glazed_terracotta_stairs", () -> new StairBlock(Blocks.GRAY_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("light_gray_glazed_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("cyan_glazed_terracotta_stairs", () -> new StairBlock(Blocks.CYAN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("purple_glazed_terracotta_stairs", () -> new StairBlock(Blocks.PURPLE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("blue_glazed_terracotta_stairs", () -> new StairBlock(Blocks.BLUE_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("brown_glazed_terracotta_stairs", () -> new StairBlock(Blocks.BROWN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("green_glazed_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("red_glazed_terracotta_stairs", () -> new StairBlock(Blocks.RED_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_STAIRS = BLOCK_REGISTRY.register("black_glazed_terracotta_stairs", () -> new StairBlock(Blocks.BLACK_GLAZED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    // CONCRETE STAIRS
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = BLOCK_REGISTRY.register("white_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = BLOCK_REGISTRY.register("orange_concrete_stairs", () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = BLOCK_REGISTRY.register("magenta_concrete_stairs", () -> new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = BLOCK_REGISTRY.register("light_blue_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = BLOCK_REGISTRY.register("yellow_concrete_stairs", () -> new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = BLOCK_REGISTRY.register("lime_concrete_stairs", () -> new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = BLOCK_REGISTRY.register("pink_concrete_stairs", () -> new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = BLOCK_REGISTRY.register("gray_concrete_stairs", () -> new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = BLOCK_REGISTRY.register("light_gray_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = BLOCK_REGISTRY.register("cyan_concrete_stairs", () -> new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = BLOCK_REGISTRY.register("purple_concrete_stairs", () -> new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = BLOCK_REGISTRY.register("blue_concrete_stairs", () -> new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = BLOCK_REGISTRY.register("brown_concrete_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = BLOCK_REGISTRY.register("green_concrete_stairs", () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = BLOCK_REGISTRY.register("red_concrete_stairs", () -> new StairBlock(Blocks.RED_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = BLOCK_REGISTRY.register("black_concrete_stairs", () -> new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));
    // WOOL STAIRS
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCK_REGISTRY.register("white_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCK_REGISTRY.register("orange_wool_stairs", () -> new StairBlock(Blocks.GREEN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCK_REGISTRY.register("magenta_wool_stairs", () -> new StairBlock(Blocks.MAGENTA_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCK_REGISTRY.register("light_blue_wool_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCK_REGISTRY.register("yellow_wool_stairs", () -> new StairBlock(Blocks.YELLOW_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCK_REGISTRY.register("lime_wool_stairs", () -> new StairBlock(Blocks.LIME_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCK_REGISTRY.register("pink_wool_stairs", () -> new StairBlock(Blocks.PINK_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCK_REGISTRY.register("gray_wool_stairs", () -> new StairBlock(Blocks.GRAY_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCK_REGISTRY.register("light_gray_wool_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCK_REGISTRY.register("cyan_wool_stairs", () -> new StairBlock(Blocks.CYAN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCK_REGISTRY.register("purple_wool_stairs", () -> new StairBlock(Blocks.PURPLE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCK_REGISTRY.register("blue_wool_stairs", () -> new StairBlock(Blocks.BLUE_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCK_REGISTRY.register("brown_wool_stairs", () -> new StairBlock(Blocks.BROWN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCK_REGISTRY.register("green_wool_stairs", () -> new StairBlock(Blocks.GREEN_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCK_REGISTRY.register("red_wool_stairs", () -> new StairBlock(Blocks.RED_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCK_REGISTRY.register("black_wool_stairs", () -> new StairBlock(Blocks.BLACK_WOOL::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    // METAL STAIRS
    public static final RegistryObject<Block> IRON_BLOCK_STAIRS = BLOCK_REGISTRY.register("iron_block_stairs", () -> new StairBlock(Blocks.IRON_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GOLD_BLOCK_STAIRS = BLOCK_REGISTRY.register("gold_block_stairs", () -> new StairBlock(Blocks.GOLD_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BLOCK_STAIRS = BLOCK_REGISTRY.register("diamond_block_stairs", () -> new StairBlock(Blocks.DIAMOND_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_STAIRS = BLOCK_REGISTRY.register("redstone_block_stairs", () -> new StairBlock(Blocks.REDSTONE_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BLOCK_STAIRS = BLOCK_REGISTRY.register("netherite_block_stairs", () -> new StairBlock(Blocks.NETHERITE_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LAPIS_BLOCK_STAIRS = BLOCK_REGISTRY.register("lapis_block_stairs", () -> new StairBlock(Blocks.LAPIS_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> EMERALD_BLOCK_STAIRS = BLOCK_REGISTRY.register("emerald_block_stairs", () -> new StairBlock(Blocks.EMERALD_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    // STONE STAIRS
    public static final RegistryObject<Block> CALCITE_STAIRS = BLOCK_REGISTRY.register("calcite_stairs", () -> new StairBlock(Blocks.CALCITE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_STAIRS = BLOCK_REGISTRY.register("tuff_stairs", () -> new StairBlock(Blocks.TUFF::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = BLOCK_REGISTRY.register("smooth_basalt_stairs", () -> new StairBlock(Blocks.SMOOTH_BASALT::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = BLOCK_REGISTRY.register("obsidian_stairs", () -> new StairBlock(Blocks.OBSIDIAN::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS = BLOCK_REGISTRY.register("crying_obsidian_stairs", () -> new StairBlock(Blocks.CRYING_OBSIDIAN::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)));
    // DIRT STAIRS
    public static final RegistryObject<Block> DIRT_SLAB = BLOCK_REGISTRY.register("dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    // TERRACOTTA SLABS
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_SLAB = BLOCK_REGISTRY.register("terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("white_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("orange_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("magenta_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("light_blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("yellow_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("lime_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("pink_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("light_gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("cyan_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("purple_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("brown_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("green_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("red_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_SLAB = BLOCK_REGISTRY.register("black_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    // CONCRETE SLABS
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = BLOCK_REGISTRY.register("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = BLOCK_REGISTRY.register("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = BLOCK_REGISTRY.register("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = BLOCK_REGISTRY.register("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = BLOCK_REGISTRY.register("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = BLOCK_REGISTRY.register("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = BLOCK_REGISTRY.register("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = BLOCK_REGISTRY.register("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = BLOCK_REGISTRY.register("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = BLOCK_REGISTRY.register("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = BLOCK_REGISTRY.register("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = BLOCK_REGISTRY.register("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = BLOCK_REGISTRY.register("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = BLOCK_REGISTRY.register("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = BLOCK_REGISTRY.register("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = BLOCK_REGISTRY.register("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));
    // WOOL SLABS
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = BLOCK_REGISTRY.register("white_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = BLOCK_REGISTRY.register("orange_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = BLOCK_REGISTRY.register("magenta_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = BLOCK_REGISTRY.register("light_blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = BLOCK_REGISTRY.register("yellow_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = BLOCK_REGISTRY.register("lime_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = BLOCK_REGISTRY.register("pink_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = BLOCK_REGISTRY.register("gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = BLOCK_REGISTRY.register("light_gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = BLOCK_REGISTRY.register("cyan_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = BLOCK_REGISTRY.register("purple_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = BLOCK_REGISTRY.register("blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = BLOCK_REGISTRY.register("brown_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = BLOCK_REGISTRY.register("green_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_SLAB = BLOCK_REGISTRY.register("red_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = BLOCK_REGISTRY.register("black_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    // METAL SLABS
    public static final RegistryObject<Block> IRON_BLOCK_SLAB = BLOCK_REGISTRY.register("iron_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GOLD_BLOCK_SLAB = BLOCK_REGISTRY.register("gold_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BLOCK_SLAB = BLOCK_REGISTRY.register("diamond_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_SLAB = BLOCK_REGISTRY.register("redstone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BLOCK_SLAB = BLOCK_REGISTRY.register("netherite_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LAPIS_BLOCK_SLAB = BLOCK_REGISTRY.register("lapis_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> EMERALD_BLOCK_SLAB = BLOCK_REGISTRY.register("emerald_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    // STONE SLABS
    public static final RegistryObject<Block> CALCITE_SLAB = BLOCK_REGISTRY.register("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_SLAB = BLOCK_REGISTRY.register("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = BLOCK_REGISTRY.register("smooth_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> OBSIDIAN_SLAB = BLOCK_REGISTRY.register("obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = BLOCK_REGISTRY.register("crying_obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)));
    // DIRT STAIRS
    public static final RegistryObject<Block> DIRT_WALL = BLOCK_REGISTRY.register("dirt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    // TERRACOTTA WALLS
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = BLOCK_REGISTRY.register("white_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = BLOCK_REGISTRY.register("orange_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = BLOCK_REGISTRY.register("magenta_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = BLOCK_REGISTRY.register("light_blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = BLOCK_REGISTRY.register("yellow_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = BLOCK_REGISTRY.register("lime_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = BLOCK_REGISTRY.register("pink_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = BLOCK_REGISTRY.register("gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = BLOCK_REGISTRY.register("light_gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = BLOCK_REGISTRY.register("cyan_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = BLOCK_REGISTRY.register("purple_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = BLOCK_REGISTRY.register("blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = BLOCK_REGISTRY.register("brown_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = BLOCK_REGISTRY.register("green_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("red_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = BLOCK_REGISTRY.register("black_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_WALL = BLOCK_REGISTRY.register("terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("white_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("orange_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("magenta_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("light_blue_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("yellow_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("lime_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("pink_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("gray_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("light_gray_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("cyan_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("purple_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("blue_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("brown_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("green_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("red_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_WALL = BLOCK_REGISTRY.register("black_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    // CONCRETE WALLS
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = BLOCK_REGISTRY.register("white_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = BLOCK_REGISTRY.register("orange_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = BLOCK_REGISTRY.register("magenta_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = BLOCK_REGISTRY.register("light_blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = BLOCK_REGISTRY.register("yellow_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = BLOCK_REGISTRY.register("lime_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = BLOCK_REGISTRY.register("pink_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = BLOCK_REGISTRY.register("gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = BLOCK_REGISTRY.register("light_gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = BLOCK_REGISTRY.register("cyan_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = BLOCK_REGISTRY.register("purple_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = BLOCK_REGISTRY.register("blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = BLOCK_REGISTRY.register("brown_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = BLOCK_REGISTRY.register("green_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_WALL = BLOCK_REGISTRY.register("red_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = BLOCK_REGISTRY.register("black_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));
    // WOOL WALLS
    public static final RegistryObject<Block> WHITE_WOOL_WALL = BLOCK_REGISTRY.register("white_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_WALL = BLOCK_REGISTRY.register("orange_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_WALL = BLOCK_REGISTRY.register("magenta_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_WALL = BLOCK_REGISTRY.register("light_blue_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_WALL = BLOCK_REGISTRY.register("yellow_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_WALL = BLOCK_REGISTRY.register("lime_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_WALL = BLOCK_REGISTRY.register("pink_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_WALL = BLOCK_REGISTRY.register("gray_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_WALL = BLOCK_REGISTRY.register("light_gray_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_WALL = BLOCK_REGISTRY.register("cyan_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_WALL = BLOCK_REGISTRY.register("purple_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_WALL = BLOCK_REGISTRY.register("blue_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_WALL = BLOCK_REGISTRY.register("brown_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_WALL = BLOCK_REGISTRY.register("green_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_WALL = BLOCK_REGISTRY.register("red_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_WALL = BLOCK_REGISTRY.register("black_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    // METAL WALLS
    public static final RegistryObject<Block> IRON_BLOCK_WALL = BLOCK_REGISTRY.register("iron_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GOLD_BLOCK_WALL = BLOCK_REGISTRY.register("gold_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_BLOCK_WALL = BLOCK_REGISTRY.register("diamond_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_BLOCK_WALL = BLOCK_REGISTRY.register("redstone_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_BLOCK_WALL = BLOCK_REGISTRY.register("netherite_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LAPIS_BLOCK_WALL = BLOCK_REGISTRY.register("lapis_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> EMERALD_BLOCK_WALL = BLOCK_REGISTRY.register("emerald_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    // STONE WALLS
    public static final RegistryObject<Block> CALCITE_WALL = BLOCK_REGISTRY.register("calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_WALL = BLOCK_REGISTRY.register("tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = BLOCK_REGISTRY.register("smooth_basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> OBSIDIAN_WALL = BLOCK_REGISTRY.register("obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = BLOCK_REGISTRY.register("crying_obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)));

    //public static final RegistryObject<Block> DEEPSLATE_GRAVEL = BLOCK_REGISTRY.register("deepslate_gravel", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    //public static final RegistryObject<Block> DEEPSLATE_SAND = BLOCK_REGISTRY.register("deepslate_sand", () -> new SandBlock(0, BlockBehaviour.Properties.copy(Blocks.SAND)));
    //public static final RegistryObject<Block> GOLD_BLOCK_BARS = BLOCK_REGISTRY.register("gold_block_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK))); // .noOcclusion()
}
