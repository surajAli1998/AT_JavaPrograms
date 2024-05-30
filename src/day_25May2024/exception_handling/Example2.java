package day_25May2024.exception_handling;

public class Example2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = a/0;
        }
        catch (ArithmeticException e){
            System.out.println("You can not divide by 0");
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Hello");
    }
}
