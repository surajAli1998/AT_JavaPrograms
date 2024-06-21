package day_18May2024;

public class ConstructorChaining {
    public static void main(String[] args) {
        Dog d1 = new Dog("Labrador",3,"Black");
    }
}

class Dog {
    String breed;
    int age;
    String color;

    Dog(){
        System.out.println("Default constructor");
    }

    Dog(String breed, int age) {
        this();
        this.breed = breed;
        this.age = age;
        System.out.println("Constructor with 2 parameters");
    }

    Dog(String breed, int age, String color) {
        this(breed,age);
        this.color = color;
        System.out.println("Constructor with 3 parameters");
    }

}
