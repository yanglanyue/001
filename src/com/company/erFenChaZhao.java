package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class erFenChaZhao {
    /**
     * 二分查找法
     */

    public static void main(String[] args) {
        int[] arrayA = {81, 1, 54, 21, 55, 6, 199, 32, 4, 89, 51, 10, 29, 101, 7, 78, 44};
        Arrays.sort(arrayA);
        Scanner x = new Scanner(System.in);
        System.out.println("请输入你要查找的数：");
        int X = x.nextInt();
        int a=erFen(X, arrayA);
        int b=arrayA.length;
        int c=0;
        while (b-1>0){
            System.out.printf(String.valueOf(arrayA[c])+"、");
            c++;
            b--;
        }
        if(a==-1){
            System.out.println("次数字不在该数组中");
        }else {
            System.out.println("该数字排在第" + (a+1) + "个");
        }
    }

    public static int erFen(int X, int[] arrayA) {
        int a = 0;
        int z = arrayA.length - 1;

        while (a <= z) {
            int mid = (a + z) / 2;
            if (X < arrayA[mid]) {
                z = mid - 1;
            } else if (X > arrayA[mid]) {
                a = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}



