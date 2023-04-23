package net.sashiro.additionalvanillastuff.world.level.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {

    static ItemGroup tab_1 = new ItemGroup("stairstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_STAIRS.get());
        }
    };

    public static final Item.Properties STAIRS_PROPERTIES = new Item.Properties().tab(tab_1);
    static ItemGroup tab_2 = new ItemGroup("slabstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_SLAB.get());
        }
    };
    public static final Item.Properties SLABS_PROPERTIES = new Item.Properties().tab(tab_2);
    static ItemGroup tab_3 = new ItemGroup("wallstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_WALL.get());
        }
    };
    public static final Item.Properties WALLS_PROPERTIES = new Item.Properties().tab(tab_3);
}
