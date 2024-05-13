package day_11May2024;

public class Runner {
    public static void main(String[] args) {
        Course c = new Course();
        c.greet();
        c.courseFee = 10000;
        c.fee(c.courseFee);
        c.courseDuration = 4;
        c.duration(c.courseDuration);
        c.courseLanguage = "English";
        System.out.println("The course language is: "+c.courseLanguage);
        c.isSessionRecorded = true;
        c.liveOrRecorded(c.isSessionRecorded);

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
