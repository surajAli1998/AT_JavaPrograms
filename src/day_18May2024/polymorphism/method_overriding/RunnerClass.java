package day_18May2024.polymorphism.method_overriding;

/**
In overriding the function definition should be exactly same only function body will be  different.
Object type will determine which method to invoke internally.

for example below in 13th line am2 obj is being parent referenced but am2 is of type Bike class and
that's why its calling Bike class's milage method. This is called upcasting. And this is how overriding
works.

So basically the obj reference type will determine which item the obj can access from base class
and actual obj type will determine which one to invoke in actual time.

In compile time am2.milage() will only indicate that it will access parent class milage method. But
in runtime when the code actually runs that time java will invoke child class method and hence its called
dynamic or run time polymorphism.
**/

public class RunnerClass {
    public static void main(String[] args) {
        AutoMobile am = new AutoMobile();
        Bike b1 = new Bike();
        AutoMobile am2 = new Bike();
        am.milage();
        b1.milage();
        am2.milage();

    }
}


