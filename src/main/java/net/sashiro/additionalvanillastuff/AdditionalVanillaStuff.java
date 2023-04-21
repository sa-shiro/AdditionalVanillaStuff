package net.sashiro.additionalvanillastuff;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

@Mod(AdditionalVanillaStuff.MOD_ID)
public class AdditionalVanillaStuff {

    public static final String MOD_ID = "additionalvanillastuff";
    private static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public AdditionalVanillaStuff() {
        ModRegistryEvent.register(EVENT_BUS);
    }
}
