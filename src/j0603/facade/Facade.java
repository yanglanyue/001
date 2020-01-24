package j0603.facade;

public class Facade {
    public void mark(){
        TestA a=new TestA();
        a.go1();
        TestB b=new TestB();
        b.go2();
        TestC c=new TestC();
        c.go3();
    }
}
