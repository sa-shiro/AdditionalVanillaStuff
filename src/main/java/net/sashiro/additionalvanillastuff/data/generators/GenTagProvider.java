package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

import javax.annotation.Nullable;


public class GenTagProvider extends BlockTagsProvider {

    public GenTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {

        for (RegistryObject<Block> registryObject : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            assert false;
            Block block = registryObject.get();
            String name = block.getRegistryName().toString();

            if (name.contains("wall")) {
                tag(BlockTags.WALLS).add(block);
            } else if (name.contains("stairs")) {
                tag(BlockTags.STAIRS).add(block);
            } else if (name.contains("slab")) {
                tag(BlockTags.SLABS).add(block);
            }
            if (!name.contains("wool")) {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }
    }
}
