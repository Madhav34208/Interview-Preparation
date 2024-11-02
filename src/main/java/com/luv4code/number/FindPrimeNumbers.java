package com.luv4code.number;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(isPrime(i))
                System.out.println(i+" is a Prime Number");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
