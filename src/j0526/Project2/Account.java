package j0526.Project2;

/**
 * Account：账户
 * synchronized：使线程同步（不相互挤占，一个一个挨着来）
 */
public class Account {
    private String no;//卡号
    private int fund;//本金

    //标记账户中有无存款。false：没有存款，可以存；true：有存款，可以取。
    private boolean flag = false;

    public Account(String no, int fund) {
        this.no = no;
        this.fund = fund;
    }

    public synchronized void getMoney(int money, String name) throws InterruptedException {//取钱方法
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {//可以取钱了
            this.fund -= money;
            System.out.println(name + "取了" + money + "元");
            flag = false;
            Thread.currentThread().sleep(100);
            notifyAll();//唤醒所有等待的线程
        }
    }

    public synchronized void saveMoney(int money, String name) throws InterruptedException {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {//可以存钱了
            this.fund += money;
            System.out.println(name + "存了" + money + "元");
            flag = true;
            Thread.currentThread().sleep(100);
            notifyAll();//唤醒所有等待的线程
        }
    }
}
