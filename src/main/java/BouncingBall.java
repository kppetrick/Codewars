public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        int passes = -1;
        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
            return -1;
        while(h > window){
            passes += 2;
            h = h*bounce;
        }
        return passes;
    }
}