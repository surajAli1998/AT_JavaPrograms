package day_11May2024;

public class Payment {
    String paymentMode;
    boolean isEMIAvailable;

    void paymentMode(String paymentMode){
        System.out.println("The payment mode is: "+paymentMode);
    }

    void emiAvailability(boolean isEMIAvailable){
        if(isEMIAvailable) System.out.println("Yes EMI is available for this course");
        else System.out.println("Sorry, EMI is not available");
    }
}
