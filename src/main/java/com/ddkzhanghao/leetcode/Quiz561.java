package com.ddkzhanghao.leetcode;

import java.util.Arrays;

/**
 * 数组拆分 I
 */
public class Quiz561 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i<nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }

}
