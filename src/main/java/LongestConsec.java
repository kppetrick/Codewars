class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        String answer = "";
        String current = "";

        if (k == 1) {
            for (int i = 0; i < strarr.length; i++) {
                current = "";
                current += strarr[i];
                if (current.length() > answer.length()) {
                    answer = current; }
                }
                return answer;
        } if (k <= 0) {
            return answer;
        }
        else {
            for (int i = 0; i < strarr.length - (k-1); i++) {
                current += strarr[i];
                for (int j = 1; j < k; j++) {
                    current += strarr[i + j];
                    if (j == k - 1) {
                        if (current.length() > answer.length()) {
                            answer = current;
                            current = "";
                        } else {
                            current = "";
                        }
                    }
                }
            }
            return answer;
        }
    }
}