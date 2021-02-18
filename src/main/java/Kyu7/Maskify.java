package Kyu7;

public class Maskify {
    public static String maskify(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > 4 && i < str.length() - 4) {
                answer += '#';
                } else {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}

