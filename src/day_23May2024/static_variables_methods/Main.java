package day_23May2024.static_variables_methods;

public class Main {
    public static void main(String[] args) {

        Human suraj = new Human(25,"suraj",27000,false);
        Human karar = new Human(24,"karar",30000,false);

        //accessing static variable using class name
        System.out.println(Human.population);

//      we can not call a non-static element from a static entity
//      greet();

//      Accessing static method using class name or only using method name
//      below both method invoking style are fine, as invoke is a static method
        Main.invoke();


        /**
         * In below case no object is created. Only m2 reference is pointing to null. In such cases we cant access
         * non static methods or variables using m2, beacuse there no actual object created to access those.
         * But we can access stating method like invoke via m2, as the statuc elements are already loaded when the
         * class is loaded.
         */
        Main m2 = null;
        m2.invoke();

    }

    static void invoke(){
//      as invoke method is a static context so we cant invoke a non static method from static context
//      greet();

//      we have to invoke non static greet method by creating an object of Main class because its non static.
//      Hence creating an obj of class Main and then accessing greet()
        Main m = new Main();
        m.fun();
    }

    void fun(){
//      Here we can call non-static greet from non-static fun method because at the end both need an obj
        greet();
    }

    void greet(){
        System.out.println("Hello good morning");
    }

}
