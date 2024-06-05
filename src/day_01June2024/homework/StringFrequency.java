package day_01June2024.homework;

/**
 * To find the strings which are repeated and to print those only
 */

import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
        String[] arr = {"aa","aba","aa","bc","aba","bc","df"};
        List<String> ans = new ArrayList<>();
        Map<String,Integer> hmap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hmap.put(arr[i],hmap.get(arr[i])==null?1:hmap.get(arr[i])+1);
        }
        int i = 0;
        for(String str:hmap.keySet()){
            if(hmap.get(str)>1){
                ans.add(String.valueOf(str));
            }
        }
        System.out.println(ans);
    }
}
