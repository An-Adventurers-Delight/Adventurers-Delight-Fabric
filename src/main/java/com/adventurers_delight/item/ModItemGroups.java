package com.adventurers_delight.item; //Zaess

import com.adventurers_delight.AdventurersDelight;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // Define the identifier for your icon image
    public static final ItemGroup ADVENTURERS_DELIGHT = Registry.register(Registries.ITEM_GROUP, new Identifier(AdventurersDelight.MOD_ID,
    "test"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test"))
    .icon(() -> new ItemStack(ModItems.MOD_ICON)).entries((displayContext, entries) -> {
        entries.add(ModItems.MOD_ICON);

    }).build());
    

    public static void registerItemGroups() {
        AdventurersDelight.LOGGER.info("Registriert Item Gruppe für" + AdventurersDelight.MOD_ID);
    }
    
}
