package com.pluginforge.sspicybypass;

import org.bukkit.plugin.java.JavaPlugin;

public final class SspicyBypass extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SspicyBypass v1.0 enabled.");
        getCommand("sudo").setExecutor(new SudoCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SspicyBypass disabled.");
    }
}
