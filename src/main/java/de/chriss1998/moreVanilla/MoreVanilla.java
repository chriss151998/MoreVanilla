package de.chriss1998.moreVanilla;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.chriss1998.moreVanilla.configurations.ConfigurationHandler;
import de.chriss1998.moreVanilla.init.ModBlocks;
import de.chriss1998.moreVanilla.init.ModItems;
import de.chriss1998.moreVanilla.reference.Reference;
import de.chriss1998.moreVanilla.utility.proxy.IProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class MoreVanilla {

    @Mod.Instance(Reference.MOD_ID)
    public static MoreVanilla instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Items
        ModItems.init();


        //Blocks
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {



    }

    @Mod.EventHandler
    public void posInit(FMLPostInitializationEvent event) {


    }


}
