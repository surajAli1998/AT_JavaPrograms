package day_04May2024.string_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        str1 = Arrays.toString(arr1);
//        str2 = Arrays.toString(arr2);
//        if(str1.equalsIgnoreCase(str2)) System.out.println("They are Anagrams");
//        else System.out.println("They are not Anagrams");

        Map<Character,Integer> hmap1 = new TreeMap<>();
        Map<Character,Integer> hmap2 = new TreeMap<>();
        for(int i=0; i<str1.length(); i++){
            Character ch = str1.charAt(i);
            hmap1.put(ch,hmap1.get(ch)==null?1:hmap1.get(ch)+1);
        }
        for(int i=0; i<str2.length(); i++){
            Character ch = str2.charAt(i);
            hmap2.put(ch,hmap2.get(ch)==null?1:hmap2.get(ch)+1);
        }
        if(hmap1.equals(hmap2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
