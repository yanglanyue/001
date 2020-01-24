package j0526.Project1;

public class Test {
    public static void main(String[] args) {
        Account a=new Account("6228480470840005610",800);

        DrawMoney d=new DrawMoney(a,100,"甲");
        d.start();
        DrawMoney d1=new DrawMoney(a,50,"乙");
        d1.start();
        DrawMoney d2=new DrawMoney(a,300,"丙");
        d2.start();
        DrawMoney d3=new DrawMoney(a,600,"丁");
        d3.start();

        SaveMoney s=new SaveMoney(a,1000,"甲");
        s.start();
    }
}
