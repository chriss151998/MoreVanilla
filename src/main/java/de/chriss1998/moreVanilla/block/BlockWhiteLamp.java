package de.chriss1998.moreVanilla.block;

public class BlockWhiteLamp extends BlockMv{

    public BlockWhiteLamp() {
        super();
        this.setBlockName("BlockWhiteLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
