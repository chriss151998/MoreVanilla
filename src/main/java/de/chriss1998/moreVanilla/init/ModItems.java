package de.chriss1998.moreVanilla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.chriss1998.moreVanilla.item.ItemMv;
import de.chriss1998.moreVanilla.item.ItemTest;

public class ModItems {

    public static final ItemMv ItemTest = new ItemTest();

    public static void init() {

        GameRegistry.registerItem(ItemTest, "testItem");
    }


}
