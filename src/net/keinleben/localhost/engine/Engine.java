package net.keinleben.localhost.engine;

import net.keinleben.localhost.engine.system.System;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * [- Author: Felix / Froznshard -]
 */
public class Engine extends JavaPlugin {

    System syso = new System();

    @Override
    public void onEnable() {
        super.onEnable();
        syso.compactInfo(true);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
