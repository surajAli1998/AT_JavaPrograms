package day_18April2024;

/**
 * Topic: Increment (++, --)
 */

public class Lab006 {
    public static void main(String[] args) {
        //Post increment:
        int a = 12;
        int b = a++; //first old value of a is assigned to b then a is incremented by 1
        System.out.println(b);
        System.out.println(a);

        //Pre increment:
        int num1 = 5;
        int num2 = ++num1; //first num1 is incremented by 1 and then its assigned to num2
        System.out.println(num2+" "+num1);

        int num3 = 45;
        System.out.println(num3++);
        System.out.println(++num3);
    }
}
