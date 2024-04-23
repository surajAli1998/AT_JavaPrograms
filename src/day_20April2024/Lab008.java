package day_20April2024;

public class Lab008 {
    public static void main(String[] args) {
        String s1 = "SURAJ";
        String s2 = "SURAJ";
        String s3 = new String("SURAJ");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3)+" and "+s2.equals(s3));
    }
}
