package com.luv4code.number;

import java.util.Arrays;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        findSecondLargestNumber(new int[]{34, 12, 65, 78, 23, 45, 12, 78, 78, 78, 78});
    }

    public static void findSecondLargestNumber(int[] arr) {
        int size = arr.length;
        if (size < 2) {
            System.out.println("Invalid Input");
            return;
        }
        Arrays.sort(arr);
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[size - 1]) {
                System.out.println("The Second Largest No: " + arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest number");


    }
}
