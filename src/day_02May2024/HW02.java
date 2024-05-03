package day_02May2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
 */

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<size; i++){
            System.out.println("Enter the number: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Your inputs are doubled as below: ");
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i]*2;
            System.out.println(arr2[i]);
        }
    }
}
