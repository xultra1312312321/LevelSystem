package me.iloveeatmuffin.levelsystem;


import java.util.UUID;

public class Level {
    private int level;
    private int exp;
    private int ExpToLevelUp;


    public Level(int level, int exp, int ExpToLevelUp) {
        this.level = level;
        this.exp = exp;
        this.ExpToLevelUp = ExpToLevelUp;
    }

    public int getExp() {
        return exp;
    }
    public void setExp(UUID uuid, int experience) {
        this.exp = exp;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(UUID uuid, int level) {
        this.level = level;
    }
}









