package j0428;
/**
 * Polymorphism：多态【虚方法调用】
 * 【虚方法调用】
 * 【形参多态】
 * 【返回值多态】
 * */
public class D {
    public static void main(String[] args) {
        D00 d0=new D0();//【虚方法调用】向上转型，根据运行时（等号后面）走，走堆
        d0.go();
//        d0.bark();//以父类初始化的栈d0没有bark()方法，所以必须将父类栈d0强转为子类
        ((D0) d0).bark();//【虚方法调用】强转，向下转型，将父类栈d0强转为子类
    }
}
class D0 extends D00{
    public void bark(){
        System.out.println("bark");
    }
    public void go(){
        System.out.println(1);
    }
}
class D00{
    public void go(){
        System.out.println(2);
    }
}