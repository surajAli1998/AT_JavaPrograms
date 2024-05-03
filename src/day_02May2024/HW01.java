package day_02May2024;

import java.util.Scanner;

/**
 * Create a Program which takes arrays and print all the marks.
 */

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the marks: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your marks are given below: ");
        for(int j=0; j<size; j++){
            System.out.println(arr[j]);
        }
    }
}
