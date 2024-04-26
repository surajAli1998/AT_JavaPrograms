package day_25April2024;

import java.util.Scanner;

/**
 * Topic: Enhanced switch case: arrow operator is used here.
 *
 * Point one: by default break statement is added in every cases
 * including default case.
 *
 * Point two: multiple statements must be inside curly braces.
 */

public class Lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your department: ");
        String str = sc.nextLine();
        switch (str) {
            case "TE" ->
            {   System.out.println("Test Engineer, Salary: 4.2lpa");
                System.out.println("DQ should be above 85");
            }
            default -> System.out.println("Enter valid input");
            case "TA" -> System.out.println("Test Analyst, Salary: 6.2lpa");
            case "TTL" -> System.out.println("Technical Test Lead, Salary: 8.2lpa");
        }
    }
}
