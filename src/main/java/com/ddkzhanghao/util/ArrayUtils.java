package com.ddkzhanghao.util;

public class ArrayUtils {

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] column = matrix[i];
            for (int j = 0; j < column.length; j++) {
                System.out.print(column[j]);
            }
            System.out.println();
        }
    }
}
