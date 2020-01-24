package j0526.Project1;
/**
 * draw money：提款
 *
 * */
public class DrawMoney extends Thread{
    private Account account;
    private int money;
    private String name;

    public DrawMoney (Account account, int money,String name){
        this.account=account;
        this.money=money;
        this.name=name;
    }

    @Override
    public void run() {
        account.getMoney(money,name);
    }
}
