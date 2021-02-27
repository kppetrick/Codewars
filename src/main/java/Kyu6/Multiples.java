package Kyu6;

public class Multiples {

    public int threeOrFive(int number) {
        int answer = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
