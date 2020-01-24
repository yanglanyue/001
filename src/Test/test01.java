package Test;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;

public class test01 {
    public static void main(String[] args) {
        x x1=new x() {
            @Override
            public int x1() {
                return 0;
            }

            @Override
            public boolean x2() {
                return false;
            }

            public void gogogo(){}
        };
        ((x) x1).x1();

        bb b=new bb(){
            public void gogogo(){}
        };

        test01 t1=new test01();
        t1.tt1();

        tt2();

    }

    int a=100;
    static int b=100;
    public void t1(){
        int aa=a;
        int bb=b;
        t2();
        tt1();
    }
    public void t2(){

    }
    public static void tt1(){
        int aa=b;
        tt2();
        class tt11{
            public void tt11(){};
        }
        new tt11().tt11();
    };
    public static void tt2(){

    };

//    x x=new x() {
//        @Override
//        public int x1() {
//            return 0;
//        }
//
//        @Override
//        public boolean x2() {
//            return false;
//        }
//    };

    public void go(ServletConfig config){
        x x1=new x() {
            @Override
            public int x1() {
                return 0;
            }

            @Override
            public boolean x2() {
                return false;
            }

            public void gogogo(){}
        };



        go1(x1);

    }

    public void go1(x b){
        b.x1();
    }
}

class bb{

}

interface x{
    int x1();
    boolean x2();
}
interface x1{
    int x11();
    boolean x12();
}

class out{
    public void go() {
        int age = 100;
        class in {
            public void go() {
                System.out.println(age);
            }
        }
        new in().go();
    }

    public static void main(String[] args) {
        out o=new out();
        o.go();
    }
}


class Example3_2{
    public static void main(String args[]){
        Point p1,p2,p3;
        p1 = new Point();
        p2 = new Point(40,50);
        p3 = new Point(p1.getX()+p2.getX(),p1.getY()+p2.getY());
        System.out.println("p3.x="+p3.getX()+",p3.y="+p3.getY());
        Point p4 = new Point(p1.x,p2.y);
        System.out.println("p4.x="+p4.x+",p4.y="+p4.y);
        System.out.println("程序共有Point对象"+Point.pointNum()+ "个");
    }
}
class Point{
    int x,y;
    static int pCount =0;

    Point(){
        x=10;
        y=20;
        pCount++;
    }
    Point(int x,int y){
        this.x = x;
        this.y=y;
        pCount++;
    }

    static int pointNum(){
        return pCount;
    }

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}