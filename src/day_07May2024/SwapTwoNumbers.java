package day_07May2024;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Before swapping the numbers are: "+num1+" "+num2);
        swapNumbers(num1,num2);

    }

    public static void swapNumbers(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping the numbers are: "+num1+" "+num2);
    }
}
