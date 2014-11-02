package de.chriss1998.moreVanilla.block;

public class BlockPinkLamp extends BlockMv{


    public BlockPinkLamp() {
        super();
        this.setBlockName("BlockPinkLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
