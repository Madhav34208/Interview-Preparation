package com.luv4code.numbers;

public class NumberManipulation {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    /*
    Print fibonacci series
    input : 5
    output: 0 1 1 2 3
     */
    public static void printFibonacci(int input){
        int n1 = 0;
        int n2 = 1;
        int counter = 0;

        while(counter < input){
            System.out.print(n1 +" ");
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            counter++;
        }
    }

    /*
    count the no of digits in a number
    input : 1234
    output : 4
     */

    public static int countNoOfDigits(int input) {
        int count = 0;
        int temp = 1;

        while (temp <= input) {
            temp *= 10;
            count += 1;
        }
        return count;
    }

    public static int countNoOfDigitsUsingStringFunctions(int input) {
        return String.valueOf(input).toString().length();
    }

    /*
    Check given number is armstrong or not
    input : 153
    output : true / false
    153 (1*3 + 5*3 + 3*3)
    input length 3
     */

    public static boolean checkArmstrong(int input) {

        int sum = 0;
        int len = countDigit(input);
        int noOfDigits = String.valueOf(input).toString().length();
        int temp = input;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }
        System.out.println(sum);
        if (sum == input)
            return true;
        return false;
    }

    public static int countDigit(int input) {
        int count = 0;
        int temp = 1;
        while (temp <= input) {
            temp *= 10;
            count += 1;
        }
        return count;
    }

    /*
    Find Prime Numbers between 1 - 100
     */

    public static void printPrimeNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (isPrime(i))
                System.out.println(i + " is prime number");
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

    /*
    Reverse Number
    input : 123
    output : 321
     */
    public static int reverseNumber(int input) {
        int reverseNumber = 0;
        while (input != 0) {
            int remainder = input % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            input /= 10;
        }
        return reverseNumber;
    }

    public static int reverseNumberRec(int input, int reversed) {
        if (input == 0)
            return reversed;
        int digit = input % 10;
        reversed = reversed * 10 + digit;
        return reverseNumberRec(input / 10, reversed);
    }

    public static int reverseNumberBuilder(int input) {
        String builder = new StringBuilder(String.valueOf(input)).reverse().toString();
        return Integer.parseInt(builder);
    }

    /*
    Sum of Natural Numbers
    input : 5
    output : 5+4+3+2+1=15
     */
    public static int sumOfNaturalNumbersUsingForLoop(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++)
            sum += i;
        return sum;
    }

    public static int sumOfNaturalNumbersWithoutUsingForLoop(int input) {
        return input * (input + 1) / 2;
    }

    /*
    Find Factorial of given number
    input : 5
    output : 5*4*3*2*1=120
     */
    public static int findFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++)
            factorial *= i;
        return factorial;
    }

    public static int findFactorialRec(int num) {
        if (num == 1)
            return 1;
        return num * findFactorial(num - 1);
    }
}
