package net.keinleben.localhost.engine.system;

import net.keinleben.localhost.engine.source.Source;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * [- Author: Felix / Froznshard -]
 */
public class System
        implements Source{

    private static String mRam,cRam,fRam;
    private static String r1 = "[free ram] ", r2 = "[used ram] ", r3 = "[max ram] ";
    private static String consoleLine = "----------------------------------";
    private static java.lang.System s;

    public System(){
        mRam = String.valueOf(Runtime.getRuntime().maxMemory() / 1024L / 1024L);
        cRam = String.valueOf((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()) / 1024L / 1024L);
        fRam = String.valueOf(Runtime.getRuntime().freeMemory() / 1024L / 1024L);
    }

    public String getFreeRam(){
        return fRam;
    }

    public String getMaxRam(){
        return mRam;
    }

    public String getCurrentRamUsage(){
        return cRam;
    }

    public void compactInfo(boolean form){
        if (form){
            java.lang.System.out.println(consoleLine);
            java.lang.System.out.println(r1 + fRam + " MB | " + r2 + cRam + " MB | " + r3 + mRam + " MB");
            java.lang.System.out.println(consoleLine);
        }else {
            java.lang.System.out.println("Ram Notice");
            java.lang.System.out.println("Usage: " + cRam);
            java.lang.System.out.println("Free: " + fRam);
            java.lang.System.out.println("Max: " + mRam);
        }
    }

    public void compactInfo(Player player){
        player.sendMessage(engine +  "§e" + r1 + fRam + " MB | " + r2 + cRam + " MB | " + r3 + mRam + " MB");
    }

    public void shuttingDown(){
        for (Player player : Bukkit.getOnlinePlayers())
            player.kickPlayer(shuttingdown);
        Bukkit.shutdown();
    }

}
