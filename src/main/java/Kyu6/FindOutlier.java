package Kyu6;

public class FindOutlier{
    static int find(int[] integers) {
        int even = 0;
        int answer = integers[0];
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            }
        }
        if (even >= 2) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    answer = integers[i];
                    break;
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    answer = integers[i];
                    break;
                }
            }
        }
        return answer;
    }
}