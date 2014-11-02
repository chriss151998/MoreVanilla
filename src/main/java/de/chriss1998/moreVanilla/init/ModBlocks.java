package de.chriss1998.moreVanilla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.chriss1998.moreVanilla.block.BlockMv;
import de.chriss1998.moreVanilla.block.BlockMagentaLamp;

public class ModBlocks {

    public static final BlockMv BlockMagentaLamp = new BlockMagentaLamp();

    public static void init(){

        GameRegistry.registerBlock(BlockMagentaLamp ,"BlockMagentaLamp");
    }
}
