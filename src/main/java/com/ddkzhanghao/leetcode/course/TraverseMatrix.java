package com.ddkzhanghao.leetcode.course;

import java.util.ArrayList;
import java.util.List;

/**
 * 对角线遍历
 *  给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 */
public class TraverseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] ints = traverseMatrix(matrix);
        System.out.println(ints);
    }

    private static int[] traverseMatrix(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // 初始化结果集
        for (int n = 0; n < (rowLength + columnLength) - 1; n++) {
            res.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if ((i + j) % 2 != 0) {
                    // 偶数次，正序
                    res.get(i + j).add(matrix[i][j]);
                } else {
                    // 奇数次，倒序
                    res.get(i + j).add(0, matrix[i][j]);
                }
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (List<Integer> r : res) {
            result.addAll(r);
        }
        int[] array = result.stream().mapToInt(i -> i).toArray();
        return array;
    }
}
