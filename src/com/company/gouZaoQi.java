package com.company;

public class gouZaoQi extends gouZaoQi0{
    public gouZaoQi(){
        super(1);
    }

    public void go(){
        super.go();
    }

    public void plan(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        gouZaoQi a=new gouZaoQi();
        new gouZaoQi().go();
        a.plan(4);
    }
}

class gouZaoQi0 extends gouZaoQi00{
    public gouZaoQi0(){
        this(6);
        System.out.println("5");
    }
    public gouZaoQi0(int a){
        super("0");
        System.out.println(a);
    }
    public  void go(){
        super.go();
        System.out.println("3");
    }
}

class gouZaoQi00{
    public gouZaoQi00(){
        this.go();
        System.out.println("1");
    }
    public gouZaoQi00(String a){
        System.out.println(a);
    }
    public  void go(){
        System.out.println("2");
    }
}
