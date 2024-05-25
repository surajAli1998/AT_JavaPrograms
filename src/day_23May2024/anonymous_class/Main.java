package day_23May2024.anonymous_class;
public class Main {
    public static void main(String[] args) {

        // This is how we can call an abstract class, this is called anonymous class. Basically we are
        // creating an object and class in a single go and overriding the abstract member.
        AnonymousClass an1 = new AnonymousClass() {
            @Override
            void fun1() {
                System.out.println("This is anonymous class with abstract class");
            }
        };
        an1.fun1();

        // Similarly we can do for interfaces as well
        IE i1 = new IE() {
            @Override
            public void fun2() {
                System.out.println("This is anonymous class with interface");
            }
        };
        i1.fun2();
    }
}

abstract class AnonymousClass{
    abstract void fun1();
}

interface IE{
    void fun2();
}