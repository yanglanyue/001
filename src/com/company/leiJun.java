package com.company;

import suDuKongZhi.Driver;

public class leiJun extends Driver{
    static String country="地球人";

    private String name;
    private int age;

    public leiJun(){

    }

    {
        int age=100;
//        System.out.println("我是初始化块里的雷军");
    }
    public leiJun(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void go(){
        System.out.println(name+"："+age+"岁，"+country+"。");
//        System.out.println("爱好：");
//        super.eat();
//        super.see();
//        super.hear();
    }

    public static void main(String[] args) {
        leiJun.country="中国人";
        leiJun a=new leiJun("雷军",45);
        a.go();

        leiJun L=new leiJun();
        L.C=100;
        L.D=200;

    }

}
