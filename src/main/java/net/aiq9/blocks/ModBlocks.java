package net.aiq9.blocks;

import net.aiq9.TotallyNotASkyDimensionMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CLOUD_STONE = registerBlock("cloud_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block NEBULA_ORE = registerBlock("nebula_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block RAW_NEBULA_BLOCK = registerBlock("raw_nebula_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block NEBULA_BLOCK = registerBlock("nebula_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TotallyNotASkyDimensionMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TotallyNotASkyDimensionMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TotallyNotASkyDimensionMod.LOGGER.info("Registering Mod Blocks for" + TotallyNotASkyDimensionMod.MOD_ID);
    }
}
