package de.chriss1998.moreVanilla.block;

public class BlockBlueLamp extends BlockMv {


    public BlockBlueLamp() {
        super();
        this.setBlockName("BlockBlueLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
