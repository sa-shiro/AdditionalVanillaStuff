package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

public class GenItemModelProvider extends ItemModelProvider {
    public GenItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AdditionalVanillaStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        ModelFile.UncheckedModelFile itemGenerated = new ModelFile.UncheckedModelFile("item/generated");

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            assert false;
            String name = block.get().getDescriptionId().replace("block.additionalvanillastuff.", "");

            if (name.contains("wall")) {
                String loc = name.replace("_wall", "");
                wallInventory(name, new ResourceLocation("block/" + loc));
            }
            if (!name.contains("wall")) {
                withExistingParent(name, modLoc("block/" + name));
            } /*
            if (name.contains("bars")) {
                singleTexture(name, new ResourceLocation("item/generated"), "layer0", new ResourceLocation("block/NAME"));
            } */
        }
    }
}