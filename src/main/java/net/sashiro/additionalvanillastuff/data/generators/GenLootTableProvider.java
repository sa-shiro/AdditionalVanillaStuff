package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenLootTableProvider {

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BlocksLootTable::new, LootContextParamSets.BLOCK)));
    }

    public static class BlocksLootTable extends BlockLootSubProvider {
        protected BlocksLootTable() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
                dropSelf(block.get());
            }
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return ModRegistryEvent.BLOCK_REGISTRY.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}