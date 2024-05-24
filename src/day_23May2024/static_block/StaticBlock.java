package day_23May2024.static_block;

public class StaticBlock {
    static int a = 12;
    static int b;

    //  static block will be called only one time when class will be first time instantiated
    static{
        b = a*5;
        System.out.println("This is the static block");
    }

    // IIB will run every time object is created
    {
        System.out.println("This is Instance Initialization Block or IIB");
    }

    public static void main(String[] args) {
//      this is the first time when class is loaded and that's why static block will be called
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
