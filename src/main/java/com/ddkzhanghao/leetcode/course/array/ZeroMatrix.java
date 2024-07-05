package com.ddkzhanghao.leetcode.course.array;

import com.ddkzhanghao.util.ArrayUtils;

/**
 * 零矩阵
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 */
public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 1, 0},
                {4, 0, 1, 6},
                {7, 8, 1, 9}
//                {7, 8, 1, 9}
        };
        ArrayUtils.printArray(matrix);
        System.out.println();
        myZeroMatrix(matrix);
        ArrayUtils.printArray(matrix);
    }

    private static void zeroMatrix(int[][] matrix) {
        boolean[] row = new boolean[matrix.length]; //使用row和column来记录0元素的行和列位置
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] || column[j]) { //如果行或列位置有0元素，则直接替换
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void myZeroMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] rowb = new boolean[row];
        boolean[] columnb = new boolean[column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] ==0) {
                    rowb[i] = true;
                    columnb[j] = true;
                }
            }
        }
        for (int i = 0; i < rowb.length; i++) {
            for (int j = 0; j < columnb.length; j++) {
                if(rowb[i]||columnb[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
