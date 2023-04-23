package net.sashiro.additionalvanillastuff.world.level.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemGroups {

    static CreativeModeTab tab_1 = new CreativeModeTab("stairstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_STAIRS.get());
        }
    };
    public static final Item.Properties STAIRS_PROPERTIES = new Item.Properties().tab(tab_1);
    static CreativeModeTab tab_2 = new CreativeModeTab("slabstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_SLAB.get());
        }
    };
    public static final Item.Properties SLABS_PROPERTIES = new Item.Properties().tab(tab_2);
    static CreativeModeTab tab_3 = new CreativeModeTab("wallstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_WALL.get());
        }
    };
    public static final Item.Properties WALLS_PROPERTIES = new Item.Properties().tab(tab_3);

}
