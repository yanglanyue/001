package j0506;

/**
 * 枚举类（自动生成）
 * 枚举类不能被继承
 */
public enum EA implements EA1 {
    spring {//枚举类型的第一排一定是枚举对象！

        @Override
        public void mark() {
            System.out.println("春（mark）");
        }

        ;
    }, summer {
        @Override
        public void mark() {
            System.out.println("夏（mark）");
        }

        ;
    }, fall {
        @Override
        public void mark() {
            System.out.println("秋（mark）");
        }

        ;
    }, winter {
        @Override
        public void mark() {
            System.out.println("冬（mark）");
        }

        ;
    };//等同于j0506包中的A类的写法

    EA() {//枚举类型必须用默认构造器
        System.out.println("构造器");
    }

    EA(int a) {

    }

    public void go() {
        switch (this) {
            case spring:
                System.out.println("春");
                break;
            case summer:
                System.out.println("夏");
                break;
//            case fall:
//                System.out.println("秋");
//                break;
//            case winter:
//                System.out.println("冬");
//                break;
            default://将枚举类都遍历一遍，没被枚举的用default执行的内容填充
                System.out.println("春夏秋冬");
        }
    }

    public static void main(String[] args) {
        for (EA e:EA.values()) {
            e.go();
        }
    }
}

interface EA1 {
    void mark();
}