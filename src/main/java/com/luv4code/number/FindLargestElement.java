package com.luv4code.number;

public class FindLargestElement {
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{4, 7, 2, 8, 56, 12, 14, 12}));
    }

    private static int largestElement(int[] num) {
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }
}
