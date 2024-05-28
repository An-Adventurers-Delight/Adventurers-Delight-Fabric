package com.adventurers_delight.item; //Zaess

import com.adventurers_delight.AdventurersDelight;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MOD_ICON = registerItem("mod_icon", new Item(new FabricItemSettings())); 
    /*
    Mod Icon wird als Item hinzugefügt aber in keine Gruppe gepackt um es als Icon für eine Item Gruppe benutzten zu können.
    !! Man kann auch einen Identifier benutzen [public static final Identifier MOD_ICON = new Identifier("adventurers_delight", "textures/Mod_Icon.png");]
    gerne fix versuch, hat bei mir aber nicht funktioniert.
    - Zaess */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdventurersDelight.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AdventurersDelight.LOGGER.info("Registering Mod Items for " + AdventurersDelight.MOD_ID);
    }
}
