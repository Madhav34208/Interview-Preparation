package com.luv4code.arrays;

import java.util.Arrays;

public class SortArrayDesc {
    public static void main(String[] args) {
        sortArrayDesc(new int[]{1, 2, 3,23,21, 4});
    }

    public static void sortArrayDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int largeNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = largeNumber;
        }
        System.out.println("Sorting an Array by Desc Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
