package net.sashiro.additionalvanillastuff.data.generators;
/*
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            String loc = block.get().getRegistryName().getPath();
            Block vanillaBLock = Blocks.AIR;
            for (Block mcBlock : ForgeRegistries.BLOCKS) {
                String blockName = block.get().getRegistryName().getPath().replace("_wall", "").replace("_stairs", "").replace("_slab", "");
                String mcBlockName = mcBlock.getRegistryName().getPath();

                if (mcBlockName.equals(blockName))  {
                    vanillaBLock = mcBlock;
                    if (!loc.contains("wool")) {
                        if (loc.contains("stairs")) {
                            stonecutterResultFromBase(consumer, block.get(), vanillaBLock);
                            ShapedRecipeBuilder.shaped(block.get(), 4) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("#  ")
                                    .pattern("## ")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                        else if (loc.contains("slab")) {
                            stonecutterResultFromBase(consumer, block.get(), vanillaBLock, 2);
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                        else if (loc.contains("wall")) {
                            stonecutterResultFromBase(consumer, block.get(), vanillaBLock);
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                    }
                    else if (loc.contains("wool")) {
                        if (loc.contains("stairs")) {
                            ShapedRecipeBuilder.shaped(block.get(), 4) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("#  ")
                                    .pattern("## ")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("slab")) {
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("wall")) {
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
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
/
    }
}
*/