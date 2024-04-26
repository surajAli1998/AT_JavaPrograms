package day_25April2024;

import java.util.Scanner;

/**
 * Topic: Traditional switch case
 *
 * Special cases to keep in mind:
 *
 * Point one: if we keep default case before any other cases, then we have to use break otherwise
 * even if no case meet the criteria then also the default case and the cases after that will execute until there is
 * a next break.
 *
 * Point two: if we don't use break in cases then it will keep executing the next cases until it meets a break statement.
 *
 */

public class Lab010 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your department: ");
        String str = sc.nextLine();
        switch (str){
            default:
                System.out.println("Enter valid input");
                //break;
            case "TE":
                System.out.println("Test Engineer, Salary: 4.2lpa");
                //break;
            case "TA":
                System.out.println("Test Analyst, Salary: 6.2lpa");
                break;
            case "TTL":
                System.out.println("Technical Test Lead, Salary: 8.2lpa");
                break;
        }
    }
}
