package net.opafama.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.opafama.tutorialmod.OpaniteMod;
import net.opafama.tutorialmod.blocks.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup OPANITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OpaniteMod.MOD_ID, "opanite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OPANITE_INGOT))
                    .displayName(Text.translatable("itemgroup.opanitemod.opanite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OPANITE_INGOT);
                        entries.add(ModItems.RAW_OPANITE_ORE);
                    }).build());

    public static final ItemGroup OPANITE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OpaniteMod.MOD_ID, "opanite_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.OPANITE_BLOCK))
                    .displayName(Text.translatable("itemgroup.opanitemod.opanite_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.OPANITE_BLOCK);
                        entries.add(ModBlocks.RAW_OPANITE_BLOCK);
                        entries.add(ModBlocks.OPANITE_ORE);
                        entries.add(ModBlocks.OPANITE_DEEPSLATE_ORE);

                    }).build());



    public static void registerItemGroups() {
        OpaniteMod.LOGGER.info("Registering Item Groups for " + OpaniteMod.MOD_ID);
    }
}
