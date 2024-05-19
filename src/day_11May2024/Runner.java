package day_11May2024;

public class Runner {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course(10000,4,true,"English");
        Course c3 = new Course(c2);
        c2.fee();
        c2.duration();
        System.out.println("The course language is: "+c2.courseLanguage);
        c2.liveOrRecorded();
        c3.fee();
        c3.duration();
        System.out.println("The course language is: "+c3.courseLanguage);
        c3.liveOrRecorded();

        System.out.println();

        Student st = new Student();
        st.name = "Suraj";
        st.getName(st.name);
        st.rollNo = 2;
        st.getRollNumber(st.rollNo);
        st.phoneNumber = 8240520349L;
        System.out.println("Student's phone number is "+st.getPhoneNumber(st.phoneNumber));

        System.out.println();

        Payment pmt = new Payment();
        pmt.paymentMode = "CARD";
        pmt.isEMIAvailable = true;
        pmt.paymentMode(pmt.paymentMode);
        pmt.emiAvailability(pmt.isEMIAvailable);
    }
}
