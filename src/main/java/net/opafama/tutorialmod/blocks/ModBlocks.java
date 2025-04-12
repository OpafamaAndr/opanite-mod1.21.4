package net.opafama.tutorialmod.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.opafama.tutorialmod.OpaniteMod;

public class ModBlocks {

    public static final Block OPANITE_BLOCK = registerBlock("opanite_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OpaniteMod.MOD_ID, "opanite_block")))
                    .strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_OPANITE_BLOCK = registerBlock("raw_opanite_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OpaniteMod.MOD_ID, "raw_opanite_block")))
                    .strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block OPANITE_ORE = registerBlock("opanite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OpaniteMod.MOD_ID, "opanite_ore")))
                            .strength(3f).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block OPANITE_DEEPSLATE_ORE = registerBlock("opanite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OpaniteMod.MOD_ID, "opanite_deepslate_ore")))
                    .strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(OpaniteMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(OpaniteMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OpaniteMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }


    public static void registerModBlocks() {
        OpaniteMod.LOGGER.info("Registering Mod Blocks for " + OpaniteMod.MOD_ID);

    }
}
