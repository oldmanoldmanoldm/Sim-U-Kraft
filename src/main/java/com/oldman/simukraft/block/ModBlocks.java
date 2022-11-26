package com.oldman.simukraft.block;

import com.oldman.simukraft.SimUKraft;
import com.oldman.simukraft.item.ModCreativeModeTab;
import com.oldman.simukraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimUKraft.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_CHEESE = registerBlock("block_of_cheese",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY)
                    .strength(0.6f)), ModCreativeModeTab.SIMUKRAFT_TAB);
    public static final RegistryObject<Block> COMPOSITE_BRICK = registerBlock("composite_brick",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SIMUKRAFT_TAB);
    public static final RegistryObject<Block> RAINBOW_LIGHT = registerBlock("rainbow_light",
            () -> new Block(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.SIMUKRAFT_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
