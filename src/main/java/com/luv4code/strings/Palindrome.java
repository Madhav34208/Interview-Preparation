package com.luv4code.strings;

public class Palindrome {
    public static void main(String[] args) {
        String input = "level";
/*        boolean isPalindrome = palindromeRec(input, 0, input.length() - 1);
        System.out.println(isPalindrome);*/
       /* boolean isPalindrome = palindromeStrBldr(input);
        System.out.println(isPalindrome);*/
        boolean isPalindrome = palindromeForLoop(input);
        System.out.println(isPalindrome);
    }

    public static boolean palindromeForLoop(String input) {
        char[] ch = input.toCharArray();
        String reverse ="";
        for (int i = ch.length-1; i >= 0; i--) {
            reverse +=ch[i];
        }
        if(input.equals(reverse))
            return true;
        return false;
    }

    public static boolean palindromeStrBldr(String input) {
        String reverseInput = new StringBuilder(input).reverse().toString();
        if (input.equals(reverseInput))
            return true;
        else
            return false;
    }

    public static boolean palindromeRec(String input, int left, int right) {
        if (left >= right)
            return true;
        if (input.charAt(left) != input.charAt(right))
            return false;
        return palindromeRec(input, left + 1, right - 1);
    }
}
