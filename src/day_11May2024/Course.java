package day_11May2024;

public class Course {
    int courseFee;
    int courseDuration;
    boolean isSessionRecorded;
    String courseLanguage;

    Course() {
        System.out.println("This is default constructor");
        greet();
    }

    Course(int courseFee, int courseDuration, boolean isSessionRecorded, String courseLanguage) {
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
        this.isSessionRecorded = isSessionRecorded;
        this.courseLanguage = courseLanguage;
    }

    Course(Course crs){
        this.courseFee = crs.courseFee;
        this.courseDuration = crs.courseDuration;
        this.isSessionRecorded = crs.isSessionRecorded;
        this.courseLanguage = crs.courseLanguage;
    }

    void greet(){
        System.out.println("Hello Welcome to ATB6X Course.");
    }

    void liveOrRecorded(){
        if(isSessionRecorded) System.out.println("This course will be recorded.");
        else System.out.println("This is only live course");
    }

    void fee(){
        System.out.println("The course fee is:"+courseFee);
    }

    void duration(){
        System.out.println("The course duration is: "+courseDuration+" Months");
    }
}
