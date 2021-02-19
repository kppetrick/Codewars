package Kyu6;

public class Conversion {
    private static final int[] numbers = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1, };
    private static final String[] romans = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String solution(int n) {
        final StringBuilder roman = new StringBuilder();
        int i = 0;
        while (n > 0) {
            if (n >= numbers[i++]) {
                roman.append(romans[--i]);
                n = n - numbers[i];
            }
        }
        return roman.toString();
    }
}