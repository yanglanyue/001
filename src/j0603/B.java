package j0603;
/**
 * 线程池
 *
 * .execute()
 * 执行线程池
 *
 * .shutdown()
 * 关闭线程池
 *
 * .newFixedThreadPool(8)
 * 开启指定数量线程
 * .newCachedThreadPool()
 * 由计算机随机开启足够线程
 *
 * .newSingleThreadExecutor();
 * 由计算机开启一个线程
 */

import org.junit.Test;
import javax.print.attribute.DateTimeSyntax;
import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B {
    public static void main(String[] args) {
        new B().go1();
    }

    @Test
    public void go1() {
        Executor es = Executors.newFixedThreadPool(6);//开启指定数量线程

        for (int i = 0; i < 10; i++) {
            Runnable run=new Runnable() {//执行线程池
                @Override
                public void run() {
                    System.out.println("启动 " + Thread.currentThread().getName() + " 线程");
                }
            };
            es.execute(run);
        }
        ((ExecutorService) es).shutdown();//关闭线程池
        try {
            ((ExecutorService) es).awaitTermination(100, TimeUnit.DAYS);//设定时间范围内JDK强制关闭线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void go2() {
        Executor es = Executors.newCachedThreadPool();//由计算机随机开启足够线程

        for (int i = 0; i < 10; i++) {
            es.execute(new Runnable() {//执行线程池
                @Override
                public void run() {
                    System.out.println("启动 " + Thread.currentThread().getName() + " 线程");
                }
            });
        }
        ((ExecutorService) es).shutdown();//关闭线程池
        try {
            ((ExecutorService) es).awaitTermination(100, TimeUnit.SECONDS);//设定时间范围内JDK强制关闭线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void go3() {
        Executor es = Executors.newSingleThreadExecutor();//由计算机开启一个线程

        for (int i = 0; i < 8; i++) {
            es.execute(new Runnable() {//执行线程池
                @Override
                public void run() {
                    System.out.println("启动 " + Thread.currentThread().getName() + " 线程");
                }
            });
        }
        ((ExecutorService) es).shutdown();//关闭线程池
        try {
            ((ExecutorService) es).awaitTermination(100, TimeUnit.HOURS);//设定时间范围内JDK强制关闭线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
