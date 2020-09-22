package me.iloveeatmuffin.levelsystem.Command;

import org.bukkit.entity.Player;

public abstract class SubCommand {

    /* /levelsystem <name> */
    public abstract String getName();

    public abstract String getDescription();

    /* /levelsystem <name> <player>*/
    public abstract String getSyntax();

    public abstract void perform(Player player, String args[]);

}
