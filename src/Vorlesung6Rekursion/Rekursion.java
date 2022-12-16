package Vorlesung6Rekursion;

public class Rekursion {
    private static int startValue;
    private static int endValue;
    public static void main(String[] args) {
        startValue = 5;
        endValue = 1;
        fac(startValue);
        System.out.println(endValue);
    }

    public static void fac(int remaining){
        if (remaining != 0)
            endValue *= remaining;
        if (remaining > 1){
           fac(remaining - 1);
        }
    }
}
