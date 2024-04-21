package day_20April2024;
public class Homework4 {
    public static void main(String[] args) {
        int x = 10;
        double y = 12.4 , z = 56.78;
        double result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);
    }
}
