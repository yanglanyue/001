package j0428;
/**
 * Polymorphism：多态【返回值多态】
 * 【虚方法调用】
 * 【形参多态】
 * 【返回值多态】
 * */
public class F {
    public static void main(String[] args) {
        int a=0;

        F f=new F();
        f.go(a).go();

        new F().go(a).go();
    }
    public F0 go(int a){
        switch (a){
            case 0:
                return new F0();
            case 1:
                return new F1();
            case 2:
                return new F2();
        }
        return null;
    }
}
class F2 extends F1{
    public void go(){
        System.out.println(2);
    }
}
class F1 extends F0{
    public void go(){
        System.out.println(1);
    }
}
class F0{
    public void go(){
        System.out.println(0);
    }
}
