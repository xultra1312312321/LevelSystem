package me.iloveeatmuffin.levelsystem;


import me.iloveeatmuffin.levelsystem.Manager.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        getCommand("LevelSystem").setExecutor(new CommandManager());


    }

    @Override
    public void onDisable() {

    }

}