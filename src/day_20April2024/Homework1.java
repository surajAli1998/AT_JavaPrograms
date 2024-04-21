package day_20April2024;

/**
 * Problem statement: Max between 3 Numbers with ? operator.
 */

public class Homework1 {
    public static void main(String[] args) {
        int num1 = 100, num2 = 159, num3 = 113, max;
        max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("The maximum number is: "+max);
    }
}
