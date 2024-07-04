package com.ddkzhanghao;

public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println(josephus(11,3));
        System.out.println(josephusForward(11,3));
    }


    /**
     * 约瑟夫问题
     * index = f(n,m)
     * f(10,3) = (f(9,3)+3)%10
     * f(9,3) = (f(8,3)+3)%9
     * <p>
     * f(2,3) = (f(1,3)+3)%2
     * f(1,3) = 0
     * <p>
     * 补充：取模运算%可以视为”在列表中循环遍历获取指定次数元素的位置“。
     *  例如：列表元素个数3，列表首尾相接获取第5个元素的位置：1 2 3
     *  5%3=2 (第2个)
     *
     * @param n 人总数
     * @param m 步长
     */
    public static int josephus(int n, int m) {
        if (n == 0) {
            return 0;
        }
        return (josephus(n - 1, m) + m) % n;
    }
    public static int josephusForward(int n, int m) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
