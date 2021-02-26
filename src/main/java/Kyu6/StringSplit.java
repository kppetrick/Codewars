package Kyu6;

public class StringSplit {
    public static String[] solution(String s) {
        int length = s.length() / 2;
        if (s.length() % 2 != 0) length += 1;
        String[] answer = new String[length];
        for (int i = 0, j = 0; i < length; i++) {
            if (j + 1 >= s.length()) {
                answer[i] = s.substring(j) + "_";
            } else {
                answer[i] = s.substring(j, j + 2);
                j += 2;
            }
        }
        return answer;
    }
}
