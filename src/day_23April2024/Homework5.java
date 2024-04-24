package day_23April2024;

import java.util.Scanner;

/**
 * Program to Check if a Number is Prime or Not
 */

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean checkPrime = true;
        if(num<=1){
            checkPrime = false;
        }
        for (int c=2; c*c<=num; c++){
            if (num % c == 0) {
                checkPrime = false;
                break;
            }
        }
        if (checkPrime) System.out.println("This is a prime number");
        else System.out.println("This is not a prime number");
    }
}
