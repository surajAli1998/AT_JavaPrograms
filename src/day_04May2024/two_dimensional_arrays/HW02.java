package day_04May2024.two_dimensional_arrays;

import java.util.Scanner;

/**
 * Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
 */

public class HW02 {
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
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==num){
                    flag = true;
                    System.out.println(flag);
                    break;
                }
            }
        }
        if(!flag) System.out.println(flag);
    }
}
