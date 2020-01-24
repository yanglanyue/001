package com.company;

public class RunNianJiSuanQi {
    /**
     * 闰年计算器1.0
     */
    public static void main (String[] args) {

        int a = 1964;

//        a%4==0?true:false;

        System.out.println(a%4==0&a%100!=0|a%400==0?a+"是闰年":a+"不是闰年");
//        System.out.println(a+"是闰年");

    }
}
