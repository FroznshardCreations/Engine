package net.keinleben.localhost.engine.system;

/**
 * [- Author: Felix / Froznshard -]
 */
public class System {

    private static String mRam,cRam,fRam;
    private static String r1 = "[FREE RAM] ", r2 = "[CURRENT USAGE] ", r3 = "[MAX RAM] ";
    private static String consoleLine = "---------------------------------------------------------------------";
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

}
