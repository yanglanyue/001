package j0506;
/**
 * 枚举类（手写）
 */
public class A {
    private A(){//私有构造器,防止其他操作对这个类产生对象

    }
    public static final A spring=new A();//枚举对象（春）
    public static final A summer=new A();//枚举对象（夏）
    public static final A fall=new A();//枚举对象（秋）
    public static final A winter=new A();//枚举对象（冬）

    public void go(){

    }
}
class test{
    public static void main(String[] args) {
//        A.spring.go();
//        A.summer.go();
//        A.fall.go();
//        A.winter.go();
//
//        EA.spring.go();
//        EA.summer.go();
//        EA.fall.go();
//        EA.winter.go();

        for(EA ea:EA.values()){//foreach循环可针对集合、数组、枚举。将枚举类都遍历一遍，没被枚举的用default执行的内容填充
            ea.go();
        }
        for(EA ea:EA.values()){
            ea.mark();
        }
    }
}
