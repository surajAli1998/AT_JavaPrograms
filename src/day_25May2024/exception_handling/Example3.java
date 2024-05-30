package day_25May2024.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example3 {
    public static void main(String[] args) throws FileNotFoundException {
        Example3.method1("file1");
    }

    public static void method1(String filename) throws FileNotFoundException {
        int a = 10/10;
        int c = 0;
        FileReader f = new FileReader(new File("c://file.txt"));
    }
}
