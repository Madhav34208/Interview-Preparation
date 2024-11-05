package com.luv4code.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        char firstNotRepeatedChar = findFirstNotRepeatedChar("madhav");
        System.out.println(firstNotRepeatedChar);
    }

    public static char findFirstNotRepeatedChar(String input){
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length()-1; i++) {
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }
            else
                map.put(chars[i],1);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character, Integer> entry:entries){
           if(entry.getValue() == 1){
               return entry.getKey();
           }
        }
        return '\0';
    }
}
