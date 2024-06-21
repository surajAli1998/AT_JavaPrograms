package day_21June2024_restAssured;

// This is called no design pattern

public class NoDesignPattern {
    public void step1(){
        System.out.println("step 1");
    }

    public void step2(){
        System.out.println("step 2");
    }

    public void step3(){
        System.out.println("step 3");
    }

    public static void main(String[] args) {
        NoDesignPattern ndp = new NoDesignPattern();
        ndp.step1();
        ndp.step2();
        ndp.step3();
    }
}
