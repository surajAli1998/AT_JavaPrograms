package day_25May2024.exception_handling;

public class Example1 {
    public static void main(String[] args) {
        try {
            String str = args[0];
            int x = Integer.parseInt(str);
            int a = 10/x;
            System.out.println(x);
            System.out.println(a);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Please enter some valid input");

//            this will print the code line no where the issue is
//            e.printStackTrace();
        }

//        if above catch block doesn't handle the exception then this catch block with definately do
        catch (Exception e){
            System.out.println("Exception is handled.");
        }
    }
}
