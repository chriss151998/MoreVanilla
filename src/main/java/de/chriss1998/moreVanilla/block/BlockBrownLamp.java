package de.chriss1998.moreVanilla.block;

public class BlockBrownLamp extends BlockMv {


    public BlockBrownLamp() {
        super();
        this.setBlockName("BlockBrownLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
