package j0428;
/**
 * interface接口的应用
 * */
public class C extends C0 implements IA,IB,IC{//C类先继承C0，再实现IA,IB,IC接口。

    public static void main(String[] args) {
        C c=new C();
        c.go();
        c.go1();
        c.go2();
        c.go3();
        c.go4();
    }

    @Override
    public void go() {
        System.out.println(IA.age);
    }
    @Override
    public void go1(){
        System.out.println(IB.age);
    }
    @Override
    public void go2(){
        System.out.println(IC.age);
    }

    @Override
    public void go3() {
        System.out.println(ID.age);
    }
    public void go4(){
        System.out.println(IF.age);
    }
}
class C0{

}
interface IA {
    void go();
    public static final int age=100;//等同于public int age=100;，说明接口中的变量一定是static final常量
}
interface IB {
    void go();
    public int age=200;
}
interface IC extends ID,IE{//接口IC继承ID，让接口C不用实现ID也能继承ID中的常量age。
    void go1();
    public int age=300;
}
interface ID {
    void go2();
    public int age=400;
}
interface IE {
    void go3();
    public int age=500;
}
interface IF {
    void go4();
    public int age=600;
}