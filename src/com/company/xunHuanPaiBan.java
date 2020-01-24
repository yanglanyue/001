package com.company;

import java.util.Scanner;

public class xunHuanPaiBan {
    public static void main(String[] args) {
        System.out.println("请输入需要输出的字符或字符串：");
        Scanner A = new Scanner(System.in);
        String a = A.next();

        System.out.println("请输入行数：");
        Scanner B = new Scanner(System.in);
        int b = B.nextInt();

        System.out.println("请输入列数：");
        Scanner C = new Scanner(System.in);
        int c = C.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
