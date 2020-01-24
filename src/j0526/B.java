package j0526;
/**
 * 写法一：实例化匿名内部类，马上实现接口（只能使用一次）
 * new Runnable()想要启动必须借助于Thread，将其放入Thread构造器中。再由Thread的实例启动。
 *
 * 写法二：正常写法，其原理相同
 * new Runnable()想要启动必须借助于Thread，将其放入Thread构造器中。再由Thread的实例启动。
 * */
import java.util.Iterator;
import java.util.List;

public class B{
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){//（写法一）实例化匿名内部类，马上实现接口（只能使用一次），new Runnable()想要启动必须借助于Thread，将其放入Thread构造器中。再由Thread的实例启动。
            @Override
            public void run() {
                for (int i=1;i<10;i++){
                    try {
                        Thread.sleep(100);//控制线程速度（毫秒）
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"："+i);
                }
            }
        });

        t.start();

        //（写法二）正常写法，其原理相同
        B0 b0=new B0();
        B0 b1=new B0();

        Thread t0=new Thread(b0);
        Thread t1=new Thread(b1);

        t0.start();
        t1.start();
    }
}

class B0 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<15;i++){
            try {
                Thread.sleep(100);//控制线程速度（毫秒）
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}