package day_07May2024;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean checkPrime = isPrime(num);
        if(checkPrime) System.out.println("This is a prime number");
        else System.out.println("This is not a prime number");
    }

    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for (int c=2; c*c<=num; c++){
            if (num % c == 0) {
                return false;
            }
        }
        return true;
    }

}
