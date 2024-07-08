package com.ddkzhanghao.leetcode;

import com.ddkzhanghao.util.ArrayUtils;

/**
 * 题目
 *  给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *      你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像
 *
 * 分析
 *  00->02, 01->12, 02->22
 *  10->01, 11->11, 12->21
 *  20->00, 21->10, 22->20
 *
 * 结论
 *  n = 3
 *  matrix[i][j] --> matrix[j][n-i-1]
 */
public class Quiz48 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayUtils.printArray(matrix); //原二维数组
        rotate(matrix); //转换
        System.out.println(); // 日志分割线
        ArrayUtils.printArray(matrix); //转换后二维数组
    }

    /**
     * 旋转
     */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]= matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }


}
