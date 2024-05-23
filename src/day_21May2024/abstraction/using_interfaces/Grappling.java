package day_21May2024.abstraction.using_interfaces;

public class Grappling extends Wrestling implements Boxing{

    @Override
    public void featherWeight() {
        System.out.println("This is feather weight grappling match");
    }

    // if a class implements an interface and overrides a method of it then the method must be public in this class
    @Override
    public void display() {
        super.display();
    }

    @Override
    public void ufc() {
        System.out.println("No 1 mma company in the world");
    }

    @Override
    public void one() {
        System.out.println("No 1 muai thai company in the world");
    }

    @Override
    void grecoRoman() {
        System.out.println("Greco roman wrestling style");
    }

}
