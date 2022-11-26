package com.oldman.simukraft.item;

import com.oldman.simukraft.SimUKraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimUKraft.MOD_ID);

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheeseslice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SIMUKRAFT_TAB)));
    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SIMUKRAFT_TAB)));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SIMUKRAFT_TAB)));
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SIMUKRAFT_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
