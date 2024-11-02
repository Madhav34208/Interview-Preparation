package com.luv4code.number;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(factorialRec(6));
    }

    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRec(int n){
        if(n == 0){
            return 1;
        }else {
            return n * factorialRec(n-1);
        }
    }
}
