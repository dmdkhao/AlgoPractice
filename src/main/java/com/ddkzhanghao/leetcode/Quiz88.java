package com.ddkzhanghao.leetcode;

import java.util.Arrays;

public class Quiz88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = nums1.length-1;
        while(n>0) {
            if (m>0 && nums1[m-1]>nums2[n-1]) {
                nums1[j--] = nums1[m-1];
                m--;
            }else {
                nums1[j--] = nums2[n-1];
                n--;
            }
        }
    }
}
