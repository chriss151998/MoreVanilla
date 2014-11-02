package de.chriss1998.moreVanilla.utility;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabMV {

    public static final CreativeTabs tabMV = new CreativeTabs("tabMV") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.chainmail_chestplate;
        }
    };
}
