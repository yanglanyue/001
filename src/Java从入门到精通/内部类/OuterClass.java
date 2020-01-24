package Java从入门到精通.内部类;

public class OuterClass {

    innerClass in=new innerClass();                 //在外部类实例化内部类对象引用

    public void ouf(){
        in.inf();                                   //在外部内方法中调用内部类方法
    }

    class innerClass{
        innerClass(){}                              //内部类构造方法
        public innerClass(int y, String x) {
            this.y = y;
            this.x = x;
        }
        public void inf(){}                         //内部类成员方法
        int y=0;                                    //定义内部类成员变量
        String x="A";
    }

    public innerClass doit(){                       //外部类方法，返回值为内部类引用
        //y=4;                                      //外部类不可以直接访问内部类成员变量
        in.y=4;
        return new innerClass();                    //返回内部类引用
    }

    public innerClass go(){
        in.y=100;
        in.x="B";
        return in;
    }

    public static void main(String[] args) {
        OuterClass out=new OuterClass();
        //内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现
        OuterClass.innerClass in1=out.doit();//非静态方法实例化内部类对象
        OuterClass.innerClass in2=out.new innerClass(20,"ABC");//实例化内部类对象
        System.out.println(in2.y+in2.x);
        System.out.println(out.go().y+out.go().x);
        System.out.println(in1.y);
    }
}
