package day_25May2024.exception_handling;

public class CustomException {
    public static void main(String[] args) throws Exception {
        Bank icici = new Bank("INR",1000);
        Bank sbi = new Bank("USD",50);
        Integer total = icici.add(sbi);
        System.out.println(total);
    }
}
