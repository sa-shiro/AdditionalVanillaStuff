package net.sashiro.additionalvanillastuff.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;

public class ModRegistryEvent {

    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalVanillaStuff.MOD_ID);
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalVanillaStuff.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCK_REGISTRY.register(eventBus);
        ITEM_REGISTRY.register(eventBus);
    }
}
