package day_21May2024.homework;

public abstract class Book {
    String name;
    String author;
    int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
