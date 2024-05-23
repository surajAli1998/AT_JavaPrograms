package day_21May2024.abstraction.using_interfaces;

// all members are by default public in an interface

public interface MartialArts {

    //public, final, static keywords are not needed to mention, as the variables are by default final public and static
    public final static int noOfWeighClass = 8;

    // abstract keyword is by default applied to the methods and they are by default public
    void featherWeight();
    default void display(){
        System.out.println("This is featherweight championship");
    }
    static void rules(){
        System.out.println("The rules are same for all matches");
    }

}
