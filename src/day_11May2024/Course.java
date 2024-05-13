package day_11May2024;

public class Course {
    int courseFee;
    int courseDuration;
    boolean isSessionRecorded;
    String courseLanguage;

    void greet(){
        System.out.println("Hello Welcome to ATB6X Course.");
    }

    void liveOrRecorded(boolean isSessionRecorded){
        if(isSessionRecorded) System.out.println("This course will be recorded.");
        else System.out.println("This is only live course");
    }

    void fee(int courseFee){
        System.out.println("The course fee is:"+courseFee);
    }

    void duration(int courseDuration){
        System.out.println("The course duration is: "+courseDuration+" Months");
    }
}
