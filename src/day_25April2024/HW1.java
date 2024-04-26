package day_25April2024;

import java.util.Scanner;

/**
 * Take a input from user, input1, input2 as int and ask the user what you want to do,
 * enter char +,*,/ ,%, - , you will share the result by using the switch.
 */

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter a Arithmatic operation u want to perform: ");
        char ch = sc.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '+' -> {
                result = num1+num2;
                System.out.println("The result is: "+result);
            }
            case '-' -> {
                if (num1 == num2) System.out.println("The result is: "+result);
                else {
                    System.out.println("Type Positive if u want positive answer or else type Negative for negative answer");
                    String str = sc.next();
                    switch (str){
                        case "Positive" -> result = Math.max(num1,num2) - Math.min(num1,num2);
                        case "Negative" -> result = Math.min(num1,num2) - Math.max(num1,num2);
                        default -> System.out.println("Enter between Positive and Negative");
                    }
                    System.out.println("The result is: "+result);
                }
            }
            case '*' -> {
                result = num1*num2;
                System.out.println("The result is: "+result);
            }
            case '/' -> {
                if (num1 == num2) result = 1;
                else {
                    System.out.println("Type Zero if u want Zero as answer or else type Nonzero for a non zero answer");
                    String str = sc.next();
                    switch (str){
                        case "Nonzero" -> {
                            if(Math.min(num1,num2)==0) System.out.println("Result is Indefinite");
                            else{
                                result = Math.max(num1,num2) / Math.min(num1,num2);
                            }
                        }
                        case "Zero" -> result = Math.min(num1,num2) / Math.max(num1,num2);
                        default -> System.out.println("Enter between Zero and Nonzero");
                    }
                }
            }
            case '%' -> {
                result = num1%num2;
                System.out.println("The result is: "+result);
            }
            default -> System.out.println("Enter a valid Arithmatic expression");
        }
        sc.close();
    }
}
