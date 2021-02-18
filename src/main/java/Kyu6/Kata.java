package Kyu6;

public class Kata {
    public static int[] sortArray(int[] array) {
        int oddCount = 0;
        //count odds
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;

            }
        }
        //make array of odds add all the odds to this array
        int[] odds = new int[oddCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[j] = array[i];
                array[i] = -1;
                j++;
            }
        }
        //sort odd array
        for (int i = 0; i < odds.length; i++)
            for (int j = 0; j < odds.length - 1 - i; j++)
                if (odds[j] > odds[j + 1]) {
                    int temp = odds[j];
                    odds[j] = odds[j + 1];
                    odds[j + 1] = temp;
                }
        //add odds back to array in order
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == -1) {
                array[i] = odds[j];
                j++;
            }
        }
        return array;
    }
}
