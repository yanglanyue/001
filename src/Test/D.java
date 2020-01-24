package Test;

public class D extends D1 {
    D() {
        super(100);
        System.out.println("a");
    }

    static {
        System.out.println("b");
    }

    static {
        System.out.println("c");
    }

    {
        System.out.println("d");
    }

    D(int age) {
        this();
        System.out.println("e");
    }

    public static void main(String[] args) {
        new D(100);
    }
}

class D1 {

    D1(int age) {
        this();
        System.out.println("f");
    }

    D1() {
        System.out.println("g");
    }

    static {
        System.out.println("h");
    }

    {
        System.out.println("i");
    }

    static {
        System.out.println("Test.behavior.j");
    }
}
