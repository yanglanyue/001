package j0603;
/**
 * 线程组
 *
 * .activeCount()
 * 开启活跃线程的对象数组（大约的）
 *
 * .enumerate()
 * 活跃的线程个数（精确到）
 * */
public class A implements Runnable{
    public static void main(String[] args) {
        new A().go();
    }

    public void go(){
        ThreadGroup tg1=new ThreadGroup("父组");

        ThreadGroup tg4=new ThreadGroup("父组");

        ThreadGroup tg2=new ThreadGroup(tg1,"子组");

        Thread t=new Thread(tg1,this);
        t.setName("A");
        t.start();
        Thread t1=new Thread(tg2,this);
        t1.setName("B");
        t1.start();
        Thread t2=new Thread(tg4,this);
        t2.setName("C");
        t2.start();

        //查询到底有多少活跃的线程
        Thread[] ts=new Thread[tg1.activeCount()];//开启活跃线程的对象数组（大约的）
        int count=tg1.enumerate(ts);//活跃的线程个数（精确到）
        System.out.println("一共"+count+"个线程");
        for(int i=0;i<count;i++){
            System.out.println("发现线程："+ts[i].getName());
        }
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            i++;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束线程："+Thread.currentThread().getName());
    }
}
