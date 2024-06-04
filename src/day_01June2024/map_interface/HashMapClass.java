package day_01June2024.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("suraj",3);
        map.put("Karar",5);
        map.put("patwa",14);
        map.put("trigu",25);
        System.out.println(map);
        // iterating through the hash map
        for(Map.Entry<String, Integer> set:map.entrySet()){
            System.out.println(set.getKey()+" -> "+set.getValue());
        }
    }
}
