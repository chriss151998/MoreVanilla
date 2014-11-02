package de.chriss1998.moreVanilla.block;

public class BlockLightGrayLamp extends BlockMv{


    public BlockLightGrayLamp() {
        super();
        this.setBlockName("BlockLightGrayLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
