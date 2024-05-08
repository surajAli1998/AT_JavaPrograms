package day_07May2024;

import java.util.Scanner;

public class DiagonalElements {
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
        System.out.println("The diagonal elements are below: ");
        printDiagonalElements(arr);
    }

    public static void printDiagonalElements(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                //primary diagonal logic
                if(i==j) System.out.print(arr[i][j]);

                //secondary diagonal logic
                else if(i+j == arr.length-1) System.out.print(arr[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
