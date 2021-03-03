package Kyu5;

import java.util.ArrayList;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        ArrayList surivor = new ArrayList();
        for (int i = 0; i < n; i++) {
            surivor.add(i + 1);
        }
        int indexToRemove = 0;
        int length = n + 1;
        while (surivor.size() > 1) {
            indexToRemove += k - 1;
            length--;
            if(indexToRemove < length) {
                surivor.remove(indexToRemove);
            } else {
                while(indexToRemove >= length) {
                    indexToRemove -= length;
                }
                surivor.remove(indexToRemove);
            }
        }
        return (int) surivor.get(0);
    }
}
