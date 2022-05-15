package net.sashiro.additionalvanillastuff.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;

public class ModRegistryEvent {

    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalVanillaStuff.MOD_ID);
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalVanillaStuff.MOD_ID);
    private static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register() {
        BLOCK_REGISTRY.register(EVENT_BUS);
        ITEM_REGISTRY.register(EVENT_BUS);
        // DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> EVENT_BUS.addListener(ModRegistryEvent::translucentRender));
    }

    private static void translucentRender(final FMLCommonSetupEvent e) {
        // ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_GRAVEL.get(), RenderType.translucent());
        // ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_SAND.get(), RenderType.translucent());
    }
}
