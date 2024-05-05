package day_04May2024;

import java.util.Scanner;

/**
 * Duplicate String
 */

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String ans = "";

        //using indexOf method
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            int index = str.indexOf(ch,i+1);
//            if(index==-1) ans += ch;
//        }

        //using character array
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag) ans+=arr[i];
        }
        System.out.println("New string after removing duplicates: "+ans);
    }
}
