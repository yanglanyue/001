package j0428;
/**
 * Polymorphism：多态【形参多态】
 * 【虚方法调用】
 * 【形参多态】
 * 【返回值多态】
 * */
public class E {
    public void plan(E00 e00){//需要传入的形式为父类E00
        e00.go();//执行go方法
    }
    public void ok(one u){
        u.to();
    }
    public static void main(String[] args) {
        new E().plan(new E00());
        new E().plan(new E0());//直接继承E00
        new E().plan(new E1());//间接继承E00

        new E().ok(new one());
    }
}
class one{
    public void to(){
        System.out.println("one");
    }
}
class E0 extends E00{
    public void go(){
        System.out.println(1);
    }
}
class E1 extends E0{
    public void go(){
        System.out.println(2);
    }
}
class E00{
    public void go(){
        System.out.println(3);
    }
}