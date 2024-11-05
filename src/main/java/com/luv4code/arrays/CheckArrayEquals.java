package com.luv4code.arrays;

import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 4, 3, 5};

        System.out.println(checkArraysEqualMismatch(arr1, arr2));
        System.out.println(checkArraysEqualMismatch(arr1, arr3));
    }

    public static boolean checkArraysEqualArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static int checkArraysEqualMismatch(int[] arr1, int[] arr2){
        return Arrays.mismatch(arr1, arr2);
    }

    public static boolean checkArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
