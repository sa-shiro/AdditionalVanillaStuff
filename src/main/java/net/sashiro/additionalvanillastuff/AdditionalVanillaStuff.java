package net.sashiro.additionalvanillastuff;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;
import net.sashiro.additionalvanillastuff.world.level.item.ModItems;

@Mod(AdditionalVanillaStuff.MOD_ID)
public class AdditionalVanillaStuff {

    public static final String MOD_ID = "additionalvanillastuff";
    private static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public AdditionalVanillaStuff() {
        ModRegistryEvent.register(EVENT_BUS);

        EVENT_BUS.addListener(this::addItemsToCreativeTab);
    }


    private void addItemsToCreativeTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            for (RegistryObject<Item> item : ModRegistryEvent.ITEM_REGISTRY.getEntries()) {
                event.accept(item.get());
            }
        }
    }
}
