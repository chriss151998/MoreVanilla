package de.chriss1998.moreVanilla.block;

public class BlockLimeLamp extends BlockMv{

    public BlockLimeLamp() {
        super();
        this.setBlockName("BlockLimeLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
