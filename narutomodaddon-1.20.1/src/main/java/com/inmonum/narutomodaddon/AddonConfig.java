package com.inmonum.narutomodaddon;

import net.minecraftforge.common.ForgeConfigSpec;

public class AddonConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue REROLL_KKG;

    static {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();
        REROLL_KKG = b.comment("Let every player use /changekkg on themselves (otherwise only ops).").define("rerollKkg", true);
        SPEC = b.build();
    }
}
