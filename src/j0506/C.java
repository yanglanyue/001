package j0506;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Math相关方法
 */
public class C {
    public static void main(String[] args) {
        System.out.println(Math.ceil(4.3));//输入double类型，取入
        System.out.println(Math.floor(4.3));//输入double类型，取舍
        System.out.println(Math.pow(4, 3));//计算4的3次方
        for (int i=0;i<1;i++) {
            System.out.println(Math.random());//[0.0,1.0)范围随机数
            System.out.println(Math.random()*5+5);//[5.0,10.0)范围double类型随机数
            System.out.println((int)(Math.random()*5+5));//[5.0,10.0)范围整数随机数
            System.out.println((char)((int)(Math.random()*26+65)));//[A,Z)范围char随机数
            //2019-5-7
            System.out.println(Math.round(2.2789));//四舍五入

            BigDecimal d=new BigDecimal(13.673340939f);
            int dd=2;
            System.out.println(d.setScale(dd,BigDecimal.ROUND_HALF_UP));//四舍五入到第dd位

            String s1=5.41+"";//转换为字符串的最简单方法1
            String s2=Double.toString(5.41);//转换为字符串的方法2

            String s3="dangerous";
            System.out.println(s3.substring(3,6));//将字符串变成数组，截取从3位到第6位结束之前的那一位

            Math.round(Math.random()*(100-50)+50);//创建一个从50到100（不包含100）的随机数，公式：Math.round(Math.random()*(b-a)+a);
            Math.round(Math.random()*(100-50+1)+50);//创建一个从50到100（包含100）的随机数，公式：Math.round(Math.random()*(b-a+1)+a);

            Random s4=new Random();//伪方法
            int s4a=10;
            System.out.println(s4.nextInt(s4a));//伪方法产生s4a-1以内的随机数

            String s5="a"+"b"+"d"+"c"+"e";//字符连接，总共开了6个堆，a,b,d,c,e各一个堆，abdce一个堆
            StringBuffer s6=new StringBuffer();//（synchronized，串行，同步（同一时间只允许一个线程操作），速度慢，安全）生成一个字符串s6
            s6.append("a");//往字符串s6里依次添加a
            s6.append("b");
            s6.append("c");
            System.out.println(s6.capacity());//打印字符串s6的长度

            StringBuilder s7=new StringBuilder();//生成一个字符串s7（AbstractStringBuilder，并行，异步（同一时间多线程并行），速度快，相对不安全）
            s7.append(7);////往字符串s6里依次添加7

            System.out.println(s6.reverse());//将字符串倒叙排列

            //2019-5-9
            //将一个字符数组变成一个字符串
            char[] data={'a','b','c','d','e','f','g',};
            String s=new String(data);
            System.out.println(s);

            String a="ABC";
            String b=new String("ABC");//不让b和a同用一个堆，必须从新强制开堆
            String c="ABC";
            System.out.println(c==a);//判断栈的值是否一致，用==（全等）
            System.out.println(b.equals(a));//判断堆的值是否一致

            //2019-5-23(127:10)
            //equals的重写，在j0506新建class Animal

        }
    }
}
