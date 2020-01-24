package com.company;

import java.util.Scanner;

public class ChengJiFenZu {
    /**
     * 成绩分组1.0
     */
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("请输入分数：");
        int a = A.nextInt();

        if (0 <= a && a <= 100) {
            A(a);
        } else {
            System.out.println("撒谎！放学后留下来做清洁！");
        }
    }

    static void A(int a) {
        switch (a / 10) {
            case 0:
            case 1:
                System.out.println("到教务处办理留级手续");
                break;
            case 2:
            case 3:
                System.out.println("假期作业写五遍");
                break;
            case 4:
            case 5:
                System.out.println("假期作业写三遍");
                break;
            case 6:
            case 7:
                System.out.println("假期作业全做");
                break;
            case 8:
            case 9:
                System.out.println("假期作业选做");
                break;
            case 10:
                System.out.println("假期无作业");
                break;
        }
    }
}
