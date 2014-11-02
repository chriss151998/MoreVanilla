package de.chriss1998.moreVanilla.block;

public class BlockGrayLamp extends BlockMv{


    public BlockGrayLamp() {
        super();
        this.setBlockName("BlockGrayLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
