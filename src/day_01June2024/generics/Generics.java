package day_01June2024.generics;

public class Generics {
    public static void main(String[] args) {
        genericMethod(3,5);
        genericMethod("suraj","karar");
        genericMethod(true,false);
        genericMethod("ali",23);
    }

    private static <T> void genericMethod(T x, T y) {
        System.out.println(x+" "+y);
    }
}
