package Kyu7;

public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f" , sum);
    }
}