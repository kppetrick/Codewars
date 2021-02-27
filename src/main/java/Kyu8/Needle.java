package Kyu8;

public class Needle {
    public static String findNeedle(Object[] haystack) {
        String answer = "found the needle at position ";
        for (int i = 0; i < haystack.length; i++) {
            if(haystack[i] == "needle") {
                answer += i;
            }
        }
        return answer;
    }
}
