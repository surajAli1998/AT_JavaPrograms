package day_21May2024.abstraction.using_interfaces;

public interface Boxing extends MartialArts, MMA{

    default void featherWeight(){
        System.out.println("This is a feather weight boxing match");
    }

}
