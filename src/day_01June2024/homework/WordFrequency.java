package day_01June2024.homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "hello world hello";
        wordFrequencyCounter(str);
    }

    private static void wordFrequencyCounter(String str) {
        String[] arr = str.split(" ");
        Map<String,Integer> hmap = new LinkedHashMap<>();
        for(String s:arr){
            hmap.put(s,hmap.get(s)==null?1:hmap.get(s)+1);
        }
        System.out.println(hmap);
    }

}
