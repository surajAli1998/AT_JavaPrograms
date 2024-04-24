package day_23April2024;

import java.util.Scanner;

/**
 * Program to Check if a Character is a Vowel or a Consonant
 */

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a single character ");
        ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("The given character is a vowel");
        }
        else System.out.println("The given character is a consonant");
    }
}
