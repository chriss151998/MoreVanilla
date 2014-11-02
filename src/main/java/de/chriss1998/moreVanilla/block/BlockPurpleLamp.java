package de.chriss1998.moreVanilla.block;

public class BlockPurpleLamp extends BlockMv{


    public BlockPurpleLamp() {
        super();
        this.setBlockName("BlockPurpleLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
