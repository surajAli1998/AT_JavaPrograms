package day_01June2024.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("mango",5);
        map.put("apple",3);
        map.put("orange",7);
        map.put("banana",8);
        System.out.println(map);
        for(Map.Entry<String,Integer> set:map.entrySet()){
            System.out.println(set.getKey()+" -> "+set.getValue());
        }

        Map<Object, Object> map2 = new LinkedHashMap<>();
        map2.put("suraj",23);
        map2.put(12,45);
        map2.put(true,23);
        map2.put(null,null);
        System.out.println(map2);
    }
}
