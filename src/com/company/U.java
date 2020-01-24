package com.company;

/**
 * 组合的写法
 */
public class U {
    private HEAD head;
    private HAND hand;
    private Q q;

    public static int age;
    public static String name;

    {
        A = 100;
    }

    int A;
    protected int B;
    public int C;


    public U() {
        head = new HEAD();//组合的写法，先在默认构造器中实例化要调用的类，再执行实例化本身这个类（28行）
    }

    public U(HEAD head) {
        this.head = head;
    }

    public U(HAND hand) {
        this.hand = hand;
    }

    public U(Q q) {
        this.q = q;
    }

    public void eye() {
//        System.out.println("吃干饭");
        head.eye();
    }

    public void eat() {
//        System.out.println("吃干饭");
        head.eat();
    }

    public void see() {
//        System.out.println("看美女");
        head.see();
    }

    public void hear() {
//        System.out.println("听摇滚");
        head.hear();
    }

    public void bb() {
        q.bb();
    }

    public static void main(String[] args) {

        U.name = "雷军";
        System.out.print(name + "，昨天他才说自己");//age是类变量，所以无需实例化，可以直接用类名.调用
        System.out.print(age = 18);//age是类变量，所以无需实例化，可以直接用类名.调用或者直接用
        System.out.print("岁！今天他就");//age是类变量，所以无需实例化，可以直接用类名.调用
        U uu = new U();
        System.out.print(uu.A = 200);//A是实例变量，所以必须先实例化才能被调用
        System.out.println("岁了！");

        U u1 = new U();//组合的写法（1）：实例化U的同时，在构造器里实例化HEAD。
        u1.eye();
        u1.eat();
        u1.see();
        u1.hear();

        new U().eat();//组合的写法（2）：这种写法JVM会自动实例化U，自动生成实例化所需要的栈。
        new U().see();
        new U().hear();

        HAND hand = new HAND();
        U u2 = new U(hand);
        u2.hand.mo();
        u2.hand.da();
        u2.hand.na();

        Q q = new Q();
//        U u3=new U(q);
//        u3.bb();
        new U(q).bb();

    }
}

class HEAD {
    public void eye() {
        System.out.println("大眼睛");
    }

    public void eat() {
        System.out.println("吃烧烤");
    }

    public void see() {
        System.out.println("看美女");
    }

    public void hear() {
        System.out.println("听笑话");
    }
}

class HAND {
    public void mo() {
        System.out.println("摸");
    }

    public void da() {
        System.out.println("打");
    }

    public void na() {
        System.out.println("拿");
    }
}

class Q {
    public void bb() {
        System.out.println("泡妹妹");
    }
}
