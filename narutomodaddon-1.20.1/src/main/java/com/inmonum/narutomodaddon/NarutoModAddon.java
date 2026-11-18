package com.inmonum.narutomodaddon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

@Mod(NarutoModAddon.MODID)
public class NarutoModAddon {
    public static final String MODID = "narutomodaddon";

    public NarutoModAddon() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, AddonConfig.SPEC);
        MinecraftForge.EVENT_BUS.register(AddonCommands.class);
    }
}
