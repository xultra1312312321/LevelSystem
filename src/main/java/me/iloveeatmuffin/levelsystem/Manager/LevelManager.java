package me.iloveeatmuffin.levelsystem.Manager;

public class LevelManager {
    private int level;
    private int xp;

    public LevelManager(int level, int xp) {
        this.level = level;
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}

