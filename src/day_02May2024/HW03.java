package day_02May2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the max salary in the input arrays {30,50,60,90,10, 100,999}
 */

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the salary: ");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("The max salary is: "+max);
    }
}
