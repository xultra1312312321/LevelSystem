package me.iloveeatmuffin.levelsystem.Command;

import org.bukkit.entity.Player;

public class HelpCommand extends SubCommand{
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "help you arrr";
    }

    @Override
    public String getSyntax() {
        return "/LevelSystem help";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
