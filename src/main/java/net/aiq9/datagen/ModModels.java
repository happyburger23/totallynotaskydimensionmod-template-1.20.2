package net.aiq9.datagen;

import net.aiq9.blocks.ModBlocks;
import net.aiq9.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModels extends FabricModelProvider {
    public ModModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOUD_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEBULA_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NEBULA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEBULA_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_NEBULA_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEBULA_INGOT, Models.GENERATED);
    }
}
