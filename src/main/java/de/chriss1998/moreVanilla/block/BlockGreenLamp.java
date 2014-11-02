package de.chriss1998.moreVanilla.block;

public class BlockGreenLamp extends BlockMv {


    public BlockGreenLamp() {
        super();
        this.setBlockName("BlockGreenLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
