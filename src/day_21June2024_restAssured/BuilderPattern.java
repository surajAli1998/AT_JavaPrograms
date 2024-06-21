package day_21June2024_restAssured;

public class BuilderPattern {
    String name;
    public BuilderPattern step1(String name){
        this.name = name;
        System.out.println(this.name+" has completed step 1");
        return this;
    }

    public BuilderPattern step2(String name){
        this.name = name;
        System.out.println(this.name+" has completed step 2");
        return this;
    }

    public BuilderPattern step3(){
        System.out.println("step 3 completed");
        return this;
    }

    public static void main(String[] args) {
        BuilderPattern bp = new BuilderPattern();
        bp.step1("Suraj").step2("Karar").step3();
    }
}
