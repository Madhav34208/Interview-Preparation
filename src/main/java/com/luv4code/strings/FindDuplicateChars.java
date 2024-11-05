package com.luv4code.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateChars {
    public static void main(String[] args) {
        findDuplicateChars("programming");
    }

    public static void findDuplicateChars(String input) {
        char[] ch = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i]))
                map.put(ch[i],map.get(ch[i])+1);
            else
                map.put(ch[i],1);
        }
        boolean hasDuplicates = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
                hasDuplicates = true;
            }
        }
        if(!hasDuplicates)
            System.out.println("No Duplicates");
    }
}
