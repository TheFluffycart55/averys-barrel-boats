package net.thefluffycart.barrel_boats.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thefluffycart.barrel_boats.AverysBarrelBoats;
import net.thefluffycart.barrel_boats.block.custom.PlushieBlock;

public class ModBlocks {
    public static final Block THEFLUFFYCART_PLUSHIE = registerBlock("thefluffycart_plushie",
            new PlushieBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AverysBarrelBoats.MOD_ID, "thefluffycart_plushie")))
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable().nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AverysBarrelBoats.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AverysBarrelBoats.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AverysBarrelBoats.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        AverysBarrelBoats.LOGGER.info("Registering ModBlocks for " + AverysBarrelBoats.MOD_ID);
    }
}
