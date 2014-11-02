package de.chriss1998.moreVanilla.block;

public class BlockBlackLamp extends BlockMv{


    public BlockBlackLamp() {
        super();
        this.setBlockName("BlockBlackLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
