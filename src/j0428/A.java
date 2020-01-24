package j0428;
/**
 * 利息计算器
 *
 * abstract虚类的应用
 * */
public class A {
    public static void main(String[] args) {
        System.out.println(new A1().computeInterest());
        System.out.println(new A2().computeInterest());
    }
}
class A2 extends A0{

    @Override
    public float getRate() {
        return 0.2f;
    }
}

class A1 extends A0{

    @Override
    public float getRate() {
        return 0.1f;
    }
}

abstract class A0{
    private int fund=1000;//本金
//    private float rate;//利率

    public float computeInterest(){//计算利息
        return fund*getRate();
    }
    public abstract float getRate();
}