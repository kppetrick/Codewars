package Kyu7;

public class Sum {
    public int GetSum(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
