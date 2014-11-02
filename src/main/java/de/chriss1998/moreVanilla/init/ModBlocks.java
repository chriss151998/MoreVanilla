package de.chriss1998.moreVanilla.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.chriss1998.moreVanilla.block.*;

public class ModBlocks {


    public static final BlockMv BlockWhiteLamp = new BlockWhiteLamp();
    public static final BlockMv BlockOrangeLamp = new BlockOrangeLamp();
    public static final BlockMv BlockMagentaLamp = new BlockMagentaLamp();
    public static final BlockMv BlockLightBlueLamp = new BlockLightBlueLamp();
    public static final BlockMv BlockYellowLamp = new BlockYellowLamp();
    public static final BlockMv BlockLimeLamp = new BlockLimeLamp();
    public static final BlockMv BlockPinkLamp = new BlockPinkLamp();
    public static final BlockMv BlockGrayLamp = new BlockGrayLamp();
    public static final BlockMv BlockLightGrayLamp = new BlockLightBlueLamp();
    public static final BlockMv BlockPurpleLamp = new BlockPurpleLamp();
    public static final BlockMv BlockBlueLamp = new BlockBlueLamp();
    public static final BlockMv BlockBrownLamp = new BlockBrownLamp();
    public static final BlockMv BlockGreenLamp = new BlockGreenLamp();
    public static final BlockMv BlockRedLamp = new BlockRedLamp();
    public static final BlockMv BlockBlackLamp = new BlockBlackLamp();

    public static void init() {

        GameRegistry.registerBlock(BlockWhiteLamp, "BlockWhiteLamp");
        GameRegistry.registerBlock(BlockOrangeLamp, "BlockOrangeLamp");
        GameRegistry.registerBlock(BlockLightBlueLamp, "BlockLightBlueLamp");
        GameRegistry.registerBlock(BlockYellowLamp, "BlockLimeLamp");
        GameRegistry.registerBlock(BlockLimeLamp, "BlockLimeLamp");
        GameRegistry.registerBlock(BlockPinkLamp, "BlockPinkLamp");
        GameRegistry.registerBlock(BlockGrayLamp, "BlockGrayLamp");
        GameRegistry.registerBlock(BlockLightGrayLamp, "BlockLightGrayLamp");
        GameRegistry.registerBlock(BlockPurpleLamp, "BlockPurpleLamp");
        GameRegistry.registerBlock(BlockBlueLamp, "BlockBlueLamp");
        GameRegistry.registerBlock(BlockBrownLamp, "BlockBrownLamp");
        GameRegistry.registerBlock(BlockGreenLamp, "BlockGrrenLamp");
        GameRegistry.registerBlock(BlockRedLamp, "BlockRedLamp");
        GameRegistry.registerBlock(BlockBlackLamp, "BlockBlackLamp");
    }
}
