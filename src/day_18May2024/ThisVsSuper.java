package day_18May2024;

public class ThisVsSuper {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
//        System.out.println(c1.topSpeed);
        c1.display();
        c1.superDisplay();

        Vehicle c2 = new Car();
        c2.display();
    }
}

class Vehicle{
    int topSpeed = 100;
    void display(){
        System.out.println("This is Vehicle class");
    }
}

class Car extends Vehicle{
    int topSpeed = 120;
    void display(){
        System.out.println("This is Car class");
        System.out.println("Max speed of this car is: "+this.topSpeed);
        super.display();
        System.out.println("Max speed of vehicle is: "+super.topSpeed);
    }

    void superDisplay(){
        super.display();
        System.out.println("Max speed of vehicle is: "+super.topSpeed);
    }

}