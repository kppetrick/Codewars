package Kyu6;

public class ASum {
    public static long findNb(long m) {
        long ex=(long)Math.sqrt((long) Math.sqrt(m)*2);
        if((ex*(ex+1)/2)*(ex*(ex+1)/2)==m) return ex; else return -1;
    }
}