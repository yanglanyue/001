package j0507;

import org.junit.Test;

/**
 * Exception：异常
 * throw（主动的）
 * */
public class E {
    public static void main(String[] args) {
        go();
        try {
            go1();//调用go1方法的两种异常抛出方法一（被动）
        } catch (Exception e) {//由catch来进行被动处理
            e.printStackTrace();
        }
    }

    @Test
    public void A() throws Exception {//调用go1方法的两种异常抛出方法二，在调用这个方法的方法里用throws将异常抛给JDK
        go1();
    }

    public static void go(){
        int age=10;
        if(age==10){
            try{
                throw new Exception();//throw：语句抛（主动）
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void go1() throws RuntimeException,Exception{//throws：方法抛，谁调用go1，都必须对throws抛出的所有异常进行处理
        System.out.println("异常");
    }
}
