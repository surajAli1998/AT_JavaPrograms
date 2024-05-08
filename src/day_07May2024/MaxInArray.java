package day_07May2024;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        int max = findMaxEelement(arr);
        System.out.println("The max array element is: "+max);
    }

    public static int findMaxEelement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }
}
