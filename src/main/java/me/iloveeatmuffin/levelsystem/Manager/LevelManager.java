package me.iloveeatmuffin.levelsystem.Manager;



import java.util.HashMap;
import java.util.UUID;

public class LevelManager {
 //addLevel
//addExp
//reduceExp
//reduceLevel

    private HashMap<UUID, LevelManager> levelManagerHashMap;
    private int getPlayerLevel;
    private double addPlayerExp;
    private double reducePlayerExp;
    private double addPlayerLevel;
    private double reducePlayerLevel;

    public LevelManager(int getPlayerLevel, double addPlayerExp, double reducePlayerExp,double addPlayerLevel, double reducePlayerLevel) {
        this.getPlayerLevel = getPlayerLevel;
        this.addPlayerExp = addPlayerExp;
        this.reducePlayerExp = reducePlayerExp;
        this.addPlayerLevel = addPlayerLevel;
        this.reducePlayerLevel = reducePlayerLevel;
    }

    public static int getPlayerLevel(UUID uuid) {
    }
    public double AddPlayerExp(UUID uuid, int amount) {
    }

    public double AddPlayerLevel(UUID uuid, int amount) {
    }

    public double ReducePlayerExp(UUID uuid, int amount) {
        return AddPlayerExp(uuid, amount * -1);
    }
    public double ReducePlayerLevel(UUID uuid, int amount) {
        return AddPlayerLevel(uuid, amount * -1);
    }
}


