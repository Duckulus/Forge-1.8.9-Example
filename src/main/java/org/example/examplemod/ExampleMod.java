package org.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.MOD_NAME, version = ExampleMod.MOD_VERSION, clientSideOnly = true)
public class ExampleMod {

    public static final String MOD_NAME = "ExampleMod";
    public static final String MOD_ID = "examplemod";
    public static final String MOD_VERSION = "1.0";

    @Mod.Instance(ExampleMod.MOD_ID)
    private static ExampleMod instance;


    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        System.out.println("Hello World");
    }

    public static ExampleMod getInstance() {
        return instance;
    }

}
