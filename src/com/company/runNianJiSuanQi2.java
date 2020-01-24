package com.company;

import java.util.Scanner;

public class runNianJiSuanQi2 {
    /**
     * 闰年计算器2.0
     */

    public static void main(String[] args) {

        Scanner YEAR = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = YEAR.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
