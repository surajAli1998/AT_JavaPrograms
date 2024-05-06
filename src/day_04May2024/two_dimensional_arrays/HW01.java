package day_04May2024.two_dimensional_arrays;

import java.util.Scanner;

/**
 * Write - Java method to find the maximum value in a 2D array. - O/P - 9
 */

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println("The maximum element is: "+max);
    }
}
