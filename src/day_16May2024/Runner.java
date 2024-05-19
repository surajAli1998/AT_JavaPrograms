package day_16May2024;

public class Runner {
    public static void main(String[] args) {

        Child ch1 = new Child();
        System.out.println(ch1.a+" "+ch1.b+" "+ch1.c);

        System.out.println();

        Parent p1 = new Parent();
        System.out.println(p1.a+" "+p1.b);

        System.out.println();

        GrandParent gp1 = new GrandParent();
        System.out.println(gp1.a);

        System.out.println();


        //Dynamic dispatch or parent referencing child
        /*
        In case of dynamic dispatch
         */
        /*
        In this case even though obj is created of class Child, we cant access Child class elements. Because by the
        rule ch2 obj is referenced by parent class which is Parent, so it will have only access to the Parent items.
        Also ch2 can access the GrandPrent items as the Parent is child of GrandParent class.
         */

        Parent ch2 = new Child();
        System.out.println(ch2.a+" "+ch2.b+" "+ch2.x);

        System.out.println();

        /*
         in this case ch3 can access only GrandParent's items because ch3 has reference type of GrandParent
         */
        GrandParent ch3 = new Child();
        System.out.println(ch3.a);

        System.out.println();

        /*
        Similarly in this case also p2 is being referenced by GrandParent class, hence it can only access
        GrandParent's items.
         */
        GrandParent p2 = new Parent();
        System.out.println(p2.a);

    }
}
