package com.luv4code.leetcode;

import java.util.Arrays;

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        int[] resultArr;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target == arr[i]+arr[j])
                    return new int[]{i,j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(twoSum));
    }
}
