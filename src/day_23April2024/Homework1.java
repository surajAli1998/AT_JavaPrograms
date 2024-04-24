package day_23April2024;

import java.util.Scanner;

/**
 * Program to Check if a Number is Positive, Negative, or Zero.
 */

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("The number is positive");
        else if (num == 0) System.out.println("The number is Zero");
        else System.out.println("The number is negative");
    }
}
