package Kyu5;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        ArrayList surivor = new ArrayList();
        List<T> answer = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            surivor.add(i + 1);
        }
        int indexToRemove = 0;
        int length = items.size() + 1;
        while (surivor.size() > 1) {
            indexToRemove += k - 1;
            length--;
            if (indexToRemove < length) {

                surivor.remove(indexToRemove);
                answer.add((T) surivor.get(indexToRemove));
            } else {
                while (indexToRemove >= length) {
                    indexToRemove -= length;
                }
                surivor.remove(indexToRemove);
            }
        }
        return answer;
    }
}
