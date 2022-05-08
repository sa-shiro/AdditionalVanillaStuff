package net.sashiro.additionalvanillastuff;

import net.minecraftforge.fml.common.Mod;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

@Mod(AdditionalVanillaStuff.MOD_ID)
public class AdditionalVanillaStuff {

    public static final String MOD_ID = "additionalvanillastuff";

    public AdditionalVanillaStuff() {
        ModRegistryEvent.register();
    }
}
