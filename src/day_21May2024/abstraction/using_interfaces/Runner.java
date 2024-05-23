package day_21May2024.abstraction.using_interfaces;

public class Runner {
    public static void main(String[] args) {
        Grappling gp1 = new Grappling();
        gp1.display();
        gp1.featherWeight();
        gp1.one();
        gp1.ufc();
        gp1.grecoRoman();

        MartialArts.rules();
        System.out.println("No of weight classes are: "+MartialArts.noOfWeighClass);
    }
}
