package com.luv4code.arrays;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {89, 34, 102, 15, 23,};
        System.out.println(findLargestNumber(arr));
    }

    public static int findLargestNumber(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        return largest;
    }
}
