package me.iloveeatmuffin.levelsystem.Command;

import org.bukkit.entity.Player;

public class AddExp extends SubCommand {
    @Override
    public String getName() {
        return "AddExp";
    }

    @Override
    public String getDescription() {
        return "add exp";
    }

    @Override
    public String getSyntax() {
        return "/LevelSystem AddExp <player name>";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}