package day_04May2024.two_dimensional_arrays;

import java.util.Scanner;

/**
 * Write a Java method to transpose a given 2D array.
 */

public class HW03 {
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
        int[][] ans = new int[col][row];
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                ans[i][j] = arr[j][i];
            }
        }
        System.out.println("The transpose of the given matrix is below: ");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
