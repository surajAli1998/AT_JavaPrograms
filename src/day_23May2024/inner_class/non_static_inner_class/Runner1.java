package day_23May2024.inner_class.non_static_inner_class;

public class Runner1 {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki");
        c1.drive();

        // This is how we initialize a nonstatic inner class object
        // so basically without creating an object of outer class we cannot access inner class
        Car.Engine e1 = c1.new Engine("1200cc");
        System.out.println("The power of this car is: "+e1.horsePower);
        e1.start();
    }
}

class Car{
    String make;
    public Car(String make){
        this.make = make;
    }

    void drive(){
        System.out.println("You can drive the car");
    }

    class Engine{
        String horsePower;
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        public void start(){
            System.out.println("Engine started: "+make);
        }
    }

}
