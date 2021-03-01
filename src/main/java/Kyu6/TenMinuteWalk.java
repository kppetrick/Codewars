package Kyu6;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int vertical = 0;
        int horizontal = 0;

        if(walk.length != 10) {
            return false;
        }
        for (int i = 0; i < walk.length; i++) {
            if(walk[i] == 'n') {
                vertical++;
            }
            if(walk[i] == 's') {
                vertical--;
            }
            if(walk[i] == 'e') {
                horizontal++;
            }
            if(walk[i] == 'w') {
                horizontal--;
            }
        }
        if(vertical == 0 && horizontal == 0) {
            return true;
        }
        return false;
    }
}
