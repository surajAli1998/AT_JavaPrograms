package day_13April2024;

/**
 * Concept: various ways of declaring variables
 */
public class Lab003 {
    public static void main(String[] args) {

        // declaring and initializing multiple variables of same data type in a single statement
        int num1 = 12, num2 = 5, num3 = 56;
        System.out.println("Number 1 = "+num1);

        // we cant declare or initialize multiple variables of diff data types in a single statement
        //int a  = 23, float b = 3.45f;

        // we can assign same value to multiple variables of same data type in a single statement.
        int a, b, c = 23;

        // We can't declare two variables with same name in same scope
        /*
        int f = 23;
        int f = 24;
         */

    }
}
