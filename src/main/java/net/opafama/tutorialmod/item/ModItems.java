package net.opafama.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.opafama.tutorialmod.OpaniteMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_OPANITE_ORE=registerItem("raw_opanite_ore",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OpaniteMod.MOD_ID,"raw_opanite_ore")))));

    public static final Item OPANITE_INGOT=registerItem("opanite_ingot",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OpaniteMod.MOD_ID,"opanite_ingot")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OpaniteMod.MOD_ID, name), item);
    }

   public static void registerModItems(){
       OpaniteMod.LOGGER.info("Registering Mod Items for " + OpaniteMod.MOD_ID);

       ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(RAW_OPANITE_ORE);
       });
       ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(OPANITE_INGOT);
       });
   }
}
