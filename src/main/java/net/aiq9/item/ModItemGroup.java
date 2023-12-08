package net.aiq9.item;

import net.aiq9.TotallyNotASkyDimensionMod;
import net.aiq9.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TEMPLATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TotallyNotASkyDimensionMod.MOD_ID, "cloud_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tnasdm"))
                    .icon(() -> new ItemStack(ModBlocks.CLOUD_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CLOUD_STONE);
                        entries.add(ModBlocks.NEBULA_ORE);
                        entries.add(ModBlocks.RAW_NEBULA_BLOCK);
                        entries.add(ModBlocks.NEBULA_BLOCK);

                        entries.add(ModItems.RAW_NEBULA_ORE);
                        entries.add(ModItems.NEBULA_INGOT);
                    }).build());

    public static void registerItemGroups() {
        TotallyNotASkyDimensionMod.LOGGER.info("Registering Mod ItemGroup(s) for" + TotallyNotASkyDimensionMod.MOD_ID);
    }
}
