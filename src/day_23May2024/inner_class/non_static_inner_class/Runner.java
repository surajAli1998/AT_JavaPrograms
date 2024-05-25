package day_23May2024.inner_class.non_static_inner_class;

public class Runner {
    public static void main(String[] args) {
        OuterClass oc1 = new OuterClass();
    }
}

class OuterClass{
    int a = 10;
    class InnerClass{
        void fun1(){
            System.out.println("This is inner class and a = "+a);
        }
    }

}
