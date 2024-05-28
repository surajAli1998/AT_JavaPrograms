package day_25May2024.enums;

public class EnumClass {
    public static void main(String[] args) {

        //This way we can access enum elements
//        WeekDays wk = WeekDays.TUESDAY;
//        System.out.println("This is: "+wk);

        for(WeekDays week:WeekDays.values()){
            System.out.println(week);
        }
    }
}

enum WeekDays{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}
