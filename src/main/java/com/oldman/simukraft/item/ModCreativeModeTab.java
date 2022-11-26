package com.oldman.simukraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SIMUKRAFT_TAB = new CreativeModeTab("simukrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHEESE_SLICE.get());
        }
    };
}
