package com.luv4code.number;

import java.util.*;

public class FindFrequencyInArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 30};
        findFrequency(arr);
    }

    public static void findFrequency(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
