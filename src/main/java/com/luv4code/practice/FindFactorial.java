package com.luv4code.practice;

public class FindFactorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorialRec(n);
        System.out.println(fact);
    }

    private static int factorialRec(int n){
        if(n == 0)
            return 1;
        return  n * factorialRec(n-1);
    }

    private static void extracted(int n) {
        int factorial = 1;
        for(int i = 1; i<= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
