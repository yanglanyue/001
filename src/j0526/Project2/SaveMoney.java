package j0526.Project2;

import j0526.Project2.Account;

public class SaveMoney extends Thread {
    private Account account;
    private int money;
    private String name;

    public SaveMoney(Account account, int money, String name) {
        this.account = account;
        this.money = money;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(100);//防止死锁状态（线程太快，相互等候，没办法激活）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                account.saveMoney(money,name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
