package com.ddkzhanghao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Review {
    public static void main(String args[]) {
        System.out.println(josephusForward(11,3));
    }

    public static int josephusForward(int count, int target) {
        if (count == 1) {
            return 0;
        }
        return (josephusForward(count-1, target)+target)%count;

    }

    public void testGetList() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] list = getList(matrix);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(list);
    }

    public static int[] getList(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        int length = matrix.length;
        for (int i = 0; i < length + matrix[0].length; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    res.get(i + j).add(0, matrix[i][j]);
                } else {
                    res.get(i + j).add(matrix[i][j]);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        res.forEach(t -> result.addAll(t));
        int[] array = result.stream().mapToInt(i -> i).toArray();
        return array;

    }
}
