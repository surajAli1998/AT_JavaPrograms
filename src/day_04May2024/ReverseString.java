package day_04May2024;

import java.util.Scanner;

/**
 * Reverse a String without using any function or using for loop.
 */

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        //using string buffer
//        StringBuffer sb = new StringBuffer();
//        for(int i=str.length()-1; i>=0; i--){
//            sb.append(str.charAt(i));
//        }
//        String ans = sb.toString();
//        System.out.println(ans);

        //using new string and for loop
        String rev1 = "";
        for(int i=str.length()-1; i>=0; i--){
            rev1 += str.charAt(i);
        }
        System.out.println("After reverse the string is: "+rev1);

        //using new string and while loop
//        String rev2 = "";
//        int i = str.length()-1;
//        while(i>=0){
//            rev2 += str.charAt(i);
//            i--;
//        }
//        System.out.println("After reverse the string is: "+rev2);
    }
}
