package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@SuppressWarnings("DuplicateCondition")
public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            String loc = block.get().getDescriptionId().replace("block.additionalvanillastuff.", "");
            Block vanillaBLock;
            for (Block mcBlock : ForgeRegistries.BLOCKS) {
                String blockName = loc.replace("_wall", "").replace("_stairs", "").replace("_slab", "");
                String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");

                if (mcBlockName.equals(blockName)) {
                    vanillaBLock = mcBlock;
                    if (!loc.contains("wool")) {
                        if (loc.contains("stairs")) {
                            stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, block.get(), vanillaBLock);
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 4) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("#  ")
                                    .pattern("## ")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("slab")) {
                            stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, block.get(), vanillaBLock, 2);
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("wall")) {
                            stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, block.get(), vanillaBLock);
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                    } else if (loc.contains("wool")) {
                        if (loc.contains("stairs")) {
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 4) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("#  ")
                                    .pattern("## ")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("slab")) {
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("wall")) {
                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                    }
                }
            }
        }

/*
                    ShapedRecipeBuilder.shaped(blocks.get(i).get()) // result
                            .define('#', blocks.get(i - 1).get()) // ingredient
                            .pattern("###")
                            .pattern("###")
                            .pattern("###")
                            .unlockedBy("has_item", has(blocks.get(i - 1).get().asItem()))
                            .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
*/
    }
}