package day_04May2024.string_questions;

import java.util.Scanner;

/**
 * Java Anagrams - silent -> listen , length1 = length2
 */

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        if(str1.length() == str2.length()){
            boolean flag = true;
            for(int i=0;i<str1.length();i++){
                char ch = str1.charAt(i);
                int index = str2.indexOf(ch);
                int lastIndex = str2.lastIndexOf(ch);
                if(index != -1){
                    if(index != lastIndex){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) System.out.println("They are anagrams");
            else System.out.println("They are not anagrams");
        }
        else System.out.println("They are not anagrams");
    }
}
