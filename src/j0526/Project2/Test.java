package j0526.Project2;

import j0526.Project2.Account;
import j0526.Project2.DrawMoney;
import j0526.Project2.SaveMoney;

public class Test {
    public static void main(String[] args) {
        Account a=new Account("6228480470840005610",800);

        DrawMoney d=new DrawMoney(a,100,"甲");
        d.start();
        DrawMoney d1=new DrawMoney(a,80,"乙");
        d1.start();
//        DrawMoney d2=new DrawMoney(a,50,"丙");
//        d2.start();
//        DrawMoney d3=new DrawMoney(a,150,"丁");
//        d3.start();

        SaveMoney s=new SaveMoney(a,800,"甲");
        s.start();
    }
}
