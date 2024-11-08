package com.luv4code.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long reversed = 0;
        int y = x;
        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;

    }

    /*
    Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
}
