package Kyu4;

public class LongestSlide {

    public static int longestSlideDown(int[][] pyramid) {
        int answer = pyramid[0][0] + Math.max(pyramid[1][0], pyramid[1][1]);
        for (int i = 2, l = 3, r = 2; i < pyramid.length; i++) {
            int left = pyramid[i][pyramid[i].length - l];
            int right = pyramid[i][pyramid[i].length - r];
            if (Math.max(left, right) == right) {
                answer += right;
            } else {
                answer += left;
                l++;
                r++;
            }
        }
        return answer;
    }
}