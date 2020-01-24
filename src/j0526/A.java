package j0526;
/**
 * .start()：开始线程
 * .stop()：停止线程（过时的写法）
 * break：停止线程（现在的写法）
 * .yield()：线程同步：放弃当前权限，等在下一个线程（满足某条件后）再继续往下执行
 * .sleep(10)：控制线程速度（毫秒）
 * .setPriority(Thread.MAX_PRIORITY)：设置优先级（方法一）
 * .setPriority(10)：设置优先级（方法二）：1-10级
 *
 * */
public class A {
    public static void main(String[] args) {
        A0 a0=new A0();
        a0.setName("A");//设置名字
        a0.setPriority(Thread.MAX_PRIORITY);//设置优先级（方法一）
        a0.setPriority(10);//设置优先级（方法二）：1-10级
        a0.start();

        A0 a1=new A0();
        a1.setName("B");
        a1.setPriority(Thread.MIN_PRIORITY);
//        a1.setPriority(3);
        a1.setPriority(1);
        a1.start();
    }
}

class A0 extends Thread{

    @Override
    public void run(){
        for (int i=1;i<100;i++){
            if(i==50){
//                Thread.currentThread().stop();//停止线程（过时的写法）
//                break;//停止线程（现在的写法）
            }
            try {
                Thread.yield();//线程同步：放弃当前权限，等在下一个线程（满足某条件后）再继续往下执行
                Thread.sleep(10);//控制线程速度（毫秒）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}