package net.keinleben.localhost.engine.system;

/**
 * [- Author: Felix / Froznshard -]
 */
public class System {

    private static String mRam,cRam,fRam;
    private static String r1 = "[FREE RAM] ", r2 = "[CURRENT USAGE] ", r3 = "[MAX RAM] ";
    private static String consoleLine = "---------------------------------------------------";
    private static java.lang.System s;

    public System(){
        mRam = String.valueOf(Runtime.getRuntime().maxMemory() / 1024L / 1024L);
        cRam = String.valueOf((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()) / 1024L / 1024L);
        fRam = String.valueOf(Runtime.getRuntime().freeMemory() / 1024L / 1024L);
    }

    public static String getFreeRam(){
        return fRam;
    }

    public static String getMaxRam(){
        return mRam;
    }

    public static String getCurrentRamUsage(){
        return cRam;
    }

    public static void compactInfo(boolean form){
        if (form){
            s.out.println(consoleLine);
            s.out.println(r1 + fRam + " | " + r2 + cRam + " | " +r3 + mRam);
            s.out.println(consoleLine);
        }else {
            s.out.println("Ram Notice");
            s.out.println("Usage: " + cRam);
            s.out.println("Free: " + fRam);
            s.out.println("Max: " + mRam);
        }
    }

}
