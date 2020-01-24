package j0603;
/**
 * 多线程开发主要的模式
 *
 * Callable（接口）
 * Call（接口Callable的方法）
 *
 * */

import org.junit.Test;

import java.util.List;
import java.util.concurrent.*;

public class C {

    @Test
    public void go() {
        Executor es = Executors.newCachedThreadPool();//由计算机随机开启足够线程

        for (int i = 0; i < 10; i++) {
            Future<String> fs=((ExecutorService) es).submit(new MyCall("MIKE"+i));
            try {
                System.out.println(fs.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        ((ExecutorService) es).shutdown();//关闭线程池
        try {
            ((ExecutorService) es).awaitTermination(10, TimeUnit.SECONDS);//设定时间范围内JDK强制关闭线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyCall implements Callable<String> {

    private String name;

    public MyCall(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(this.name+"执行了核心");
        return "完成了"+this.name;
    }
}