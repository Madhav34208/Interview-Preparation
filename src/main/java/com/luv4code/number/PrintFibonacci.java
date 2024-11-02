package com.luv4code.number;

public class PrintFibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n) {
        int num1 = 0, num2 = 1;
        int counter = 0;

        while(counter < n){
            System.out.print(num1+" ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
        }
    }
}
