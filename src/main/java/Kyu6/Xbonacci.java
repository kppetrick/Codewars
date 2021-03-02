package Kyu6;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] answer = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                answer[i] = s[i];
            } else {
                answer[i] = answer[i - 3] + answer[i - 2] + answer[i - 1];
            }
        }
        return answer;
    }
}
