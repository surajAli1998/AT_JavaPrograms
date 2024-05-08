package day_07May2024;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String str2 = reverseString(str);
        System.out.println("After reverse the string is: "+str2);
    }

    public static String reverseString(String str) {
        String rev1 = "";
        for(int i=str.length()-1; i>=0; i--){
            rev1 += str.charAt(i);
        }
        return rev1;
    }
}
