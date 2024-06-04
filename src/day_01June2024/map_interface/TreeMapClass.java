package day_01June2024.map_interface;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Object, Object> tm = new TreeMap<>();
        tm.put("suraj",12);
        tm.put("price",null);
        tm.put("Expensive",true);

        // treemap dosent allow null key
//        tm.put(null,null);

        // tree map only supports similar type of key objects
//        tm.put(100,12);
//        tm.put(true,12);
        System.out.println(tm);
    }
}
