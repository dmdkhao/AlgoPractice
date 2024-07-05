package com.ddkzhanghao.leetcode.course.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 合并区间 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);

        System.out.println("合并后的区间：");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        //first interval
        int[] endInterval = intervals[0];
        merged.add(endInterval);
        for (int[] interval : intervals) {
            int endIntervalRight = endInterval[1];
            int left = interval[0];
            int right = interval[1];
            if (left <= endIntervalRight) {
                endInterval[1] = Math.max(endIntervalRight, right);
            } else {
                merged.add(interval);
                endInterval = interval;
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
