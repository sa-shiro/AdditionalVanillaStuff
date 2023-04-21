package net.sashiro.additionalvanillastuff.world.level.item;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.world.level.block.ModBlocks;

import static net.sashiro.additionalvanillastuff.event.ModRegistryEvent.ITEM_REGISTRY;
import static net.sashiro.additionalvanillastuff.world.level.item.ItemGroups.*;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = AdditionalVanillaStuff.MOD_ID)
public class ModItems {
    // DIRT STAIRS
    public static final RegistryObject<Item> DIRT_STAIRS = ITEM_REGISTRY.register("dirt_stairs", () -> new BlockItem(ModBlocks.DIRT_STAIRS.get(), STAIRS_PROPERTIES));
    // TERRACOTTA STAIRS
    public static final RegistryObject<Item> WHITE_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("white_terracotta_stairs", () -> new BlockItem(ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("orange_terracotta_stairs", () -> new BlockItem(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("magenta_terracotta_stairs", () -> new BlockItem(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("light_blue_terracotta_stairs", () -> new BlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("yellow_terracotta_stairs", () -> new BlockItem(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIME_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("lime_terracotta_stairs", () -> new BlockItem(ModBlocks.LIME_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PINK_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("pink_terracotta_stairs", () -> new BlockItem(ModBlocks.PINK_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("gray_terracotta_stairs", () -> new BlockItem(ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("light_gray_terracotta_stairs", () -> new BlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("cyan_terracotta_stairs", () -> new BlockItem(ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("purple_terracotta_stairs", () -> new BlockItem(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("blue_terracotta_stairs", () -> new BlockItem(ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("brown_terracotta_stairs", () -> new BlockItem(ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("green_terracotta_stairs", () -> new BlockItem(ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> RED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("red_terracotta_stairs", () -> new BlockItem(ModBlocks.RED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("black_terracotta_stairs", () -> new BlockItem(ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> TERRACOTTA_STAIRS = ITEM_REGISTRY.register("terracotta_stairs", () -> new BlockItem(ModBlocks.TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("white_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("orange_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("magenta_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("light_blue_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("yellow_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("lime_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("pink_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("gray_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("light_gray_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("cyan_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("purple_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("blue_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("brown_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("green_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("red_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_STAIRS = ITEM_REGISTRY.register("black_glazed_terracotta_stairs", () -> new BlockItem(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), STAIRS_PROPERTIES));
    // CONCRETE STAIRS
    public static final RegistryObject<Item> WHITE_CONCRETE_STAIRS = ITEM_REGISTRY.register("white_concrete_stairs", () -> new BlockItem(ModBlocks.WHITE_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_CONCRETE_STAIRS = ITEM_REGISTRY.register("orange_concrete_stairs", () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STAIRS = ITEM_REGISTRY.register("magenta_concrete_stairs", () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STAIRS = ITEM_REGISTRY.register("light_blue_concrete_stairs", () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_CONCRETE_STAIRS = ITEM_REGISTRY.register("yellow_concrete_stairs", () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIME_CONCRETE_STAIRS = ITEM_REGISTRY.register("lime_concrete_stairs", () -> new BlockItem(ModBlocks.LIME_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PINK_CONCRETE_STAIRS = ITEM_REGISTRY.register("pink_concrete_stairs", () -> new BlockItem(ModBlocks.PINK_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_CONCRETE_STAIRS = ITEM_REGISTRY.register("gray_concrete_stairs", () -> new BlockItem(ModBlocks.GRAY_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STAIRS = ITEM_REGISTRY.register("light_gray_concrete_stairs", () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_CONCRETE_STAIRS = ITEM_REGISTRY.register("cyan_concrete_stairs", () -> new BlockItem(ModBlocks.CYAN_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_CONCRETE_STAIRS = ITEM_REGISTRY.register("purple_concrete_stairs", () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_CONCRETE_STAIRS = ITEM_REGISTRY.register("blue_concrete_stairs", () -> new BlockItem(ModBlocks.BLUE_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_CONCRETE_STAIRS = ITEM_REGISTRY.register("brown_concrete_stairs", () -> new BlockItem(ModBlocks.BROWN_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_CONCRETE_STAIRS = ITEM_REGISTRY.register("green_concrete_stairs", () -> new BlockItem(ModBlocks.GREEN_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> RED_CONCRETE_STAIRS = ITEM_REGISTRY.register("red_concrete_stairs", () -> new BlockItem(ModBlocks.RED_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_CONCRETE_STAIRS = ITEM_REGISTRY.register("black_concrete_stairs", () -> new BlockItem(ModBlocks.BLACK_CONCRETE_STAIRS.get(), STAIRS_PROPERTIES));
    // WOOL STAIRS
    public static final RegistryObject<Item> WHITE_WOOL_STAIRS = ITEM_REGISTRY.register("white_wool_stairs", () -> new BlockItem(ModBlocks.WHITE_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_WOOL_STAIRS = ITEM_REGISTRY.register("orange_wool_stairs", () -> new BlockItem(ModBlocks.ORANGE_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_WOOL_STAIRS = ITEM_REGISTRY.register("magenta_wool_stairs", () -> new BlockItem(ModBlocks.MAGENTA_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_STAIRS = ITEM_REGISTRY.register("light_blue_wool_stairs", () -> new BlockItem(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_WOOL_STAIRS = ITEM_REGISTRY.register("yellow_wool_stairs", () -> new BlockItem(ModBlocks.YELLOW_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIME_WOOL_STAIRS = ITEM_REGISTRY.register("lime_wool_stairs", () -> new BlockItem(ModBlocks.LIME_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PINK_WOOL_STAIRS = ITEM_REGISTRY.register("pink_wool_stairs", () -> new BlockItem(ModBlocks.PINK_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_WOOL_STAIRS = ITEM_REGISTRY.register("gray_wool_stairs", () -> new BlockItem(ModBlocks.GRAY_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_STAIRS = ITEM_REGISTRY.register("light_gray_wool_stairs", () -> new BlockItem(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_WOOL_STAIRS = ITEM_REGISTRY.register("cyan_wool_stairs", () -> new BlockItem(ModBlocks.CYAN_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_WOOL_STAIRS = ITEM_REGISTRY.register("purple_wool_stairs", () -> new BlockItem(ModBlocks.PURPLE_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_WOOL_STAIRS = ITEM_REGISTRY.register("blue_wool_stairs", () -> new BlockItem(ModBlocks.BLUE_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_WOOL_STAIRS = ITEM_REGISTRY.register("brown_wool_stairs", () -> new BlockItem(ModBlocks.BROWN_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_WOOL_STAIRS = ITEM_REGISTRY.register("green_wool_stairs", () -> new BlockItem(ModBlocks.GREEN_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> RED_WOOL_STAIRS = ITEM_REGISTRY.register("red_wool_stairs", () -> new BlockItem(ModBlocks.RED_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_WOOL_STAIRS = ITEM_REGISTRY.register("black_wool_stairs", () -> new BlockItem(ModBlocks.BLACK_WOOL_STAIRS.get(), STAIRS_PROPERTIES));
    // METAL STAIRS
    public static final RegistryObject<Item> IRON_BLOCK_STAIRS = ITEM_REGISTRY.register("iron_block_stairs", () -> new BlockItem(ModBlocks.IRON_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_STAIRS = ITEM_REGISTRY.register("gold_block_stairs", () -> new BlockItem(ModBlocks.GOLD_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_BLOCK_STAIRS = ITEM_REGISTRY.register("diamond_block_stairs", () -> new BlockItem(ModBlocks.DIAMOND_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_STAIRS = ITEM_REGISTRY.register("redstone_block_stairs", () -> new BlockItem(ModBlocks.REDSTONE_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> NETHERITE_BLOCK_STAIRS = ITEM_REGISTRY.register("netherite_block_stairs", () -> new BlockItem(ModBlocks.NETHERITE_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_STAIRS = ITEM_REGISTRY.register("lapis_block_stairs", () -> new BlockItem(ModBlocks.LAPIS_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> EMERALD_BLOCK_STAIRS = ITEM_REGISTRY.register("emerald_block_stairs", () -> new BlockItem(ModBlocks.EMERALD_BLOCK_STAIRS.get(), STAIRS_PROPERTIES));
    // STONE STAIRS
    public static final RegistryObject<Item> CALCITE_STAIRS = ITEM_REGISTRY.register("calcite_stairs", () -> new BlockItem(ModBlocks.CALCITE_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> TUFF_STAIRS = ITEM_REGISTRY.register("tuff_stairs", () -> new BlockItem(ModBlocks.TUFF_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> SMOOTH_BASALT_STAIRS = ITEM_REGISTRY.register("smooth_basalt_stairs", () -> new BlockItem(ModBlocks.SMOOTH_BASALT_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS = ITEM_REGISTRY.register("obsidian_stairs", () -> new BlockItem(ModBlocks.OBSIDIAN_STAIRS.get(), STAIRS_PROPERTIES));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS = ITEM_REGISTRY.register("crying_obsidian_stairs", () -> new BlockItem(ModBlocks.CRYING_OBSIDIAN_STAIRS.get(), STAIRS_PROPERTIES));
    // TERRACOTTA SLABS
    public static final RegistryObject<Item> WHITE_TERRACOTTA_SLAB = ITEM_REGISTRY.register("white_terracotta_slab", () -> new BlockItem(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_SLAB = ITEM_REGISTRY.register("orange_terracotta_slab", () -> new BlockItem(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_SLAB = ITEM_REGISTRY.register("magenta_terracotta_slab", () -> new BlockItem(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_SLAB = ITEM_REGISTRY.register("light_blue_terracotta_slab", () -> new BlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_SLAB = ITEM_REGISTRY.register("yellow_terracotta_slab", () -> new BlockItem(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIME_TERRACOTTA_SLAB = ITEM_REGISTRY.register("lime_terracotta_slab", () -> new BlockItem(ModBlocks.LIME_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PINK_TERRACOTTA_SLAB = ITEM_REGISTRY.register("pink_terracotta_slab", () -> new BlockItem(ModBlocks.PINK_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_SLAB = ITEM_REGISTRY.register("gray_terracotta_slab", () -> new BlockItem(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_SLAB = ITEM_REGISTRY.register("light_gray_terracotta_slab", () -> new BlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_SLAB = ITEM_REGISTRY.register("cyan_terracotta_slab", () -> new BlockItem(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_SLAB = ITEM_REGISTRY.register("purple_terracotta_slab", () -> new BlockItem(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_SLAB = ITEM_REGISTRY.register("blue_terracotta_slab", () -> new BlockItem(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_SLAB = ITEM_REGISTRY.register("brown_terracotta_slab", () -> new BlockItem(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_SLAB = ITEM_REGISTRY.register("green_terracotta_slab", () -> new BlockItem(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> RED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("red_terracotta_slab", () -> new BlockItem(ModBlocks.RED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_SLAB = ITEM_REGISTRY.register("black_terracotta_slab", () -> new BlockItem(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> TERRACOTTA_SLAB = ITEM_REGISTRY.register("terracotta_slab", () -> new BlockItem(ModBlocks.TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("white_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("orange_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("magenta_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("light_blue_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("yellow_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("lime_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("pink_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("gray_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("light_gray_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("cyan_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("purple_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("blue_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("brown_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("green_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("red_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_SLAB = ITEM_REGISTRY.register("black_glazed_terracotta_slab", () -> new BlockItem(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), SLABS_PROPERTIES));
    // CONCRETE SLABS
    public static final RegistryObject<Item> WHITE_CONCRETE_SLAB = ITEM_REGISTRY.register("white_concrete_slab", () -> new BlockItem(ModBlocks.WHITE_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SLAB = ITEM_REGISTRY.register("orange_concrete_slab", () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SLAB = ITEM_REGISTRY.register("magenta_concrete_slab", () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SLAB = ITEM_REGISTRY.register("light_blue_concrete_slab", () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SLAB = ITEM_REGISTRY.register("yellow_concrete_slab", () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIME_CONCRETE_SLAB = ITEM_REGISTRY.register("lime_concrete_slab", () -> new BlockItem(ModBlocks.LIME_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PINK_CONCRETE_SLAB = ITEM_REGISTRY.register("pink_concrete_slab", () -> new BlockItem(ModBlocks.PINK_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_CONCRETE_SLAB = ITEM_REGISTRY.register("gray_concrete_slab", () -> new BlockItem(ModBlocks.GRAY_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SLAB = ITEM_REGISTRY.register("light_gray_concrete_slab", () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_CONCRETE_SLAB = ITEM_REGISTRY.register("cyan_concrete_slab", () -> new BlockItem(ModBlocks.CYAN_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SLAB = ITEM_REGISTRY.register("purple_concrete_slab", () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_CONCRETE_SLAB = ITEM_REGISTRY.register("blue_concrete_slab", () -> new BlockItem(ModBlocks.BLUE_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_CONCRETE_SLAB = ITEM_REGISTRY.register("brown_concrete_slab", () -> new BlockItem(ModBlocks.BROWN_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_CONCRETE_SLAB = ITEM_REGISTRY.register("green_concrete_slab", () -> new BlockItem(ModBlocks.GREEN_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> RED_CONCRETE_SLAB = ITEM_REGISTRY.register("red_concrete_slab", () -> new BlockItem(ModBlocks.RED_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_CONCRETE_SLAB = ITEM_REGISTRY.register("black_concrete_slab", () -> new BlockItem(ModBlocks.BLACK_CONCRETE_SLAB.get(), SLABS_PROPERTIES));
    // WOOL SLABS
    public static final RegistryObject<Item> WHITE_WOOL_SLAB = ITEM_REGISTRY.register("white_wool_slab", () -> new BlockItem(ModBlocks.WHITE_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_WOOL_SLAB = ITEM_REGISTRY.register("orange_wool_slab", () -> new BlockItem(ModBlocks.ORANGE_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_WOOL_SLAB = ITEM_REGISTRY.register("magenta_wool_slab", () -> new BlockItem(ModBlocks.MAGENTA_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_SLAB = ITEM_REGISTRY.register("light_blue_wool_slab", () -> new BlockItem(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_WOOL_SLAB = ITEM_REGISTRY.register("yellow_wool_slab", () -> new BlockItem(ModBlocks.YELLOW_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIME_WOOL_SLAB = ITEM_REGISTRY.register("lime_wool_slab", () -> new BlockItem(ModBlocks.LIME_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PINK_WOOL_SLAB = ITEM_REGISTRY.register("pink_wool_slab", () -> new BlockItem(ModBlocks.PINK_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_WOOL_SLAB = ITEM_REGISTRY.register("gray_wool_slab", () -> new BlockItem(ModBlocks.GRAY_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_SLAB = ITEM_REGISTRY.register("light_gray_wool_slab", () -> new BlockItem(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_WOOL_SLAB = ITEM_REGISTRY.register("cyan_wool_slab", () -> new BlockItem(ModBlocks.CYAN_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_WOOL_SLAB = ITEM_REGISTRY.register("purple_wool_slab", () -> new BlockItem(ModBlocks.PURPLE_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_WOOL_SLAB = ITEM_REGISTRY.register("blue_wool_slab", () -> new BlockItem(ModBlocks.BLUE_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_WOOL_SLAB = ITEM_REGISTRY.register("brown_wool_slab", () -> new BlockItem(ModBlocks.BROWN_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_WOOL_SLAB = ITEM_REGISTRY.register("green_wool_slab", () -> new BlockItem(ModBlocks.GREEN_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> RED_WOOL_SLAB = ITEM_REGISTRY.register("red_wool_slab", () -> new BlockItem(ModBlocks.RED_WOOL_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_WOOL_SLAB = ITEM_REGISTRY.register("black_wool_slab", () -> new BlockItem(ModBlocks.BLACK_WOOL_SLAB.get(), SLABS_PROPERTIES));
    // METAL SLABS
    public static final RegistryObject<Item> IRON_BLOCK_SLAB = ITEM_REGISTRY.register("iron_block_slab", () -> new BlockItem(ModBlocks.IRON_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_SLAB = ITEM_REGISTRY.register("gold_block_slab", () -> new BlockItem(ModBlocks.GOLD_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_BLOCK_SLAB = ITEM_REGISTRY.register("diamond_block_slab", () -> new BlockItem(ModBlocks.DIAMOND_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_SLAB = ITEM_REGISTRY.register("redstone_block_slab", () -> new BlockItem(ModBlocks.REDSTONE_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> NETHERITE_BLOCK_SLAB = ITEM_REGISTRY.register("netherite_block_slab", () -> new BlockItem(ModBlocks.NETHERITE_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_SLAB = ITEM_REGISTRY.register("lapis_block_slab", () -> new BlockItem(ModBlocks.LAPIS_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> EMERALD_BLOCK_SLAB = ITEM_REGISTRY.register("emerald_block_slab", () -> new BlockItem(ModBlocks.EMERALD_BLOCK_SLAB.get(), SLABS_PROPERTIES));
    // STONE SLABS
    public static final RegistryObject<Item> CALCITE_SLAB = ITEM_REGISTRY.register("calcite_slab", () -> new BlockItem(ModBlocks.CALCITE_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> TUFF_SLAB = ITEM_REGISTRY.register("tuff_slab", () -> new BlockItem(ModBlocks.TUFF_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> SMOOTH_BASALT_SLAB = ITEM_REGISTRY.register("smooth_basalt_slab", () -> new BlockItem(ModBlocks.SMOOTH_BASALT_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_SLAB = ITEM_REGISTRY.register("obsidian_slab", () -> new BlockItem(ModBlocks.OBSIDIAN_SLAB.get(), SLABS_PROPERTIES));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SLAB = ITEM_REGISTRY.register("crying_obsidian_slab", () -> new BlockItem(ModBlocks.CRYING_OBSIDIAN_SLAB.get(), SLABS_PROPERTIES));
    // TERRACOTTA WALLS
    public static final RegistryObject<Item> WHITE_TERRACOTTA_WALL = ITEM_REGISTRY.register("white_terracotta_wall", () -> new BlockItem(ModBlocks.WHITE_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_WALL = ITEM_REGISTRY.register("orange_terracotta_wall", () -> new BlockItem(ModBlocks.ORANGE_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_WALL = ITEM_REGISTRY.register("magenta_terracotta_wall", () -> new BlockItem(ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_WALL = ITEM_REGISTRY.register("light_blue_terracotta_wall", () -> new BlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_WALL = ITEM_REGISTRY.register("yellow_terracotta_wall", () -> new BlockItem(ModBlocks.YELLOW_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIME_TERRACOTTA_WALL = ITEM_REGISTRY.register("lime_terracotta_wall", () -> new BlockItem(ModBlocks.LIME_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PINK_TERRACOTTA_WALL = ITEM_REGISTRY.register("pink_terracotta_wall", () -> new BlockItem(ModBlocks.PINK_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_WALL = ITEM_REGISTRY.register("gray_terracotta_wall", () -> new BlockItem(ModBlocks.GRAY_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_WALL = ITEM_REGISTRY.register("light_gray_terracotta_wall", () -> new BlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_WALL = ITEM_REGISTRY.register("cyan_terracotta_wall", () -> new BlockItem(ModBlocks.CYAN_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_WALL = ITEM_REGISTRY.register("purple_terracotta_wall", () -> new BlockItem(ModBlocks.PURPLE_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_WALL = ITEM_REGISTRY.register("blue_terracotta_wall", () -> new BlockItem(ModBlocks.BLUE_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_WALL = ITEM_REGISTRY.register("brown_terracotta_wall", () -> new BlockItem(ModBlocks.BROWN_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_WALL = ITEM_REGISTRY.register("green_terracotta_wall", () -> new BlockItem(ModBlocks.GREEN_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> RED_TERRACOTTA_WALL = ITEM_REGISTRY.register("red_terracotta_wall", () -> new BlockItem(ModBlocks.RED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_WALL = ITEM_REGISTRY.register("black_terracotta_wall", () -> new BlockItem(ModBlocks.BLACK_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> TERRACOTTA_WALL = ITEM_REGISTRY.register("terracotta_wall", () -> new BlockItem(ModBlocks.TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("white_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("orange_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("magenta_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("light_blue_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("yellow_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("lime_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("pink_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("gray_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("light_gray_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("cyan_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("purple_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("blue_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("brown_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("green_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("red_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_WALL = ITEM_REGISTRY.register("black_glazed_terracotta_wall", () -> new BlockItem(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), WALLS_PROPERTIES));
    // CONCRETE WALLS
    public static final RegistryObject<Item> WHITE_CONCRETE_WALL = ITEM_REGISTRY.register("white_concrete_wall", () -> new BlockItem(ModBlocks.WHITE_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_CONCRETE_WALL = ITEM_REGISTRY.register("orange_concrete_wall", () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_WALL = ITEM_REGISTRY.register("magenta_concrete_wall", () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_WALL = ITEM_REGISTRY.register("light_blue_concrete_wall", () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_CONCRETE_WALL = ITEM_REGISTRY.register("yellow_concrete_wall", () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIME_CONCRETE_WALL = ITEM_REGISTRY.register("lime_concrete_wall", () -> new BlockItem(ModBlocks.LIME_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PINK_CONCRETE_WALL = ITEM_REGISTRY.register("pink_concrete_wall", () -> new BlockItem(ModBlocks.PINK_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_CONCRETE_WALL = ITEM_REGISTRY.register("gray_concrete_wall", () -> new BlockItem(ModBlocks.GRAY_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_WALL = ITEM_REGISTRY.register("light_gray_concrete_wall", () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_CONCRETE_WALL = ITEM_REGISTRY.register("cyan_concrete_wall", () -> new BlockItem(ModBlocks.CYAN_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_CONCRETE_WALL = ITEM_REGISTRY.register("purple_concrete_wall", () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_CONCRETE_WALL = ITEM_REGISTRY.register("blue_concrete_wall", () -> new BlockItem(ModBlocks.BLUE_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_CONCRETE_WALL = ITEM_REGISTRY.register("brown_concrete_wall", () -> new BlockItem(ModBlocks.BROWN_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_CONCRETE_WALL = ITEM_REGISTRY.register("green_concrete_wall", () -> new BlockItem(ModBlocks.GREEN_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> RED_CONCRETE_WALL = ITEM_REGISTRY.register("red_concrete_wall", () -> new BlockItem(ModBlocks.RED_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_CONCRETE_WALL = ITEM_REGISTRY.register("black_concrete_wall", () -> new BlockItem(ModBlocks.BLACK_CONCRETE_WALL.get(), WALLS_PROPERTIES));
    // WOOL WALLS
    public static final RegistryObject<Item> WHITE_WOOL_WALL = ITEM_REGISTRY.register("white_wool_wall", () -> new BlockItem(ModBlocks.WHITE_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_WOOL_WALL = ITEM_REGISTRY.register("orange_wool_wall", () -> new BlockItem(ModBlocks.ORANGE_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_WOOL_WALL = ITEM_REGISTRY.register("magenta_wool_wall", () -> new BlockItem(ModBlocks.MAGENTA_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_WALL = ITEM_REGISTRY.register("light_blue_wool_wall", () -> new BlockItem(ModBlocks.LIGHT_BLUE_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_WOOL_WALL = ITEM_REGISTRY.register("yellow_wool_wall", () -> new BlockItem(ModBlocks.YELLOW_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIME_WOOL_WALL = ITEM_REGISTRY.register("lime_wool_wall", () -> new BlockItem(ModBlocks.LIME_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PINK_WOOL_WALL = ITEM_REGISTRY.register("pink_wool_wall", () -> new BlockItem(ModBlocks.PINK_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GRAY_WOOL_WALL = ITEM_REGISTRY.register("gray_wool_wall", () -> new BlockItem(ModBlocks.GRAY_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_WALL = ITEM_REGISTRY.register("light_gray_wool_wall", () -> new BlockItem(ModBlocks.LIGHT_GRAY_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> CYAN_WOOL_WALL = ITEM_REGISTRY.register("cyan_wool_wall", () -> new BlockItem(ModBlocks.CYAN_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_WOOL_WALL = ITEM_REGISTRY.register("purple_wool_wall", () -> new BlockItem(ModBlocks.PURPLE_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLUE_WOOL_WALL = ITEM_REGISTRY.register("blue_wool_wall", () -> new BlockItem(ModBlocks.BLUE_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BROWN_WOOL_WALL = ITEM_REGISTRY.register("brown_wool_wall", () -> new BlockItem(ModBlocks.BROWN_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GREEN_WOOL_WALL = ITEM_REGISTRY.register("green_wool_wall", () -> new BlockItem(ModBlocks.GREEN_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> RED_WOOL_WALL = ITEM_REGISTRY.register("red_wool_wall", () -> new BlockItem(ModBlocks.RED_WOOL_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> BLACK_WOOL_WALL = ITEM_REGISTRY.register("black_wool_wall", () -> new BlockItem(ModBlocks.BLACK_WOOL_WALL.get(), WALLS_PROPERTIES));
    // METAL WALLS
    public static final RegistryObject<Item> IRON_BLOCK_WALL = ITEM_REGISTRY.register("iron_block_wall", () -> new BlockItem(ModBlocks.IRON_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_WALL = ITEM_REGISTRY.register("gold_block_wall", () -> new BlockItem(ModBlocks.GOLD_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_BLOCK_WALL = ITEM_REGISTRY.register("diamond_block_wall", () -> new BlockItem(ModBlocks.DIAMOND_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_WALL = ITEM_REGISTRY.register("redstone_block_wall", () -> new BlockItem(ModBlocks.REDSTONE_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> NETHERITE_BLOCK_WALL = ITEM_REGISTRY.register("netherite_block_wall", () -> new BlockItem(ModBlocks.NETHERITE_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_WALL = ITEM_REGISTRY.register("lapis_block_wall", () -> new BlockItem(ModBlocks.LAPIS_BLOCK_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> EMERALD_BLOCK_WALL = ITEM_REGISTRY.register("emerald_block_wall", () -> new BlockItem(ModBlocks.EMERALD_BLOCK_WALL.get(), WALLS_PROPERTIES));
    // STONE WALLS
    public static final RegistryObject<Item> CALCITE_WALL = ITEM_REGISTRY.register("calcite_wall", () -> new BlockItem(ModBlocks.CALCITE_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> TUFF_WALL = ITEM_REGISTRY.register("tuff_wall", () -> new BlockItem(ModBlocks.TUFF_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> SMOOTH_BASALT_WALL = ITEM_REGISTRY.register("smooth_basalt_wall", () -> new BlockItem(ModBlocks.SMOOTH_BASALT_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_WALL = ITEM_REGISTRY.register("obsidian_wall", () -> new BlockItem(ModBlocks.OBSIDIAN_WALL.get(), WALLS_PROPERTIES));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_WALL = ITEM_REGISTRY.register("crying_obsidian_wall", () -> new BlockItem(ModBlocks.CRYING_OBSIDIAN_WALL.get(), WALLS_PROPERTIES));
    private static final Item.Properties PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS);
    // DIRT SLABS
    public static final RegistryObject<Item> DIRT_SLAB = ITEM_REGISTRY.register("dirt_slab", () -> new BlockItem(ModBlocks.DIRT_SLAB.get(), PROPERTIES));
    // DIRT STAIRS
    public static final RegistryObject<Item> DIRT_WALL = ITEM_REGISTRY.register("dirt_wall", () -> new BlockItem(ModBlocks.DIRT_WALL.get(), PROPERTIES));

    //public static final RegistryObject<Item> DEEPSLATE_GRAVEL = ITEM_REGISTRY.register("deepslate_gravel", () -> new BlockItem(ModBlocks.DEEPSLATE_GRAVEL.get(), PROPERTIES));
    //public static final RegistryObject<Item> DEEPSLATE_SAND = ITEM_REGISTRY.register("deepslate_sand", () -> new BlockItem(ModBlocks.DEEPSLATE_SAND.get(), PROPERTIES));
    //public static final RegistryObject<Item> GOLD_BLOCK_BARS = ITEM_REGISTRY.register("gold_block_bars", () -> new BlockItem(ModBlocks.GOLD_BLOCK_BARS.get(), PROPERTIES));
}