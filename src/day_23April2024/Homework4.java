package day_23April2024;

import java.util.Scanner;

/**
 * Program to Check if a Year is a Leap Year or Not
 */

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0){
            System.out.println("This is a leap year");
        }
        else System.out.println("This is not a leap year");
    }
}
