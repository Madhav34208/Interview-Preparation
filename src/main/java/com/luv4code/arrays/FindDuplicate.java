package com.luv4code.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 2};
        List<Integer> integerList = findDuplicate(arr);
        System.out.println(integerList);
    }

    public static List<Integer> findDuplicate(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] & !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
