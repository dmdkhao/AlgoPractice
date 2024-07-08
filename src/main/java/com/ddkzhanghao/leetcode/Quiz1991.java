package com.ddkzhanghao.leetcode;

/**
 * 1991. 找到数组的中间位置
 */
public class Quiz1991 {
    public static void main(String[] args) {
        int[] array = {2,3,-1,8,4};
        int middleIndex = findMiddleIndex(array);
        System.out.println(middleIndex);
    }

    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int left = 0;
        for(int i = 0; i < nums.length; i++) {
            if(left *2+nums[i] == sum) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

}
