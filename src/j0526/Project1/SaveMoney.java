package j0526.Project1;

public class SaveMoney extends Thread {
    private Account account;
    private int money;
    private String name;

    public SaveMoney (Account account, int money,String name){
        this.account=account;
        this.money=money;
        this.name=name;
    }
    @Override
    public void run() {
        account.saveMoney(money,name);
    }
}
