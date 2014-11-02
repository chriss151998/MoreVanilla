package de.chriss1998.moreVanilla.block;

public class BlockLightBlueLamp extends BlockMv {


    public BlockLightBlueLamp() {
        super();
        this.setBlockName("BlockLightBlueLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
