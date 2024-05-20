package day_18May2024;

/**
If child class is having a default constructor, then by default it will call parent class default constructor.
Now regarding this above statement there are 2 observations:

1) If the parent class dosent have any constructors then it dosent show error at compile time if we have default
constructor or any other type of constructors in child class.

2) But if the parent class has only parameterized constructor and child class has a default constructor then its
 mandatory for parent class to have a default constructor.
**/

public class SuperWithConstructer {
    public static void main(String[] args) {
//        Student st1 = new Student();
        Student st2 = new Student(70);
//        Student st3 = new Student(60);

        Student st4 = new Student(st2);
    }

}

class Person {
    String name;
    int height;


    // default constructor
    Person(){
        System.out.println("Parent class DC");
    }
//
    // parameterized constructor
    Person(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("Parent class parameterized constructor");
    }

    Person(Person other){
        this.name = other.name;
        this.height = other.height;
        System.out.println("Parent");
    }

}

class Student extends Person {
    int weight;

    //default constructor
    Student(){
        //super();
        System.out.println("Child class DC");
    }

    // parameterized constructor
    Student(int weight) {
        super("Suraj",5);
        this.weight = weight;
        System.out.println("Child class parameterized constructor");
        System.out.println(super.name+" has height "+super.height+" and weight "+this.weight);
    }

    Student(Student student) {
        super(student);
        this.weight = student.weight;
        System.out.println("child");
        System.out.println(super.name+" has height "+super.height+" and weight "+this.weight);
    }

}

