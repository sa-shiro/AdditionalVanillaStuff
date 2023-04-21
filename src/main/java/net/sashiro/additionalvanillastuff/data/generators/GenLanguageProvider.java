package net.sashiro.additionalvanillastuff.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.additionalvanillastuff.AdditionalVanillaStuff;
import net.sashiro.additionalvanillastuff.event.ModRegistryEvent;

public class GenLanguageProvider extends LanguageProvider {
    public GenLanguageProvider(DataGenerator gen, String locale) {
        super(gen, AdditionalVanillaStuff.MOD_ID, locale);
    }

    private static String stringFormat(String formatString) {
        String[] words = formatString.split("\\s");
        StringBuilder stringFormat = new StringBuilder();
        for (String str : words) {
            String first = str.substring(0, 1);
            String afterFirst = str.substring(1);
            stringFormat.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return stringFormat.toString().trim();
    }

    @Override
    protected void addTranslations() {
        for (RegistryObject<Block> block : ModRegistryEvent.BLOCK_REGISTRY.getEntries()) {
            String name = block.get().getDescriptionId().replace("block.additionalvanillastuff.", "");
            String loc = name.replace("_", " ");
            add("block.additionalvanillastuff." + name, stringFormat(loc));
            //add("item.additionalvanillastuff." + name, stringFormat(loc));
        }
        add("itemGroup.stairstab.", "Stairs");
        add("itemGroup.slabstab.", "Slabs");
        add("itemGroup.wallstab.", "Walls");
    }
}