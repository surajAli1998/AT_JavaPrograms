package day_18May2024.polymorphism.method_overriding;

public class Bike extends AutoMobile{
    /*
       @Override annotation denotes a particular method is overriding its superclass method.
        */
    @Override
    void milage(){
        int a = 65;
        System.out.println("Milage of bike is: "+a);
    }

    //we cant use override annotation for new child class methods like below
    //    @Override
    void engine(){
        System.out.println("125cc engine");
    }

//    @Override
//    void clutch(){
//        System.out.println("final method cant be overridden");
//    }

}
