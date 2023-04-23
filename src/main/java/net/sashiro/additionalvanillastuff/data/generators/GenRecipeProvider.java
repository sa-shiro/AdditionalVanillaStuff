package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
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
            assert false;
            String loc = block.get().getRegistryName().toString().replace("additionalvanillastuff:", "");
            Block vanillaBLock;
            for (Block mcBlock : ForgeRegistries.BLOCKS) {
                String blockName = loc.replace("_wall", "").replace("_stairs", "").replace("_slab", "");
                String mcBlockName = mcBlock.getRegistryName().toString().replace("minecraft:", "");

                if (mcBlockName.equals(blockName)) {
                    vanillaBLock = mcBlock;
                    String vanillaBlockName = vanillaBLock.getRegistryName().toString().replace("minecraft:", "");
                    if (!loc.contains("wool")) {
                        if (loc.contains("stairs")) {
                            SingleItemRecipeBuilder.stonecutting(Ingredient.of(vanillaBLock), block.get()).unlockedBy("has_item", has(vanillaBLock)).save(consumer, loc + "_from_" + vanillaBlockName + "_stonecutting");
                            ShapedRecipeBuilder.shaped(block.get(), 4) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("#  ")
                                    .pattern("## ")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("slab")) {
                            SingleItemRecipeBuilder.stonecutting(Ingredient.of(vanillaBLock), block.get(), 2).unlockedBy("has_item", has(vanillaBLock)).save(consumer, loc + "_from_" + vanillaBlockName + "_stonecutting");
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        } else if (loc.contains("wall")) {
                            SingleItemRecipeBuilder.stonecutting(Ingredient.of(vanillaBLock), block.get()).unlockedBy("has_item", has(vanillaBLock)).save(consumer, loc + "_from_" + vanillaBlockName + "_stonecutting");
                            ShapedRecipeBuilder.shaped(block.get(), 6) // result
                                    .define('#', vanillaBLock) // ingredient
                                    .pattern("###")
                                    .pattern("###")
                                    .unlockedBy("has_item", has(vanillaBLock.asItem()))
                                    .save(consumer, new ResourceLocation(AdditionalVanillaStuff.MOD_ID, "shaped_" + loc));
                        }
                    } else if (loc.contains("wool")) {
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
    }
}