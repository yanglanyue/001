package com.company;
/**
 * 字符串转换为ASCII
 */

import java.util.Scanner;

public class stringToAscii {

    public static void main(String[] args) {
        System.out.println("请输入需要转换的字符或字符串：");
        Scanner A = new Scanner(System.in);
        String a = A.next();
        System.out.println(stringToAscii(a));
    }

    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                sbu.append((int) chars[i]).append(",");
            } else {
                sbu.append((int) chars[i]);
            }
        }
        return sbu.toString();
    }
}
