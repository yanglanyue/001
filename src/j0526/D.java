package j0526;
/**
 * 守护线程：
 * .setDaemon：A线程结束时B线程跟着结束（不是立即结束）
 * 线程中加入Thread.sleep(100);即可立即结束
 *
 * */
public class D {
    public static void main(String[] args) {
        D0 d0=new D0();
        d0.setName("A");
        d0.start();

        D1 d1=new D1();
        d1.setName("B");
        d1.setDaemon(true);//守护线程
        d1.start();

    }
}

class D0 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<50;i++){
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+"："+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D1 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<500;i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}