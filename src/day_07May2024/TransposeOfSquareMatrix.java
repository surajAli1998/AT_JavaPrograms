package day_07May2024;

/**
 * this code is applicable only for square matrix and it will not take any extra 2d array. With this logic
 * we will convert the main matrix into a transpose matrix.
 */

import java.util.Scanner;

public class TransposeOfSquareMatrix {
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
        transposeOfMatrix(arr,row,col);
    }

    public static void transposeOfMatrix(int[][] arr, int row, int col) {
        for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
                int temp;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("The transpose of the given matrix is below: ");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
