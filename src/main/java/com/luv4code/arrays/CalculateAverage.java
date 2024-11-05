package com.luv4code.arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);
    }
}
