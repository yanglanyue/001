package j0526.Project1;
/**
 * Account：账户
 * synchronized：使线程同步（不相互挤占，一个一个挨着来）
 *
 * */
public class Account {
    private String no;//卡号
    private int fund;//本金

    public Account(String no, int fund) {
        this.no = no;
        this.fund = fund;
    }

    public void getMoney(int money,String name){
        synchronized (this) {//使线程同步（不相互挤占，一个一个挨着来）
            if (money <= fund) {
                try {
                    Thread.sleep(1000);//缓解线程速度
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fund -= money;
                System.out.println("账号："+no);
                System.out.println(name + "所取金额：" + money + "元");
                System.out.println("余额：" + fund + "元");
            } else {
                System.out.println(name + "欲取金额：" + money + "元");
                System.out.println("余额不足");
            }
        }
    }

    public void saveMoney(int money,String name){
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fund += money;
            System.out.println("账号："+no);
            System.out.println(name + "存入金额：" + money + "元");
            System.out.println("余额：" + fund + "元");
        }
    }
}
