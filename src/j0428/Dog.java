package j0428;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
}

abstract class Animal {
    public abstract void eat();
}
