package com.masteruts20.tutorialmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

@Mod(modid = Tutorial.MOD_ID, name = Tutorial.MOD_NAME, version = Tutorial.VERSION, dependencies = Tutorial.DEPENDENCIES)
public class Tutorial {

    public static final String MOD_ID = "tutorial";
    public static final String MOD_NAME = "TutorialMod";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2189,)";
    public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ':'; // tutorial:

    // variables
    public static Random random = new Random();

    @Instance(MOD_ID)
    public static Tutorial instance;

    @SidedProxy(clientSide = "com.masteruts20.tutorialmod.ClientProxy", serverSide = "com.mastercuts20.tutorialmod.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void posInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
