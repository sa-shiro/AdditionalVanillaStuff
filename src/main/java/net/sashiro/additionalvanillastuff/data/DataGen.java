package net.sashiro.additionalvanillastuff.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.data.generators.*;

@Mod.EventBusSubscriber(modid = AdditionalVanillaStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        gen.addProvider(true, new GenBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(true, new GenItemModelProvider(gen, existingFileHelper));
        gen.addProvider(true, new GenLanguageProvider(gen, "en_us"));
        gen.addProvider(true, new GenRecipeProvider(gen));
        gen.addProvider(true, new GenLootTableProvider(gen));
        gen.addProvider(true, new GenTagProvider(gen, AdditionalVanillaStuff.MOD_ID, existingFileHelper));
    }
}