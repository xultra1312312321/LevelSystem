package me.iloveeatmuffin.levelsystem.Container;

import me.iloveeatmuffin.levelsystem.Manager.LevelManager;
import org.bukkit.entity.Player;

public class LevelContainer {
    private int level;
    private double exp;

    public LevelContainer(int level,double exp){
        this.level = level;
        this.exp = exp;
    }

    public double getExp() {
        return exp;
    }

    public int getLevel(){
        return level;
    }

    public void setExp(Player player, double exp){
        this.exp = getExp() + exp;
        double RequiredExp = LevelManager.expRequiredToLevelUp(getExp());


        if(getExp() >= RequiredExp){
            setLevel(getLevel() + 1);
            LevelManager.LevelUp(player , getLevel());

        }
    }

    public void setLevel(int level){
        this.level = level;

    }

}
