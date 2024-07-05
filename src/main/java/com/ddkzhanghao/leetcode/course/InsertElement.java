package com.ddkzhanghao.leetcode.course;

/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 * 作者：LeetCode
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class InsertElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert2(nums, 3));
//        System.out.println(3+(5-3)/2);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 二分法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert2(int[] nums, int target) {
        int left = 0;//3
        int right = nums.length;//5
        while (left <= right) {
            int mid = left + (right-left)/ 2;//2
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid-1;
            }
            if (target > nums[mid]) {
                left = mid+1;
            }
        }
        return left;
    }
}
