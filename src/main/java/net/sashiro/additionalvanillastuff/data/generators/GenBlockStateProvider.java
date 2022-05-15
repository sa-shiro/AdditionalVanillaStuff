package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

public class GenBlockStateProvider extends BlockStateProvider {
    public GenBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, AdditionalVanillaStuff.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        ModelFile.UncheckedModelFile wallInventory = new ModelFile.UncheckedModelFile("block/wall_inventory");
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile("block/cube_column");
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile("block/cube_column_horizontal");
        assert false;

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            String blockName = block.get().getRegistryName().toString();
            String blockWall = block.get().getRegistryName().getPath().replace("_wall", "");
            String blockStairs = block.get().getRegistryName().getPath().replace("_stairs", "");
            String blockSlab = block.get().getRegistryName().getPath().replace("_slab", "");
            String blockBars = block.get().getRegistryName().getPath().replace("_bars", "");

            if (blockName.contains("wall")) {
                wallBlock((WallBlock) block.get(), new ResourceLocation("block/" + blockWall));
            } else if (blockName.contains("stairs")) {
                stairsBlock((StairBlock) block.get(), new ResourceLocation("block/" + blockStairs));
            } else if (blockName.contains("slab")) {
                slabBlock((SlabBlock) block.get(), new ResourceLocation("block/" + blockSlab), new ResourceLocation("block/" + blockSlab));
            } else if (blockName.contains("bars")) {
                paneBlock((IronBarsBlock) block.get(),new ResourceLocation("block/" + blockBars), new ResourceLocation("block/" + blockBars));
            } else if (blockName.contains("gravel")) {
                makeSimpleBLock(block.get(), "gravel", "deepslate_gravel_overlay");
            } else if (blockName.contains("sand")) {
                makeSimpleBLock(block.get(), "sand", "deepslate_sand_overlay");
            }
        }
    }

    private void makeSimpleBLock(Block block, String name, String overlay) {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        simpleBlock(
                block, models().cubeAll(
                                block.getRegistryName().toString(),
                                new ResourceLocation("block/" + name)
                        )
                        .texture("particle", new ResourceLocation("block/" + name))
                        .texture("overlay", "block/" + overlay)
                        .parent(blockBlock)
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).texture("#all").end()
                        .face(Direction.UP).texture("#all").end()
                        .face(Direction.NORTH).texture("#all").end()
                        .face(Direction.SOUTH).texture("#all").end()
                        .face(Direction.EAST).texture("#all").end()
                        .face(Direction.WEST).texture("#all").end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).texture("#overlay").end()
                        .face(Direction.UP).texture("#overlay").end()
                        .face(Direction.NORTH).texture("#overlay").end()
                        .face(Direction.SOUTH).texture("#overlay").end()
                        .face(Direction.EAST).texture("#overlay").end()
                        .face(Direction.WEST).texture("#overlay").end()
                        .end()
        );
    }
}