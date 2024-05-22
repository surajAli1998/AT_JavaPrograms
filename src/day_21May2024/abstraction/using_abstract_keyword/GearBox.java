package day_21May2024.abstraction.using_abstract_keyword;

abstract class GearBox extends Engine{

    @Override
    void capacity() {
        System.out.println("Engine capacity is 300cc");
    }

    @Override
    void type() {
        System.out.println("Petrol car");
    }

    abstract void gearPattern();
}
