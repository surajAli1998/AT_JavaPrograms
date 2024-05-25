package day_23May2024.inner_class.static_inner_class;

public class Runner3 {
    public static void main(String[] args) {
        OuterClass1 oc1 = new OuterClass1();

        //in case of static inner class, we don't need any object created for outer class
        OuterClass1.InnerClass1 ic1 = new OuterClass1.InnerClass1();
        ic1.display();
    }
}

class OuterClass1{
    static int x = 12;
    int y = 23;
    static class InnerClass1{
        void display(){
            System.out.println(x);

            // as the inner class is static we cannot access outer class not static elements
//            System.out.println(y);
        }
    }
}