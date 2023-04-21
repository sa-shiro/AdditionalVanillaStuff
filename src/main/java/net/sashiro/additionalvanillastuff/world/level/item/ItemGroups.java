package net.sashiro.additionalvanillastuff.world.level.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.additionalvanillastuff.AdditionalVanillaStuff.MOD_ID;
import static net.sashiro.additionalvanillastuff.world.level.block.ModBlocks.*;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {

    public static CreativeModeTab GROUP_STAIRS;
    public static CreativeModeTab GROUP_SLABS;
    public static CreativeModeTab GROUP_WALLS;

    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        GROUP_STAIRS = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "stairs"), builder -> builder.icon(
                () -> new ItemStack(CRYING_OBSIDIAN_STAIRS.get())).title(Component.translatable("itemGroup.additionalvanillastuff.stairs")));

        GROUP_SLABS = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "slabs"), builder -> builder.icon(
                () -> new ItemStack(CRYING_OBSIDIAN_SLAB.get())).title(Component.translatable("itemGroup.additionalvanillastuff.slabs")));

        GROUP_WALLS = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "walls"), builder -> builder.icon(
                () -> new ItemStack(CRYING_OBSIDIAN_WALL.get())).title(Component.translatable("itemGroup.additionalvanillastuff.walls")));
    }
}
