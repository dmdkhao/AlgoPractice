package com.ddkzhanghao.leetcode.course.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class 最长公共前缀 {
    public static void main(String[] args) {
//        String[] strArray = {"flxower", "flxow", "flxight"};
//        String[] strArray = {"flxower", "flxow", "flxight","a"};
        String[] strArray = {"flower", "flower", "flower", "flower"};
        String s = longestCommonPrefix2(strArray);
        System.out.println(s);

//        String str = "zxcvb";
//        String prefix = "zxcvbn";
//        System.out.println(str.indexOf(prefix));

    }

    public static String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < prefix.length() && j < strs[i].length(); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
            if (prefix == "") {
                return prefix;
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {
        // 如果数组为空，返回空字符串
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 初始化前缀为第一个字符串
        String prefix = strs[0];

        // 遍历数组中的每个字符串
        for (int i = 1; i < strs.length; i++) {
            // 更新前缀为当前字符串和前缀的公共部分
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // 如果前缀被缩短为空，返回空字符串
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

}
