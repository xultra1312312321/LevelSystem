package me.iloveeatmuffin.levelsystem.Manager;


import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class LevelManager{
    public static double expRequiredToLevelUp(double currentLevel){
        double exponent = 500;
        if(currentLevel == 1){
            return exponent;
        }
        return  exponent * (Math.pow(currentLevel,2)) - (exponent * currentLevel);
    }
    public static void LevelUp(Player player, int level){
        //levelup 的message

        //levelup 的聲音
        player.getLocation().getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP,1,1);
    }

}