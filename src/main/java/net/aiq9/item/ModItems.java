package net.aiq9.item;

import net.aiq9.TotallyNotASkyDimensionMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_NEBULA_ORE = registerItem("raw_nebula_ore", new Item(new FabricItemSettings()));
    public static final Item NEBULA_INGOT = registerItem("nebula_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TotallyNotASkyDimensionMod.MOD_ID, name), item);
    }

    public static void registerModBlocks() {
        TotallyNotASkyDimensionMod.LOGGER.info("Registering Mod Items for" + TotallyNotASkyDimensionMod.MOD_ID);
    }
}
