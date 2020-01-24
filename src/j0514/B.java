package j0514;
/**
 * 两种输入方式
 * 两种退出方式
 *
 * */
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        new B().go3();
    }

    //输入方式一，两种退出方式
    @Test
    public void go1(){
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;//先标记
        while (flag) {
            String msg = scanner.nextLine();
            if(msg.toUpperCase().equals("q")){
                flag=false;//绿色退出，当输入“q”时，将变量flag赋值为false，循环将退出（第一种）
                System.exit(1);//整个系统退出（第二种）
            }
            System.out.println(msg);
        }
        scanner.close();//关闭流
    }

    //输入方式二（操作的是字节流）
    @Test
    public void go2(){
        InputStream is=System.in;//字节流
        boolean flag=true;
        //byte[] buffer=new byte[1024];申明在外部会一直用这个堆，造成将之前输入的内容也连同打印出来
        while (flag){
            byte[] buffer=new byte[1024];
            try{
                is.read(buffer);
                String msg=new String(buffer).trim();
            if(msg.toUpperCase().equals("q")){
                System.exit(1);
            }
                System.out.print(msg);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        try {
            is.close();//关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //输入方式三（操作的是字符流，转换流）
    @Test
    public void go3(){
        InputStream is=System.in;
//        BufferedReader br=new BufferedReader(new InputStreamReader(is, Charset.forName("utf-8")));//将输入的内容转换为字符
        BufferedReader br=new BufferedReader(new InputStreamReader(is));//将输入的内容转换为字符
        boolean flag=true;
        while (flag){
            try {
                String s=br.readLine();
                System.out.println(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            br.close();//关闭流（后开先关）
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();//关闭流（后开先关）
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
