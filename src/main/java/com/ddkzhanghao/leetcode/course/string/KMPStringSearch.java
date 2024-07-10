package com.ddkzhanghao.leetcode.course.string;

public class KMPStringSearch {

    /**
     *  计算模式串的next数组
     *
     *  P(4): a a b c
     *  j=8
     *  N(9): -1 0 0 0 0 0 1 2 3
     *  t=0
     *
     *
     */
    // 构造模式串 P 的 next 表
    private static int[] buildNext(String P) {
        int pSize = P.length(), j = 0;  // "主"串指针
        int[] N = new int[pSize];
        N[0] = -1;
        int t = -1; // 模式串指针

        while (j < pSize - 1) {
            if (t < 0 || P.charAt(j) == P.charAt(t)) { // 匹配
                j++;
                t++;
                N[j] = t; // 此句可改进为 N[j] = (P.charAt(j) != P.charAt(t) ? t : N[t]);
            } else { // 失配
                t = N[t];
            }
        }
        return N;
    }

    // KMP匹配过程
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();
        int[] N = buildNext(needle);

        int j = 0;  // 主串指针
        int k = 0;  // 模式串指针

        while (j < n) {
            if (k < 0 || haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
                if (k == m) {
                    return j - k;  // 找到匹配，返回起始下标
                }
            } else {
                k = N[k];
            }
        }

        return -1;  // 如果没有找到匹配项，返回-1
    }

    public static void main(String[] args) {
//        String haystack = "hello";
//        String needle = "ll";
//        System.out.println("The first match index: " + strStr(haystack, needle));  // 输出: 2
//
//        haystack = "aaaaa";
//        needle = "bba";
//        System.out.println("The first match index: " + strStr(haystack, needle));  // 输出: -1
        int[] ints = buildNext("aababa");
        System.out.println(ints);
    }
}
