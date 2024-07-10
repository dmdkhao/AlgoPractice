package com.ddkzhanghao.leetcode.course.string;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle) {
        int[] next = new int[needle.length()];
        buildNext(needle,next);
        int j=0,t=0;
        while(j<haystack.length()) {
            if (t<0||haystack.charAt(j) == needle.charAt(t)) {
                t++;j++;
                if (t == needle.length()) {
                    return j-t;//index+1 = position
                }
            }else {
                t = next[t];
            }
        }


        return -1;
    }

    public static void buildNext(String needle, int[] next) {
        int t = -1;
        next[0]=-1;
        int j=0;
        while(j<needle.length()-1) {
            if(t<0 || needle.charAt(t)==needle.charAt(j)) {
                t++;j++;
                next[j] = t;
            }else {
                t = next[t];
            }
        }
    }


}
