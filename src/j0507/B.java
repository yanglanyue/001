package j0507;
/*
*
* printf()：格式化输出
* */
public class B {

    public static void main(String[] args) {
        //分割
        String a="a=b=c";
        String [] b=a.split("=");
        for (String A:b) {
            System.out.print(A+"--");
        }

        /*
        * .toUpperCase()：转大写
        * .toLowerCase()：转小写
        * */
        System.out.println();
        String a1="abcdefGHijk";
        System.out.println(a1.toUpperCase());
        System.out.println(a1.toLowerCase());

        /*
        * .subString()：返回特定范围内的字符
        * */
        String a2="abcdefGHijk";
        System.out.println(a1.substring(2,8));

        /*
        * printf()：格式化输出
        * \n表示换行
        * */
        double d=345.678;
        String s="你好！";
        int i=1234;
        String ss="\n";
        System.out.printf("%f\n",d);//"f"表示格式化输出浮点数，小数点后保留6位数，并且遵循四舍五入进位。输出结果：345.678000
        System.out.printf("%9.2f\n",d);//"9"表示输出长度，2表示小数点后的位数，并且遵循四舍五入进位。输出结果：   345.68（前面有3个空格占位）
        System.out.printf("%9.2f"+ss,d);
        System.out.printf("%+9.2f\n",d);//"+"表示输出的数带上正负号。输出结果：  +345.68
        System.out.printf("%-9.2f\n",d);//"-"表示输出的数左对齐。输出结果：345.68   （后面有3个空格占位）
        System.out.printf("%-+9.2f\n",d);//"-+"或"+-"表示输出的数带上正负号左对齐。输出结果：+345.68  （后面有2个空格占位）

        System.out.printf("%d\n",i);//十进制输出
        System.out.printf("%o\n",i);//八进制输出
        System.out.printf("%x\n",i);//十六进制输出
        System.out.printf("%#x\n",i);//带十六进制标识输出

        System.out.printf("%s\n",s);//输出字符串
        System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s\n",d,i,s);//按顺序输出多个变量
        System.out.printf("%2$s %3$d的十六进制数：%3$#x，%1$f保留小数点后两位输出结果：%1$6.2f\n",d,s,i);//"1$"表示第1个变量，"2$"表示第2个变量，"3$"表示第3个变量...

    }
}
