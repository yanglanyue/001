package Test;

public class A1 {
    public int age;
    public String name;
    A2 a3=new A2(new A3());

    A1(){
//        this(new A2());//调用形参构造器A1(A2 a2){this.a3=a2; }
    }
    A1(A2 a2){
        this.a3=a2;
        a3.go2();
    }

    public void go1(){
        a3.go2();
    }

    public static void main(String[] args) {
        A2 a2=new A2(new A3());
        new A1(a2);

        new A1(new A2(new A3()));

        new A1().go1();

    }
}
class A2{

    public A2(A3 a3) {
        this.go2();
    }

    public void go2(){
        System.out.println("吃火锅");
    }
}
class A3{
    public void go3(){
        System.out.println("吃串串");
    }
}