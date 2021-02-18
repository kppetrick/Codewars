package Kyu6;

class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        String answer = "";
        String current = "";
        for (int i = 0; i < strarr.length - (k-1); i++) {
            for (int j = 0; j < k; j++) {
                current += strarr[i + j];
                if (j == k - 1) {
                    if (current.length() > answer.length()) {
                        answer = current;
                    }
                    current = "";
                }
            }
        }
        return answer;
    }
}