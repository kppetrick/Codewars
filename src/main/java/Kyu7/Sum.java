package Kyu7;

public class Sum {
    public int GetSum(int a, int b) {
        int answer = 0;
        if (a > b) {
            while (b != a +1) {
                answer += b;
                b++;
            }
            return answer;
        }
        if (a < b) {
            while (a != b + 1) {
                answer += a;
                a++;
            }
            return answer;
        } else {
            answer += a;
            return answer;
        }
    }
}
