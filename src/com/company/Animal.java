package com.company;

import org.junit.Test;

public class Animal {

    private int age;//属性：Attribute，property，data，field，global variable
    private String color;
    private int weight;

    Animal() {//默认构造器：constructor
        this.age = 100;
        this.color = "yellow";
        this.weight = 6;
    }

    Animal(int age) {//非默认构造器：constructor
        this.age = age;
        Animal a=new Animal();
        a.setAge(age);
        System.out.println(a.age);
    }

    Animal(String color) {//非默认构造器：constructor
        this.color = "yellow";
    }

    public static void main(String[] args) {

        //Animal a = new Animal(25);//实例化：instanced
        //System.out.println(a.age);
        new Animal(100);
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

}
