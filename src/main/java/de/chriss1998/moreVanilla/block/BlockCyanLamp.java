package de.chriss1998.moreVanilla.block;

public class BlockCyanLamp extends BlockMv{


    public BlockCyanLamp() {
        super();
        this.setBlockName("BlockCyanLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
