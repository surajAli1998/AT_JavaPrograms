package day_18May2024.polymorphism.method_overriding;

public class AutoMobile {
    void milage(){
        System.out.println("This is milage of an automobile");
    }

    /*
    final methods cant be overridden. in normal overriding java will decide which method to call in run time,
    that's why its also called late binding.
    But in case of final method, as it cant be overridden further so in compile time itself java is calling the
    final method only, this is called early binding.
     */
    final void clutch(){
        System.out.println("Clutch is a mandatory part");
    }

}
