package com.luv4code.number;

public class CheckPalindrome {
    public static void main(String[] args) {
        int remainder=0, reversedNumber = 0;
        int num = 5005;
        int temp = num;

        while(num > 0){
            remainder = num % 10;
            reversedNumber = (reversedNumber*10) + remainder;
            num /= 10;
        }
        if(temp == reversedNumber)
            System.out.println("The Number is Palindrome");
        else
            System.out.println("The Number is not a Palindrome");
    }
}
