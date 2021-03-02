package Kyu6;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array2[j].indexOf(array1[i]) != -1 && !list.contains(array1[i])) {
                    list.add(array1[i]);
                }
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}

