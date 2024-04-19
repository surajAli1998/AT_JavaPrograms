package day_18April2024;

/**
 * Topic: Type casting
 * Sub topic:
 * Widening -> converting lower data type to higher data type, no loss of data
 * Narrowing -> converting higher data type into lower, loss of data
 */

public class Lab005 {
    public static void main(String[] args) {
        short a = 23;
        int b = a; // implicit type casting: done by JVM automatically
        int c = (int)a; // explicit type casting: done by user
        System.out.println(b+ " " +c);

        int num1 = 12;
        // byte num2 = num1; in case of narrowing implicit type cast is not possible
        byte num2 = (byte)num1; //explicit narrowing
        System.out.println(num2);
    }
}
