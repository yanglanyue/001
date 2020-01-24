package j0526;
/**
 * .join：暂停线程
 *
 * */
public class C {
    public static void main(String[] args) {
        C0 c0=new C0();
        c0.start();


    }
}

class C0 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<30;i++){
            if(i==10){
                C1 c1=new C1();
                c1.setName("C1");
                c1.start();

                C1 c2=new C1();
                c2.setName("C2");
                c2.start();
                try {
                    c1.join();//暂停此c0线程，运行c1线程
                    c2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("C0"+"："+i);
        }
    }
}

class C1 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<30;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"："+i);
        }
    }
}