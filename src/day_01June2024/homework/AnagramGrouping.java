package day_01June2024.homework;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("eat");
        ls.add("ate");
        ls.add("tea");
        ls.add("tan");
        ls.add("bat");
        ls.add("nat");
        List<List<String>> ans = groupAnagramWords(ls);
        System.out.println(ans);
    }

    static List<List<String>> groupAnagramWords(List<String> ls){
        Map<String,List<String>> hmap = new LinkedHashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String str:ls){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if(!hmap.containsKey(sortedWord)){
                hmap.put(sortedWord,new ArrayList<>());
            }
            hmap.get(sortedWord).add(str);
        }
        for(List<String> list:hmap.values()){
            ans.add(list);
        }
        return ans;
    }
}
