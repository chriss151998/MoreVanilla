package de.chriss1998.moreVanilla.block;

public class BlockRedLamp extends BlockMv{


    public BlockRedLamp() {
        super();
        this.setBlockName("BlockRedLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
