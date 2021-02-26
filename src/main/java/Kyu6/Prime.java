package Kyu6;

public class Prime {
    public static boolean isPrime(int num)  {
        // Corner cases
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;

        return true;
    }
}
