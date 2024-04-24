package day_23April2024;

import java.util.Scanner;

/**
 * Program to Find the Largest Among Three Numbers:
 */

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        b = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        c = sc.nextInt();
        if (a > b && a > c) System.out.println("The largest number is: "+a);
        else if (b > a && b > c) System.out.println("The largest number is: "+b);
        else System.out.println("The largest number is: "+c);
    }
}
