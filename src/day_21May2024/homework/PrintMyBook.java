package day_21May2024.homework;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, int price){
        super(name, author, price);
        this.getDetails();
    }
    @Override
    void getDetails() {
        System.out.println(this.name+","+this.author+","+this.price);
    }

}
