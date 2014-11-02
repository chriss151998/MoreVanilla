package de.chriss1998.moreVanilla.block;

public class BlockOrangeLamp extends BlockMv{


    public BlockOrangeLamp() {
        super();
        this.setBlockName("BlockMagentaLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
