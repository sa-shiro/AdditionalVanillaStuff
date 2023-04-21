package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;


public class GenTagProvider extends BlockTagsProvider {

    public GenTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider holder) {
        for (RegistryObject<Block> registryObject : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            assert false;
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.additionalvanillastuff.", "");

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