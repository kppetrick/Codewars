package Kyu6;

public class ASum {
    public static long findNb(long m) {
        int answer = 0;
        answer = (int) Math.sqrt((Math.sqrt(m)) * 2);
        long test = 0;
        for (int i = 1; i <= answer; i++) {
            test += Math.pow(i, 3);
        }
        if (test == m) {
            return answer;
        }
        return -1;
    }
}