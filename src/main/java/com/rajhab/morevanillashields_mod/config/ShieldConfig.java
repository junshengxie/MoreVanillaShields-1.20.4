package com.rajhab.morevanillashields_mod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ShieldConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> diamond_shield_durability;

    static {
        BUILDER.push("Config for More Vanilla Shields!");

        diamond_shield_durability = BUILDER.comment("Durability of Diamond Shield. Default Value is 512").define("Diamond Shield Durability", 512);

        BUILDER.pop();
        SPEC = BUILDER.build();

    }
}
