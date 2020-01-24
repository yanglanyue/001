package j0513;

import java.io.IOException;

/**
 * 1.异常处理
 * 方法中的重写抛出异常特点
 * 父类抛出的方法的异常的范围必须大于等于子类重写方法抛出的异常范围
 * RuntimeException特殊，只有运行时才会出现异常，若作为子类抛出异常范围大于父类抛出异常，则编译过程中不会报错
 *
 * 2.自定义异常
 * 通过构造器在自定义异常里传递参数
 */

public class E extends E0 {
    public static void main(String[] args) {
        try {
            new E().go();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void go() throws IOException {
        int age=14;
        if(age<18){
            try {
                throw new MyException1(age);
            } catch (MyException1 MyException1) {
                System.out.println(MyException1);
            }
        }else if(age>80){
            try {
                throw new MyException2(age);
            } catch (MyException2 MyException2) {
                System.out.println(MyException2);
            }
        }else {
            System.out.println("你可以观看");
        }
    }
}
class E0{
    public void go() throws Exception{

    }
}

class MyException1 extends Exception{//不满足18岁的异常
    int age;
    MyException1(int age){
        this.age=age;
    }

    @Override//打印对象JDK会生成一些非程序员难以理解的东西，需要程序员通过重写toString来生成易懂的东西
    public String toString() {
        return this.age+"岁，年龄太小，不适合观看！";
    }
}

class MyException2 extends Exception{//超过80岁的异常
    int age;
    MyException2(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return this.age+"岁，年龄过大，不易观看！";
    }
}